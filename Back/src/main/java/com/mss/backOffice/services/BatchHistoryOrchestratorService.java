package com.mss.backOffice.services;

import com.mss.unified.entities.BatchesHistory;
import com.mss.unified.repositories.BatchesHistoryRepository;
import com.mss.backOffice.websocket.BatchHistoryWebSocketHandler;
import com.mss.backOffice.websocket.BatchStatusUpdateMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.nio.file.Paths;

@Service
public class BatchHistoryOrchestratorService {

    private static final Logger logger = LoggerFactory.getLogger(BatchHistoryOrchestratorService.class);

    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job importFileJob;

    @Autowired
    private BatchesHistoryRepository batchesHistoryRepository;

    @Autowired
    private BatchHistoryWebSocketHandler webSocketHandler;

    public ResponseEntity<?> processBatchHistories(List<Long> batchHIds) throws Exception {
        if (batchHIds == null || batchHIds.isEmpty()) {
            return ResponseEntity.badRequest().body("At least one batch history ID is required");
        }

        List<Map<String, Object>> results = new ArrayList<>();

        for (Long batchHId : batchHIds) {
            try {
                BatchesHistory history = batchesHistoryRepository.findById(batchHId)
                        .orElseThrow(() -> new IllegalArgumentException("BatchesHistory not found with ID: " + batchHId));

                // Set status to 0 (parsing started)
                history.setStatus(0);
                batchesHistoryRepository.save(history);
                webSocketHandler.broadcastStatusUpdate(new BatchStatusUpdateMessage(
                    history.getBatchHId(), 0, history.getBatchName()));

                String filePath = Paths.get(history.getFileLocation(), history.getFilename()).toString();
                java.io.File file = new java.io.File(filePath);
                if (!file.exists() || !file.isFile()) {
                    // Set status to 2 (error)
                    history.setStatus(2);
                    batchesHistoryRepository.save(history);
                    webSocketHandler.broadcastStatusUpdate(new BatchStatusUpdateMessage(
                        history.getBatchHId(), 2, history.getBatchName()));

                    Map<String, Object> errorMap = new HashMap<>();
                    errorMap.put("batchHId", batchHId);
                    errorMap.put("status", "error");
                    errorMap.put("message", "File does not exist or is not a valid file at " + filePath);
                    results.add(errorMap);
                    continue;
                }

                JobParameters params = new JobParametersBuilder()
                        .addString("filePath", filePath)
                        .addString("idHeader", batchHId.toString())
                        .addLong("time", System.currentTimeMillis())
                        .toJobParameters();

                JobExecution execution = jobLauncher.run(importFileJob, params);

                // Wait for completion
                while (execution.isRunning()) {
                    Thread.sleep(100);
                }

                if (execution.getStatus().isUnsuccessful()) {
                    // Set status to 2 (error)
                    history.setStatus(2);
                    batchesHistoryRepository.save(history);
                    webSocketHandler.broadcastStatusUpdate(new BatchStatusUpdateMessage(
                        history.getBatchHId(), 2, history.getBatchName()));

                    Map<String, Object> errorMap = new HashMap<>();
                    errorMap.put("batchHId", batchHId);
                    errorMap.put("status", "error");
                    errorMap.put("message", "Batch job failed: " + execution.getStatus());
                    results.add(errorMap);
                } else {
                    // Set status to 3 (parsing completed)
                    history.setStatus(3);
                    batchesHistoryRepository.save(history);
                    webSocketHandler.broadcastStatusUpdate(new BatchStatusUpdateMessage(
                        history.getBatchHId(), 3, history.getBatchName()));

                    Map<String, Object> successMap = new HashMap<>();
                    successMap.put("batchHId", batchHId);
                    successMap.put("status", "success");
                    successMap.put("message", "File processed successfully");
                    results.add(successMap);
                }
            } catch (Exception e) {
                logger.error("Error processing batch history ID {}: {}", batchHId, e.getMessage());
                // Try to set status to 2 (error) - may fail if DB connection is down
                try {
                    BatchesHistory history = batchesHistoryRepository.findById(batchHId).orElse(null);
                    if (history != null) {
                        history.setStatus(2);
                        batchesHistoryRepository.save(history);
                        webSocketHandler.broadcastStatusUpdate(new BatchStatusUpdateMessage(
                            history.getBatchHId(), 2, history.getBatchName()));
                    }
                } catch (Exception dbError) {
                    logger.error("Failed to update error status for batch history ID {} (DB may be unavailable): {}",
                        batchHId, dbError.getMessage());
                    // Still broadcast error via WebSocket even if DB update failed
                    webSocketHandler.broadcastStatusUpdate(new BatchStatusUpdateMessage(
                        batchHId, 2, "Unknown"));
                }

                Map<String, Object> errorMap = new HashMap<>();
                errorMap.put("batchHId", batchHId);
                errorMap.put("status", "error");
                errorMap.put("message", e.getMessage());
                results.add(errorMap);
            }
        }

        return ResponseEntity.ok(results);
    }
}

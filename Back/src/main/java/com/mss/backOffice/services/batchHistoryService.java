package com.mss.backOffice.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.BatchesFC;
import com.mss.unified.entities.BatchesHistory;
import com.mss.unified.repositories.BatchesFFCRepository;
import com.mss.unified.repositories.BatchesHistoryRepository;
import com.mss.unified.repositories.FileContentTPRepository;
import com.mss.backOffice.websocket.BatchStatusUpdateMessage;
import org.springframework.messaging.simp.SimpMessagingTemplate;

/**
 * Service for managing BatchesHistory records.
 */
@Service
public class batchHistoryService {

    private static final Logger logger = LoggerFactory.getLogger(batchHistoryService.class);

    @Autowired
    private BatchesFFCRepository batchesFCRepository;

    @Autowired
    private BatchesHistoryRepository batchesHistoryRepository;

    @Autowired
    private FileContentTPRepository fileContentTPRepository;

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @Transactional
    public void syncBatchByKey(String key) {
        batchesHistoryRepository.findByKeyfc(key).ifPresent(history -> {
            history.setStatus(1);
            history.setBatchHEndDate(new Date());
            batchesHistoryRepository.save(history);
            logger.info("Manually synced batch history with key: {}", key);

            // Broadcast status update via WebSocket STOMP
            BatchStatusUpdateMessage message = new BatchStatusUpdateMessage(
                history.getBatchHId(),
                1,
                history.getBatchName()
            );
            messagingTemplate.convertAndSend("/topic/batch-status", message);
        });
    }

    /**
     * Get all history records for a specific batch.
     */
    public List<BatchesHistory> getHistoryByBatchId(int batchId) {
        return batchesHistoryRepository.findByBatchId(batchId);
    }

    /**
     * Get all history records with a specific status.
     */
    public List<BatchesHistory> getHistoryByStatus(Integer status) {
        return batchesHistoryRepository.findByStatus(status);
    }

    /**
     * Get all history records.
     */
    public List<BatchesHistory> getAllHistory() {
        return batchesHistoryRepository.findAll();
    }

    /**
     * Update bypass status for a history record.
     */
    @Transactional
    public void updateBypassStatus(Long historyId, Integer bypassStatus) {
        batchesHistoryRepository.findById(historyId).ifPresent(history -> {
            history.setBypassStatus(bypassStatus);
            batchesHistoryRepository.save(history);
            logger.info("Updated bypass status to {} for history ID: {}", bypassStatus, historyId);
        });
    }
    /**
     * Returns the list of BatchesHistory that are pending or failed since the last successful execution for each batchName.
     * Logic:
     * 1. Get all distinct batchName values
     * 2. For each batchName, find the last successful execution by batchDate
     * 3. Find pending batches (status != 1) for that batchName after the last successful execution
     * 4. Aggregate all pending batches across all batchName
     */
    public List<BatchesHistory> getPendingBatchesSinceLastDone() {
        // Get all distinct batchName values
        List<String> distinctBatchNames = batchesHistoryRepository.findDistinctBatchName();

        List<BatchesHistory> pendingBatches = new ArrayList<>();

        for (String batchName : distinctBatchNames) {
            // Find the last done history for this batchName
            List<BatchesHistory> doneHistories = batchesHistoryRepository.findTopByBatchNameAndStatusOrderByBatchDateDesc(batchName, 1);

            Date startDate;
            if (doneHistories != null && !doneHistories.isEmpty()) {
                BatchesHistory lastDoneHistory = doneHistories.get(0);
                startDate = lastDoneHistory.getBatchDate();
            } else {
                // If no done history found, start from the earliest possible
                startDate = new Date(0);
            }

            // Get pending batches for this batchName after the last done
            List<BatchesHistory> pendings = batchesHistoryRepository.findByBatchNameAndBatchDateAfterAndStatusNot(batchName, startDate, 1);
            pendingBatches.addAll(pendings);
        }

        return pendingBatches;
    }

    /**
     * Returns the list of BatchesHistory for a specific batchName from the last done BatchesHistory (status=1)
     * for that batchName.
     * Logic:
     * 1. Find the last BatchesHistory where status = 1 and batchName matches
     * 2. Get its batchDate
     * 3. Get all BatchesHistory where batchName matches and batchDate is AFTER that date and status != 1
     */
    public List<BatchesHistory> getPendingBatchesSinceLastDoneForBatch(String batchName) {
        // Step 1: Find the last done history for this batchName
        List<BatchesHistory> doneHistories = batchesHistoryRepository.findTopByBatchNameAndStatusOrderByBatchDateDesc(batchName, 1);
        
        Date startDate;
        if (doneHistories != null && !doneHistories.isEmpty()) {
            BatchesHistory lastDoneHistory = doneHistories.get(0);
            startDate = lastDoneHistory.getBatchDate();
        } else {
            // If no done history found, start from the earliest possible
            startDate = new Date(0);
        }

        // Step 2: Get all BatchesHistory for this batchName after the last done history and status != 1
        return batchesHistoryRepository.findByBatchNameAndBatchDateGreaterThan(batchName, startDate);
    }

    /**
     * Update status for a history record
     */
    @Transactional
    public void updateStatus(Long historyId, Integer status) {
        batchesHistoryRepository.findById(historyId).ifPresent(history -> {
            history.setStatus(status);
            batchesHistoryRepository.save(history);
            logger.info("Updated status to {} for batch history ID: {}", status, historyId);

            // Broadcast status update via WebSocket STOMP
            BatchStatusUpdateMessage message = new BatchStatusUpdateMessage(
                history.getBatchHId(),
                status,
                history.getBatchName()
            );
            messagingTemplate.convertAndSend("/topic/batch-status", message);
            logger.info("Broadcasted status update for batch {}", history.getBatchHId());
        });
    }

    /**
     * Delete a batch history record and its associated parsed TP records
     */
    @Transactional
    public void deleteBatchHistory(Long batchHId) {
        fileContentTPRepository.deleteByBatchHistoryId(batchHId);
        batchesHistoryRepository.deleteById(batchHId);
        logger.info("Deleted batch history ID: {} and its parsed TP records", batchHId);
    }
}

package com.mss.backOffice.controller;

import com.mss.backOffice.request.AddFileRequest;
import com.mss.backOffice.services.BatchHistoryOrchestratorService;
import com.mss.backOffice.services.batchHistoryService;
import com.mss.unified.entities.BatchesFC;
import com.mss.unified.entities.BatchesHistory;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("BatchHistory")
@Tag(name = "Batch History", description = "APIs for managing batch history records")
public class BatchHistoryController {

    @Autowired
    private batchHistoryService batchHistoryService;

    @Autowired
    private BatchHistoryOrchestratorService batchHistoryOrchestratorService;

    /**
     * Get all batch history records
     */
    @GetMapping("getAllHistory")
    @Operation(summary = "Get all batch history records")
    public List<BatchesHistory> getAllHistory() {
        return batchHistoryService.getAllHistory();
    }

    /**
     * Get history records for a specific batch
     */
    @GetMapping("getHistoryByBatchId/{batchId}")
    @Operation(summary = "Get history records for a specific batch")
    public List<BatchesHistory> getHistoryByBatchId(@PathVariable int batchId) {
        return batchHistoryService.getHistoryByBatchId(batchId);
    }

    /**
     * Get history records by status
     */
    @GetMapping("getHistoryByStatus/{status}")
    @Operation(summary = "Get history records by status")
    public List<BatchesHistory> getHistoryByStatus(@PathVariable Integer status) {
        return batchHistoryService.getHistoryByStatus(status);
    }

    /**
     * Get pending batches since last done batch up to yesterday
     */
    @GetMapping("getPendingBatchesSinceLastDone")
    @Operation(summary = "Get pending batches since last done batch")
    public List<BatchesHistory> getPendingBatchesSinceLastDone() {
        return batchHistoryService.getPendingBatchesSinceLastDone();
    }

    /**
     * Get pending batches for a specific batch name since the last done history for that batch name
     */
    @GetMapping("getPendingBatchesSinceLastDone/{batchName}")
    @Operation(summary = "Get pending batches for a specific batch name")
    public List<BatchesHistory> getPendingBatchesSinceLastDoneForBatch(@PathVariable String batchName) {
        return batchHistoryService.getPendingBatchesSinceLastDoneForBatch(batchName);
    }

    /**
     * Update bypass status for a history record
     */
    @PutMapping("updateBypassStatus/{historyId}/{bypassStatus}")
    @Operation(summary = "Update bypass status for a history record")
    public void updateBypassStatus(@PathVariable Long historyId, @PathVariable Integer bypassStatus) {
        batchHistoryService.updateBypassStatus(historyId, bypassStatus);
    }

    /**
     * Update status for a history record
     */


    /**
     * Process TP file using Spring Batch for one or more BatchesHistory IDs
     */
    @PostMapping("/processBatchHistory")
    @Operation(summary = "Process batch histories using Spring Batch")
    public ResponseEntity<?> processBatchHistory(@RequestParam List<Long> batchHIds) throws Exception {
        return batchHistoryOrchestratorService.processBatchHistories(batchHIds);
    }
    @PutMapping("updateStatus/{historyId}/{status}")
    @Operation(summary = "Update status of a batch history record")
    public void updateStatus(@PathVariable Long historyId, @PathVariable Integer status) {
        batchHistoryService.updateStatus(historyId, status);
    }

}

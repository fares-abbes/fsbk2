package com.mss.backOffice.controller;

import com.mss.backOffice.services.batchHistoryService;
import com.mss.unified.entities.BatchesFC;
import com.mss.unified.entities.BatchesHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("BatchHistory")
public class BatchHistoryController {

    @Autowired
    private batchHistoryService batchHistoryService;

    /**
     * Get all batch history records
     */
    @GetMapping("getAllHistory")
    public List<BatchesHistory> getAllHistory() {
        return batchHistoryService.getAllHistory();
    }

    /**
     * Get history records for a specific batch
     */
    @GetMapping("getHistoryByBatchId/{batchId}")
    public List<BatchesHistory> getHistoryByBatchId(@PathVariable int batchId) {
        return batchHistoryService.getHistoryByBatchId(batchId);
    }

    /**
     * Get history records by status
     */
    @GetMapping("getHistoryByStatus/{status}")
    public List<BatchesHistory> getHistoryByStatus(@PathVariable Integer status) {
        return batchHistoryService.getHistoryByStatus(status);
    }

    /**
     * Get pending batches since last done batch up to yesterday
     */
    @GetMapping("getPendingBatchesSinceLastDone")
    public List<BatchesFC> getPendingBatchesSinceLastDone() {
        return batchHistoryService.getPendingBatchesSinceLastDone();
    }

    /**
     * Get pending batches for a specific batch name since the last done history for that batch name
     */
    @GetMapping("getPendingBatchesSinceLastDone/{batchName}")
    public List<BatchesHistory> getPendingBatchesSinceLastDoneForBatch(@PathVariable String batchName) {
        return batchHistoryService.getPendingBatchesSinceLastDoneForBatch(batchName);
    }

    /**
     * Update bypass status for a history record
     */
    @PutMapping("updateBypassStatus/{historyId}/{bypassStatus}")
    public void updateBypassStatus(@PathVariable Long historyId, @PathVariable Integer bypassStatus) {
        batchHistoryService.updateBypassStatus(historyId, bypassStatus);
    }

  
}

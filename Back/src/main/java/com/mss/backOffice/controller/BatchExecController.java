package com.mss.backOffice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.mss.backOffice.services.BatchExecService;
import com.mss.unified.entities.BatchExec;
import com.mss.unified.entities.BatchesHistory;

/**
 * REST Controller for BatchExec operations.
 */
@RestController
@RequestMapping("batchExec")
public class BatchExecController {

    @Autowired
    private BatchExecService batchExecService;

    /**
     * Create batch history records for all batches within the date range of a BatchExec.
     * 
     * @param batchExecId The ID of the BatchExec record
     * @return List of created BatchesHistory records
     */
    @PostMapping("createBatchHistoryFromRange/{batchExecId}")
    public ResponseEntity<?> createBatchHistoryFromRange(@PathVariable Long batchExecId) {
        try {
            List<BatchesHistory> createdHistories = batchExecService.createBatchHistoryFromDateRange(batchExecId);
            return ResponseEntity.ok()
                    .body(String.format("Successfully created %d batch history records", createdHistories.size()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("Error creating batch history: " + e.getMessage());
        }
    }

    /**
     * Create a new BatchExec record with start and end dates.
     * 
     * @param startDate Start date of the range (format: yyyy-MM-dd)
     * @param endDate End date of the range (format: yyyy-MM-dd)
     * @return The created BatchExec record
     */
    @PostMapping("create")
    public ResponseEntity<?> createBatchExec(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        try {
            BatchExec batchExec = batchExecService.createBatchExec(startDate, endDate);
            return ResponseEntity.ok(batchExec);
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("Error creating BatchExec: " + e.getMessage());
        }
    }

    /**
     * Create a BatchExec and immediately create batch histories for the date range.
     * 
     * @param startDate Start date of the range (format: yyyy-MM-dd)
     * @param endDate End date of the range (format: yyyy-MM-dd)
     * @return Summary of created records
     */
    @PostMapping("createAndExecute")
    public ResponseEntity<?> createAndExecute(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date endDate) {
        try {
            // Create the BatchExec record
            BatchExec batchExec = batchExecService.createBatchExec(startDate, endDate);
            
            // Create batch histories for the date range
            List<BatchesHistory> createdHistories = batchExecService.createBatchHistoryFromDateRange(batchExec.getBatchExecId());
            
            return ResponseEntity.ok()
                    .body(String.format("Created BatchExec ID: %d and %d batch history records", 
                            batchExec.getBatchExecId(), createdHistories.size()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("Error creating BatchExec and histories: " + e.getMessage());
        }
    }

    /**
     * Get a BatchExec by ID.
     * 
     * @param batchExecId The ID of the BatchExec record
     * @return The BatchExec record
     */
    @GetMapping("get/{batchExecId}")
    public ResponseEntity<?> getBatchExec(@PathVariable Long batchExecId) {
        try {
            BatchExec batchExec = batchExecService.getBatchExec(batchExecId);
            return ResponseEntity.ok(batchExec);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            return ResponseEntity.internalServerError()
                    .body("Error retrieving BatchExec: " + e.getMessage());
        }
    }

    /**
     * Get all BatchExec records.
     * 
     * @return List of all BatchExec records
     */
    @GetMapping("getAll")
    public ResponseEntity<List<BatchExec>> getAllBatchExec() {
        try {
            List<BatchExec> batchExecs = batchExecService.getAllBatchExec();
            return ResponseEntity.ok(batchExecs);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().build();
        }
    }
}

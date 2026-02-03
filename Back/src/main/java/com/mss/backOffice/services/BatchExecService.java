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

import com.mss.unified.entities.BatchExec;
import com.mss.unified.entities.BatchesFC;
import com.mss.unified.entities.BatchesHistory;
import com.mss.unified.repositories.BatchExecRepository;
import com.mss.unified.repositories.BatchesFFCRepository;
import com.mss.unified.repositories.BatchesHistoryRepository;

/**
 * Service for managing BatchExec operations and creating batch history records
 * based on date ranges.
 */
@Service
public class BatchExecService {

    private static final Logger logger = LoggerFactory.getLogger(BatchExecService.class);

    @Autowired
    private BatchExecRepository batchExecRepository;

    @Autowired
    private BatchesHistoryRepository batchesHistoryRepository;

    @Autowired
    private BatchesFFCRepository batchesFCRepository;

    /**
     * Creates BatchesHistory records for each date in the BatchExec date range.
     * Creates ONE history record per date (not per batch per date).
     * Only creates a record if no batch history exists for that date.
     * 
     * @param batchExecId The ID of the BatchExec record containing start and end dates
     * @return List of created BatchesHistory records
     */
    @Transactional
    public List<BatchesHistory> createBatchHistoryFromDateRange(Long batchExecId) {
        logger.info("Creating batch history records from BatchExec ID: {}", batchExecId);
        
        // Get the BatchExec record
        BatchExec batchExec = batchExecRepository.findById(batchExecId)
                .orElseThrow(() -> new IllegalArgumentException("BatchExec not found with ID: " + batchExecId));
        
        Date startDate = batchExec.getStartDate();
        Date endDate = batchExec.getEndDate();
        
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("BatchExec must have both start and end dates");
        }
        
        if (startDate.after(endDate)) {
            throw new IllegalArgumentException("Start date must be before or equal to end date");
        }
        
        List<BatchesHistory> createdHistories = new ArrayList<>();
        
        // Iterate through each date in the range
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        
        Calendar endCalendar = Calendar.getInstance();
        endCalendar.setTime(endDate);
        endCalendar.set(Calendar.HOUR_OF_DAY, 23);
        endCalendar.set(Calendar.MINUTE, 59);
        endCalendar.set(Calendar.SECOND, 59);
        endCalendar.set(Calendar.MILLISECOND, 999);
        
        int totalCreated = 0;
        int totalSkipped = 0;
        
        while (!calendar.after(endCalendar)) {
            Date currentDate = calendar.getTime();
            logger.info("Processing date: {}", currentDate);
            
            // Check if ANY batch history already exists for this date
            if (!batchesHistoryRepository.existsByBatchHStartDate(currentDate)) {
                BatchesHistory history = createHistoryRecordForDate(currentDate, startDate, endDate);
                createdHistories.add(history);
                totalCreated++;
            } else {
                totalSkipped++;
                logger.debug("Skipped creating history for date {} - already exists", currentDate);
            }
            
            // Move to next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        
        logger.info("Batch history creation completed. Created: {}, Skipped: {}", totalCreated, totalSkipped);
        
        return createdHistories;
    }

    /**
     * Creates a BatchesHistory record for a specific date.
     * Sets the selectedStartDate and selectedEndDate from the BatchExec range.
     * The date goes into createdAt column.
     */
    private BatchesHistory createHistoryRecordForDate(Date currentDate, 
                                                      Date selectedStartDate, Date selectedEndDate) {
        BatchesHistory history = new BatchesHistory();
        
        // Set minimal fields - only what's needed
        history.setBatchId(null);
        history.setBatchName(null);
        history.setBatchType(null);
        history.setBatchLastExecution(null);
        
        // Set batchDate to the current date in the range (12, 13, 14, etc.)
        history.setBatchDate(currentDate);
        
        // Leave batch execution dates null
        history.setBatchHStartDate(null);
        history.setBatchHEndDate(null);
       
        // Set the selected date range from BatchExec
        history.setSelectedStartDate(selectedStartDate);
        history.setSelectedEndDate(selectedEndDate);
        
        // Initialize status and other fields as null/default
        history.setStatus(null);
        history.setErreur(null);
        history.setException(null);
        history.setBypassStatus(null);
        
        // createdAt will be set automatically by @PrePersist to current timestamp
        
        batchesHistoryRepository.save(history);
        
        logger.debug("Created history record for date {}", currentDate);
        
        return history;
    }

    /**
     * Get a BatchExec by ID.
     */
    public BatchExec getBatchExec(Long batchExecId) {
        return batchExecRepository.findById(batchExecId)
                .orElseThrow(() -> new IllegalArgumentException("BatchExec not found with ID: " + batchExecId));
    }

    /**
     * Create a new BatchExec record.
     */
    @Transactional
    public BatchExec createBatchExec(Date startDate, Date endDate) {
        BatchExec batchExec = new BatchExec();
        batchExec.setStartDate(startDate);
        batchExec.setEndDate(endDate);
        return batchExecRepository.save(batchExec);
    }

    /**
     * Get all BatchExec records.
     */
    public List<BatchExec> getAllBatchExec() {
        return batchExecRepository.findAll();
    }
}

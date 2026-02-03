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
     * For each batch in BatchesFC, creates a history record for each day in the range,
     * but only if no batch history exists for that date.
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
        
        // Get all batches from BatchesFC
        List<BatchesFC> allBatches = batchesFCRepository.findAll();
        
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
            
            // For each batch, create a history record for this date if it doesn't exist
            for (BatchesFC batch : allBatches) {
                // Check if a batch history already exists for this batch on this date
                if (!batchesHistoryRepository.existsByBatchIdAndDate(batch.getBatchId(), currentDate)) {
                    BatchesHistory history = createHistoryRecordForDate(batch, currentDate, startDate, endDate);
                    createdHistories.add(history);
                    totalCreated++;
                } else {
                    totalSkipped++;
                    logger.debug("Skipped creating history for batch {} on date {} - already exists", 
                            batch.getBatchName(), currentDate);
                }
            }
            
            // Move to next day
            calendar.add(Calendar.DAY_OF_MONTH, 1);
        }
        
        logger.info("Batch history creation completed. Created: {}, Skipped: {}", totalCreated, totalSkipped);
        
        return createdHistories;
    }

    /**
     * Creates a BatchesHistory record for a specific batch and date.
     * Sets the selectedStartDate and selectedEndDate from the BatchExec range.
     */
    private BatchesHistory createHistoryRecordForDate(BatchesFC batch, Date currentDate, 
                                                      Date selectedStartDate, Date selectedEndDate) {
        BatchesHistory history = new BatchesHistory();
        
        // Set basic batch information
        history.setBatch(batch);
        history.setBatchName(batch.getBatchName());
        history.setBatchType(batch.getBatchType());
        history.setBatchLastExecution(batch.getBatchLastExcution());
        
        // Set the execution date for this specific day
        history.setBatchHStartDate(currentDate);
        
        // Set end date as end of the same day
        Calendar endOfDay = Calendar.getInstance();
        endOfDay.setTime(currentDate);
        endOfDay.set(Calendar.HOUR_OF_DAY, 23);
        endOfDay.set(Calendar.MINUTE, 59);
        endOfDay.set(Calendar.SECOND, 59);
        endOfDay.set(Calendar.MILLISECOND, 999);
        history.setBatchHEndDate(endOfDay.getTime());
        
        // Set the selected date range from BatchExec
        history.setSelectedStartDate(selectedStartDate);
        history.setSelectedEndDate(selectedEndDate);
        
        // Initialize status and other fields
        history.setStatus(0); // Default status: 0 (pending)
        history.setErreur(batch.getError());
        history.setException(batch.getErrorStackTrace());
        history.setBypassStatus(0); // Default bypass status
        
        batchesHistoryRepository.save(history);
        
        logger.debug("Created history record for batch {} on date {}", batch.getBatchName(), currentDate);
        
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

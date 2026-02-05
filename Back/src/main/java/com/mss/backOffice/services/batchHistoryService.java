package com.mss.backOffice.services;

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

    @Transactional
    public void syncBatchByKey(String key) {
        batchesHistoryRepository.findByKeyfc(key).ifPresent(history -> {
            history.setStatus(1);
            history.setBatchHEndDate(new Date());
            batchesHistoryRepository.save(history);
            logger.info("Manually synced batch history with key: {}", key);
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
     * Returns the list of BatchesFC from the last done batch (batchStatus=1)
     * up to yesterday (excluding today's batches).
     * Logic:
     * 1. Find the last batch in BatchesFC where batchStatus = 1 (done)
     * 2. Get all batches where batchLastExecution is AFTER that batch's batchLastExecution
     * 3. Exclude batches from today (only include up to yesterday)
     */
    public List<BatchesFC> getPendingBatchesSinceLastDone() {
        // Step 1: Find the last done batch (batchStatus = 1) from BatchesFC table
        List<BatchesFC> doneBatches = batchesFCRepository.findLastDoneBatch();
        
        Date startDate;
        if (doneBatches != null && !doneBatches.isEmpty()) {
            // Get the first one (most recent done batch by batchLastExecution)
            BatchesFC lastDoneBatch = doneBatches.get(0);
            startDate = lastDoneBatch.getBatchLastExcution();
        } else {
            // If no done batch found, start from the earliest possible
            startDate = new Date(0);
        }

        // Step 2: Calculate start of today (midnight)
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date startOfToday = calendar.getTime();

        // Step 3: Get all batches after the last done batch but before today
        return batchesFCRepository.findBatchesAfterDateUntilYesterday(startDate, startOfToday);
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
}

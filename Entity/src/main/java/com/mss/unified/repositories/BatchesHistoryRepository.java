package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.BatchesHistory;

import java.util.List;
import java.util.Optional;

@Repository
public interface BatchesHistoryRepository extends JpaRepository<BatchesHistory, Long> {
    
    /**
     * Find all history records for a specific batch by batchId
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchId = :batchId ORDER BY bh.batchDate DESC")
    List<BatchesHistory> findByBatchId(int batchId);
    
    /**
     * Find the latest history record for a specific batch
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchId = :batchId ORDER BY bh.batchDate DESC")
    Optional<BatchesHistory> findLatestByBatchId(int batchId);
    
    /**
     * Check if a history record exists for a batch with specific batchHStartDate
     */
    boolean existsByBatchIdAndBatchHStartDate(int batchId, java.util.Date batchHStartDate);
    
    /**
     * Find history records by status
     */
    List<BatchesHistory> findByStatus(Integer status);
    
    /**
     * Find history records by batch name
     */
    List<BatchesHistory> findByBatchNameContainingIgnoreCase(String batchName);
    
    /**
     * Find history records by batch type
     */
    List<BatchesHistory> findByBatchType(String batchType);
    
    /**
     * Check if a history record exists for a specific batch on a specific date
     * Compares dates by truncating to day level (SQL Server compatible)
     */
    @Query(value = "SELECT COUNT(*) FROM FRANSABANK.BATCHES_HISTORY WHERE BATCH_ID = :batchId AND CAST(BATCH_H_STARTDATE AS DATE) = CAST(:date AS DATE)", nativeQuery = true)
    int countByBatchIdAndDate(int batchId, java.util.Date date);
    
    default boolean existsByBatchIdAndDate(int batchId, java.util.Date date) {
        return countByBatchIdAndDate(batchId, date) > 0;
    }
    
    /**
     * Check if any history record exists for a specific date (regardless of batch)
     * SQL Server compatible date comparison on CREATED_AT column
     */
    @Query(value = "SELECT COUNT(*) FROM FRANSABANK.BATCHES_HISTORY WHERE CAST(CREATED_AT AS DATE) = CAST(:date AS DATE)", nativeQuery = true)
    int countByBatchDate(java.util.Date date);

    default boolean existsByBatchHStartDate(java.util.Date date) {
        return countByBatchDate(date) > 0;
    }

    /**
     * Check if a history record exists for a specific date and batch name combination
     */
    @Query(value = "SELECT COUNT(*) FROM FRANSABANK.BATCHES_HISTORY WHERE CAST(BATCH_DATE AS DATE) = CAST(:date AS DATE) AND BATCH_NAME = :batchName", nativeQuery = true)
    int countByBatchDateAndBatchName(java.util.Date date, String batchName);
    
    default boolean existsByBatchDateAndBatchName(java.util.Date date, String batchName) {
        return countByBatchDateAndBatchName(date, batchName) > 0;
    }

    /**
     * Find the top history records for a batch name and status, ordered by batch date descending
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchName = :batchName AND bh.status = :status ORDER BY bh.batchDate DESC")
    List<BatchesHistory> findTopByBatchNameAndStatusOrderByBatchDateDesc(String batchName, Integer status);

    /**
     * Find history records for a batch name with batch date greater than the specified date and status not equal to 1
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchName = :batchName AND bh.batchDate > :startDate AND bh.status != 1 ORDER BY bh.batchDate ASC")
    List<BatchesHistory> findByBatchNameAndBatchDateGreaterThan(String batchName, java.util.Date startDate);

    /**
     * Find distinct batch_name values
     */
    @Query("SELECT DISTINCT bh.batchName FROM BatchesHistory bh WHERE bh.batchName IS NOT NULL")
    List<String> findDistinctBatchName();

    /**
     * Find pending batches for a specific batch_name with batch date after start date and status != specified status
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchName = :batchName AND bh.batchDate > :startDate AND bh.status != :status ORDER BY bh.batchDate ASC")
    List<BatchesHistory> findByBatchNameAndBatchDateAfterAndStatusNot(String batchName, java.util.Date startDate, Integer status);

    /**
     * Find history record by key
     */
    Optional<BatchesHistory> findByKeyfc(String keyfc);

    /**
     * Update status of a batch history record by ID
     */
    @Modifying(clearAutomatically = true)
    @Query("UPDATE BatchesHistory bh SET bh.status = :status WHERE bh.batchHId = :id")
    int updateStatusById(Integer status, Long id);
}

package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
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
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchId = :batchId ORDER BY bh.createdAt DESC")
    List<BatchesHistory> findByBatchId(int batchId);
    
    /**
     * Find the latest history record for a specific batch
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batchId = :batchId ORDER BY bh.createdAt DESC")
    Optional<BatchesHistory> findLatestByBatchId(int batchId);
    
    /**
     * Check if a history record exists for a batch with specific lastExecution date
     */
    @Query("SELECT CASE WHEN COUNT(bh) > 0 THEN true ELSE false END FROM BatchesHistory bh WHERE bh.batchId = :batchId AND bh.batchLastExecution = :lastExecution")
    boolean existsByBatchIdAndLastExecution(int batchId, java.util.Date lastExecution);
    
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
    int countByCreatedAt(java.util.Date date);
    
    default boolean existsByBatchHStartDate(java.util.Date date) {
        return countByCreatedAt(date) > 0;
    }
}

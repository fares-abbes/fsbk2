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
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batch.batchId = :batchId ORDER BY bh.createdAt DESC")
    List<BatchesHistory> findByBatchId(int batchId);
    
    /**
     * Find the latest history record for a specific batch
     */
    @Query("SELECT bh FROM BatchesHistory bh WHERE bh.batch.batchId = :batchId ORDER BY bh.createdAt DESC")
    Optional<BatchesHistory> findLatestByBatchId(int batchId);
    
    /**
     * Check if a history record exists for a batch with specific lastExecution date
     */
    @Query("SELECT CASE WHEN COUNT(bh) > 0 THEN true ELSE false END FROM BatchesHistory bh WHERE bh.batch.batchId = :batchId AND bh.batchLastExecution = :lastExecution")
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
     * Compares dates by truncating to day level
     */
    @Query(value = "SELECT CASE WHEN COUNT(*) > 0 THEN 1 ELSE 0 END FROM FRANSABANK.BATCHES_HISTORY WHERE BATCH_ID = :batchId AND TRUNC(BATCH_H_STARTDATE) = TRUNC(:date)", nativeQuery = true)
    boolean existsByBatchIdAndDate(int batchId, java.util.Date date);
    
    /**
     * Check if any history record exists for a specific date (regardless of batch)
     */
    @Query(value = "SELECT CASE WHEN COUNT(*) > 0 THEN 1 ELSE 0 END FROM FRANSABANK.BATCHES_HISTORY WHERE TRUNC(BATCH_H_STARTDATE) = TRUNC(:date)", nativeQuery = true)
    boolean existsByBatchHStartDate(java.util.Date date);
}

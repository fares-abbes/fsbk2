package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.BatchesFC;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository

public interface BatchesFFCRepository extends JpaRepository<BatchesFC, Integer> {
    Optional<BatchesFC> findByKey(String key);
    List<BatchesFC> findByBatchType(String type);
    @Transactional
    @Modifying
    @Query("update BatchesFC u set u.batchStatus =:status,u.batchEndDate=:last where u.key =:key")
    void updateFinishBatch(String key, Integer status, Date last);
    @Transactional
    @Modifying
    @Query("update BatchesFC u set u.batchStatus =:status,u.batchDate=:start where u.key =:key")
    void updateStart(String key, Integer status, Date start);
    @Transactional
    @Modifying
    @Query("update BatchesFC u set u.dateReg =:dateReg where u.key =:key")
    void updateDateReg(String dateReg,  String key);
    @Transactional
    @Modifying
    @Query("update BatchesFC u set u.batchStatus =:status, u.error=:error,u.batchEndDate=:last, u.errorStackTrace=:errorStackTrace where u.key =:key")
    void updateStatusAndErrorBatch(String key,Integer status,String error,Date last,String errorStackTrace);
    @Query("SELECT b FROM BatchesFC b WHERE b.batchDate >= :startDate AND b.batchDate < :endDate ORDER BY b.batchDate ASC")
    List<BatchesFC> findBatchesBetweenDates(Date startDate, Date endDate);

    // Find the last batch where batchStatus = 1 (done), ordered by batchLastExcution descending
    @Query("SELECT b FROM BatchesFC b WHERE b.batchStatus = 1 ORDER BY b.batchLastExcution DESC")
    List<BatchesFC> findLastDoneBatch();

    // Find batches where batchLastExcution is after startDate and before endDate (yesterday)
    @Query("SELECT b FROM BatchesFC b WHERE b.batchLastExcution > :startDate AND b.batchLastExcution < :endDate ORDER BY b.batchLastExcution ASC")
    List<BatchesFC> findBatchesAfterDateUntilYesterday(Date startDate, Date endDate);

}

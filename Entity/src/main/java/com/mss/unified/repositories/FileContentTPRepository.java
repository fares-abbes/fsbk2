package com.mss.unified.repositories;

import com.mss.unified.entities.FileContentTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FileContentTPRepository extends JpaRepository<FileContentTP, Integer> {

    @Modifying(clearAutomatically = true)
    @Query("DELETE FROM FileContentTP f WHERE f.batchHistory.batchHId = :batchHId")
    void deleteByBatchHistoryId(@Param("batchHId") Long batchHId);
}
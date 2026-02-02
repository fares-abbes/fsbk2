package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mss.unified.entities.FileContent;
import com.mss.unified.entities.FileProcessed;

public interface FileProcessedRepository extends JpaRepository<FileProcessed, Integer> {
	
	
	  @Query("SELECT e.id FROM FileProcessed e WHERE (  :startDate IS NULL OR e.fileDate>= :startDate) AND  (  :endDate IS NULL OR  e.fileDate<= :endDate)")
	    List<Integer> findIdByDateTakenBetween(@Param("startDate") String startDate, @Param("endDate") String endDate);

	  
	  @Query("SELECT e.id FROM FileProcessed e WHERE (  :startDate IS NULL OR e.fileDate=:startDate )")
	    List<Integer> findIdByDate(@Param("startDate") String startDate);
}

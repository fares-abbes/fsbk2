package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CroRejetControl;



public interface CroRejetControlRepository extends JpaRepository<CroRejetControl,Integer> {

//	
//	@Query("select e from CroRejetControl e Where e.dateReg like %:dateReg%"
//    	
//    	)
//	Page<CroRejetControl> findByDateReg(Pageable pageable,String dateReg);
	
	
	
    @Query("select e from CroRejetControl e Where e.processingDate BETWEEN CAST(:startProcessingDate as date) and CAST(:endProcessingDate as date) ")
	List<CroRejetControl> findByProcessingDate(String startProcessingDate,String endProcessingDate);
	
  @Query("select e.processingDate from CroRejetControl e Where e.processingDate=(  "
  		+ "SELECT max(t.processingDate)  FROM CroRejetControl t"
  		+ ")")
  List<Date> findMaxDateReg();
}

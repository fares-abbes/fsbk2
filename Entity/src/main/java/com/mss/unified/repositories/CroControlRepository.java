package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CroControl;



public interface CroControlRepository extends JpaRepository<CroControl,Integer> {

//	
	@Query("select e from CroControl e Where e.dateReg like %:dateReg%"
    	
    	)
	Page<CroControl> findByDateReg(Pageable pageable,String dateReg);
	
	
	
    @Query("select e from CroControl e Where e.processingDate BETWEEN CAST(:startProcessingDate as date) and CAST(:endProcessingDate as date) ")
	List<CroControl> findByProcessingDate(String startProcessingDate,String endProcessingDate);
	
  @Query("select e.processingDate from CroControl e Where e.processingDate=(  "
  		+ "SELECT max(t.processingDate)  FROM CroControl t"
  		+ ")")
  List<Date> findMaxDateReg();
}

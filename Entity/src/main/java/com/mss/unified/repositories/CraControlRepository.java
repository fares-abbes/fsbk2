package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CraControl;
import com.mss.unified.entities.TpControl;



public interface CraControlRepository extends JpaRepository<CraControl,Integer> {


	
//	Optional<CraControl> findByProcessingDate(String date);
//	
//    @Query("select e from CraControl e Where "
//    		+ "FORMAT(CONVERT(DATETIME,e.processingDate,102),'yyyy-MM-dd') BETWEEN CAST(:startProcessingDate  as date) and CAST(:endProcessingDate  as date) "
//    	)

//	Page<CroControl> findByDateReg(Pageable pageable,String dateReg);
	
	List<CraControl> findByProcessingDateAndLotType(String date,String lotType);
	
//    @Query("select e from CraControl e Where "
//    		+ "FORMAT(CONVERT(DATETIME,e.processingDate,102),'yyyy-MM-dd') BETWEEN CAST(:startProcessingDate  as date) and CAST(:endProcessingDate  as date) "
//    		//+ "and CAST(SUBSTRING(e.fileName,3,LEN(e.fileName)) as date) BETWEEN CAST(:startFileDate  as date) and CAST(:endFileDate  as date) "
//    	)
//	Page<CraControl> findByProcessingDate(String startProcessingDate,String endProcessingDate
////			,String startFileDate,String endFileDate
//			);
//    
    @Query("select e from CraControl e Where "
    		+ "CONVERT(DATE, SUBSTRING(e.processingDate, 1, 2) + '/' + SUBSTRING(e.processingDate, 3, 2) + '/' +"
    		+ " SUBSTRING(e.processingDate, 5, 4), 101) "
    	
    		+ "BETWEEN CAST(:startProcessingDate  as date) and CAST(:endProcessingDate  as date) "
    		//+ "and CAST(SUBSTRING(e.fileName,3,LEN(e.fileName)) as date) BETWEEN CAST(:startFileDate  as date) and CAST(:endFileDate  as date) "
    	)
    List<CraControl> findByProcessingDate(String startProcessingDate,String endProcessingDate
//			,String startFileDate,String endFileDate
			);
	
//  @Query("select e.processingDate from CraControl e Where e.processingDate=(  "
//  		+ "SELECT max(t.processingDate)  FROM CraControl t"
//  		+ ")")
//  List<Date> findMaxDateReg();
  
//  @Query("select CONVERT(DATE, SUBSTRING(e.processingDate, 1, 2) + '/' + SUBSTRING(e.processingDate, 3, 2) + '/' + SUBSTRING(e.processingDate, 5, 4), 101) from CraControl e Where CONVERT(DATE, SUBSTRING(e.processingDate, 1, 2) + '/' + SUBSTRING(e.processingDate, 3, 2) + '/' + SUBSTRING(e.processingDate, 5, 4), 101)="
//  		+ "(SELECT max( CONVERT(DATE, SUBSTRING(t.processingDate, 1, 2) + '/' + SUBSTRING(t.processingDate, 3, 2) + '/' + SUBSTRING(t.processingDate, 5, 4), 101) ) FROM CraControl t)")
    
    @Query(" SELECT e.processingDate FROM CraControl e WHERE e.processingDate = (SELECT MAX(t.processingDate) FROM CraControl t) ")
	  List<String> findMaxProcessingDate();

}

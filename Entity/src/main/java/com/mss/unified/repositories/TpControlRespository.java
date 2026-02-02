package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.TpControl;
import java.lang.String;

public interface TpControlRespository extends JpaRepository < TpControl, Integer > {
    @Query("select e from TpControl e Where "
    		+ "CAST(e.processingDate as date) BETWEEN CAST(:startProcessingDate  as date) and CAST(:endProcessingDate  as date) "
    		//+ "and CAST(SUBSTRING(e.fileName,3,LEN(e.fileName)) as date) BETWEEN CAST(:startFileDate  as date) and CAST(:endFileDate  as date) "
    	)
	Page<TpControl> findByProcessingDate(Pageable pageable,String startProcessingDate,String endProcessingDate
//			,String startFileDate,String endFileDate
			);
	
  @Query("select CAST(e.processingDate as date) from TpControl e Where CAST(e.processingDate as date)=(  "
  		+ "SELECT max(CAST(t.processingDate as date ))  FROM TpControl t"
  		+ ")")
  List<Date> findMaxProcessingDate();
  
//  @Query("select CAST(SUBSTRING(e.fileName,3,LEN(e.fileName)) as date) from TpControl e Where CAST(SUBSTRING(e.fileName,3,LEN(e.fileName)) as date)=(  "
//	  		+ "SELECT max(CAST(SUBSTRING(t.fileName,3,LEN(t.fileName)) as date))  FROM TpControl t"
//	  		+ ")")
//  List<Date> findMaxFileDate();
  
  
  Optional<TpControl> findByFileName(String filename);

}

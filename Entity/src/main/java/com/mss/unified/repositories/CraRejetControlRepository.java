package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CraControl;
import com.mss.unified.entities.CraRejetControl;
import com.mss.unified.entities.TpControl;



public interface CraRejetControlRepository extends JpaRepository<CraRejetControl,Integer> {


	List<CraRejetControl> findByProcessingDateAndLotType(String date,String lotType);

    @Query("select e from CraRejetControl e Where "
    		+ "CONVERT(DATE, SUBSTRING(e.craRejetDate, 1, 2) + '/' + SUBSTRING(e.craRejetDate, 3, 2) + '/' +"
    		+ " SUBSTRING(e.craRejetDate, 5, 4), 101) "
    	
    		+ "BETWEEN CAST(:startProcessingDate  as date) and CAST(:endProcessingDate  as date) "
    		//+ "and CAST(SUBSTRING(e.fileName,3,LEN(e.fileName)) as date) BETWEEN CAST(:startFileDate  as date) and CAST(:endFileDate  as date) "
    	)
	List<CraRejetControl> findByProcessingDate(String startProcessingDate,String endProcessingDate

			);
	

    
    @Query(" SELECT e.craRejetDate FROM CraRejetControl e WHERE e.craRejetDate = (SELECT MAX(t.craRejetDate) FROM CraRejetControl t) ")

	  List<String> findMaxProcessingDate();

}

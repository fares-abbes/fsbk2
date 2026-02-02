package com.mss.unified.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.LogAtm;


@Repository
public interface LogAtmRepository extends JpaRepository<LogAtm, Integer> {
	
	@Query("select s from LogAtm s where s.numAtm like %:atmNum% and s.anomlyDate > to_date(:date,'yyyy-MM-dd HH24:MI:SS')")
     Page< LogAtm> getLogAtms(Pageable pageable,  String atmNum, String date );
	
	@Query("select s from LogAtm s where s.numAtm like %:atmNum% ")
    Page< LogAtm> getLogAtmsWithouDate(Pageable pageable,  String atmNum );
	

}

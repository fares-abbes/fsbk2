package com.mss.unified.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.mss.unified.entities.OpeningDaySummary;

@Repository
public interface OpeningDaySummaryRepository extends JpaRepository<OpeningDaySummary, Integer> {
	//@Query("SELECT B from OpeningDaySummary B where B.fileDate like %:fileDate% and TRUNC(B.treatmentDate) = TO_DATE (:integrationDate, 'yyyy/MM/dd')")
	//TODO fix me	
	@Query("SELECT B FROM OpeningDaySummary B WHERE B.fileDate LIKE %:fileDate% AND B.treatmentDate = CAST(:integrationDate AS date)")
	Page<OpeningDaySummary> getAllWithIntegrationDate(Pageable pageable,String fileDate,String integrationDate );
	
	@Query("SELECT B from OpeningDaySummary B where B.fileDate like %:fileDate%")
	Page<OpeningDaySummary> getAllWithoutIntegrationDate(Pageable pageable,String fileDate );
	
	Optional<OpeningDaySummary> findByFileDate(String fileDate);
	
	@Query("SELECT B from OpeningDaySummary B where B.closed=0")
	Optional<OpeningDaySummary> findOpenedDay();

	
    @Transactional
	@Modifying
	@Query("update OpeningDaySummary u set u.closed =1,u.closeDate=:date where u.fileDate =:fileDate")
	void closeDay(Date date,String fileDate);
}   	


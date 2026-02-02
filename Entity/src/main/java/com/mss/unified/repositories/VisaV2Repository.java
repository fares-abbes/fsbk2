package com.mss.unified.repositories;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.VisaV2;

@Repository
public interface VisaV2Repository extends JpaRepository<VisaV2,Integer>{

	@Modifying
	@Transactional
	@Query("DELETE FROM VisaV2 CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);
}

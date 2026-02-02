package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.Tc04;
@Repository
public interface Tc04Repository extends JpaRepository<Tc04, Integer>{
	@Modifying
	@Transactional
	@Query("DELETE FROM Tc04 CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);

}

package com.mss.unified.repositories;

import com.mss.unified.entities.VisaRaport;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VisaRaportRepository extends JpaRepository<VisaRaport,Integer> {
	List<VisaRaport> findByRaportDateAndTypeAndCurrency(String raportDate,String type,String currency); 
	
	
	
	@Modifying
	@Transactional
	@Query("DELETE FROM VisaRaport CP WHERE CP.raportDate = :dateP")
	void deleteByRapportDate(@Param("dateP") String dateP);
}

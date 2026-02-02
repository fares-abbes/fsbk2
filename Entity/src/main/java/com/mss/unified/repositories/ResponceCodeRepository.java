package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.ResponseCode;

@Repository
public interface ResponceCodeRepository extends JpaRepository<ResponseCode,String> {
//	@Query("select distinct r.motifOpposition, r.description from ResponseCode r")
//	List <String[]> getAllMotifOpp();
	List<ResponseCode> findAllByOrderByMotifOppositionAsc();
//	
	@Query("select r from ResponseCode r where r.motifOpposition=:motif")
	List<ResponseCode> findOne(String motif);
	
	@Query("select r from ResponseCode r where r.responseCodeIso=:motif")
	Optional<ResponseCode> findByIso(String motif);

}

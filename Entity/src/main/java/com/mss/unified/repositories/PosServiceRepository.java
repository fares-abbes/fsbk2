package com.mss.unified.repositories;

import com.mss.unified.entities.PosService;
import com.mss.unified.entities.PosServiceConf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PosServiceRepository extends JpaRepository<PosService,Integer> {
	
	@Query("SELECT b FROM PosService b ORDER BY b.psCode DESC")
	public List<PosService> findAllWithSort();
	
	
	
	@Query("SELECT r from PosService r where r.cardType like %:cardType%")	
	List<PosService> findAllcardType(String cardType);

}

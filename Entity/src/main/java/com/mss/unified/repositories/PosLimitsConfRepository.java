package com.mss.unified.repositories;

import com.mss.unified.entities.PosLimitsConf;
import com.mss.unified.entities.PosService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PosLimitsConfRepository  extends JpaRepository<PosLimitsConf,Integer> {

	  @Query("SELECT l.plcCode, l.plcLibelle FROM PosLimitsConf l")
	  List<PosLimitsConf> findAllPosLimitsConfs();
	 
	  @Query("SELECT r from PosLimitsConf r where r.plcLibelle like %:plcLibelle%")	
		List<PosLimitsConf> findAllplcLibelle(String plcLibelle);
}

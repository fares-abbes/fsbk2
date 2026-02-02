package com.mss.unified.repositories;

import com.mss.unified.entities.PosServiceConf;
import com.mss.unified.entities.TpeRequest;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PosServicesConfRepository  extends JpaRepository<PosServiceConf,Integer> {
	@Query("SELECT r from PosServiceConf r where r.pscLibelle like %:pscLibelle%")	
	List<PosServiceConf> findAllBypscLibelle(String pscLibelle);

}

package com.mss.unified.repositories;

import com.mss.unified.entities.PosAllowedTransConf;
import com.mss.unified.entities.PosService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PosAllowedTransactionConfRepository  extends JpaRepository<PosAllowedTransConf,Integer> {

	 @Query("SELECT c FROM PosAllowedTransConf c where c.patcLibelle = :libelle")
	 PosAllowedTransConf findByLibelle(String libelle);
	 
	 
	 @Query("SELECT r from PosAllowedTransConf r where r.patcLibelle like %:patcLibelle%")	
		List<PosAllowedTransConf> findAllpatcLibelle(String patcLibelle);
}

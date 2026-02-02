package com.mss.unified.repositories;

import com.mss.unified.entities.PosAllowedTransConf;
import com.mss.unified.entities.PosBinConf;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PosBinConfRepository extends JpaRepository<PosBinConf, Integer> {
	 @Query("SELECT r from PosBinConf r where r.pbcLibelle like %:pbcLibelle%")	
		List<PosBinConf> findAllpbcLibelle(String pbcLibelle);
}

package com.mss.unified.repositories;

import com.mss.unified.entities.PosBin;
import com.mss.unified.entities.PosService;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface PosBinRepository extends JpaRepository<PosBin, Integer> {
	
	@Query("SELECT b FROM PosBin b ORDER BY b.binCode DESC")
	public List<PosBin> findAllWithSort();
	
	
	@Query("SELECT r from PosBin r where r.lowPrefix like %:lowPrefix%")	
	List<PosBin> findAlllowPrefix(String lowPrefix);
	
}

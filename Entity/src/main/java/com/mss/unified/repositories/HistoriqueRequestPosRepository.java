package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.HistoriqueRequestPos;
import com.mss.unified.entities.PosTerminal;

@Repository
public interface HistoriqueRequestPosRepository extends JpaRepository<HistoriqueRequestPos,Integer>{

	@Query("SELECT r from HistoriqueRequestPos r where r.requestCode=:requestCode")	
	List<HistoriqueRequestPos> getAllHistoriqueRequestPos(int requestCode);
}

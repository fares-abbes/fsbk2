package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.HistoriqueCommercant;

@Repository
public interface HistoriqueCommercantRepository extends JpaRepository<HistoriqueCommercant,Integer>{

	@Query("SELECT r from HistoriqueCommercant r where r.merchantCode=:merchantCode")	
	List<HistoriqueCommercant> getAllHistoriqueCommercant(int merchantCode);
}

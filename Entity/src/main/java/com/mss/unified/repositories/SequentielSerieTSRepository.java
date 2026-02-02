package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.SequentielSerieTS;

public interface SequentielSerieTSRepository extends JpaRepository<SequentielSerieTS,Integer>  {

	@Query("SELECT r from SequentielSerieTS r where r.dateG=:dateG")	
	List<SequentielSerieTS> findAllSequentielSerieTSByDate(String dateG);
}

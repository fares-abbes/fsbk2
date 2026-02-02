package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SequentielSerie;

@Repository
public interface SequentielSerieRepository extends JpaRepository<SequentielSerie,Integer>  {
	
	@Query("SELECT r from SequentielSerie r where r.dateG=:dateG")	
	List<SequentielSerie> findAllSequentielSerieByDate(String dateG);

}

package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SequentielSerieBS;

@Repository
public interface SequentielSerieBSRepository extends JpaRepository<SequentielSerieBS,Integer>  {

	@Query("SELECT r from SequentielSerieBS r where r.dateG=:dateG")	
	List<SequentielSerieBS> findAllSequentielSerieBSByDate(String dateG);
}

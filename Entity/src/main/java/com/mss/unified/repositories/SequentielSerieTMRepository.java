package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SequentielSerieTM;

@Repository
public interface SequentielSerieTMRepository extends JpaRepository<SequentielSerieTM,Integer>{
	
	@Query("SELECT r from SequentielSerieTM r where r.dateG=:dateG")	
	List<SequentielSerieTM> findAllSequentielSerieTMByDate(String dateG);

}

package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SequentielSerieBM;

@Repository
public interface SequentielSerieBMRepository extends JpaRepository<SequentielSerieBM,Integer>  {

	@Query("SELECT r from SequentielSerieBM r where r.dateG=:dateG")	
	List<SequentielSerieBM> findAllSequentielSerieBMByDate(String dateG);
}

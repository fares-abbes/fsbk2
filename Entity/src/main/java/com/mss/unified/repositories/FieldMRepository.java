package com.mss.unified.repositories;


import com.mss.unified.entities.FieldM;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public
interface FieldMRepository extends JpaRepository<FieldM,String > {
	
	Optional<FieldM> findByFieldMValue(String value);
	  @Query("SELECT r from FieldM r where r.libelle like %:libelle%")
	    List<FieldM> findAllByLibelle(String libelle);


}

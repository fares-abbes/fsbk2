package com.mss.unified.repositories;


import com.mss.unified.entities.FieldH;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public
interface FieldHRepository extends JpaRepository<FieldH,String > {
	 Optional<FieldH> findByCameraValue(String id);
	    @Query("SELECT r from FieldH r where r.libelle like %:libelle%")
	    List<FieldH> findAllByLibelle(String libelle);
}

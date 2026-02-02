package com.mss.unified.repositories;


import com.mss.unified.entities.EnhancedConfigParamLoad;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public
interface EnhancedConfigParamLoadRepository extends JpaRepository<EnhancedConfigParamLoad, Integer> {
	 Optional<EnhancedConfigParamLoad> findByEcplCode(int code);

	  @Query("SELECT r from EnhancedConfigParamLoad r where r.libelle like %:libelle%")
	  List<EnhancedConfigParamLoad> findAllByLibelle(String libelle);

}

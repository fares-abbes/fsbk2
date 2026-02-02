package com.mss.unified.repositories;


import com.mss.unified.entities.AtmMarque;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmMarqueRepository  extends JpaRepository<AtmMarque,Integer> {
	
	@Query("select s from AtmMarque s where s.libelle like %:libelle%")
    Page<AtmMarque> getPageAtmMarque(Pageable pageable,String libelle);
	
	@Query("select s from AtmMarque s where s.libelle=:libelle")
	AtmMarque getAtmMarqueBylibelle(String libelle);

}

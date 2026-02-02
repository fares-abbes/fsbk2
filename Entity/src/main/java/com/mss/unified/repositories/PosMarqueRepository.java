package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.PosMarque;

@Repository
public interface PosMarqueRepository extends JpaRepository<PosMarque, Integer> {
	
	@Query("select s from PosMarque s where s.libelle like %:libelle%")
    Page<PosMarque> getPagePosMarque(Pageable pageable,String libelle);
	
	@Query("select s from PosMarque s where s.libelle=:libelle")
    PosMarque getPosMarqueBylibelle(String libelle);
	
	@Query("select s from PosMarque s where s.libelle like %:libelle%")
    List<PosMarque> getPagePosMarque(String libelle);
}

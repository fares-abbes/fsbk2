package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.EligiblePos;

@Repository
public interface EligiblePosRepository extends JpaRepository<EligiblePos,Integer > {

	Optional<EligiblePos> findByChapter(String chapter);
	@Query("select s from EligiblePos s where s.label like %:libelle%")
    Page<EligiblePos> getPageEligiblePos(Pageable pageable,String libelle);
}

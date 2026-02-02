package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.PosStock;

@Repository
public interface PosStockRepository extends JpaRepository<PosStock,Integer> {
	
	@Query("select s from PosStock s where s.model=:libelle")
    Page<PosStock> getPagePosStock(Pageable pageable,Integer libelle);
	@Query("select s from PosStock s")
    Page<PosStock> getPagePosStock(Pageable pageable);
	
	@Query("select s from PosStock s where s.model=:libelle")
    PosStock getPosStockByMode(Integer libelle);
	
	@Query("select s from PosStock s where s.model=:libelle")
    List<PosStock> getPagePosStockByLibelle(Integer libelle);

}

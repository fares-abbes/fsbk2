package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.PosModel;

@Repository
public interface PosModelRepository extends JpaRepository<PosModel, Integer>{
	
	@Query("select s from PosModel s where s.libelle like %:libelle%")
    Page<PosModel> getPagePosModel(Pageable pageable,String libelle);
	
	@Query("select s from PosModel s where s.modelCode=:codeModel")
    PosModel getOneByCode(Integer codeModel);
	
	@Query("select s from PosModel s where s.libelle=:libellel")
    PosModel getOneByLibelle(String libellel);
	
	@Query("select a from PosModel a,PosStock t where a.modelCode=t.model and t.stockDisponible>0")
    List<PosModel> getAllModelStock();
	
	@Query("select s from PosModel s where s.marqueCode=:codeMarque")
    List<PosModel> getAllModelByCodeMarque(Integer codeMarque);
	
	@Query("select s from PosModel s where s.libelle like %:libelle%")
    List<PosModel> getPagePosModel(String libelle);

}

package com.mss.unified.repositories;


import com.mss.unified.entities.AtmModel;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtmModelRepository extends JpaRepository<AtmModel,Integer> {
    @Query("Select e from AtmModel e Where e.marqueCode=:marqueCode ")
    Optional<List<AtmModel>> findByMarqueCode (@Param("marqueCode") Integer marqueCode);
    
    @Query("select s from AtmModel s where s.libelle like %:libelle%")
    Page<AtmModel> getPageAtmModel(Pageable pageable,String libelle);
	
	@Query("select s from AtmModel s where s.modelCode=:codeModel")
	AtmModel getOneByCode(Integer codeModel);
	
	@Query("select s from AtmModel s where s.libelle=:libelle")
	AtmModel getOneByLibelle(String libelle);

}

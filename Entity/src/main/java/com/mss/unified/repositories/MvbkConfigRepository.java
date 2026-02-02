package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.DayOperationFransaBank;
import com.mss.unified.entities.MvbkConf;
import com.mss.unified.entities.MvbkSettlement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MvbkConfigRepository extends JpaRepository<MvbkConf, Integer> {
	List<MvbkConf> findByCategorie(int categorie);
	List<MvbkConf> findByStatusLevel(String statusLevel);
	@Query("SELECT DISTINCT m.categorie FROM MvbkConf m WHERE m.statusLevel = :statusLevel  ")
	List<Integer> findDistinctByStatusLevel(String statusLevel);
@Query("SELECT DISTINCT libelle_operation  FROM MvbkConf m")
List<String> findDistinctBylibs();
@Query("SELECT m FROM MvbkConf m where  m.libelle_operation=:libelle_operation")
Page<MvbkConf> findBylibelleOperation(Pageable pageable,String libelle_operation);

	@Query("SELECT DISTINCT m.categorie FROM MvbkConf m")
	List<String> findDistinctByCategorie();
	@Query("SELECT DISTINCT m.categorie FROM MvbkConf m WHERE m.categorie BETWEEN :startCategory AND :endCategory")
	List<Integer> findDistinctByCategoryRange(@Param("startCategory") int startCategory, @Param("endCategory") int endCategory);
	@Query("SELECT m FROM MvbkConf m where  m.categorie=:categorie")
	Page<MvbkConf> findByCategorie(Pageable pageable,Integer categorie);
}

package com.mss.unified.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.UAPFransaBankHistory;
@Repository

public interface UAPFransaBankHistoryRepository extends JpaRepository<UAPFransaBankHistory, Integer>, JpaSpecificationExecutor<UAPFransaBankHistory>{
	
	
	@Query("SELECT u FROM UAPFransaBankHistory u WHERE  "
			+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
		

			+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
			+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
			+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
			+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
			+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
			+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
			+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAPFransaBankHistory> filter(Pageable pageable, String typeTransaction,
			
			String codeBin, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAPFransaBankHistory u WHERE  "
	+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "

	+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
	+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
	+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
	+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
	+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
	+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
	+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
	+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) "
	+ "AND u.statusTechnique='000' AND u.accepted is null")
Page<UAPFransaBankHistory> filterAcceptedUap(Pageable pageable, String typeTransaction, 
		 
		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	@Query("SELECT u FROM UAPFransaBankHistory u WHERE  "
	+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
	
	+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
	+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
	+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
	+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
	+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
	+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
	+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
	+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) "
	+ "AND u.statusTechnique is not null  AND u.statusTechnique!='000'")
Page<UAPFransaBankHistory> filterUapWithProblem(Pageable pageable, String typeTransaction, 
	

		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAPFransaBankHistory u WHERE  "
	+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
	
	+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
	+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
	+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
	+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
	+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
	+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
	+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
	+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) "
	+ "AND u.statusTechnique='000' AND u.accepted='1'")
Page<UAPFransaBankHistory> filterRejectedUap(Pageable pageable, String typeTransaction,
	
		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAPFransaBankHistory u WHERE  "
	+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
	
	+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
	+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
	+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
	+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
	+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
	+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
	+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
	+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) "
	+ "AND u.statusTechnique is null ")
Page<UAPFransaBankHistory> filterWaitingUap(Pageable pageable, String typeTransaction, 
	

		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
 
}

package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import com.mss.unified.entities.UAP040INHistory;


public interface UAP040INFransaBankHistoryRepository extends JpaRepository<UAP040INHistory, Integer>, JpaSpecificationExecutor<UAP040INHistory> {

//	@Query("select UAP040INHistory from UAP040IN A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  , A.typeCarteDebit , A.numSeq,A.numOrdre , A.cle )=:pan ")
//	List<UAP040INHistory> findBYNumAutorisationAndPAN(String numAutorisation, String pan);
	List<UAP040INHistory> findByRio(String rio);
	List<UAP040INHistory> findByRioAndMotifRejet(String rio,String motifRejet);
 	@Query("select A from UAP040INHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  , A.typeCarteDebit , A.numSeq,A.numOrdre , A.cle )=:pan and A.flag='2' and motifRejet!='002' and A.numTransaction=:numTransaction")
	List<UAP040INHistory> findRejectedOnes(String numAutorisation,String pan,String numTransaction);
 	@Query("select A from UAP040INHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
 	List<UAP040INHistory> findinHistorys(String numAutorisation,String pan,String numTransaction);
    List<UAP040INHistory> findByCopiedAndFlag(String copied,String flag);  
    
    
	@Query("SELECT u FROM UAP040INHistory u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
			+ "AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) "
			+ "AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) "
			+ "AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) "
			+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
			+ "AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) "
			+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
			+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
			+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
			+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
			+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
			+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
			+ "AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) "
			+ "AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) "
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND "
			+ "( accepted=:accepted OR :accepted IS NULL )")
	Page<UAP040INHistory> filterErWithStatus(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String accepted);
	
	
	
	@Query("SELECT u FROM UAP040INHistory u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
			+ "AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) "
			+ "AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) "
			+ "AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) "
			+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
			+ "AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) "
			+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
			+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
			+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
			+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
			+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
			+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
			+ "AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) "
			+ "AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) "
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND "
			+ "( accepted='3' OR accepted IS NULL )")
	Page<UAP040INHistory> filterErNotYetMatched(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAP040INHistory u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
			+ "AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) "
			+ "AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) "
			+ "AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) "
			+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
			+ "AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) "
			+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
			+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
			+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
			+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
			+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
			+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
			+ "AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) "
			+ "AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) "
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND u.accepted='2' AND "
			+ "u.flag like :flag% ")
	Page<UAP040INHistory> filterErExtra(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String flag);
	
	
	
	@Query("SELECT u FROM UAP040INHistory u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
			+ "AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) "
			+ "AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) "
			+ "AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) "
			+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
			+ "AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) "
			+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
			+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
			+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
			+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
			+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
			+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
			+ "AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) "
			+ "AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) "
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND u.accepted='2' AND "
			+ "u.flag is null")
	Page<UAP040INHistory> filterErExtraWaiting(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

}

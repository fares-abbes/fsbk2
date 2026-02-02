package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.UAP040INHistory;
import com.mss.unified.entities.UAP050IN;
import com.mss.unified.entities.UAP051FransaBank;
import com.mss.unified.entities.UAP051IN;
import com.mss.unified.entities.UAP051INRHistory;


public interface UAP051INRFransaBankHistoryRepository extends JpaRepository<UAP051INRHistory, Integer>{
	@Query("select A from UAP051INRHistory A where A.accepted is null ")
	List<UAP051IN> getNotOk();
	
	@Query("select A from UAP051INRHistory A where A.accepted ='1' ")
	List<UAP051IN> getListUAPINByStatusAccepted();
	
	@Query("select A from UAP051INRHistory A where A.accepted ='1' and A.fileDate=:fileDate")
	List<UAP051IN> getListUAPINReglementByStatusAccepted(String fileDate);
	
	  @Query("select A from UAP051INRHistory A where A.accepted is null or A.accepted='3' ")
	    List<UAP051IN> getListUAPIN();
		List<UAP051INRHistory> findByRio(String rio);

	@Query("SELECT u FROM UAP051INRHistory u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAP051IN> filter(Pageable pageable, String typeTransaction, String typePaiement,
			String numRIBcommercant, String numContratAccepteur, String codeBin, String numTransaction,
			String dateTransactionS, String dateTransactionE, String dateDebutValiditeCarteS,
			String dateDebutValiditeCarteE, String dateFinValiditeCarteS, String dateFinValiditeCarteE,
			String dateRemiseS, String dateRemiseE, String numAutorisation);
 	@Query("select A from UAP051INRHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  , A.typeCarte , A.numSeq,A.numOrdre , A.cle  )=:pan and A.flag='2' and motifRejet!='002' and A.numTransaction=:numTransaction")
	List<UAP051INRHistory> findRejectedOnes(String numAutorisation,String pan,String numTransaction);
 	@Query("select A from UAP051INRHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
 	List<UAP051INRHistory> findinHistorys(String numAutorisation,String pan,String numTransaction);
    List<UAP051INRHistory> findByCopiedAndFlag(String copied,String flag);  

	@Query("SELECT u FROM UAP051INRHistory u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND ( accepted!='1'  or  accepted Is Null ) ")
	Page<UAP051IN> filterEr(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
}

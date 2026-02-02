package com.mss.unified.repositories;

import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.UAP040IN;
import com.mss.unified.entities.UAP040INHistory;
import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAP050IN;
import com.mss.unified.entities.UAPFransaBank;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UAP040INFransaBankRepository extends JpaRepository<UAP040IN, Integer>, JpaSpecificationExecutor<UAP040IN> {
//	@Query("SELECT id FROM UAP040IN h where h.accepted= :accepted ")
	@Query("SELECT id FROM UAP040IN h WHERE h.accepted = :accepted  and copied=:copied and flag=:flag")
	List<Integer> findAllIds(String accepted,String flag,String copied);
	@Query("SELECT id FROM UAP040IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted and (flag is null or flag   not like '%2%')")
	List<Integer> findAllIdsnotrejected(String accepted);
	@Query("SELECT id FROM UAP040IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted and (flag is null or flag!='1')")
	List<Integer> findAllIdsnotaccepted(String accepted);

	@Query("SELECT id FROM UAP040IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted   AND flag is null ")
	List<Integer> findAllIdsAndFlagNull(String accepted);

	@Query("select sum(A.montantAComponser) from UAP040IN A ")
	String getTotalAmount();

	List<UAP040IN> findByFlag(String flag);

	List<UAP040IN> findByFlagAndAccepted(String flag, String accepted);
	List<UAP040IN> findByFlagAndAcceptedAndCopied(String flag, String accepted,String copied);

	List<UAP040IN> findByRio(String rio);

	@Query("Select count(*) from UAP040IN A ")
	int getNmbreOpreration();

	@Query("select  A.fileDate from UAP040IN A")
	List<String> findDate();

	@Query("SELECT u FROM UAP040IN u WHERE "
			+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) ")
	Page<UAP040IN> filter(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP040IN u WHERE "
			+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND ( accepted!='1'  or  accepted Is Null ) ")
	Page<UAP040IN> filterEr(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	@Query("SELECT u FROM UAP040IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP040IN> filterErWithStatus(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String accepted);
	
	
	
	@Query("SELECT u FROM UAP040IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP040IN> filterErNotYetMatched(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAP040IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP040IN> filterErExtra(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String flag);
	
	
	
	@Query("SELECT u FROM UAP040IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP040IN> filterErExtraWaiting(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP040IN u WHERE "
			+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)  AND (( :accepted   IS NULL  AND (accepted='2'  or  accepted='NOT OK' )) OR accepted=:accepted ) AND flag is null")
	Page<UAP040IN> filterNotMatched(Pageable pageable, String typeTransaction, String typePaiement,
			String numRIBcommercant, String numContratAccepteur, String codeBin, String numTransaction,
			String dateTransactionS, String dateTransactionE, String dateDebutValiditeCarteS,
			String dateDebutValiditeCarteE, String dateFinValiditeCarteS, String dateFinValiditeCarteE,
			String dateRemiseS, String dateRemiseE, String numAutorisation, String accepted);

	@Query("SELECT u FROM UAP040IN u WHERE flag ='22' or flag='24'")
	Page<UAP040IN> filterPending(Pageable pageable);

	@Query("SELECT u FROM UAP040IN u WHERE flag ='22' or flag='24'")
	List<UAP040IN> filterPending();

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP040IN A ")
	Long getTotalAmountIN();

	@Query("select A from UAP040IN A where (A.accepted is null or A.accepted='3') and A.fileIntegrationDate=:fileIntegration ")
	List<UAP040IN> getListUAPIN(String fileIntegration);

	@Query("select A from UAP040IN A where A.accepted !='3' and A.fileIntegrationDate=:fileIntegration")
	List<UAP040IN> getListUAPINByStatusAccepted(String fileIntegration);

	@Query("select A from UAP040IN A where A.accepted is null and A.fileIntegrationDate=:fileIntegration ")
	List<UAP040IN> getNotOk(String fileIntegration);

	@Query("select count(*) from UAP040IN A where (A.accepted='2' or accepted='NOT OK') and A.fileIntegrationDate=:fileIntegration")
	Integer sizeNotMatched(String fileIntegration);

	@Query("select A from UAP040IN A where (A.accepted is null or A.accepted='3')")
	List<UAP040IN> getListUAPIN();
	@Query("select A from UAP040IN A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
	List<UAP040IN> findinHistorys(String numAutorisation,String pan,String numTransaction);
	@Query("select A from UAP040IN A where A.accepted !='3'   and A.bkmGeneration is null ")
	List<UAP040IN> getListUAPINByStatusAccepted();

	@Query("select A from UAP040IN A where A.accepted is null")
	List<UAP040IN> getNotOk();

	@Query("select count(*) from UAP040IN A where (A.accepted='2' or accepted='NOT OK')  ")
	Integer sizeNotMatched();

	@Query("select count(*) from UAP040IN A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	Integer sizeNotMatchedAndEmptyFlag();
	@Query("select A from UAP040IN A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	List<UAP040IN>  findByMatchedAndEmptyFlag();

	@Query("select count(*) from UAP040IN A where A.flag='20'")
	Integer numberOfGeneratedLots();

	/*
	 * @Query("select A from UAP040IN A where A.accepted ='1' and fileDate=:fileDate"
	 * ) List<UAP040IN> getListUAPINByStatusAcceptedAndDate(String fileDate);
	 */
	@Query("select A from UAP040IN A where A.accepted ='1'")
	List<UAP040IN> getListUAPINByStatusAcceptedAndDate();

//	@Query("select A from UAP040IN A where   CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
	@Query("select A from UAP040IN A where  (A.accepted ='1' or A.flag='1' ) and CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
	List<UAP040IN> getListUAPINByStatusAcceptedAndDateNew(String today);

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP040IN A where CONVERT(DATE,A.dateReg)= CONVERT(DATE,:today)")
	Long getTotalAmountPositif040In(String today);
//	@Query("SELECT  DISTINCT A.dateReg from UAP040IN A   where (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)   ")

	@Query("SELECT  DISTINCT A.dateReg from UAP040IN A   where   CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)   ")
	List<String> findDistinctRegDates(String today);
	@Query("select A from UAP040IN A where A.accepted not in ('3','1') ")
	List<UAP040IN> getUap040ForGenerating140();

	@Query("select A from UAP040IN A where A.accepted !='3' and done='1'")
	List<UAP040IN> getListUAPINByStatusAcceptedAndDone();

	@Query("select A from UAP040IN A where CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
	List<UAP040IN> findReglementByDate(String today);

	@Query("select A from UAP040IN A where A.accepted ='3'")
	List<UAP040IN> getExtraUap();
	
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP040IN A where A.accepted ='1' and A.dateReg=:dateReg")
	List<UapDetailsControl> getAcceptedUap40In(String dateReg);
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP040IN A where A.accepted ='NOT OK' and A.dateReg=:dateReg")
	List<UapDetailsControl> getRejectedUap40In(String dateReg);
	
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP040IN A where A.accepted ='2' and A.dateReg=:dateReg")
	List<UapDetailsControl> getExtraUap40In(String dateReg);
	
	
	
//	@Query("select A"
//			+" from UAP040IN A where A.flag in ('20','24','22','23') and A.fileIntegrationDate=:fileDate")
//	List<UAP040IN> getListUAP40NotAcceptedForControl(String fileDate);
	

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
			+" from UAP040IN A where A.flag='21' and A.fileIntegrationDate=:fileDate")
	List<UapDetailsControl> getListUAP40AcceptedForControl(String fileDate);

    List<UAP040IN> findByCopiedAndFlag(String copied,String flag); 

	
}

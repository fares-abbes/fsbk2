package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.UAP040IN;
import com.mss.unified.entities.UAP050IN;
import com.mss.unified.entities.UAP051FransaBank;
import com.mss.unified.entities.UAP051IN;
import com.mss.unified.entities.UAP051INHistory;

public interface UAP051INFransaBankRepository extends JpaRepository<UAP051IN, Integer>, JpaSpecificationExecutor<UAP051IN> {
	@Query("select A from UAP051IN A where A.accepted is null ")
	List<UAP051IN> getNotOk();
	@Query("select A from UAP051IN A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
	List<UAP051IN> findinHistorys(String numAutorisation,String pan,String numTransaction);
	@Query("SELECT id FROM UAP051IN h WHERE h.accepted = :accepted  and copied=:copied")
	List<Integer> findAllIds(String accepted,String copied);
	@Query("SELECT id FROM UAP051IN h WHERE h.accepted = :accepted  and copied=:copied and flag=:flag")
	List<Integer> findAllIds(String accepted,String flag,String copied);
	@Query("SELECT id FROM UAP051IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP051IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted   and (flag is null or flag   not like '%2%') ")
	List<Integer> findAllIdsnotrejected(String accepted);

	@Query("SELECT id FROM UAP051IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP051IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted   and (flag is null or flag !='1') ")
	List<Integer> findAllIdsnotaccepted(String accepted);

//    @Query("SELECT id FROM UAP051IN h where h.accepted= :accepted ")
//    List<Integer> findAllIds(String accepted);

	@Query("select A from UAP051IN A where A.accepted !='3' and A.fileIntegrationDate=:fileIntegration ")
	List<UAP051IN> getListUAPINByStatusAccepted(String fileIntegration);

	List<UAP051IN> findByFlag(String flag);

	List<UAP051IN> findByFlagAndAccepted(String flag, String accepted);
	List<UAP051IN> findByFlagAndAcceptedAndCopied(String flag, String accepted,String copied);

	@Query("select A from UAP051IN A where A.accepted !='3'   and A.bkmGeneration is null  ")
	List<UAP051IN> getListUAPINByStatusAccepted();

	@Query("select A from UAP051IN A where A.accepted !='3' and done='1' ")
	List<UAP051IN> getListUAPINByStatusAcceptedAndDone();

	/*
	 * @Query("select A from UAP051IN A where A.accepted ='1' and A.fileDate=:fileDate"
	 * ) List<UAP051IN> getListUAPINReglementByStatusAccepted(String fileDate);
	 */
	@Query("select count(*) from UAP051IN A where (A.accepted='2' or accepted='NOT OK') ")
	Integer sizeNotMatched();

	@Query("select count(*) from UAP051IN A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	Integer sizeNotMatchedAndEmptyFlag();

	@Query("select A from UAP051IN A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	List<UAP051IN> findByMatchedAndEmptyFlag();

	@Query("select count(*) from UAP040IN A where A.flag='20'")
	Integer numberOfGeneratedLots();

	List<UAP051IN> findByRio(String rio);

	@Query("select A from UAP051IN A where  ( A.accepted ='1' or A.flag='1') and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	List<UAP051IN> getListUAPINReglementByStatusAccepted(String today);
//	@Query("select A from UAP051IN A where  CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
//	List<UAP051IN> getListUAPINReglementByStatusAccepted(String today);

	@Query("select A from UAP051IN A where (A.accepted is null or A.accepted='3')")
	List<UAP051IN> getListUAPIN();

	@Query("SELECT u FROM UAP051IN u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAP051IN> filter(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP051IN u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND ( accepted!='1'  or  accepted Is Null ) ")
	Page<UAP051IN> filterEr(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
//	@Query("SELECT u FROM UAP051IN u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND"
//			+ "( accepted=:accepted OR :accepted IS NULL ) ")
//	Page<UAP051IN> filterErWithStatus(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
//			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
//			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
//			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
//			String numAutorisation,String accepted);
	
	
	@Query("SELECT u FROM UAP051IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP051IN> filterErWithStatus(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String accepted);
	
	

	@Query("SELECT u FROM UAP051IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP051IN> filterErNotYetMatched(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAP051IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP051IN> filterErExtra(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String flag);
	
	
	
	@Query("SELECT u FROM UAP051IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP051IN> filterErExtraWaiting(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP051IN u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND  (( :accepted   IS NULL  AND (accepted='2'  or  accepted='NOT OK' ) ) OR accepted=:accepted ) AND flag is null")
	Page<UAP051IN> filterNotMatched(Pageable pageable, String typeTransaction, String typePaiement,
			String numRIBcommercant, String numContratAccepteur, String codeBin, String numTransaction,
			String dateTransactionS, String dateTransactionE, String dateDebutValiditeCarteS,
			String dateDebutValiditeCarteE, String dateFinValiditeCarteS, String dateFinValiditeCarteE,
			String dateRemiseS, String dateRemiseE,

			String numAutorisation, String accepted);

	@Query("SELECT u FROM UAP051IN u WHERE flag ='22' or flag='24'")
	Page<UAP051IN> filterPending(Pageable pageable);

	@Query("SELECT u FROM UAP051IN u WHERE flag ='22' or flag='24'")
	List<UAP051IN> filterPending();

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP051IN A where  CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	Long getTotalAmountPositif050In(String today);

	@Query("select A from UAP051IN A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	List<UAP051IN> findReglementByDate(String today);

	@Query("SELECT  DISTINCT A.dateReglement from UAP051IN A   where (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)   ")
	List<String> findDistinctRegDates(String today);

	@Query("select A from UAP051IN A where A.accepted ='3'")
	List<UAP051IN> getExtraUap();

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP051IN A where A.accepted ='1' and A.dateReglement=:dateReg")
	List<UapDetailsControl> getAcceptedUap51In(String dateReg);

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP051IN A where A.accepted ='NOT OK' and A.dateReglement=:dateReg")
	List<UapDetailsControl> getRejectedUap51In(String dateReg);

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP051IN A where A.accepted ='2' and A.dateReglement=:dateReg")
	List<UapDetailsControl> getExtraUap51In(String dateReg);

	@Query("select A" + " from UAP051IN A where  A.flag in ('20','24','22','23') and A.fileIntegrationDate=:fileDate")
	List<UAP051IN> getListUAP51NotAcceptedForControl(String fileDate);

	List<UAP051IN> findByCopiedAndFlag(String copied, String flag);

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
			+ " from UAP051IN A where A.flag='21' and A.fileIntegrationDate=:fileDate")
	List<UapDetailsControl> getListUAP51AcceptedForControl(String fileDate);
}

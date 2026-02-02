package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.UAP040IN;
import com.mss.unified.entities.UAP050IN;
 import com.mss.unified.entities.UAP051FransaBank;
import com.mss.unified.entities.UAP051INR;
import com.mss.unified.entities.UAP051INRHistory;

public interface UAP051INRFransaBankRepository extends JpaRepository<UAP051INR, Integer> {
	@Query("select A from UAP051INR A where A.accepted is null ")
	List<UAP051INR> getNotOk();

	@Query("SELECT id FROM UAP051INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP051INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted ")
	List<Integer> findAllIds(String accepted);
	@Query("SELECT id FROM UAP051INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP051INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted   and (flag is null or flag   not like '%2%') ")
	List<Integer> findAllIdsnotrejected(String accepted);
	@Query("SELECT id FROM UAP051INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP051INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted   and (flag is null or flag !='1') ")
	List<Integer> findAllIdsnotaccepted(String accepted);

//    @Query("SELECT id FROM UAP051INR h where h.accepted= :accepted ")
//    List<Integer> findAllIds(String accepted);

	@Query("select A from UAP051INR A where A.accepted !='3' and A.fileIntegrationDate=:fileIntegration ")
	List<UAP051INR> getListUAPINByStatusAccepted(String fileIntegration);

	List<UAP051INR> findByFlag(String flag);

	List<UAP051INR> findByFlagAndAcceptedAndCopied(String flag, String accepted,String copied);
	
	List<UAP051INR> findByFlagAndAccepted(String flag, String accepted);
    @Query("SELECT e FROM UAP051INR e WHERE e.flag = :flag AND e.accepted = :accepted AND CONVERT(DATE,e.dateReglement) <= current_date()")
    List<UAP051INR> findByFlagAndAcceptedAndDateRegAfterToday(@Param("flag") String flag, @Param("accepted") String accepted);

	@Query("select A from UAP051INR A where A.accepted !='3'   and A.bkmGeneration is null ")
	List<UAP051INR> getListUAPINByStatusAccepted();

	@Query("select A from UAP051INR A where A.accepted !='3' and done='1' ")
	List<UAP051INR> getListUAPINByStatusAcceptedAndDone();

	/*
	 * @Query("select A from UAP051INR A where A.accepted ='1' and A.fileDate=:fileDate"
	 * ) List<UAP051INR> getListUAPINReglementByStatusAccepted(String fileDate);
	 */
	@Query("select count(*) from UAP051INR A where (A.accepted='2' or accepted='NOT OK') ")
	Integer sizeNotMatched();

	@Query("select count(*) from UAP051INR A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	Integer sizeNotMatchedAndEmptyFlag();

	@Query("select count(*) from UAP040IN A where A.flag='20'")
	Integer numberOfGeneratedLots();

	List<UAP051INR> findByRio(String rio);

	@Query("select A from UAP051INR A where  ( A.accepted ='1' or A.flag='1') and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	List<UAP051INR> getListUAPINReglementByStatusAccepted(String today);

	@Query("select A from UAP051INR A where (A.accepted is null or A.accepted='3')")
	List<UAP051INR> getListUAPIN();

	@Query("SELECT u FROM UAP051INR u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAP051INR> filter(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP051INR u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND ( accepted!='1'  or  accepted Is Null ) ")
	Page<UAP051INR> filterEr(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP051INR u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND  (( :accepted   IS NULL  AND (accepted='2'  or  accepted='NOT OK' ) ) OR accepted=:accepted ) AND flag is null")
	Page<UAP051INR> filterNotMatched(Pageable pageable, String typeTransaction, String typePaiement,
			String numRIBcommercant, String numContratAccepteur, String codeBin, String numTransaction,
			String dateTransactionS, String dateTransactionE, String dateDebutValiditeCarteS,
			String dateDebutValiditeCarteE, String dateFinValiditeCarteS, String dateFinValiditeCarteE,
			String dateRemiseS, String dateRemiseE,

			String numAutorisation, String accepted);

	@Query("SELECT u FROM UAP051INR u WHERE flag ='22' or flag='24'")
	Page<UAP051INR> filterPending(Pageable pageable);

	@Query("SELECT u FROM UAP051INR u WHERE flag ='22' or flag='24'")
	List<UAP051INR> filterPending();

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP051INR A where  (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	Long getTotalAmountPositif050In(String today);
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP051INR A where ( A.flag='25') and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	Long getTotalAmountNegatif(String today);
	@Query("select A from UAP051INR A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	List<UAP051INR> findReglementByDate(String today);
	@Query("SELECT  DISTINCT A.dateReglement from UAP051INR A   where (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)   ")
	List<String> findDistinctRegDates(String today);
	@Query("select A from UAP051INR A where A.accepted ='3'")
	List<UAP051INR> getExtraUap();
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP051INR A where A.accepted ='1' and A.dateReglement=:dateReg")
	List<UapDetailsControl> getAcceptedUap51In(String dateReg);
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP051INR A where A.accepted ='NOT OK' and A.dateReglement=:dateReg")
	List<UapDetailsControl> getRejectedUap51In(String dateReg);
	
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP051INR A where A.accepted ='2' and A.dateReglement=:dateReg")
	List<UapDetailsControl> getExtraUap51In(String dateReg);
	
	
	
	@Query("select A from UAP051INR A where  A.flag in ('20','24','22','23')")
	List<UAP051INR> getListUAP51NotAcceptedForControl();
    List<UAP051INR> findByCopiedAndFlag(String copied,String flag); 


	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
			+" from UAP051INR A where A.flag='21' ")
	List<UapDetailsControl> getListUAP51AcceptedForControl();
}

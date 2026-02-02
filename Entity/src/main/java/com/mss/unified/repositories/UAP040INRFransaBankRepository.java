package com.mss.unified.repositories;

import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.UAP040IN;
import com.mss.unified.entities.UAP040INR;
import com.mss.unified.entities.UAP040INRHistory;
import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAP050IN;
import com.mss.unified.entities.UAPFransaBank;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UAP040INRFransaBankRepository extends JpaRepository<UAP040INR, Integer> {
//	@Query("SELECT id FROM UAP040INR h where h.accepted= :accepted ")
	@Query("SELECT id FROM UAP040INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted ")
	List<Integer> findAllIds(String accepted);
	@Query("SELECT id FROM UAP040INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted and (flag is null or flag   not like '%2%')")
	List<Integer> findAllIdsnotrejected(String accepted);
	@Query("SELECT id FROM UAP040INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted and (flag is null or flag!='1')")
	List<Integer> findAllIdsnotaccepted(String accepted);

	@Query("SELECT id FROM UAP040INR h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP040INR h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted   AND flag is null ")
	List<Integer> findAllIdsAndFlagNull(String accepted);

	@Query("select sum(A.montantAComponser) from UAP040INR A ")
	String getTotalAmount();

	List<UAP040INR> findByFlag(String flag);

	List<UAP040INR> findByFlagAndAccepted(String flag, String accepted);
	List<UAP040INR> findByFlagAndAcceptedAndCopied(String flag, String accepted,String copied);
    // Custom query method to filter by flag, accepted, and dateReg >= system date
    @Query("SELECT e FROM UAP040INR e WHERE e.flag = :flag AND e.accepted = :accepted AND CONVERT(DATE,e.dateReg) <= current_date()")
    List<UAP040INR> findByFlagAndAcceptedAndDateRegAfterToday(@Param("flag") String flag, @Param("accepted") String accepted);

	List<UAP040INR> findByRio(String rio);

	@Query("Select count(*) from UAP040INR A ")
	int getNmbreOpreration();

	@Query("select  A.fileDate from UAP040INR A")
	List<String> findDate();

	@Query("SELECT u FROM UAP040INR u WHERE "
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
	Page<UAP040INR> filter(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP040INR u WHERE "
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
	Page<UAP040INR> filterEr(Pageable pageable, String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	@Query("SELECT u FROM UAP040INR u WHERE "
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
	Page<UAP040INR> filterNotMatched(Pageable pageable, String typeTransaction, String typePaiement,
			String numRIBcommercant, String numContratAccepteur, String codeBin, String numTransaction,
			String dateTransactionS, String dateTransactionE, String dateDebutValiditeCarteS,
			String dateDebutValiditeCarteE, String dateFinValiditeCarteS, String dateFinValiditeCarteE,
			String dateRemiseS, String dateRemiseE, String numAutorisation, String accepted);

	@Query("SELECT u FROM UAP040INR u WHERE flag ='22' or flag='24'")
	Page<UAP040INR> filterPending(Pageable pageable);

	@Query("SELECT u FROM UAP040INR u WHERE flag ='22' or flag='24'")
	List<UAP040INR> filterPending();

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP040INR A ")
	Long getTotalAmountIN();

	@Query("select A from UAP040INR A where (A.accepted is null or A.accepted='3') and A.fileIntegrationDate=:fileIntegration ")
	List<UAP040INR> getListUAPIN(String fileIntegration);

	@Query("select A from UAP040INR A where A.accepted !='3' and A.fileIntegrationDate=:fileIntegration")
	List<UAP040INR> getListUAPINByStatusAccepted(String fileIntegration);

	@Query("select A from UAP040INR A where A.accepted is null and A.fileIntegrationDate=:fileIntegration ")
	List<UAP040INR> getNotOk(String fileIntegration);

	@Query("select count(*) from UAP040INR A where (A.accepted='2' or accepted='NOT OK') and A.fileIntegrationDate=:fileIntegration")
	Integer sizeNotMatched(String fileIntegration);

	@Query("select A from UAP040INR A where (A.accepted is null or A.accepted='3')")
	List<UAP040INR> getListUAPIN();

	@Query("select A from UAP040INR A where  A.accepted !='3'   and A.bkmGeneration is null ")
	List<UAP040INR> getListUAPINByStatusAccepted();

	@Query("select A from UAP040INR A where A.accepted is null")
	List<UAP040INR> getNotOk();

	@Query("select count(*) from UAP040INR A where (A.accepted='2' or accepted='NOT OK')  ")
	Integer sizeNotMatched();

	@Query("select count(*) from UAP040INR A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	Integer sizeNotMatchedAndEmptyFlag();
	@Query("select A from UAP040INR A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	List<UAP040INR>  findByMatchedAndEmptyFlag();

	@Query("select count(*) from UAP040INR A where A.flag='20'")
	Integer numberOfGeneratedLots();

	/*
	 * @Query("select A from UAP040INR A where A.accepted ='1' and fileDate=:fileDate"
	 * ) List<UAP040INR> getListUAPINByStatusAcceptedAndDate(String fileDate);
	 */
	@Query("select A from UAP040INR A where A.accepted ='1'")
	List<UAP040INR> getListUAPINByStatusAcceptedAndDate();

	@Query("select A from UAP040INR A where  (A.accepted ='1' or A.flag='1' ) and CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
	List<UAP040INR> getListUAPINByStatusAcceptedAndDateNew(String today);

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP040INR A where (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReg)= CONVERT(DATE,:today)")
	Long getTotalAmountPositif040In(String today);
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP040INR A where ( A.flag='25') and CONVERT(DATE,A.dateReg)= CONVERT(DATE,:today)")
	Long getTotalAmountNegatif(String today);
	
	@Query("SELECT  DISTINCT A.dateReg from UAP040INR A   where (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)   ")
	List<String> findDistinctRegDates(String today);
	@Query("select A from UAP040INR A where A.accepted not in ('3','1') ")
	List<UAP040INR> getUap040ForGenerating140();

	@Query("select A from UAP040INR A where A.accepted !='3' and done='1'")
	List<UAP040INR> getListUAPINByStatusAcceptedAndDone();

	@Query("select A from UAP040INR A where CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
	List<UAP040INR> findReglementByDate(String today);

	@Query("select A from UAP040INR A where A.accepted ='3'")
	List<UAP040INR> getExtraUap();
	
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP040INR A where A.accepted ='1' and A.dateReg=:dateReg")
	List<UapDetailsControl> getAcceptedUap40In(String dateReg);
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP040INR A where A.accepted ='NOT OK' and A.dateReg=:dateReg")
	List<UapDetailsControl> getRejectedUap40In(String dateReg);
	
	
	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP040INR A where A.accepted ='2' and A.dateReg=:dateReg")
	List<UapDetailsControl> getExtraUap40In(String dateReg);
	
	
	
	@Query("select A  from UAP040INR A where A.flag in ('20','24','22','23')")
	List<UAP040INR> getListUAP40NotAcceptedForControl();
	

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
			+" from UAP040INR A where A.flag='21'")
	List<UapDetailsControl> getListUAP40AcceptedForControl();
    List<UAP040INR> findByCopiedAndFlag(String copied,String flag); 

	
}

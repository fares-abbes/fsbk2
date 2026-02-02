package com.mss.unified.repositories;

import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.UAP040IN;
import com.mss.unified.entities.UAP040INR;
import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAP050IN;
import com.mss.unified.entities.UAP050INHistory;
import com.mss.unified.entities.UAPFransaBank;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface UAP050INFransaBankRepository extends JpaRepository<UAP050IN, Integer>, JpaSpecificationExecutor<UAP050IN> {
	//@Query("select sum(A.montantAComponser) from UAP050IN A ")
	//String getTotalAmount();

	//@Query("Select count(*) from UAP050IN A ")
	//int getNmbreOpreration();
//    @Query("SELECT id FROM UAP050IN h where h.accepted= :accepted ")
//    List<Integer> findAllIds(String accepted);
	
 
 
	@Query("SELECT id FROM UAP050IN h WHERE h.accepted = :accepted  and copied=:copied and flag=:flag")
	List<Integer> findAllIds(String accepted,String flag,String copied);
	@Query("SELECT id FROM UAP050IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP050IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted  and (flag is null or flag   not like '%2%') ")
	List<Integer> findAllIdsnotrejected(String accepted);
	@Query("SELECT id FROM UAP050IN h WHERE h.fileIntegrationDate = (SELECT MAX(h2.fileIntegrationDate) FROM UAP050IN h2 WHERE h2.accepted = :accepted) and h.accepted = :accepted  and (flag is null or flag   !='1') ")
	List<Integer> findAllIdsnotaccepted(String accepted);
	@Query("Select count(*) from UAP050IN A ")
	

	int getNmbreOpreration();
	List<UAP050IN> findByFlagAndAccepted(String flag,String accepted);
	List<UAP050IN> findByFlagAndAcceptedAndCopied(String flag, String accepted,String copied);

	List<UAP050IN> findByFlag(String flag);

	  @Query("select count(*) from UAP050IN A where (A.accepted='2' or accepted='NOT OK') and A.fileIntegrationDate=:fileIntegration")
	   Integer sizeNotMatched(String fileIntegration);
		List<UAP050IN> findByRio(String rio);

	  @Query("select count(*) from UAP050IN A where (A.accepted='2' or accepted='NOT OK')  ")
	   Integer sizeNotMatched();
	 
 
	  @Query("select count(*) from UAP050IN A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	  Integer sizeNotMatchedAndEmptyFlag();
	  @Query("select A from UAP050IN A where (A.accepted='2' or accepted='NOT OK')  and A.flag is null ")
	  List<UAP050IN>   findByMatchedAndEmptyFlag();
	  @Query("select count(*) from UAP040IN A where A.flag='20'")
	    Integer numberOfGeneratedLots();
	//@Query("select A.dateTransaction from UAP050IN A where ROWNUM=1")
	//String findDate();
	@Query("select A.fileDate from UAP050IN A ")
	List<String> findDate();

	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP050IN> filter(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP050IN> filterEr(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP050IN> filterErWithStatus(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String accepted);
	
	
	
	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP050IN> filterErNotYetMatched(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP050IN> filterErExtra(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String flag);
	
	
	
	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
	Page<UAP050IN> filterErExtraWaiting(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAP050IN u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%) AND (( :accepted   IS NULL  AND (accepted='2'  or  accepted='NOT OK' )) OR accepted=:accepted ) AND flag is null")
	Page<UAP050IN> filterNotMatched(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation,String accepted);
	@Query("SELECT u FROM UAP050IN u WHERE flag ='22' or flag='24'")
Page<UAP050IN> filterPending(Pageable pageable);
	@Query("SELECT u FROM UAP050IN u WHERE flag ='22' or flag='24'")
	List<UAP050IN> filterPending( );
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050IN A ")
	Long getTotalAmount();
	
	  @Query("select A from UAP050IN A where  A.accepted !='3'   and A.bkmGeneration is null ")
	    List<UAP050IN> getListUAPINByStatusAccepted();
	  
	  @Query("select A from UAP050IN A where A.accepted !='3'and done='1' ")
	    List<UAP050IN> getListUAPINByStatusAcceptedAndDone();
	  
	  @Query("select A from UAP050IN A where (A.accepted is null or A.accepted='3')")
	    List<UAP050IN> getListUAPIN();
	@Query("select A from UAP050IN A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
	List<UAP050IN> findinHistorys(String numAutorisation,String pan,String numTransaction);

	@Query("select A from UAP050IN A where A.accepted is null and A.fileIntegrationDate=:fileIntegration")
	    List<UAP050IN> getNotOk(String fileIntegration);
	  
	  /*@Query("select A from UAP050IN A where A.accepted ='1' and A.fileDate=:fileDate")
		List<UAP050IN> getListUAPINReglementByStatusAccepted(String fileDate);
       */
//	  @Query("select A from UAP050IN A where  CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	  @Query("select A from UAP050IN A where ( A.accepted ='1' or A.flag='1') and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
		List<UAP050IN> getListUAPINReglementByStatusAccepted(String today);
	  
	  @Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050IN A where   CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	  Long getTotalAmountPositif050In(String today);
	  
	  @Query("select A from UAP050IN A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
		List<UAP050IN> findReglementByDate(String today);
		@Query("SELECT  DISTINCT A.dateReglement from UAP050IN A   where (A.accepted='1' or A.flag=1) and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)   ")
		List<String> findDistinctRegDates(String today);
	  @Query("select A from UAP050IN A where A.accepted ='3'")
	    List<UAP050IN> getExtraUap();
	  
		@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP050IN A where A.accepted ='1' and A.dateReglement=:dateReg")
		List<UapDetailsControl> getAcceptedUap50In(String dateReg);
		
		@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP050IN A where A.accepted ='NOT OK' and A.dateReglement=:dateReg")
		List<UapDetailsControl> getRejectedUap50In(String dateReg);
		
		
		@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser) from UAP050IN A where A.accepted ='2' and A.dateReglement=:dateReg")
		List<UapDetailsControl> getExtraUap50In(String dateReg);
		
		
		@Query("select A"
				+" from UAP050IN A where  A.flag in ('20','24','22','23') and A.fileIntegrationDate=:fileDate")
		List<UAP050IN> getListUAP50NotAcceptedForControl(String fileDate);
		

		@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
				+" from UAP050IN A where A.flag='21' and A.fileIntegrationDate=:fileDate")
		List<UapDetailsControl> getListUAP50AcceptedForControl(String fileDate);
	    List<UAP050IN> findByCopiedAndFlag(String copied,String flag); 

}

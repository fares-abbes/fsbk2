package com.mss.unified.repositories;

import com.mss.unified.dto.TpDetailsControl;
import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAP050FransaBankHistory;
import com.mss.unified.entities.UAPFransaBank;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UAP050FransaBankRepository extends JpaRepository<UAP050FransaBank, Integer> {
	
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050FransaBank A ")

	Long getTotalAmount();

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050FransaBank A where   A.fileIntegrationDate=:fileIntegration ")

	Long getTotalAmountByDateIntegration(String fileIntegration);
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050FransaBank A where   A.fileIntegrationDate=:fileIntegration And ( A.statusTechnique!='000' or A.statusTechnique is null) ")
	Long getTotalAmountByDateIntegrationNV(String fileIntegration);

	@Query("Select count(*) from UAP050FransaBank A where     A.fileIntegrationDate=:fileIntegration ")
	int getNmbreOprerationByDateIntegration(String fileIntegration);

	@Query("select A from UAP050FransaBank A where A.statusTechnique='000'")
	List<UAP050FransaBank> getListUAPByStatuswithoutDay();
	@Query("Select count(*) from UAP050FransaBank A ")
	int getNmbreOpreration();

	@Query("select A.fileDate from UAP050FransaBank A ")
	 List<String> findDate();
	@Query("select A.heureTransaction from UAP050FransaBank A ")
	 List<String> findHeure();

	@Query("SELECT u FROM UAP050FransaBank u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAP050FransaBank> filter(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	@Query("SELECT u FROM UAP050FransaBank u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)"
			+ "AND u.statusTechnique='000' AND u.accepted is null"
			)
	Page<UAP050FransaBank> filterAcceptedUap(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	@Query("SELECT u FROM UAP050FransaBank u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)"
			+ "AND u.statusTechnique is not null  AND u.statusTechnique!='000'")
			
	Page<UAP050FransaBank> filterUapWithProblem(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);


	
	@Query("SELECT u FROM UAP050FransaBank u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)"
			+ "AND u.statusTechnique='000' AND u.accepted='1'")
			
	Page<UAP050FransaBank> filterRejectedUap(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAP050FransaBank u WHERE " + "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
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
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)"
			+ "AND u.statusTechnique is null ")
	Page<UAP050FransaBank> filterWaitingUap(Pageable pageable,String typeTransaction, String typePaiement, String numRIBcommercant,
			String numContratAccepteur, String codeBin, String numTransaction, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String dateRemiseS, String dateRemiseE,
			String numAutorisation);

	
	  @Query("select A from UAP050FransaBank A where A.statusTechnique='000' and A.fileIntegrationDate=:fileIntegration ")
	    List<UAP050FransaBank> getListUAPByStatusTechnique(String fileIntegration);
		@Query("select A from UAP050FransaBank A where ( A.statusTechnique!='000'  or A.statusTechnique is null) and A.fileIntegrationDate=:fileIntegration")
		List<UAP050FransaBank> getListUAPByStatusTechniqueNV(String fileIntegration);
		@Query("select A from UAP050FransaBank A where ( A.statusTechnique!='000'  or A.statusTechnique is null) and A.fileIntegrationDate=:fileIntegration")
		Page<UAP050FransaBank> getListUAPByStatusTechniqueNV(Pageable pageable,String fileIntegration);
	  
	  @Query("select A from UAP050FransaBank A where  A.accepted is null  and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:dateReg)")
	    List<UAP050FransaBank> getListUAPByStatusAccepted(String dateReg);
	  
	  @Query("select A from UAP050FransaBank A where A.accepted='1' and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:dateReg)")
	    List<UAP050FransaBank> getListUAPByStatusAcceptedReject(String dateReg);
	  
	  @Query("select A from UAP050FransaBank A where A.fileDate=:fileDate and A.accepted is null ")
	    List<UAP050FransaBank> getListUAPByFileDate(String fileDate);
	  
	  @Query("select A from UAP050FransaBank A where A.fileDate=:fileDate and A.statusTechnique='000'")
	    List<UAP050FransaBank> getListUAPByFileDateAndStatus(String fileDate);

	  
	  @Query("select A from UAP050FransaBank A where  A.accepted is null  and  A.statusTechnique='000' and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	    List<UAP050FransaBank> getListUAPByStatus(String today);
	 	@Query("SELECT  DISTINCT A.dateReglement from UAP050FransaBank A     where A.statusTechnique='000' and A.accepted is null and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today) ")
		List<String> findDistinctRegDates(String today);
	  
	    @Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050FransaBank A where A.statusTechnique='000' and  CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
		Long getTotalAmountPositif050(String today);
	    @Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP050FransaBank A where A.statusTechnique='000' and A.accepted='1' and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
		Long getTotalAmountNegatif050(String today);
		@Query("select A from UAP050FransaBank A where A.statusTechnique='000' and accepted='1' and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
		List<UAP050FransaBank> getTotalListRejected(String today);
	    @Query("select A from UAP050FransaBank A where A.done='1'")
		List<UAP050FransaBank> findByDone();
	    
	    @Query("select A from UAP050FransaBank A where A.fileIntegrationDate=:fileIntegration")
		List<UAP050FransaBank> findByIntegrationDate(String fileIntegration);
	    
	    @Query("select A from UAP050FransaBank A where A.fileIntegrationDate=:date")
		List<UAP050FransaBank> findReglementByDate(String date);
	    
	    @Query("select A from UAP050FransaBank A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	    List<UAP050FransaBank> findByDateReglement(String today);
	    
		@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
				+" from UAP050FransaBank A where ( A.statusTechnique!='000' or A.statusTechnique is null) and A.fileDate=:fileDate")
		List<UapDetailsControl> getListUAP50ForControl(String fileDate);
		
		
		@Query("select A"
				+" from UAP050FransaBank A where ( A.statusTechnique!='000' or A.statusTechnique is null) and A.fileIntegrationDate=:fileDate")
		List<UAP050FransaBank> getListUAP50NotAcceptedForControl(String fileDate);
		

		@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
				+" from UAP050FransaBank A where A.statusTechnique='000' and A.fileIntegrationDate=:fileDate")
		List<UapDetailsControl> getListUAP50AcceptedForControl(String fileDate);
 
}

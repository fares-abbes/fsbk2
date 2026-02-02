package com.mss.unified.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.dto.TpDetailsControl;
import com.mss.unified.dto.UapDetailsControl;
import com.mss.unified.entities.DayOperationFransaBank;
import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAPFransaBank;
import com.mss.unified.entities.UAPFransaBankHistory;

import java.util.List;

@Repository
public interface UAPFransaBankRepository extends JpaRepository<UAPFransaBank, Integer>, JpaSpecificationExecutor<UAPFransaBank> {

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAPFransaBank A where   A.fileIntegrationDate=:fileIntegration ")
	Long getTotalAmountByDateIntegration(String fileIntegration);
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAPFransaBank A where   A.fileIntegrationDate=:fileIntegration And ( A.statusTechnique!='000' or A.statusTechnique is null) ")
	Long getTotalAmountByDateIntegrationNV(String fileIntegration);

	@Query("Select count(*) from UAPFransaBank A where     A.fileIntegrationDate=:fileIntegration ")
	int getNmbreOprerationByDateIntegration(String fileIntegration);

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAPFransaBank A ")
	Long getTotalAmount();

	@Query("Select count(*) from UAPFransaBank A ")
	int getNmbreOpreration();

	@Query("select  A.fileDate from UAPFransaBank A")
	List<String> findDate();

	@Query("select  A.heureTransaction from UAPFransaBank A")
	List<String> findHeure();

	@Query("select A from UAPFransaBank A where A.statusTechnique='000' and A.fileIntegrationDate=:fileIntegration")
	List<UAPFransaBank> getListUAPByStatusTechnique(String fileIntegration);
	@Query("select A from UAPFransaBank A where ( A.statusTechnique!='000' or A.statusTechnique is null) and A.fileIntegrationDate=:fileIntegration")
	List<UAPFransaBank> getListUAPByStatusTechniqueNV(String fileIntegration);
	@Query("select A from UAPFransaBank A where ( A.statusTechnique!='000' or A.statusTechnique is null) and A.fileIntegrationDate=:fileIntegration")
	Page<UAPFransaBank> getListUAPByStatusTechniqueNV(Pageable pageable, String fileIntegration);

	@Query("select A from UAPFransaBank A where A.Numtransaction=:numTransaction")
	List<UAPFransaBank> getListByNumTransaction(String numTransaction);

	@Query("select A from UAPFransaBank A where A.accepted is null  and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:dateReg)")
	List<UAPFransaBank> getListUAPByStatusAccepted(String dateReg);

	@Query("select A from UAPFransaBank A where A.accepted='1' and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:dateReg)")
	List<UAPFransaBank> getListUAPByStatusAcceptedReject(String dateReg);

	@Query("select A from UAPFransaBank A where A.fileIntegrationDate=:fileIntegrationDate")
	List<UAPFransaBank> getListUapLastDate(String fileIntegrationDate);

	@Query("select A from UAPFransaBank A where A.fileDate=:fileDate and A.accepted is null ")
	List<UAPFransaBank> getListUAPByFileDate(String fileDate);

	@Query("select A from UAPFransaBank A where A.fileDate=:fileDate and A.statusTechnique='000' ")
	List<UAPFransaBank> getListUAPByFileDateAndStatus(String fileDate);

	
	@Query("select A from UAPFransaBank A where  A.accepted is null  and A.statusTechnique='000' and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	List<UAPFransaBank> getListUAPByStatus(String today);
	@Query("select A from UAPFransaBank A where  A.accepted is null  and A.statusTechnique='000' ")
	List<UAPFransaBank> getListUAPByStatuswithoutDay( );

	@Query("select A from UAPFransaBank A where A.statusTechnique='000' ")
	List<UAPFransaBank> getListUAPByFileDateAndStatusNew();

	@Query("SELECT u FROM UAPFransaBank u WHERE  "
			+ "(:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) "
	

			+ "AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) "
			+ "AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) "
			+ "AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) "
			+ "AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) "
			+ "AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) "
			+ "AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) "
			+ "AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) "
			+ "AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAPFransaBank> filter(Pageable pageable, String typeTransaction,
			
			String codeBin, String dateTransactionS,
			String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
			String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAPFransaBank u WHERE  "
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
Page<UAPFransaBank> filterAcceptedUap(Pageable pageable, String typeTransaction, 
		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	@Query("SELECT u FROM UAPFransaBank u WHERE  "
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
Page<UAPFransaBank> filterUapWithProblem(Pageable pageable, String typeTransaction, 

		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAPFransaBank u WHERE  "
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
Page<UAPFransaBank> filterRejectedUap(Pageable pageable, String typeTransaction,
		
		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	
	
	
	@Query("SELECT u FROM UAPFransaBank u WHERE  "
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
Page<UAPFransaBank> filterWaitingUap(Pageable pageable, String typeTransaction, 
		 

		String codeBin, String dateTransactionS,
	String dateTransactionE, String dateDebutValiditeCarteS, String dateDebutValiditeCarteE,
	String dateFinValiditeCarteS, String dateFinValiditeCarteE, String numAutorisation);
	

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAPFransaBank A where A.statusTechnique='000' and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	Long getTotalAmountPositif040(String today);

	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAPFransaBank A where A.statusTechnique='000' and accepted='1' and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	Long getTotalAmountNegatif(String today);
	@Query("select A from UAPFransaBank A where A.statusTechnique='000' and accepted='1' and CONVERT(DATE,A.dateReglement)= CONVERT(DATE,:today)")
	List<UAPFransaBank>  getTotalListRejected(String today);

	@Query("select A from UAPFransaBank A where A.done='1'")
	List<UAPFransaBank> findByDone();

	@Query("select A from UAPFransaBank A where A.fileIntegrationDate=:fileIntegration")
	List<UAPFransaBank> findByFileIntegration(String fileIntegration);

	@Query("select A from UAPFransaBank A where A.fileIntegrationDate=:date")
	List<UAPFransaBank> findReglementByDate(String date);
	
	@Query("select A from UAPFransaBank A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	List<UAPFransaBank> findByDateReglement(String today);

 	@Query("SELECT  DISTINCT A.dateReglement from UAPFransaBank A    where A.statusTechnique='000' and A.accepted is null and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today) ")
	List<String> findDistinctRegDates(String today);

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
			+" from UAPFransaBank A where ( A.statusTechnique!='000' or A.statusTechnique is null) and A.fileDate=:fileDate")
	List<UapDetailsControl> getListUAP40ForControl(String fileDate);
 
	
	
	@Query("select A"
			+" from UAPFransaBank A where ( A.statusTechnique!='000' or A.statusTechnique is null) and A.fileIntegrationDate=:fileDate")
	List<UAPFransaBank> getListUAP40NotAcceptedForControl(String fileDate);
	

	@Query("select NEW com.mss.unified.dto.UapDetailsControl(A.montantAComponser)"
			+" from UAPFransaBank A where A.statusTechnique='000' and A.fileIntegrationDate=:fileDate")
	List<UapDetailsControl> getListUAP40AcceptedForControl(String fileDate);

}

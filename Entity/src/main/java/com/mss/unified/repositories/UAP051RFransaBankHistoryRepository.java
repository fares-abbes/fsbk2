package com.mss.unified.repositories;


import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAP051FransaBank;
import com.mss.unified.entities.UAP051INR;
import com.mss.unified.entities.UAP051FransaBank;
import com.mss.unified.entities.UAP051RHistoryFransaBank;



public interface UAP051RFransaBankHistoryRepository extends JpaRepository<UAP051RHistoryFransaBank, Integer> {
	
	@Query("select A from UAP051RHistoryFransaBank A where A.statusTechnique='000' ")
	List<UAP051FransaBank> getListUAPByStatusTechnique();
	@Query("select A from UAP051FransaBank A where A.statusTechnique!='000' and A.fileIntegrationDate=:fileIntegration")
	List<UAP051FransaBank> getListUAPByStatusTechniqueNV(String fileIntegration);

	@Query("select A from UAP051RHistoryFransaBank A where A.accepted is null or A.accepted='2' ")
	List<UAP051FransaBank> getListUAPByStatusAccepted();

	@Query("select A from UAP051RHistoryFransaBank A where A.fileDate=:fileDate and A.accepted is null ")
	List<UAP051FransaBank> getListUAPByFileDate(String fileDate);

	@Query("select A from UAP051RHistoryFransaBank A where A.fileDate=:fileDate and A.statusTechnique='000'")
	List<UAP051FransaBank> getListUAPByFileDateAndStatus(String fileDate);
	
	@Query("select SUM(CASE WHEN ISNUMERIC(A.montantAComponser) = 1 THEN CAST(A.montantAComponser as float ) ELSE 0 END) from UAP051RHistoryFransaBank A ")
	Long getTotalAmount();
	
	@Query("Select count(*) from UAP051RHistoryFransaBank A ")
	int getNmbreOpreration();
	@Query("select A.fileDate from UAP051RHistoryFransaBank A ")
	List<String> findDate();
    @Query("select  A.heureTransaction from UAP051RHistoryFransaBank A")
    List<String> findHeure(); 
	@Query("SELECT u FROM UAP051RHistoryFransaBank u WHERE (:typeTransaction IS NULL OR u.typeTransaction like %:typeTransaction%) AND (:typePaiement IS NULL OR u.typePaiement like %:typePaiement) AND (:numRIBcommercant IS NULL OR u.numRIBcommercant like %:numRIBcommercant%) AND (:numContratAccepteur IS NULL OR u.numContratAccepteur like %:numContratAccepteur%) AND (:codeBin IS NULL OR u.codeBin like %:codeBin%) AND (:numTransaction IS NULL OR u.numTransaction like %:numTransaction%) AND (:dateTransactionS IS NULL OR u.dateTransaction >= :dateTransactionS) AND (:dateTransactionE IS NULL OR u.dateTransaction <= :dateTransactionE) AND (:dateDebutValiditeCarteS IS NULL OR u.dateDebutValiditeCarte >= :dateDebutValiditeCarteS) AND (:dateDebutValiditeCarteE IS NULL OR u.dateDebutValiditeCarte <= :dateDebutValiditeCarteE) AND (:dateFinValiditeCarteS IS NULL OR u.dateFinValiditeCarte >= :dateFinValiditeCarteS) AND (:dateFinValiditeCarteE IS NULL OR u.dateFinValiditeCarte <= :dateFinValiditeCarteE) AND (:dateRemiseS IS NULL OR u.dateRemise >= :dateRemiseS) AND (:dateRemiseE IS NULL OR u.dateRemise <= :dateRemiseE) AND (:numAutorisation IS NULL OR u.numAutorisation like %:numAutorisation%)")
	Page<UAP051FransaBank> filter(Pageable pageable, String typeTransaction, String typePaiement,
			String numRIBcommercant, String numContratAccepteur, String codeBin, String numTransaction,
			String dateTransactionS, String dateTransactionE, String dateDebutValiditeCarteS,
			String dateDebutValiditeCarteE, String dateFinValiditeCarteS, String dateFinValiditeCarteE,
			String dateRemiseS, String dateRemiseE, String numAutorisation);
 
	

	 
}

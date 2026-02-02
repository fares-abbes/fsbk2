package com.mss.unified.repositories;

import java.util.List;
import java.util.Map;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.dto.FileContentProjection;
import com.mss.unified.dto.TpDetailsControl;
import com.mss.unified.entities.FileContent;
import com.mss.unified.entities.FileContentT;
import com.mss.unified.entities.SwitchTransaction;

@Repository
public interface FILECONTENTRepository extends JpaRepository<FileContent, Integer> {
	FileContent findByNumRefTransactionAndTypeTransaction(String numRefTransaction, String typeTransaction);
	@Query("select A from FileContent A where A.idHeder=:idHeder and A.numRIBEmetteur like %:numRIBEmetteur% and A.numCartePorteur like %:numCartePorteur% and A.idTerminal like %:idTerminal% and A.typeTransaction like %:typeTransaction% and A.idCommercant like %:idCommercant%")
	Page<FileContent> findAllByFilters(Pageable pageable, String idHeder, String numRIBEmetteur, String numCartePorteur,
			String idTerminal, String typeTransaction, String idCommercant);

	@Query(value = " select count(*) as total,validCommission ,typeTransaction  from FileContent td where (:idHeader=0 OR td.idHeder=:idHeader)  group by validCommission ,typeTransaction   ")
	List<Object[]> summary(int idHeader);

	Page<FileContent> findByTypeTransaction(Pageable pageable, String typeTransaction);

	Page<FileContent> findByValidCommission(Pageable pageable, String validCommission);

	Page<FileContent> findByValidCommissionAndTypeTransaction(Pageable pageable, String validCommission,
			String typeTransaction);

	@Query(value = "SELECT  e FROM FileContent e 	WHERE (e.numRefTransaction, e.numAutorisation, e.numCartePorteur) IN (  SELECT ee.numRefTransaction, ee.numAutorisation, ee.numCartePorteur   FROM FileContent ee   GROUP BY ee.numRefTransaction, ee.numAutorisation, ee.numCartePorteur    HAVING COUNT(*) > 1 )")
	Page<FileContent> findDuplicate(Pageable pageable);
	List<FileContent> findByNumRefTransaction(String  numRefTransaction);
	List<FileContent> findByNumAutorisationAndNumCartePorteur(String numAutorisation, String numCartePorteur);
	
	@Query("SELECT fc FROM FileContent fc WHERE fc.numCartePorteur = :numCartePorteur AND fc.numAutorisation = :numAutorisation AND fc.idCommercant = :idCommercant and fc.typeTransaction!='080'")
	List<FileContent> findByNumCartePorteurAndNumAutorisationAndIdCommercant(@Param("numCartePorteur") String numCartePorteur, @Param("numAutorisation") String numAutorisation, @Param("idCommercant") String idCommercant);

	List<FileContent> findByIdHeder(int idHeder);

	@Query(value = "SELECT count(*)   FROM FileContent ee   GROUP BY ee.numRefTransaction, ee.numAutorisation, ee.numCartePorteur    HAVING COUNT(*) > 1")
	List<Integer> countDuplicate();

	@Query(value = "SELECT fc FROM FileContent fc WHERE ( fc.idHeder IN (:idHeaders)) AND (  :startDate IS NULL OR fc.dateTransaction >= :startDate) AND  (  :endDate IS NULL OR fc.dateTransaction <= :endDate) AND (:codeDebit IS NULL OR fc.codeDebit LIKE %:codeDebit%) AND "
			+ "(:codeBin IS NULL OR fc.codeBin LIKE %:codeBin%) AND (:codeBank IS NULL OR fc.codeBank LIKE %:codeBank%) AND"
			+ " (:numRIBEmetteur IS NULL OR fc.numRIBEmetteur LIKE %:numRIBEmetteur%) AND (:numCartePorteur IS NULL OR fc.numCartePorteur LIKE"
			+ " %:numCartePorteur%) AND (:codeDebitCommercant IS NULL OR fc.codeDebitCommercant LIKE %:codeDebitCommercant%) AND "
			+ "(:numRIBcommercant IS NULL OR fc.numRIBcommercant LIKE %:numRIBcommercant%) AND (:BinAcquereur IS NULL OR fc.BinAcquereur "
			+ "LIKE %:BinAcquereur%) AND (:CodeBankAcquereur IS NULL OR fc.CodeBankAcquereur LIKE %:CodeBankAcquereur%) AND "
			+ "(:CodeAgence IS NULL OR fc.CodeAgence LIKE %:CodeAgence%) AND (:idTerminal IS NULL OR fc.idTerminal "
			+ "LIKE %:idTerminal%) AND (:idCommercant IS NULL OR fc.idCommercant LIKE %:idCommercant%) AND "
			+ "(:typeTransaction IS NULL OR fc.typeTransaction LIKE %:typeTransaction%) AND"
			+ " (:dateTransaction IS NULL OR fc.dateTransaction LIKE %:dateTransaction%) AND (:heureTransaction IS NULL OR"
			+ " fc.heureTransaction LIKE %:heureTransaction%) AND (:montantTransaction IS NULL OR fc.montantTransaction LIKE"
			+ " %:montantTransaction%) AND (:numFacture IS NULL OR fc.numFacture LIKE %:numFacture%) AND "
			+ "(:emetteurFacture IS NULL OR fc.emetteurFacture LIKE %:emetteurFacture%) AND (:numRefTransaction IS NULL "
			+ "OR fc.numRefTransaction LIKE %:numRefTransaction%) AND (:numAutorisation IS NULL OR fc.numAutorisation"
			+ " LIKE %:numAutorisation%) AND (:codeDebitPorteur IS NULL OR fc.codeDebitPorteur LIKE %:codeDebitPorteur%) "
			+ "AND (:commisionPorteur IS NULL OR fc.commisionPorteur LIKE %:commisionPorteur%) AND (:codeDebitCommisionCommercant IS "
			+ "NULL OR fc.codeDebitCommisionCommercant LIKE %:codeDebitCommisionCommercant%) AND (:commisionCommercant IS NULL "
			+ "OR fc.commisionCommercant LIKE %:commisionCommercant%) AND (:commisionInterchange IS NULL OR fc.commisionInterchange"
			+ " LIKE %:commisionInterchange%) AND (:fraisOperateurTechnique IS NULL OR fc.fraisOperateurTechnique LIKE %:fraisOperateurTechnique%) "
			+ "AND (:appCryptogram IS NULL OR fc.appCryptogram LIKE %:appCryptogram%) AND (:cryptogramInfoData IS NULL OR"
			+ " fc.cryptogramInfoData LIKE %:cryptogramInfoData%) AND (:atc IS NULL OR fc.atc LIKE %:atc%) AND (:terminalVerificationResult IS NULL OR fc.terminalVerificationResult LIKE %:terminalVerificationResult%) AND"
			+ " (:libelleCommercant IS NULL OR fc.libelleCommercant LIKE %:libelleCommercant%) AND "
			+ "(:ruf IS NULL OR fc.ruf LIKE %:ruf%) AND (:Numtransaction IS NULL OR fc.Numtransaction LIKE %:Numtransaction%) "
			+ "AND (:validCommission IS NULL OR fc.validCommission LIKE %:validCommission%) AND (:commissionCalculated IS NULL OR fc.interchangeCalculated LIKE %:commissionCalculated%) ")
	Page<FileContent> findByFilters(Pageable pageable, List<String> idHeaders, @Param("startDate") String startDate,
			@Param("endDate") String endDate, String codeDebit, String codeBin, String codeBank, String numRIBEmetteur,
			String numCartePorteur, String codeDebitCommercant, String numRIBcommercant, String BinAcquereur,
			String CodeBankAcquereur, String CodeAgence, String idTerminal, String idCommercant, String typeTransaction,
			String dateTransaction, String heureTransaction, String montantTransaction, String numFacture,
			String emetteurFacture, String numRefTransaction, String numAutorisation, String codeDebitPorteur,
			String commisionPorteur, String codeDebitCommisionCommercant, String commisionCommercant,
			String commisionInterchange, String fraisOperateurTechnique, String appCryptogram,
			String cryptogramInfoData, String atc, String terminalVerificationResult, String libelleCommercant,
			String ruf, String Numtransaction, String validCommission, String commissionCalculated);

//	@Query(value = "SELECT fc FROM FileContent fc WHERE ( fc.idHeder IN (:idHeaders)) AND   (  :startDate IS NULL OR fc.dateTransaction >= :startDate) AND  (  :endDate IS NULL OR  fc.dateTransaction <= :endDate) AND (:codeDebit IS NULL OR fc.codeDebit LIKE %:codeDebit%) AND "
//			+ "(:codeBin IS NULL OR fc.codeBin LIKE %:codeBin%) AND (:codeBank IS NULL OR fc.codeBank LIKE %:codeBank%) AND"
//			+ " (:numRIBEmetteur IS NULL OR fc.numRIBEmetteur LIKE %:numRIBEmetteur%) AND (:numCartePorteur IS NULL OR fc.numCartePorteur LIKE"
//			+ " %:numCartePorteur%) AND (:codeDebitCommercant IS NULL OR fc.codeDebitCommercant LIKE %:codeDebitCommercant%) AND "
//			+ "(:numRIBcommercant IS NULL OR fc.numRIBcommercant LIKE %:numRIBcommercant%) AND (:BinAcquereur IS NULL OR fc.BinAcquereur "
//			+ "LIKE %:BinAcquereur%) AND (:CodeBankAcquereur IS NULL OR fc.CodeBankAcquereur LIKE %:CodeBankAcquereur%) AND "
//			+ "(:CodeAgence IS NULL OR fc.CodeAgence LIKE %:CodeAgence%) AND (:idTerminal IS NULL OR fc.idTerminal "
//			+ "LIKE %:idTerminal%) AND (:idCommercant IS NULL OR fc.idCommercant LIKE %:idCommercant%) AND "
//			+ "(:typeTransaction IS NULL OR fc.typeTransaction LIKE %:typeTransaction%) AND"
//			+ " (:DateTransaction IS NULL OR fc.DateTransaction LIKE %:DateTransaction%) AND (:heureTransaction IS NULL OR"
//			+ " fc.heureTransaction LIKE %:heureTransaction%) AND (:montantTransaction IS NULL OR fc.montantTransaction LIKE"
//			+ " %:montantTransaction%) AND (:numFacture IS NULL OR fc.numFacture LIKE %:numFacture%) AND "
//			+ "(:emetteurFacture IS NULL OR fc.emetteurFacture LIKE %:emetteurFacture%) AND (:numRefTransaction IS NULL "
//			+ "OR fc.numRefTransaction LIKE %:numRefTransaction%) AND (:numAutorisation IS NULL OR fc.numAutorisation"
//			+ " LIKE %:numAutorisation%) AND (:codeDebitPorteur IS NULL OR fc.codeDebitPorteur LIKE %:codeDebitPorteur%) "
//			+ "AND (:commisionPorteur IS NULL OR fc.commisionPorteur LIKE %:commisionPorteur%) AND (:codeDebitCommisionCommercant IS "
//			+ "NULL OR fc.codeDebitCommisionCommercant LIKE %:codeDebitCommisionCommercant%) AND (:commisionCommercant IS NULL "
//			+ "OR fc.commisionCommercant LIKE %:commisionCommercant%) AND (:commisionInterchange IS NULL OR fc.commisionInterchange"
//			+ " LIKE %:commisionInterchange%) AND (:fraisOperateurTechnique IS NULL OR fc.fraisOperateurTechnique LIKE %:fraisOperateurTechnique%) "
//			+ "AND (:appCryptogram IS NULL OR fc.appCryptogram LIKE %:appCryptogram%) AND (:cryptogramInfoData IS NULL OR"
//			+ " fc.cryptogramInfoData LIKE %:cryptogramInfoData%) AND (:atc IS NULL OR fc.atc LIKE %:atc%) AND (:terminalVerificationResult IS NULL OR fc.terminalVerificationResult LIKE %:terminalVerificationResult%) AND (:libelleCommercant IS NULL OR fc.libelleCommercant LIKE %:libelleCommercant%) AND (:ruf IS NULL OR fc.ruf LIKE %:ruf%) AND (:Numtransaction IS NULL OR fc.Numtransaction LIKE %:Numtransaction%) ")
//	List<FileContent> findByFilters(List<String> idHeaders,@Param("startDate") String startDate, @Param("endDate") String endDate ,String codeDebit, String codeBin, String codeBank,
//			String numRIBEmetteur, String numCartePorteur, String codeDebitCommercant, String numRIBcommercant,
//			String BinAcquereur, String CodeBankAcquereur, String CodeAgence, String idTerminal, String idCommercant,
//			String typeTransaction, String dateTransaction, String heureTransaction, String montantTransaction,
//			String numFacture, String emetteurFacture, String numRefTransaction, String numAutorisation,
//			String codeDebitPorteur, String commisionPorteur, String codeDebitCommisionCommercant,
//			String commisionCommercant, String commisionInterchange, String fraisOperateurTechnique,
//			String appCryptogram, String cryptogramInfoData, String atc, String terminalVerificationResult,
//			String libelleCommercant, String ruf, String Numtransaction);

	@Query(value = "SELECT fc FROM FileContent fc WHERE ( fc.idHeder IN (:idHeaders)) AND (  :startDate IS NULL OR fc.dateTransaction >= :startDate) AND  (  :endDate IS NULL OR fc.dateTransaction <= :endDate) AND (:codeDebit IS NULL OR fc.codeDebit LIKE %:codeDebit%) AND "
			+ "(:codeBin IS NULL OR fc.codeBin LIKE %:codeBin%) AND (:codeBank IS NULL OR fc.codeBank LIKE %:codeBank%) AND"
			+ " (:numRIBEmetteur IS NULL OR fc.numRIBEmetteur LIKE %:numRIBEmetteur%) AND (:numCartePorteur IS NULL OR fc.numCartePorteur LIKE"
			+ " %:numCartePorteur%) AND (:codeDebitCommercant IS NULL OR fc.codeDebitCommercant LIKE %:codeDebitCommercant%) AND "
			+ "(:numRIBcommercant IS NULL OR fc.numRIBcommercant LIKE %:numRIBcommercant%) AND (:BinAcquereur IS NULL OR fc.BinAcquereur "
			+ "LIKE %:BinAcquereur%) AND (:CodeBankAcquereur IS NULL OR fc.CodeBankAcquereur LIKE %:CodeBankAcquereur%) AND "
			+ "(:CodeAgence IS NULL OR fc.CodeAgence LIKE %:CodeAgence%) AND (:idTerminal IS NULL OR fc.idTerminal "
			+ "LIKE %:idTerminal%) AND (:idCommercant IS NULL OR fc.idCommercant LIKE %:idCommercant%) AND "
			+ "(:typeTransaction IS NULL OR fc.typeTransaction LIKE %:typeTransaction%) AND"
			+ " (:dateTransaction IS NULL OR fc.dateTransaction LIKE %:dateTransaction%) AND (:heureTransaction IS NULL OR"
			+ " fc.heureTransaction LIKE %:heureTransaction%) AND (:montantTransaction IS NULL OR fc.montantTransaction LIKE"
			+ " %:montantTransaction%) AND (:numFacture IS NULL OR fc.numFacture LIKE %:numFacture%) AND "
			+ "(:emetteurFacture IS NULL OR fc.emetteurFacture LIKE %:emetteurFacture%) AND (:numRefTransaction IS NULL "
			+ "OR fc.numRefTransaction LIKE %:numRefTransaction%) AND (:numAutorisation IS NULL OR fc.numAutorisation"
			+ " LIKE %:numAutorisation%) AND (:codeDebitPorteur IS NULL OR fc.codeDebitPorteur LIKE %:codeDebitPorteur%) "
			+ "AND (:commisionPorteur IS NULL OR fc.commisionPorteur LIKE %:commisionPorteur%) AND (:codeDebitCommisionCommercant IS "
			+ "NULL OR fc.codeDebitCommisionCommercant LIKE %:codeDebitCommisionCommercant%) AND (:commisionCommercant IS NULL "
			+ "OR fc.commisionCommercant LIKE %:commisionCommercant%) AND (:commisionInterchange IS NULL OR fc.commisionInterchange"
			+ " LIKE %:commisionInterchange%) AND (:fraisOperateurTechnique IS NULL OR fc.fraisOperateurTechnique LIKE %:fraisOperateurTechnique%) "
			+ "AND (:appCryptogram IS NULL OR fc.appCryptogram LIKE %:appCryptogram%) AND (:cryptogramInfoData IS NULL OR"
			+ " fc.cryptogramInfoData LIKE %:cryptogramInfoData%) AND (:atc IS NULL OR fc.atc LIKE %:atc%) AND "
			+ "(:terminalVerificationResult IS NULL OR fc.terminalVerificationResult LIKE %:terminalVerificationResult%) "
			+ "AND (:libelleCommercant IS NULL OR fc.libelleCommercant LIKE %:libelleCommercant%) AND "
			+ "(:ruf IS NULL OR fc.ruf LIKE %:ruf%) AND (:Numtransaction IS NULL OR fc.Numtransaction LIKE %:Numtransaction%) "
			+ " AND (:validCommission IS NULL OR fc.validCommission LIKE %:validCommission%) AND (:commissionCalculated IS NULL OR fc.interchangeCalculated LIKE %:commissionCalculated%) ")
	List<FileContent> findByFilters(List<String> idHeaders, @Param("startDate") String startDate,
			@Param("endDate") String endDate, String codeDebit, String codeBin, String codeBank, String numRIBEmetteur,
			String numCartePorteur, String codeDebitCommercant, String numRIBcommercant, String BinAcquereur,
			String CodeBankAcquereur, String CodeAgence, String idTerminal, String idCommercant, String typeTransaction,
			String dateTransaction, String heureTransaction, String montantTransaction, String numFacture,
			String emetteurFacture, String numRefTransaction, String numAutorisation, String codeDebitPorteur,
			String commisionPorteur, String codeDebitCommisionCommercant, String commisionCommercant,
			String commisionInterchange, String fraisOperateurTechnique, String appCryptogram,
			String cryptogramInfoData, String atc, String terminalVerificationResult, String libelleCommercant,
			String ruf, String Numtransaction, String validCommission, String commissionCalculated);

	@Query(value = "SELECT NEW com.mss.unified.dto.FileContentProjection(td.id,   td.codeDebit, td.codeBin, td.codeBank,"
			+ "			td.numRIBEmetteur, td.numCartePorteur, td.codeDebitCommercant, td.numRIBcommercant,"
			+ "			td.BinAcquereur, td.CodeBankAcquereur, td.CodeAgence, td.idTerminal, td.idCommercant,"
			+ "			td.typeTransaction, td.dateTransaction, td.heureTransaction, td.montantTransaction,"
			+ "			td.numFacture, td.emetteurFacture, td.numRefTransaction, td.numAutorisation,"
			+ "			td.codeDebitPorteur, td.commisionPorteur, td.codeDebitCommisionCommercant,"
			+ "			td.commisionCommercant, td.commisionInterchange, td.fraisOperateurTechnique,"
			+ "			td.appCryptogram, td.cryptogramInfoData, td.atc, td.terminalVerificationResult,"
			+ "			td.libelleCommercant, td.ruf, td.Numtransaction, td.udf1, td.rufAcquereur,"
			+ "			td.numTransactionPaiementInternet, td.trackId, td.idOriginTransaction, td.rufpaiement,"
			+ "			td.idHeder, td.validCommission, td.interchangeCalculated, s.switchCode, s.switchRRN) FROM com.mss.unified.entities.FileContent td , com.mss.unified.entities.SwitchTransaction s "
			+ "where   SUBSTRING(td.numAutorisation, LENGTH(td.numAutorisation) - 5, 6) = s.switchAuthNumber "
			+ "AND td.numCartePorteur = s.switchPan AND s.switchAuthNumber IS NOT NULL " 
			+ "AND CAST(td.montantTransaction as float)   = CAST(s.switchAmountTransaction as float)/100   "
			+ "AND  td.numAutorisation NOT LIKE '%00000'")
	Page<FileContentProjection> findMatchingSwitch(Pageable pageable);
 


	@Query("SELECT td FROM FileContent td WHERE NOT EXISTS (     SELECT switchel FROM SwitchTransaction switchel " +
		       "    WHERE SUBSTRING(td.numAutorisation, LENGTH(td.numAutorisation) - 5, 6) = switchel.switchAuthNumber " +
		       "    AND switchel.switchAuthNumber IS NOT NULL " +
		       "    AND td.numCartePorteur = switchel.switchPan " +
		       "    AND CAST(td.montantTransaction AS float) = CAST(switchel.switchAmountTransaction AS float) / 100.0 )")
	Page<FileContent> findnotMatchingSwitch(Pageable pageable);
	
	@Query(value = "SELECT NEW com.mss.unified.dto.TpDetailsControl( td.montantTransaction,td.commisionInterchange) "
			//+ " sum( cast(REPLACE(td.montantTransaction,'.','') as float ) + cast(REPLACE(td.commisionInterchange,'.','') as float ) ) ) "
			+ "from FileContent td "
			+ "where td.idHeder=:idHeader "
			+ "and td.typeTransaction in :transactionTypes "
			+ "and td.CodeBankAcquereur='035' and td.codeBank!='035'")
	List<TpDetailsControl> findTpDetailsForUap040(String idHeader,List<String> transactionTypes);
	
	@Query(value = "SELECT NEW com.mss.unified.dto.TpDetailsControl( td.montantTransaction,td.commisionInterchange) "
			//+ " sum( cast( REPLACE(td.montantTransaction,'.','') as float ) - cast(REPLACE(td.commisionInterchange,'.','') as float )) )"
			+ "from FileContent td "
			+ "where td.idHeder=:idHeader "
			+ "and td.typeTransaction in :transactionTypes "
			+ "and td.CodeBankAcquereur='035' and td.codeBank!='035'")
	List<TpDetailsControl> findTpDetailsForUap050(String idHeader,List<String> transactionTypes);
	
	@Query(value = "SELECT NEW com.mss.unified.dto.TpDetailsControl( td.montantTransaction,td.commisionInterchange) "
			//+ "sum( cast(REPLACE(td.montantTransaction,'.','') as float ) + cast(REPLACE(td.commisionInterchange,'.','') as float)) )"
			+ "from FileContent td "
			+ "where td.idHeder=:idHeader "
			+ "and td.typeTransaction in :transactionTypes "
			+ "and td.CodeBankAcquereur='035' and td.codeBank!='035'")
	List<TpDetailsControl> findTpDetailsForUap051(String idHeader,List<String> transactionTypes);
	
	
	
//    @Query("select max (A.file_date) from FileContent A")
//	  List<String> findMaxFileDate();
}

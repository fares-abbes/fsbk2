package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.FileContent;
import com.mss.unified.entities.FileContentT;

@Repository
public interface FILECONTENTTRepository extends JpaRepository<FileContentT, Integer> {

	@Query("select A from FileContentT A where A.idHeder=:idHeder and A.numRIBEmetteur like %:numRIBEmetteur% and A.numCartePorteur like %:numCartePorteur% and A.idTerminal like %:idTerminal% and A.typeTransaction like %:typeTransaction% and A.idCommercant like %:idCommercant%")
	Page<FileContentT> findAllByFilters(Pageable pageable, String idHeder, String numRIBEmetteur, String numCartePorteur,
			String idTerminal, String typeTransaction, String idCommercant);

	@Query(value = "SELECT e FROM FileContentT e WHERE EXISTS (SELECT ee.numRefTransaction, ee.numAutorisation, ee.numCartePorteur FROM FileContentT ee WHERE ee.numRefTransaction = e.numRefTransaction AND ee.numAutorisation = e.numAutorisation AND ee.numCartePorteur = e.numCartePorteur GROUP BY ee.numRefTransaction, ee.numAutorisation, ee.numCartePorteur HAVING COUNT(*) > 1)")
	Page<FileContentT> findDuplicate(Pageable pageable);

	
	
	@Query(value ="SELECT  count(*)     FROM FileContentT ee   GROUP BY ee.numRefTransaction, ee.numAutorisation, ee.numCartePorteur    HAVING COUNT(*) > 1" )
	List<Integer> countDuplicate();
	
	@Query(value = "SELECT fc FROM FileContentT fc WHERE ( fc.idHeder IN (:idHeaders)) AND (  :startDate IS NULL OR fc.dateTransaction >= :startDate) AND  (  :endDate IS NULL OR fc.dateTransaction <= :endDate) AND (:codeDebit IS NULL OR fc.codeDebit LIKE %:codeDebit%) AND "
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
			+ " fc.cryptogramInfoData LIKE %:cryptogramInfoData%) AND (:atc IS NULL OR fc.atc LIKE %:atc%) AND (:terminalVerificationResult IS NULL OR fc.terminalVerificationResult LIKE %:terminalVerificationResult%) AND (:libelleCommercant IS NULL OR fc.libelleCommercant LIKE %:libelleCommercant%) AND (:ruf IS NULL OR fc.ruf LIKE %:ruf%) AND (:Numtransaction IS NULL OR fc.Numtransaction LIKE %:Numtransaction%) ")
	Page<FileContentT> findByFilters(Pageable pageable,List<String> idHeaders,@Param("startDate") String startDate, @Param("endDate") String endDate ,String codeDebit, String codeBin, String codeBank,
			String numRIBEmetteur, String numCartePorteur, String codeDebitCommercant, String numRIBcommercant,
			String BinAcquereur, String CodeBankAcquereur, String CodeAgence, String idTerminal, String idCommercant,
			String typeTransaction, String dateTransaction, String heureTransaction, String montantTransaction,
			String numFacture, String emetteurFacture, String numRefTransaction, String numAutorisation,
			String codeDebitPorteur, String commisionPorteur, String codeDebitCommisionCommercant,
			String commisionCommercant, String commisionInterchange, String fraisOperateurTechnique,
			String appCryptogram, String cryptogramInfoData, String atc, String terminalVerificationResult,
			String libelleCommercant, String ruf, String Numtransaction);
	
	
//	@Query(value = "SELECT fc FROM FileContentT fc WHERE ( fc.idHeder IN (:idHeaders)) AND   (  :startDate IS NULL OR fc.dateTransaction >= :startDate) AND  (  :endDate IS NULL OR  fc.dateTransaction <= :endDate) AND (:codeDebit IS NULL OR fc.codeDebit LIKE %:codeDebit%) AND "
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
//	List<FileContentT> findByFilters(List<String> idHeaders,@Param("startDate") String startDate, @Param("endDate") String endDate ,String codeDebit, String codeBin, String codeBank,
//			String numRIBEmetteur, String numCartePorteur, String codeDebitCommercant, String numRIBcommercant,
//			String BinAcquereur, String CodeBankAcquereur, String CodeAgence, String idTerminal, String idCommercant,
//			String typeTransaction, String dateTransaction, String heureTransaction, String montantTransaction,
//			String numFacture, String emetteurFacture, String numRefTransaction, String numAutorisation,
//			String codeDebitPorteur, String commisionPorteur, String codeDebitCommisionCommercant,
//			String commisionCommercant, String commisionInterchange, String fraisOperateurTechnique,
//			String appCryptogram, String cryptogramInfoData, String atc, String terminalVerificationResult,
//			String libelleCommercant, String ruf, String Numtransaction);
	
	@Query(value = "SELECT fc FROM FileContentT fc WHERE ( fc.idHeder IN (:idHeaders)) AND (  :startDate IS NULL OR fc.dateTransaction >= :startDate) AND  (  :endDate IS NULL OR fc.dateTransaction <= :endDate) AND (:codeDebit IS NULL OR fc.codeDebit LIKE %:codeDebit%) AND "
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
			+ " fc.cryptogramInfoData LIKE %:cryptogramInfoData%) AND (:atc IS NULL OR fc.atc LIKE %:atc%) AND (:terminalVerificationResult IS NULL OR fc.terminalVerificationResult LIKE %:terminalVerificationResult%) AND (:libelleCommercant IS NULL OR fc.libelleCommercant LIKE %:libelleCommercant%) AND (:ruf IS NULL OR fc.ruf LIKE %:ruf%) AND (:Numtransaction IS NULL OR fc.Numtransaction LIKE %:Numtransaction%) ")
	List<FileContentT> findByFilters( List<String> idHeaders,@Param("startDate") String startDate, @Param("endDate") String endDate ,String codeDebit, String codeBin, String codeBank,
			String numRIBEmetteur, String numCartePorteur, String codeDebitCommercant, String numRIBcommercant,
			String BinAcquereur, String CodeBankAcquereur, String CodeAgence, String idTerminal, String idCommercant,
			String typeTransaction, String dateTransaction, String heureTransaction, String montantTransaction,
			String numFacture, String emetteurFacture, String numRefTransaction, String numAutorisation,
			String codeDebitPorteur, String commisionPorteur, String codeDebitCommisionCommercant,
			String commisionCommercant, String commisionInterchange, String fraisOperateurTechnique,
			String appCryptogram, String cryptogramInfoData, String atc, String terminalVerificationResult,
			String libelleCommercant, String ruf, String Numtransaction);

}

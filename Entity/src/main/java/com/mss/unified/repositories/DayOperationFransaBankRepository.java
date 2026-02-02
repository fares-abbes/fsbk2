package com.mss.unified.repositories;

import com.mss.unified.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public interface DayOperationFransaBankRepository extends JpaRepository<DayOperationFransaBank, Long> {
	@Query("select A from DayOperationFransaBank A where A.dateReglement is not null")
	List<DayOperationFransaBank> findByDoneReglement();
	List<DayOperationFransaBank> findByIdenficationIn(List<String> identifications);
	@Query("select A from DayOperationFransaBank A where A.CodeBankAcquereur=:bank and A.codeBank=:bank")
	List<DayOperationFransaBank> finddayOperationOnUs(String bank);

	@Query("SELECT dofb FROM DayOperationFransaBank dofb WHERE dofb.idenfication IN :identifications")
	List<DayOperationFransaBank> findByIdentifications(@Param("identifications") List<String> identifications);
//to modify for oracle in the future

	@Query("SELECT x.idenfication, x.montantSettlement  FROM DayOperationFransaBank x   ")
	List<Object[]> findSumByFilter();

	@Query("SELECT  x.CodeBankAcquereur,x.idenfication, x.montantSettlement  FROM DayOperationFransaBank x where  x.CodeBankAcquereur  IN (:banks)   order by x.CodeBankAcquereur ")
	List<Object[]> findSumByFilterByBank(List<String> banks);

	@Query(" SELECT   count(*) FROM DayOperationFransaBank x WHERE x.idenfication = :identification ")
	int countByIdentification(@Param("identification") String identification);

//    @Query("SELECT sum(montantSettlement) FROM DayOperationFransaBank dofb WHERE dofb.idenfication IN :identifications group By dofb.idenfication ")
//    List<DayOperationFransaBank> findsumByIdentifications(@Param("identifications") List<String> identifications);
	@Query("select M from DayOperationFransaBank M order by M.idenfication")
	List<DayOperationFransaBank> getAll();

	////////////// CASH OU /////////////////
	@Query("select A from DayOperationFransaBank A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank=:bank order by A.refernceLettrage")
	List<DayOperationFransaBank> getOnUs(String bank);

	@Query("select M from DayOperationFransaBank M where M.idenfication=:identification ")
	List<DayOperationFransaBank> findByIdentification(String identification);

	@Query("SELECT r from DayOperationFransaBank r where r.idenfication in :idenfication ")
	List<DayOperationFransaBank> findByIdentifConcatine(List<String> idenfication);

	/*
	 * @Query("SELECT sum(r.montantSettlement) from DayOperationFransaBank r where r.idenfication in:idenfication   group by r.Numtransaction order by r.refernceLettrage"
	 * ) List<String> findAmountConcatine(List<String> idenfication,String bank);
	 */

	@Query("select A from DayOperationFransaBank A where A.typeTransaction='040' and A.CodeBankAcquereur!=:bank  and A.CodeBankAcquereur NOT IN (:banks) and A.codeBank=:bank ")
	List<DayOperationFransaBank> getOffUsIssuer(String bank, List<String> banks);

	@Query("select A from DayOperationFransaBank A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank and A.codeBank!=:bank and A.codeBank NOT IN (:banks)   ")
	List<DayOperationFransaBank> getOffUsAcq(String bank, List<String> banks);

	@Query("select A from DayOperationFransaBank A where A.typeTransaction='040' and A.CodeBankAcquereur=:bank  and A.codeBank IN (:banks)  ")
	List<DayOperationFransaBank> getOffUsAcqAlgeriePoste(String bank, List<String> banks);

	@Query("select A from DayOperationFransaBank A where A.typeTransaction='040' and A.CodeBankAcquereur  IN (:banks)  and A.codeBank=:bank ")
	List<DayOperationFransaBank> getOffUsIssuerAlgeriePoste(String bank, List<String> banks);

	///////////// ACHAT /////////////////////////////////////
	@Query("select A from DayOperationFransaBank A where A.typeTransaction='050' and A.CodeBankAcquereur=:bank and A.codeBank=:bank ")
	List<DayOperationFransaBank> getOnUsAchat(String bank);

	@Query("select A from DayOperationFransaBank A where A.typeTransaction='050' and A.CodeBankAcquereur!=:bank and A.codeBank=:bank ")
	List<DayOperationFransaBank> getOffUsAcqAchat(String bank);

	@Query("select A from DayOperationFransaBank A where A.typeTransaction='050' and A.CodeBankAcquereur=:bank and A.codeBank!=:bank ")
	List<DayOperationFransaBank> getOffUsIssuerAchat(String bank);

	///// a compenser
	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction, SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END),A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where A.idenfication in('G008','G009','G010')   and A.montantSettlement is not null group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListRetraitUAP();

	@Query("select A from DayOperationFransaBank A where A.idenfication='8' ")
	List<DayOperationFransaBank> getIdentif();

	//// retrait
	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G008' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRetrait();

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G009', 'G010')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRetraitCommission(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G122', 'G123')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListConsultationSoldeUAPCommission(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction, Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G122','G123')   group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")

	List<Object[]> getListConsultationSoldeUAP();

	@Query("select A.numAutorisation , SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END)  from DayOperationFransaBank A where   A.idenfication in('122','123') group by A.numAutorisation")
	List<String[]> getListConsultationSoldeCommission();

	/////////// ACHAT TPE////////////
	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in ('G031','G032') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm ")
	List<Object[]> getListPaiementSurTpeUAP();

	@Query("select A  from Merchant A  where A.merchantId in (select idCommercant from  DayOperationFransaBank D where D.idenfication in('G026','G027','G028'))")
	List<Merchant> getListMerchantPaiementTpe();

	@Query("select A.numAutorisation , SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END)  from DayOperationFransaBank A where   A.idenfication in('G027','G028') group by A.numAutorisation")
	List<Object[]> getListAchatTpeCommission();

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G026' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchat();
	/////////////// REMBOURSSEMENT ACHAT TPE ///////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G048','G094','G095') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListRembourssementTpeUAP();

	@Query("select A  from Merchant A  where A.merchantId in (select idCommercant from  DayOperationFransaBank D where D.idenfication in('G048','G049','G050'))")
	List<Merchant> getListMerchantRembourssementTpe();

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G094', 'G095')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRembourssemntTpeCommission(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G048' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRembourssement();

	////////// Algerie Poste ///////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction, SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END),A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G170','G171','G172') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListRetraitUAPAlgeriePoste();

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G171', 'G172')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRetraitCommissionAlgeriePoste(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G170' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRetraitAlgeriePoste();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G001'")
	List<DayOperationFransaBank> getListOnUsMemeAgence();

	@Query("select A from DayOperationFransaBank A where A.numRefTransaction=:numTransaction and A.numAutorisation=:numAutorisation and A.numCartePorteur=:numCartePorteur")
	List<DayOperationFransaBank> getListOnUsMemeAgenceByNumTransaction(String numTransaction, String numAutorisation,
			String numCartePorteur);

	@Query("select A.idenfication, A.montantSettlement from DayOperationFransaBank A where A.numRefTransaction = :numTransaction and A.numAutorisation = :numAutorisation and A.numCartePorteur = :numCartePorteur")
	List<Object[]> getListIdentificationAmountByTransaction(String numTransaction, String numAutorisation,
			String numCartePorteur);

	@Query("select   SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END)  from DayOperationFransaBank A where A.idenfication in (:identif1 , :identif2) and A.montantSettlement!=null ")
	Integer getMontantConcatine(String identif1, String identif2);

	////////// autre agence//////////
	@Query("select A from DayOperationFransaBank A where A.idenfication='G004'")
	List<DayOperationFransaBank> getListOnUsAutreAgence();

	/////////// off us Issuer//////////

	@Query("select A from DayOperationFransaBank A where A.idenfication='G014'")
	List<DayOperationFransaBank> getListOffUsIssuer();

	/////////// offus acq/////////////

	@Query("select A from DayOperationFransaBank A where A.idenfication='G008'")
	List<DayOperationFransaBank> getListOffUsAcq();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G170'")
	List<DayOperationFransaBank> getListOffUsAcqAlgeriePoste();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G159'")
	List<DayOperationFransaBank> getListOffUsIssuerAlgeriePoste();

	////////////// ACHAT //////////////////////

	@Query("select A from DayOperationFransaBank A where A.idenfication='G041'")
	List<DayOperationFransaBank> getListOnUsMemeAgenceAchat();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G044'")
	List<DayOperationFransaBank> getListOnUsAutreAgenceAchat();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G034'")
	List<DayOperationFransaBank> getListOffUsIssuerAchat();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G026'")
	List<DayOperationFransaBank> getListOffUsAcqAchat();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G114'")
	List<DayOperationFransaBank> getListOnUsConsultationSolde();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G118'")
	List<DayOperationFransaBank> getListOnUsAutreAgenceConsultationSolde();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G127'")
	List<DayOperationFransaBank> getListOffUsIssuerConsultationSolde();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G122'")
	List<DayOperationFransaBank> getListOffUsAcqConsultationSolde();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G103'")
	List<DayOperationFransaBank> getListOnusRembourssementTpe();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G108'")
	List<DayOperationFransaBank> getListOnusAutreAgenceRembourssementTpe();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G097'")
	List<DayOperationFransaBank> getListOffUsIssuerRembourssementTpe();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G048'")
	List<DayOperationFransaBank> getListOffUsAcqRembourssementTpe();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G148'")
	List<DayOperationFransaBank> getListOnusRembourssementInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G153'")
	List<DayOperationFransaBank> getListOnusAutreAgenceRembourssementInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G142'")
	List<DayOperationFransaBank> getListOffUsIssuerRembourssementInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G134'")
	List<DayOperationFransaBank> getListOffUsAcqRembourssementInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G081'")
	List<DayOperationFransaBank> getListOnUsMemeAgenceAchatInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G087'")
	List<DayOperationFransaBank> getListOnUsAutreAgenceAchatInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G074'")
	List<DayOperationFransaBank> getListOffUsIssuerAchatInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G193'")
	List<DayOperationFransaBank> getListOffUsIssuerAchatInternetExceptionnelMerchant();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G066'")
	List<DayOperationFransaBank> getListOffUsAcqAchatInternet();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G186'")
	List<DayOperationFransaBank> getListOffUsIssuerAchatInternetAlgeriePoste();

	@Query("select A from DayOperationFransaBank A where A.idenfication='G178'")
	List<DayOperationFransaBank> getListOffUsAcqAchatInternetAlgeriePoste();

	///////////// UAP 50 REMBOURSSEMENT INTERNET /////////////
	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END) ,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G134','G139','G140') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListRembourssementInternetUAP();

	@Query("select A from Merchant A where A.merchantId in (select D.idCommercant from  DayOperationFransaBank D where D.idenfication in ('G134','G135','G136'))")
	List<Merchant> getListMerchantRembourssementInternet();

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G139', 'G140')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRembourssemntInternetCommission(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G134' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRembourssementInternet();

	//////////////// Achat internet /////////////////////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G071','G072') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListAchatInternetUAP();

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G183','G184') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idCommercant,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListAchatInternetAlgeriePosteUAP();

	@Query("select A  from Merchant A  where A.merchantId in (select idCommercant from  DayOperationFransaBank D where D.idenfication in('G066','G067','G068'))")
	List<Merchant> getListMerchantAchatInternet();

	@Query("select A  from Merchant A  where A.merchantId in (select idCommercant from  DayOperationFransaBank D where D.idenfication in('G178','G179','G180'))")
	List<Merchant> getListMerchantAchatInternetAlgeriePoste();

//>>>>>>> origin/versionJarK
//
//    @Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='170' group by A.numAutorisation,A.montantSettlement")
//
//<<<<<<< HEAD
//    List<String[]> getListAmountRetraitAlgeriePoste();
//=======
	@Query("select A.numAutorisation , SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END)  from DayOperationFransaBank A where   A.idenfication in('G067','G068')  and A.montantSettlement!=null group by A.numAutorisation")
	List<Object[]> getListAchatInternetCommission();

	@Query("select A.numAutorisation , SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END)  from DayOperationFransaBank A where   A.idenfication in('G179','G180')  and A.montantSettlement!=null group by A.numAutorisation")
	List<Object[]> getListAchatInternetAlgeriePosteCommission();

//>>>>>>> origin/versionJarK

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G066' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchatInternet();

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G178' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchatInternetAlgeriePoste();

	/////////////////// FOR UAP40IN RETRAIT ***************
	/////////////////// ////////////////////////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction, SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END),A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm  from DayOperationFransaBank A where   A.idenfication in('G014','G018','G019')   and A.montantSettlement!=null group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListRetraitUAP40IN();

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G018', 'G019')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRetraitCommission040IN(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G014' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRetrait040IN();

	////////////////// FOR UAP040IN CONSULTATION SOLDE ****************
	////////////////// ///////////////////////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction, A.montantSettlement,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm  from DayOperationFransaBank A where   A.idenfication='G133'")
	List<Object[]> getListConsultationSoldeUAP040IN();
	// @Query("select A.numAutorisation
	// ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,
	// SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN
	// CAST(A.montantSettlement as int) ELSE 0 END) from DayOperationFransaBank A
	// where A.idenfication in('G127','G128') group by A.numAutorisation
	// ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction")

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G129', 'G130')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListCConsultationSoldeUAP040IN(String numAutorisation, String numRefTransaction, String numCarte);

	////////////// FOR UAP040IN RETRAIT ALGERIE POSTE
	////////////// **************////////////////////////////////
	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction, SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement as int) ELSE 0 END),A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm   from DayOperationFransaBank A where   A.idenfication in('G159','G166','G167') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm ")
	List<Object[]> getListRetraitUAPAlgeriePoste040IN();

	@Query("SELECT SUM(CASE WHEN ISNUMERIC(A.montantSettlement) = 1 THEN CAST(A.montantSettlement AS int) ELSE 0 END)\r\n"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G166', 'G167')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRetraitCommissionAlgeriePoste040IN(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G159' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRetraitAlgeriePoste040IN();

	//////////////// FOR UAP050IN PAIEMENT TPE
	//////////////// *****************//////////////////////////////
	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G035','G036') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListPaiementSurTpeUAPIN();

	@Query("SELECT Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 )"
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G035', 'G036')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListAchatTpeCommissionIN(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G034' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchatIN();

	//////////////// FOR UAP050IN REMBOURSSEMENT TPE
	//////////////// *******////////////////////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) ,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm  from DayOperationFransaBank A where   A.idenfication in('G097','G098','G099') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm ")
	List<Object[]> getListRembourssementTpeUAPIN();

	@Query("SELECT Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) "
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication IN ('G098', 'G099')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRembourssemntTpeCommissionIN(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G097' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRembourssementIN();

	////////////// FOR UAP050IN REMBOURSSEMENT INTERNET
	////////////// **************//////////////////////////////

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G142','G143','G144') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListRembourssementInternetUAPIN();

	@Query("SELECT Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) "
			+ "FROM DayOperationFransaBank A\r\n" + "WHERE A.idenfication  IN ('G143', 'G144')\r\n"
			+ "AND A.numAutorisation = :numAutorisation\r\n" + "AND A.numRefTransaction = :numRefTransaction\r\n"
			+ "AND A.numCartePorteur = :numCarte")
	String getListRembourssemntInternetCommissionIN(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G142' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountRembourssementInternetIN();

	/////////// FOR UAP050IN ACHAT INTERNET ****************////////////////////
	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G075','G076') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListAchatInternetUAPIN();

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) ,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G193','G196','G197') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListAchatInternetExceptionnelMerchantUAPIN();

	@Query("select A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ),A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm from DayOperationFransaBank A where   A.idenfication in('G186','G187','G188') group by A.numAutorisation ,A.numCartePorteur,A.montantTransaction,A.codeAgence,A.typeTransaction,A.CodeBankAcquereur,A.codeBin,A.codeDebitPorteur,A.codeDebitCommercant,A.Numtransaction,A.dateTransaction,A.heureTransaction,A.numRIBcommercant,A.libelleCommercant,A.fileDate,A.numRefTransaction,A.idTerminal,A.pieceComptableBkm")
	List<Object[]> getListAchatInternetAlgeriePosteUAPIN();

	@Query("SELECT   Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) " + "FROM DayOperationFransaBank A "
			+ "WHERE A.idenfication IN ('G075', 'G076') AND A.numAutorisation = :numAutorisation "
			+ "AND A.numRefTransaction = :numRefTransaction AND A.numCartePorteur = :numCarte")
	String getListAchatInternetCommissionIN(String numAutorisation, String numRefTransaction, String numCarte);

	@Query("SELECT  Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) FROM DayOperationFransaBank A "
			+ "WHERE A.idenfication IN ('G196', 'G197')  AND A.numAutorisation = :numAutorisation "
			+ "AND A.numRefTransaction = :numRefTransaction  AND A.numCartePorteur = :numCarte")
	String getListAchatInternetCommissionExceptionnelMerchantIN(String numAutorisation, String numRefTransaction,
			String numCarte);

	@Query("SELECT  Round ((SUM(A.montantSettlement  )*1000)/1000  ,0 ) " + "FROM DayOperationFransaBank A "
			+ "WHERE A.idenfication IN ('G187', 'G188') AND A.numAutorisation = :numAutorisation "
			+ "AND A.numRefTransaction = :numRefTransaction AND A.numCartePorteur = :numCarte")
	String getListAchatInternetAlgeriePosteCommissionIN(String numAutorisation, String numRefTransaction,
			String numCarte);

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G074' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchatInternetIN();

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G193' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchatInternetExceptionnelMerchantIN();

	@Query("select A.numAutorisation ,A.montantSettlement from DayOperationFransaBank A where   A.idenfication='G186' group by A.numAutorisation,A.montantSettlement")
	List<Object[]> getListAmountAchatInternetAlgeriePosteIN();

//    @Query("select A from DayOperationFransaBank A where A.done='1'")
//    List<DayOperationFransaBank> findByDoneReglement();

	@Query("select A from DayOperationFransaBank A where A.dateReglement=:date")
	List<DayOperationFransaBank> findByDoneReglementAndDate(String date);

	@Query("select A from DayOperationFransaBank A where A.codeBank !=:bank and A.CodeBankAcquereur =:bank")
	List<DayOperationFransaBank> getUap040(String bank);

	@Query("select count(*) from UAPFransaBank A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	int uap040Length(String today);

	@Query("select count(*) from UAP050FransaBank A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	int uap050Length(String today);

	@Query("select count(*) from UAP051FransaBank A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	int uap051Length(String today);

	@Query("select count(*) from UAP040IN A where CONVERT(DATE,A.dateReg)<= CONVERT(DATE,:today)")
	int uap040InLength(String today);

	@Query("select count(*) from UAP050IN A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	int uap050InLength(String today);

	@Query("select count(*) from UAP051IN A where CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)")
	int uap051InLength(String today);

	@Query("SELECT  A " + "FROM DayOperationFransaBank A " + "WHERE A.idenfication =:idenfication "
			+ "AND A.numAutorisation = :numAutorisation " + "AND A.numRefTransaction = :numRefTransaction "
			+ "AND A.numCartePorteur = :numCarte")
	Optional<DayOperationFransaBank> findGByTransaction(String idenfication, String numAutorisation,
			String numRefTransaction, String numCarte);

}

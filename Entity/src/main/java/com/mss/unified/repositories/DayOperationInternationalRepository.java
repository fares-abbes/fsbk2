package com.mss.unified.repositories;

import com.mss.unified.dto.TotalVisaDto;
import com.mss.unified.entities.*;
import com.mss.unified.references.DayOperationInternationalTypeOperationRequest;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOperationInternationalRepository extends JpaRepository<DayOperationInternational, Integer> {




	@Query("select A from Tc45 A")
	List<Tc45> gettc45();

	@Query("select A from VisaIncoming A where A.transactionCode='07' or A.transactionCode='05'")
	List<VisaIncoming> visaIncoming();


	@Query("select A from VisaIncoming A where A.transactionCode like '07%' and A.summaryCode=:summary and (A.BUSINESS_FORMAT_CODE_04 is null or A.BUSINESS_FORMAT_CODE_04 !='DF') ")
	List<VisaIncoming> VisaIncomingATM(int summary);
	@Query("select A from VisaIncoming A where A.transactionCode like '07%' and A.summaryCode=:summary and  (A.BUSINESS_FORMAT_CODE_04 is not null and A.BUSINESS_FORMAT_CODE_04 ='DF' ) and A.disputeStatus='P1' ")
	List<VisaIncoming> VisaIncomingATMDisp(int summary);

	@Query("select A from VisaIncoming A where A.transactionCode like '07%' and A.summaryCode in :summary")
	List<VisaIncoming> VisaIncomingATM(List<Integer> summary);

	@Query("select A from VisaIncoming A where A.transactionCode like '05%' and A.summaryCode=:summary and (A.BUSINESS_FORMAT_CODE_04 is null or A.BUSINESS_FORMAT_CODE_04 !='DF')")
	List<VisaIncoming> VisaIncomingPOS(int summary);

	@Query("select A from VisaIncoming A where A.transactionCode like '05%' and A.summaryCode in :summary")
	List<VisaIncoming> VisaIncomingPOS(List<Integer> summary);


	@Query("select A from VisaIncoming A where A.transactionCode like '07%'")
	List<VisaIncoming> VisaIncomingATM();

	@Query("select A from VisaIncoming A where A.transactionCode like '05%'")
	List<VisaIncoming> VisaIncomingPOS();


	@Query("select A.identification,A.debitAccount from OperationCodeCommision A")
	List<String[]> getListDebit();

	@Query("select A.identification,A.creditAccount from OperationCodeCommision A")
	List<String[]> getListCredit();


	@Query("SELECT A FROM TransactionValidAtm A where A.fiid_acqu='0105' and upper(A.fiid_issuer)='VISA' and A.visaCode is null")
	public List<TransactionValidAtm> transaction_atm_visa();

	@Query("SELECT A FROM TransactionValidAtm A where A.mdsCode is null")
	public List<TransactionValidAtm> transaction_atm_frec();
	@Query("SELECT A FROM TransactionValidAtm A where A.mdsCode is null and fiid_issuer ='MDS'  and fiid_acqu =:banqueId")
	public List<TransactionValidAtm> transaction_atm_frecOptimise(String banqueId);

	@Query("SELECT A FROM TransactionValidAtm A where A.ipmCode is null")
	public List<TransactionValidAtm> transaction_ipm();
	@Query("SELECT A FROM TransactionValidPos A where constatation is null")
	public List<TransactionValidPos> transaction_pos();
	@Query("SELECT A FROM TransactionValidPos A where constatation is null and fiidIssuer ='MDS' and  fiidAquerer =:banqueId ")
	public List<TransactionValidPos> transaction_posOpt(String banqueId);

	// Find by a list of identifications
	@Query("SELECT d FROM DayOperationInternational d WHERE d.idenficationCode IN :identifications")
	List<DayOperationInternational> findByIdentificationsCode(@Param("identifications") List<String> identifications);

	@Query("SELECT A FROM VisaIncoming A")
	public List<VisaIncoming> Visa_Incoming();

	@Query("SELECT doi FROM DayOperationInternational doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE occ.identification IN :identifications")
	List<DayOperationInternational> findByIdentifications(List<String> identifications);

	@Query("SELECT doi FROM DayOperationInternational doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE occ.identification = :identification")
	List<DayOperationInternational> findByIdentification(String identification);

	@Query("select I.typeOperation from DayOperationInternational I , OperationCodeCommision O where I.typeOperation=O.code and O.identification=?1")
	List<Integer> findTypeOperationByIdentification(String identification);
	@Query("select I from DayOperationInternational I , OperationCodeCommision O where I.typeOperation=O.code and O.identification=?1")
	List<DayOperationInternational> findCurrencyCodeSettlementByIdentification(String identification);
	@Query("select I from DayOperationInternational I , OperationCodeCommision O where I.typeOperation=O.code and O.identification=?1")
	List<DayOperationInternational> findConversionRateSettlementByOperation(String identification);

	@Query("SELECT new com.mss.unified.references.DayOperationInternationalTypeOperationRequest(doi,occ.identification) FROM DayOperationInternational doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE occ.identification in :identification and doi.codeFile=:impCode order by doi.typeOperation")
	List<DayOperationInternationalTypeOperationRequest> findByIdentificationAndIpmCode(List<String> identification, String impCode);
//suit a une discussion avec wisal j'ai éliminer status chargeback et je l'ia changer par summary ipm code


	@Query("select A from VisaIncoming A where A.summaryCode=:summary and matchingSwitch is null ")
	List<VisaIncoming> visaIncomingNotMatcheSwitch (int summary);

	@Query("select A from VisaIncoming A where A.summaryCode in :summary and matchingSwitch is null ")
	List<VisaIncoming> visaIncomingNotMatcheSwitch (List<Integer> summary);
	@Query("select A from VisaIncoming A where A.transactionCode='06'  and merchantCategoryCode!='6011' and A.summaryCode=:summary "
			+ "and not exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaIncoming> RefundVisaAcqBt(int summary);
	@Query("select A from VisaIncoming A where A.transactionCode='06' and merchantCategoryCode!='6011' and A.summaryCode=:summary "
			+ "and  exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaIncoming> RefundVisaIssuerBt(int summary);
	@Query("select A from VisaIncoming A where A.transactionCode='06' and merchantCategoryCode='6011' and A.summaryCode=:summary "
			+ "and  exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaIncoming> RefundVisaRetraitIssuerBt(int summary);
	@Query("select A from VisaIncoming A where A.transactionCode='06' and merchantCategoryCode='6011'  and A.summaryCode=:summary "
			+ "and not exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaIncoming> RefundVisaRetraitAcqBt(int summary);
	//after checking with rania we have change cash advance like  ipm
	@Query("select A from VisaIncoming A where A.transactionCode='07' and merchantCategoryCode!='6011' and A.summaryCode=:summary "
			+ "and  exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaIncoming> cashAdvanceVisaIssuerBt(int summary);
	@Query("select A from VisaIncoming A where A.transactionCode='07' and merchantCategoryCode!='6011'  and A.summaryCode=:summary "
			+ "and not exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaIncoming> cashAdvanceVisaAcqBt(int summary);

	@Query("select A from VisaIncoming A where A.transactionCode='27' and summaryCode=:summary")
	List<VisaIncoming> ResevsalDabVisa(int summary);
	@Query("select A from ChargebackVisa A where summaryCode=:summary and cardAcceptorId like '05%' and code=:code")
	List<ChargebackVisa> chargebackVisaRecu(int summary,int code);
	@Query("select A from ChargebackVisa A where summaryCode=:summary and cardAcceptorId like '05%'" )
	List<ChargebackVisa> chargebackVisaRecu(int summary);
	@Query("select A from ChargebackVisa A where summaryCode=:summary and constatation is null and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<ChargebackVisa> chargebackEmisVisa(int summary);
	//	@Query("select A from ChargebackVisa A where  transactionCode in ('05','07')  and constatation is null and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
//	List<ChargebackVisa> RepresentationEmisVisa();
	@Query("select A from ChargebackVisa A where  transactionCode in ('05','07')  and constatation is null  ")
	List<ChargebackVisa> RepresentationRecuVisa();




	@Transactional
	@Modifying
	@Query("delete from DayOperationInternational d where d.fileDateCp=:fileDate")
	public void deleteByfileDate(String fileDate);
	@Transactional
	@Modifying
	@Query("delete from DayOperationInternational  ")
	public void deleteInternationalDayToday();

	@Query("select d from DayOperationInternational d where d.fileDate=:fileDate")
	public List<DayOperationInternational> findByfileDate(String fileDate);
	@Query("select d from DayOperationInternational d,OperationCodeCommision sett where  d.fileDateCp=:fileDate and sett.identification in :identification and d.typeOperation=sett.code ")
	public List<DayOperationInternational> findByfileDateCpAndIdentification(String fileDate,List<String>identification);




	@Query("SELECT new com.mss.unified.references.DayOperationInternationalTypeOperationRequest(doi,occ.identification) FROM DayOperationInternational doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "WHERE doi.fileDate=:fileDate and occ.identification in :identification and doi.codeFile=:impCode  order by doi.typeOperation")
	List<DayOperationInternationalTypeOperationRequest> findByIdentificationAndIpmCodeAndFileDate(List<String> identification, String impCode,String fileDate);
	@Query("SELECT new com.mss.unified.references.DayOperationInternationalTypeOperationRequest(doi,occ.identification) FROM DayOperationInternational doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "   and occ.identification in :identification   order by doi.codeFile  ")
	List<DayOperationInternationalTypeOperationRequest> findByIdentificationAndIpmCodeAndFileDate( List<String> identification);
	@Query("SELECT doi FROM DayOperationInternational doi "
			+ " where  LOWER(compteDebit)='appurement' ")
	List<DayOperationInternational> findByAppurement( );
	@Modifying
	@Transactional
	@Query("DELETE FROM DayOperationInternational doi "
			+ "WHERE doi.typeOperation IN ( "
			+ "    SELECT occ.code "
			+ "    FROM OperationCodeCommision occ "
			+ "    WHERE occ.identification NOT IN :identifications) "
			+ "AND doi.fileDate = :fileDate "
			+ "AND doi.source IN :sources")
	void deleteInternationalDayBySourceSansAppurementChargebackAndFileDateAndSourceIn(
			@Param("identifications") List<String> identifications,
			@Param("sources") List<String> sources,
			@Param("fileDate") String fileDate);
	@Modifying
	@Transactional
	@Query("DELETE FROM DayOperationInternational doi "
			+ "WHERE  "
			+ " doi.fileDate = :fileDate "
			+ "AND doi.source  IN :sources"
			+ " and ( LOWER(compteDebit)!='appurement'  or compteDebit is null ) "

	)
	void deleteInternationalDayBySourceSansAppurementChargebackAndFileDateAndSourceIn(
			@Param("sources") List<String> sources,
			@Param("fileDate") String fileDate);

	@Modifying
	@Transactional
	@Query("DELETE FROM DayOperationInternational doi "
			+ "WHERE doi.typeOperation IN ( "
			+ "    SELECT occ.code "
			+ "    FROM OperationCodeCommision occ "
			+ "    WHERE occ.identification IN :identifications) "
			+ "AND doi.fileDate = :fileDate "
			+ "AND doi.source IN :sources")
	void deleteInternationalDayBySourceAvecAppurementChargebackAndFileDateAndSourceIn(
			@Param("identifications") List<String> identifications,
			@Param("sources") List<String> sources,
			@Param("fileDate") String fileDate);
	@Modifying
	@Transactional
	@Query("DELETE FROM DayOperationInternational doi "
			+ "WHERE doi.typeOperation IN ( "
			+ "    SELECT occ.code "
			+ "    FROM OperationCodeCommision occ "
			+ "    WHERE occ.identification IN :identifications) "
			+ "AND doi.fileDate = :fileDate "
			+ "AND doi.source not IN :sources")
	void deleteInternationalDayBySourceAvecAppurementChargebackAndFileDateAndSourceNotIn(
			@Param("identifications") List<String> identifications,
			@Param("sources") List<String> sources,
			@Param("fileDate") String fileDate);

	@Query (" SELECT new com.mss.unified.references.DayOperationInternationalTypeOperationRequest (doc,operation.identification) from DayOperationInternational doc, OperationCodeCommision operation  where  doc.typeOperation =operation.code and operation.identification in :identification ")
	List<DayOperationInternationalTypeOperationRequest> findByIdentification(List<String> identification);
	@Query (" SELECT new com.mss.unified.references.DayOperationInternationalTypeOperationRequest (doc,operation.identification) from DayOperationInternational doc, OperationCodeCommision operation  where  doc.typeOperation =operation.code and operation.identification in :identification and doc.currencyCodeTransaction!='788' ")
	List<DayOperationInternationalTypeOperationRequest> findByIdentificationOffshore(List<String> identification);



	@Query("select A from IpmClearingDetails A where mti='1240' and de26 !='6011' and A.summaryCode =:summaryCode and exists (Select e from BinOnUs e Where SUBSTRING(A.de02,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) and A.de03 like'01%' ")
	List<IpmClearingDetails> cashAdvancePorteur(int summaryCode);

	@Query("select A from IpmClearingDetails A where mti='1240' and de26 !='6011' and A.summaryCode =:summaryCode and not exists (Select e from BinOnUs e Where SUBSTRING(A.de02,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) and A.de03 like'01%'")
	List<IpmClearingDetails> cashAdvanceCommercant(int summaryCode);
	@Query("select A from VisaIncoming A where A.transactionCode='25' and summaryCode=:summary and sourceCurrencyCode!='788'")
	List<VisaIncoming> ResevsalPOSVisa(int summary);
	@Query("select A from VisaIncoming A where A.transactionCode='25' and summaryCode=:summary and sourceCurrencyCode='788'")
	List<VisaIncoming> ResevsalPOSVisaDinars(int summary);



	@Query("select distinct A.fileDate from DayOperationInternational A")
	List<String> findDistinctfiledates();

	@Query("select sum(destinationAmount) from FraisVisaIncoming B where B.summaryCode =:summaryCode and B.transactionCode='10'")
	Optional<Double> DebitVisa(Integer summaryCode);
	@Query("select sum(amount) from FraisConnectivite B ")
	Optional<Double> DebitVisaConn();

	@Query("select sum(destinationAmount) from FraisVisaIncoming B where B.summaryCode =:summaryCode and B.transactionCode='20'")
	Optional<Double> CreditVisa(Integer summaryCode);
	@Query("select sum(destinationAmount) from FraisVisaIncoming B where B.summaryCode =:summaryCode and messageText like '%10033672%'")
	Optional<Double> FraisVisa(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('F1','R1','R2','R3','P1','L1','L2','L3')")
	List<VisaDisputeStatusAdvice> VisaDispute(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('P1' ) and not exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> VisaDisputeRepEmise(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('L3' ) and exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> arbitrageVisaCHEmis(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('L3' ) and not exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> arbitrageVisaCHRecu(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('R3' ) and not  exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> arbitrageVisaRepEmis(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('R3' ) and exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> arbitrageVisaRepRecu(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in  ('P1' ) and exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> VisaDisputeRepRecue(Integer summaryCode);
	@Query("select A from VisaIncoming A where A.transactionCode like '05%' and A.summaryCode=:summary and (A.BUSINESS_FORMAT_CODE_04 is not null and A.BUSINESS_FORMAT_CODE_04 ='DF' ) and A.disputeStatus='P1'")
	List<VisaIncoming> VisaIncomingPOSDISP(int summary);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('R1')  and exists   "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaDisputeStatusAdvice> VisaDisputeAnnulationChEmis(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('R1')  and not exists   "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaDisputeStatusAdvice> VisaDisputeAnnulationChRecu(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('L1')  and not exists   "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaDisputeStatusAdvice> VisaDisputeAnnulationRepEmis(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('L1')  and   exists   "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaDisputeStatusAdvice> VisaDisputeAnnulationRepRecu(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('L2')  and not  exists   "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaDisputeStatusAdvice> VisaDisputeAcceptationCHRecu(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('R2')  and   exists   "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	List<VisaDisputeStatusAdvice> VisaDisputeAcceptationRepEmis(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('F1')  and   exists  "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> VisaDisputeChEmis(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('F1') and not exists "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) ")
	List<VisaDisputeStatusAdvice> VisaDisputeChRecue(Integer summaryCode);
	@Query("select B from VisaDisputeStatusAdvice B where B.summaryCode =:summaryCode and disputeStatus in ('L1','L2','L3')")
	List<VisaDisputeStatusAdvice> VisaDisputeAnulationChRecu(Integer summaryCode);
	@Query("select A from ChargeBackVisaOutgoing A where A.responseCode='00' and A.requestMessageType='0422' and (A.settAmount!=0 or A.transactionAmount!=0  ) and A.summaryCode=:file")
	List<ChargeBackVisaOutgoing> ChargebackRetraitVisa(int file);
	@Query("select A from ChargeBackVisaOutgoing A where A.responseCode='00' and A.requestMessageType='0220' AND  (A.settAmount!=0 or A.transactionAmount!=0  )  and A.summaryCode=:file")
	List<ChargeBackVisaOutgoing> RepresentationRetraitVisa(int file);
	@Query("SELECT new com.mss.unified.dto.TotalVisaDto(CAST(A.secondAmount AS double), CAST(A.thirdAmount AS double)) FROM TotalVisa A where A.summaryLevel in ('01','03','05')  "
			+ "and A.reportingForSreIdentifier = A.fundsTransferSreIdentifier "
			+ "AND A.businessMode=1 and businessTransactionType='310' and trim(chargeTypeCode) is not null "
			+ "and  A.summaryCode=:summary  and TRIM(firstCount) is not null "
	)
	List<TotalVisaDto> chargeAcquisitionRetraitVisa(Integer summary );
	@Query("SELECT new com.mss.unified.dto.TotalVisaDto(sum(CAST(A.secondAmount AS double)),sum( CAST(A.thirdAmount AS double))) FROM TotalVisa A where A.summaryLevel in ('01','03','05')  "
			+ "and A.reportingForSreIdentifier = A.fundsTransferSreIdentifier "
			+ "AND A.businessMode=2 and businessTransactionType='310' and trim(chargeTypeCode) is not null "
			+ "  and A.summaryCode=:summary  "
			+ " AND (trim(secondAmountSign) is not null or trim(thirdAmountSign) is not null)")
	List<TotalVisaDto> chargeEmissionRetraitVisa(Integer summary );

	@Query("SELECT new com.mss.unified.dto.TotalVisaDto(CAST(A.secondAmount AS double),CAST(A.thirdAmount AS double)) FROM TotalVisa A where A.summaryLevel in ('01','03','05')  "
			+ "and A.reportingForSreIdentifier = A.fundsTransferSreIdentifier "
			+ "AND A.businessMode=1 and businessTransactionType='100' and trim(chargeTypeCode) is not null "
			+ "  and A.summaryCode=:summary and trim(firstCount) is not null "
	)
	List<TotalVisaDto> chargeAcquisitionAchatVisa(Integer summary );
	@Query("SELECT new com.mss.unified.dto.TotalVisaDto(sum(CAST(A.secondAmount AS double)),sum( CAST(A.thirdAmount AS double))) FROM TotalVisa A where A.summaryLevel in ('01','03','05')  "
			+ "and A.reportingForSreIdentifier = A.fundsTransferSreIdentifier "
			+ "AND A.businessMode=2 and businessTransactionType='100' and trim(chargeTypeCode) is not null "
			+ "  and A.summaryCode=:summary  "
			+ " AND (trim(secondAmountSign) is not null or trim(thirdAmountSign) is not null)")
	List<TotalVisaDto> chargeEmissionAchatVisa(Integer summary );



	@Query("select a.currency from Merchant s JOIN Account a on s.account=a.accountCode where s.merchantId like %:affiliation% ")
	String findMerchant(String affiliation);

@Query("select B from VisaIncoming B where B.summaryCode =:summaryCode and transaction_code='35'")
	List<VisaIncoming> disputeReversal(Integer summaryCode);

	@Query("select B from VisaDisputeStatusAdvice B where disputeStatus in ('F1') and not exists "
			+ " (Select e from BinOnUs e Where SUBSTRING(B.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)"
			+ " and accountNumber = :cardNumber and authorizationCode = :authorizationCode and trim(cardAcceptorId) = :merchantId"
			+ " and acquirerReferenceNumber = :acquirerReferenceNumber")
	VisaDisputeStatusAdvice visaDisputeRecue( String cardNumber, String authorizationCode, String merchantId, String acquirerReferenceNumber);

	@Query("select A from ChargebackVisa A where trim(cardAcceptorId) = :merchantId"
			+ " and authorizationCode =:authorizationCode and acquirerReferenceNumber =:acquirerReferenceNumber"
			+ " and trim(accountNumber) = :accountNumber")
	ChargebackVisa chargebackVisaRecu(String merchantId, String authorizationCode, String acquirerReferenceNumber, String accountNumber);
	@Query("select A from IpmClearingDetails A where mti='1740' and A.summaryCode = :summary and de24 in ('782')")
	List<IpmClearingDetails> getImpClearingFeesArbitrage(int summary);
	@Query("SELECT doi FROM DayOperationInternational doi "
			+ "JOIN OperationCodeCommision occ ON doi.typeOperation = occ.code "
			+ "   and occ.identification in :identification    and doi.fileDateCp=:fileDate ")
	List<DayOperationInternational> findByIdentificationAndFileDate( List<String> identification,String fileDate);

}

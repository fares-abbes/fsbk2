package com.mss.unified.repositories;


import com.mss.unified.entities.VisaIncoming;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.VisaSummary;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VisaIncomingRepository extends JpaRepository<VisaIncoming, Integer> {

	
	@Modifying
	@Transactional
	@Query("update VisaIncoming CP set CP.statusChargeback=3 where CP.acquirerReferenceNumber in :references and transactionCode in ('15','17')")
	void updatechargebackStatus(@Param("references") List<String> references);
	
	Boolean existsBySettlementDate(String date);

	@Query("SELECT B from VisaSummary B where SUBSTRING(B.settlementDate, LENGTH(settlementDate) - 3, 4)=:date")
	Optional<VisaSummary> getSummaryFileName(String date);
	@Query("select A from VisaIncoming A where A.acquirerReferenceNumber IN :ids and constatation='1'")
	public List<VisaIncoming> visaIncomingAcceptedref(List<String> ids);
	
	Optional<VisaIncoming> findByIncomingCode(int code);

	@Query("select A from VisaIncoming A where A.summaryCode=:summaryCode and A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn% and A.transactionIdentifier like %:transactionId% and A.matchingCode like :matchingCode% and A.transactionCode like :transactionCode% ")
	Page<VisaIncoming> findWithFilterDateNotNull(Pageable pageable, Integer summaryCode, String cardNumber, String arn,
			String transactionId, String matchingCode, String transactionCode);

	@Query("select A from VisaIncoming A where A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn% and A.transactionIdentifier like %:transactionId% and A.matchingCode like :matchingCode% and A.transactionCode like :transactionCode% ")
	Page<VisaIncoming> findWithFilterDateNull(Pageable pageable, String cardNumber, String arn, String transactionId,
			String matchingCode, String transactionCode);

	@Query("select A from VisaIncoming A where A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn% and A.transactionIdentifier like %:transactionId% and A.transactionCode like :transactionCode% and A.matchingCode is null ")
	Page<VisaIncoming> findWithFilterDateNullAndMatchingNull(Pageable pageable, String cardNumber, String arn,
			String transactionId, String transactionCode);

	@Query("select A from VisaIncoming A where A.summaryCode=:summaryCode and A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn% and A.transactionIdentifier like %:transactionId% and A.transactionCode like :transactionCode% and A.matchingCode is null  ")
	Page<VisaIncoming> findWithFilterDateNotNullAndMatchingNull(Pageable pageable, Integer summaryCode,
			String cardNumber, String arn, String transactionId, String transactionCode);

	@Query("select A from VisaIncoming A where A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn% and A.transactionIdentifier like %:transactionId% and A.transactionCode like :transactionCode%  ")
	Page<VisaIncoming> findWithFilterDateNullWithoutMatching(Pageable pageable, String cardNumber, String arn,
			String transactionId, String transactionCode);

	@Query("select A from VisaIncoming A where A.summaryCode=:summaryCode and A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn% and A.transactionIdentifier like %:transactionId% and A.transactionCode like :transactionCode% ")
	Page<VisaIncoming> findWithFilterDateNotNullWithoutMatching(Pageable pageable, Integer summaryCode,
			String cardNumber, String arn, String transactionId, String transactionCode);
	@Query("select A from VisaIncoming A where A.summaryCode=:summaryCode and A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn%  and A.transactionCode in ('06','25','27')")
	Page<VisaIncoming> findRefundAndReversal(Pageable pageable, Integer summaryCode,
			String cardNumber, String arn );
	@Query("select A from VisaIncoming A where A.summaryCode=:summaryCode and A.accountNumber like %:cardNumber% and A.acquirerReferenceNumber like %:arn%  and A.transactionCode in ('06','25','27')")
	List<VisaIncoming> findRefundAndReversalList(Integer summaryCode,
											 String cardNumber, String arn );
	VisaIncoming findFirstByAuthorisationCodeAndAcquirerReferenceNumberAndSummaryCode(String authorisationCode, String acquirerReferenceNumber,Integer summaryCode); 
	VisaIncoming findFirstByAuthorisationCodeAndAcquirerReferenceNumber(String authorisationCode, String acquirerReferenceNumber); 
	@Query("select A from VisaIncoming A where (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and A.accountNumber like %:pan%  and (A.transactionCode like '05%' or A.transactionCode like '07%')and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)and statusChargeback is null and (:summary is null or A.summaryCode=:summary)")
	Page<VisaIncoming> RequestChargebackVisa(Pageable pageable, String acquirerReferenceNumber, String pan, Integer summary);
	@Query("select A from VisaIncoming A,Card C where (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and A.accountNumber like %:pan% and A.accountNumber = C.cardNum and (A.transactionCode like '05%' or A.transactionCode like '07%')and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)and A.statusChargeback is null and (:summary is null or A.summaryCode=:summary) and ( :agencyCode is null or C.agencyCode in :agencyCode)")
	Page<VisaIncoming> RequestChargebackVisaByAgencyCode(Pageable pageable, String acquirerReferenceNumber, String pan, Integer summary,List<String> agencyCode);
	@Query("select A from VisaIncoming A,Card C where (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and A.accountNumber like %:pan% and A.accountNumber = C.cardNum and (A.transactionCode like '05%' or A.transactionCode like '07%')and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)and A.statusChargeback is null and (:summary is null or A.summaryCode=:summary) and ( :agencyCode is null or C.agencyCode in :agencyCode)")
	List<VisaIncoming> RequestChargebackVisaByAgencyCode( String acquirerReferenceNumber, String pan, Integer summary,List<String> agencyCode);


    
	@Query("select A from VisaIncoming A where "
			+ "A.summaryCode=:summaryCode "
			+ "and (:cardNumber is null or A.accountNumber like %:cardNumber%) "
			+ "and (:referenceArchivage is null or A.acquirerReferenceNumber like %:referenceArchivage%) "
			+ "and (:operationCode is null or A.transactionCode =:operationCode) "
			+ "and not exists " +
			" (Select C from Card C Where A.accountNumber = C.cardNum )")
	Page<VisaIncoming> carteInexistante(Pageable pageable, int summaryCode,String cardNumber,String referenceArchivage,String operationCode);
	@Query("select A from VisaIncoming A where "
			+ "A.summaryCode=:summaryCode "
			+ "and (:cardNumber is null or A.accountNumber like %:cardNumber%) "
			+ "and (:referenceArchivage is null or A.acquirerReferenceNumber like %:referenceArchivage%) "
			+ "and (:operationCode is null or A.transactionCode =:operationCode) "
			+ "and not exists " +
			" (Select C from Card C Where A.accountNumber = C.cardNum )")
	List<VisaIncoming> carteInexistanteList(int summaryCode,String cardNumber,String referenceArchivage,String operationCode);


	List<VisaIncoming> findBySummaryCodeAndAuthorisationCodeNotNull(Integer summaryCode);
	
	VisaIncoming findFirstByProcessingDate(String date);
	
	@Query("select A from VisaIncoming A where"
			+ " (:cardNumber is null or A.accountNumber like %:cardNumber%) "
			+ " and (:arn is null or A.acquirerReferenceNumber like %:arn%)"
			+ " and (:transactionId is null or A.transactionIdentifier like %:transactionId%) and (:transactionCode is null or A.transactionCode like %:transactionCode% )"
//			+ " and (:matchingCode is null  "
//			+ " or (:matchingCode =1 and A.matchingCode like 'A%') "
//			+ " or (:matchingCode =2 and A.matchingCode like 'P%')"
//			+ " or (:matchingCode =3 and A.matchingCode is null)) "
			+ " and summaryCode IN :codes")
	Page<VisaIncoming> visaIncoming(Pageable pageable, String cardNumber, String arn, String transactionId,String transactionCode,List<Integer> codes);
	@Query("select A from VisaIncoming A where"
			+ " (:cardNumber is null or A.accountNumber like %:cardNumber%) "
			+ " and (:arn is null or A.acquirerReferenceNumber like %:arn%)"
			+ " and (:transactionId is null or A.transactionIdentifier like %:transactionId%) and (:transactionCode is null or A.transactionCode like %:transactionCode% ) "
//			+ " and (:matchingCode is null  "
//			+ " or (:matchingCode =1 and A.matchingCode like 'A%') "
//			+ " or (:matchingCode =2 and A.matchingCode like 'P%')"
//			+ " or (:matchingCode =3 and A.matchingCode is null)) "
			+ "and summaryCode=:summary")
	List<VisaIncoming> visaIncoming( String cardNumber, String arn, String transactionId,String transactionCode,int summary);


	@Query("select VI from VisaIncoming VI where VI.summaryCode = :summaryCode and" +
			" (VI.purchaseDate is not null and "
			//+ " TO_DATE(concat(:summaryYear,VI.purchaseDate), 'yyMMdd') "
			+ "CONVERT(date, CONCAT(:summaryYear, VI.purchaseDate), 12)"
			+ "<= :workingDayDate) and VI.accountNumber like %:cardNumber%" +
			" and VI.acquirerReferenceNumber like %:ref% and (VI.rejected = false or VI.rejected is null) " +
			" and (:operationCode is null or VI.transactionCode =:operationCode)")
	Page<VisaIncoming> getLateCpDetailsByWorkingDayDiff(Pageable pageable,Integer summaryCode, Date workingDayDate,
													 String cardNumber, String ref,String operationCode,String summaryYear);
	@Query("select VI from VisaIncoming VI where VI.summaryCode = :summaryCode and" +
			" (VI.purchaseDate is not null and "
			//+ "TO_DATE(concat(:summaryYear,VI.purchaseDate), 'yyMMdd') "
			+"CONVERT(date, CONCAT(:summaryYear, VI.purchaseDate), 12)"
			+ "<= :workingDayDate) and VI.accountNumber like %:cardNumber%" +
			" and VI.acquirerReferenceNumber like %:ref% and (VI.rejected = false or VI.rejected is null) " +
			" and (:operationCode is null or VI.transactionCode =:operationCode)")
	List<VisaIncoming> getLateCpDetailsByWorkingDayDiffList(Integer summaryCode, Date workingDayDate,
														String cardNumber, String ref,String operationCode,String summaryYear);

	@Transactional
	@Modifying
	@Query("update VisaIncoming VI set VI.rejected = true where VI.incomingCode = :incomingCode")
	void rejectVisaIncoming(int incomingCode);
	
	@Query("select VI.accountNumber,VI.sourceAmount,VI.cardAcceptorId,VI.merchantName,VI.terminalTransactionDate,count(*),VI.purchaseDate" +
			" from VisaIncoming VI where VI.summaryCode=:file and (:cardNumber is null or VI.accountNumber like %:cardNumber% ) " +
			" and (:acqId is null or VI.terminalId like %:acqId%)" +
			" group by(VI.accountNumber,VI.sourceAmount,VI.cardAcceptorId,VI.terminalTransactionDate,VI.merchantName,VI.purchaseDate)" +
			" having count(*)>=2 ")
	Page<String[]> getRedundancyTransactions(Pageable pageable,int file,String cardNumber,String acqId);

	@Query("select VI" +
			" from VisaIncoming VI where VI.accountNumber = :cardNumber and VI.sourceAmount = :sourceAmount " +
			" and VI.cardAcceptorId = :acqBuisnessId and VI.merchantName like %:merchantName%" +
			" and VI.terminalTransactionDate = :date and VI.purchaseDate = :purchaseDate")
	Page<VisaIncoming> getRedundancyTransactionsDetails(Pageable pageable,String cardNumber,Double sourceAmount,
													String acqBuisnessId, String merchantName,
													String date,String purchaseDate);
	@Query("select VI" +
			" from VisaIncoming VI where VI.accountNumber = :cardNumber and VI.sourceAmount = :sourceAmount " +
			" and VI.cardAcceptorId = :acqBuisnessId and VI.merchantName like %:merchantName%" +
			" and VI.terminalTransactionDate is null and VI.purchaseDate = :purchaseDate")
	Page<VisaIncoming> getRedundancyTransactionsDetailsNullDate(Pageable pageable,String cardNumber,Double sourceAmount,
														String acqBuisnessId, String merchantName,String purchaseDate);

	@Query("select VI" +
			" from VisaIncoming VI where VI.summaryCode=:summaryCode and VI.matchingCode is null and"+
			"(:cardNumber is null or VI.accountNumber like %:cardNumber% ) and (:arn is null or VI.acquirerReferenceNumber like %:arn%) and"+
			"(:operationCode is null or VI.transactionCode =:operationCode)")
	Page<VisaIncoming> getNonAutorise1(Pageable pageable,Integer summaryCode,String cardNumber,String arn, String operationCode);
	
	@Query("select VI" +
			" from VisaIncoming VI where VI.summaryCode=:summaryCode and VI.matchingCode is null")
	Page<VisaIncoming> getNonAutorise(Pageable pageable,Integer summaryCode);
	@Query("select VI" +
			" from VisaIncoming VI where VI.summaryCode=:summaryCode and VI.matchingCode is null")
	List<VisaIncoming> getNonAutoriseList(Integer summaryCode);

	@Query("select VI from VisaIncoming VI join Card card on VI.accountNumber =card.cardNum join Account acc on acc.accountCode = card.accCode" +
			" join AccountStatus accSt on acc.astCode = accSt.astCode where VI.summaryCode=:file and accSt.astCode in (9,13) and " +
			"(:cardNumber is null or VI.accountNumber like %:cardNumber% ) and (:acqId is null or VI.terminalId like %:acqId%) " +
			"and VI.acquirerReferenceNumber like %:ref% and (:operationCode is null or VI.transactionCode =:operationCode)")
	Page<VisaIncoming> visaContentieuxOuCloturer(Pageable pageable,Integer file,String cardNumber,String acqId, String ref,String operationCode);
	@Query("select VI from VisaIncoming VI join Card card on VI.accountNumber =card.cardNum join Account acc on acc.accountCode = card.accCode" +
			" join AccountStatus accSt on acc.astCode = accSt.astCode where VI.summaryCode=:file and accSt.astCode in (9,13) and " +
			"(:cardNumber is null or VI.accountNumber like %:cardNumber% ) and (:acqId is null or VI.terminalId like %:acqId%) " +
			"and VI.acquirerReferenceNumber like %:ref% and (:operationCode is null or VI.transactionCode =:operationCode)")
	List<VisaIncoming> visaContentieuxOuCloturerList(Integer file,String cardNumber,String acqId, String ref,String operationCode);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM VisaIncoming CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);
	@Modifying
	@Transactional
	@Query("update TransactionValidAtm set matchingVisa=null where matchingVisa in ( select incomingCode from VisaIncoming v where v.summaryCode=:summary ) ")
	void unmatchingAtmBySummary(@Param("summary") Integer summary);
	@Modifying
	@Transactional
	@Query("update TransactionValidPos set matchingVisa=null where matchingVisa in ( select incomingCode from VisaIncoming v where v.summaryCode=:summary ) ")
	void unmatchingPosBySummary(@Param("summary") Integer summary);

	@Query("select A from VisaIncoming A where A.summaryCode=:summary and " +
			"((A.transactionCode = '06' and not exists (Select e from BinOnUs e Where" +
			" SUBSTRING(A.accountNumber,1,e.bouLength) " +
			"between e.bouLowBin AND e.bouHighBin)) or (A.transactionCode in ('25','27','15','17') and " +
			"exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) " +
			"between e.bouLowBin AND e.bouHighBin))) and "
			+ " (:cardNumber is null or A.accountNumber like %:cardNumber%) "
			+ " and (:arn is null or A.acquirerReferenceNumber like %:arn%)"
			+ " and (:transactionId is null or A.transactionIdentifier like %:transactionId%) ")
	Page<VisaIncoming> visaRefundAndChargeBack(Pageable pageable, String cardNumber, String arn, String transactionId
									,int summary);
	@Query("select A from VisaIncoming A where A.summaryCode=:summary and " +
			"((A.transactionCode = '06' and not exists (Select e from BinOnUs e Where" +
			" SUBSTRING(A.accountNumber,1,e.bouLength) " +
			"between e.bouLowBin AND e.bouHighBin)) or (A.transactionCode in ('25','27','15','17') and " +
			"exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) " +
			"between e.bouLowBin AND e.bouHighBin))) and "
			+ " (:cardNumber is null or A.accountNumber like %:cardNumber%) "
			+ " and (:arn is null or A.acquirerReferenceNumber like %:arn%)"
			+ " and (:transactionId is null or A.transactionIdentifier like %:transactionId%) ")
	List<VisaIncoming> visaRefundAndChargeBackList(String cardNumber, String arn, String transactionId
			,int summary);
	
	List<VisaIncoming> findBySummaryCodeAndDestinationCurrencyCode(int summary,String currencyCodeTransaction);
	@Query("select A from VisaIncoming A where (A.transactionCode like '15%' or A.transactionCode like '17%') and (A.statusChargeback is null or A.statusChargeback=1 or A.statusChargeback=2 or A.statusChargeback=3) and ((:nullFilter =true and A.statusChargeback is null ) or A.statusChargeback in :listChargeBack)  and  (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%)  and (:pan is null or A.accountNumber like %:pan%) and (:summaryCode is null or A.summaryCode=:summaryCode) and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	Page<VisaIncoming> getAllLChargeBackEmiVIsa(Pageable pageable, String pan,  String acquirerReferenceNumber, Integer summaryCode,
			List<String> listChargeBack, boolean nullFilter);
	@Query("select A from VisaIncoming A,Card C where (A.transactionCode like '15%' or A.transactionCode like '17%') and A.accountNumber = C.cardNum  and (A.statusChargeback is null or A.statusChargeback=1 or A.statusChargeback=2 or A.statusChargeback=3) and ((:nullFilter =true and A.statusChargeback is null ) or A.statusChargeback in :listChargeBack)  and  (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%)  and (:pan is null or A.accountNumber like %:pan%) and (:summaryCode is null or A.summaryCode=:summaryCode) and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) and ( :agencyCode is null or C.agencyCode in :agencyCode)")
	Page<VisaIncoming> getAllLChargeBackEmiVIsaByAgency(Pageable pageable, String pan,  String acquirerReferenceNumber, Integer summaryCode,
												List<String> listChargeBack, boolean nullFilter,List<String> agencyCode);
	@Query("select A from VisaIncoming A,Card C where (A.transactionCode like '15%' or A.transactionCode like '17%') and A.accountNumber = C.cardNum  and (A.statusChargeback is null or A.statusChargeback=1 or A.statusChargeback=2 or A.statusChargeback=3) and ((:nullFilter =true and A.statusChargeback is null ) or A.statusChargeback in :listChargeBack)  and  (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%)  and (:pan is null or A.accountNumber like %:pan%) and (:summaryCode is null or A.summaryCode=:summaryCode) and exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin) and ( :agencyCode is null or C.agencyCode in :agencyCode)")
	List<VisaIncoming> getAllLChargeBackEmiVIsaByAgency( String pan,  String acquirerReferenceNumber, Integer summaryCode,
												List<String> listChargeBack, boolean nullFilter,List<String> agencyCode);

	
	List<VisaIncoming> findBySummaryCodeAndBaseCurrency(int summary,String currencyCodeTransaction);
	
	@Query("select A from VisaIncoming A where"
			+ " ( :cardNumber is null or A.accountNumber like %:cardNumber% ) "
			+ "and ( :arn is null or A.acquirerReferenceNumber like %:arn% ) "
			+ "and ( :transactionId is null or A.transactionIdentifier like %:transactionId% ) and ( :transactionCode is null or A.transactionCode like %:transactionCode% ) "
			+ "and summaryCode in :codes")
	List<VisaIncoming> VisaIncomingWithInterval( String cardNumber, String arn, String transactionId,
									 String transactionCode,List<Integer> codes);

}

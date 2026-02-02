package com.mss.unified.repositories;

import com.mss.unified.entities.VisaOutGoingAtm;
import com.mss.unified.entities.VisaOutgoingConfig;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VisaOutComingAtmRepository extends JpaRepository<VisaOutGoingAtm, Integer> {
	
//	   @Query("SELECT v FROM VisaOutGoingAtm v WHERE v.authorizationIdResponseCode = :authorizationIdResponseCode AND v.cardNumber = :cardNumber")
//	    Optional<VisaOutGoingAtm> findByAuthorizationIdResponseCodeAndCardNumber(@Param("authorizationIdResponseCode") String authorizationIdResponseCode, @Param("cardNumber") String cardNumber);
	@Query("SELECT v FROM VisaOutGoingAtm v WHERE v.authorizationIdResponseCode = :authorizationIdResponseCode AND v.cardNumber = :cardNumber AND v.retrRefNumber = :RetrRefNumber and  v.responseCode='00' and v.requestMessageType='0200' ")
	VisaOutGoingAtm findByAuthorizationIdResponseCodeAndCardNumberAndRetrRefNumber(
			@Param("authorizationIdResponseCode") String authorizationIdResponseCode,
			@Param("cardNumber") String cardNumber,
			@Param("RetrRefNumber") String RetrRefNumber
	);
	   @Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCode(int summary, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeAndRespNotLike(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeWithoutTransactionType(int summary, String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeWithoutTransactionTypeAndRespNotLike(int summary,
			String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCode(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeAndRespNotLike(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeWithoutTransactionType(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate  like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atmCode is not null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeWithoutTransactionTypeAndRespNotLike(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeAndAtmIsNull(int summary, String pan,  String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeAndRespNotLikeAndAtmIsNull(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeWithoutTransactionTypeAndAtmIsNull(int summary,
			String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeWithoutTransactionTypeAndRespNotLikeAndAtmIsNull(
			int summary, String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeAndAtmIsNull(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeAndRespNotLikeAndAtmIsNull(String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeWithoutTransactionTypeAndAtmIsNull(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate  like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atmCode is null ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeWithoutTransactionTypeAndRespNotLikeAndAtmIsNull(
			String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodewithoutAtm(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeAndRespNotLikewithoutAtm(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeWithoutTransactionTypewithoutAtm(int summary, String pan, 
			String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithSummaryCodeWithoutTransactionTypeAndRespNotLikewithoutAtm(
			int summary, String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and  A.retrRefNumber like %:refNumber% and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeAndwithoutAtm(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and  A.retrRefNumber like %:refNumber% and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeAndRespNotLikewithoutAtm(String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and  A.retrRefNumber like %:refNumber%")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeWithoutTransactionTypewithoutAtm(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) from VisaOutGoingAtm A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate  like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode%  and  A.retrRefNumber like %:refNumber% ")
	List<VisaOutgoingConfig> findVisaOutgoingAtmWithOutSummaryCodeWithoutTransactionTypeAndRespNotLikewithoutAtm(
			String pan, String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode,A.cpCode) " +
			"FROM VisaOutGoingAtm A, Tc45 B " +
			"WHERE A.cardNumber = B.cardNumber " +
			"AND B.retrievalRefNumber = A.retrRefNumber " +
			"AND B.tranType = A.requestMessageType " +
			"AND A.summaryCode IN :codes " +
			"AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) " +
			"AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) " +
			"AND (:responseMessageType IS NULL OR (:responseMessageType = 'Autorisation' AND A.responseMessageType LIKE '%210%') OR (:responseMessageType ='Reversal' AND A.responseMessageType LIKE '%420%') OR (:responseMessageType ='Advice' AND A.responseMessageType LIKE '%430%')) " +
			"AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) "+
			//" (TO_DATE(A.termTranDate, 'yymmdd') between TO_DATE(:transactionDate, 'mmddyy') and TO_DATE(:endDateTrx, 'mmddyy') ) )" +
			"AND (:settlementDate IS NULL OR A.settlementDate LIKE CONCAT('%', :settlementDate, '%')) " +
			"AND (:atmCode IS NULL OR (:matching = 1 AND A.atmCode IS NOT NULL) OR (:matching = 2 AND A.atmCode IS NULL) OR (:matching = 3 and A.cpCode is not null))")
	Page<VisaOutgoingConfig> getVisaOutgoing(Pageable pageable,List<Integer> codes, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate,String atmCode,Integer matching);

	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode,A.cpCode) " +
			"FROM VisaOutGoingAtm A, Tc45 B " +
			"WHERE A.cardNumber = B.cardNumber " +
			"AND B.retrievalRefNumber = A.retrRefNumber " +
			"AND B.tranType = A.requestMessageType " +
			"AND A.summaryCode IN :codes " +
			"AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) " +
			"AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) " +
			"AND (:responseMessageType IS NULL OR (:responseMessageType = 'Autorisation' AND A.responseMessageType LIKE '%210%') OR (:responseMessageType ='Reversal' AND A.responseMessageType LIKE '%420%') OR (:responseMessageType ='Advice' AND A.responseMessageType LIKE '%430%')) " +
			"AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) "+
			//" (TO_DATE(A.termTranDate, 'yymmdd') between TO_DATE(:transactionDate, 'mmddyy') and TO_DATE(:endDateTrx, 'mmddyy') ) )" +
			"AND (:settlementDate IS NULL OR A.settlementDate LIKE CONCAT('%', :settlementDate, '%')) " +
			"AND (:atmCode IS NULL OR (:matching = 1 AND A.atmCode IS NOT NULL) OR (:matching = 2 AND A.atmCode IS NULL) OR (:matching = 3 and A.cpCode is not null))")
	List<VisaOutgoingConfig> getVisaOutgoing(List<Integer> codes, String pan,  String refNumber, String responseMessageType,
											 String transactionDate, String settlementDate,String atmCode,Integer matching);

	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode,A.cpCode) " +
			"FROM VisaOutGoingAtm A, Tc45 B " +
			"WHERE A.cardNumber = B.cardNumber " +
			"AND B.retrievalRefNumber = A.retrRefNumber " +
			"AND B.tranType = A.requestMessageType " +
			"AND A.summaryCode = :summary " +
			"AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) " +
			"AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) " +
			"AND (:responseMessageType IS NULL OR (:responseMessageType = 'Autorisation' AND A.responseMessageType LIKE '%210%' and  A.responseCode='00' and A.requestMessageType='0200' and A.settAmount!=0) "+
			" OR(:responseMessageType = 'Declined' AND A.responseMessageType LIKE '%210%' and (A.responseCode !='00' or A.settAmount=0) and A.requestMessageType='0200') OR (:responseMessageType ='Reversal' AND A.responseMessageType LIKE '%430%') OR (:responseMessageType ='Advice' AND A.responseMessageType LIKE '%432%')) " +
			"AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) " +
			"AND (:settlementDate IS NULL OR A.settlementDate LIKE CONCAT('%', :settlementDate, '%')) " +
			"AND (:atmCode IS NULL OR (:matching = 1 AND A.atmCode IS NOT NULL) OR (:matching = 2 AND A.atmCode IS NULL AND A.responseCode ='00') OR (:matching = 3 and A.cpCode is not null))")
	Page<VisaOutgoingConfig> getVisaOutgoing(Pageable pageable,int summary, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate,String atmCode,Integer matching);
	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atmCode, A.outComingCode) " +
			"FROM VisaOutGoingAtm A, Tc45 B " +
			"WHERE A.cardNumber = B.cardNumber " +
			"AND B.retrievalRefNumber = A.retrRefNumber " +
			"AND B.tranType = A.requestMessageType " +
			"AND A.summaryCode = :summary " +
			"AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) " +
			"AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) " +
			"AND (:responseMessageType IS NULL OR (:responseMessageType = 'Autorisation' AND A.responseMessageType LIKE '%210%' and  A.responseCode='00' and A.requestMessageType='0200' and A.settAmount!=0) "+
			" OR(:responseMessageType = 'Declined' AND A.responseMessageType LIKE '%210%' and (A.responseCode !='00' or A.settAmount=0) and A.requestMessageType='0200') OR (:responseMessageType ='Reversal' AND A.responseMessageType LIKE '%420%') OR (:responseMessageType ='Advice' AND A.responseMessageType LIKE '%430%')) " +
			"AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) " +
			"AND (:settlementDate IS NULL OR A.settlementDate LIKE CONCAT('%', :settlementDate, '%')) " +
			"AND (:atmCode IS NULL OR (:matching = 1 AND A.atmCode IS NOT NULL) OR (:matching = 2 AND A.atmCode IS NULL AND A.responseCode ='00') OR (:matching = 3 and A.cpCode is not null))")
	List<VisaOutgoingConfig> getVisaOutgoing(int summary, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate,String atmCode,Integer matching);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM VisaOutGoingAtm CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);

	List<VisaOutGoingAtm> findBySummaryCode(Integer summaryCode);
}

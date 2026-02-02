package com.mss.unified.repositories;

import com.mss.unified.entities.ChargeBackVisaOutgoing;
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
public interface ChargeBackVisaOutgoingRepository extends JpaRepository<ChargeBackVisaOutgoing, Integer> {

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCode(int summary, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeAndRespNotLike(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeWithoutTransactionType(int summary, String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeWithoutTransactionTypeAndRespNotLike(int summary,
			String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCode(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeAndRespNotLike(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeWithoutTransactionType(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate  like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atm_code is not null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeWithoutTransactionTypeAndRespNotLike(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeAndAtmIsNull(int summary, String pan,  String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeAndRespNotLikeAndAtmIsNull(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeWithoutTransactionTypeAndAtmIsNull(int summary,
			String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeWithoutTransactionTypeAndRespNotLikeAndAtmIsNull(
			int summary, String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% and "
			+ "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeAndAtmIsNull(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% and "
			+ "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeAndRespNotLikeAndAtmIsNull(String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and " + "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeWithoutTransactionTypeAndAtmIsNull(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate  like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% and " + "A.atm_code is null ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeWithoutTransactionTypeAndRespNotLikeAndAtmIsNull(
			String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodewithoutAtm(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.responseMessageType like %:responseMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeAndRespNotLikewithoutAtm(int summary, String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeWithoutTransactionTypewithoutAtm(int summary, String pan, 
			String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.summaryCode =:summary and " + "A.cardNumber like %:pan% and  A.retrRefNumber like %:refNumber% and "
			+ "B.tranType = A.requestMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithSummaryCodeWithoutTransactionTypeAndRespNotLikewithoutAtm(
			int summary, String pan,  String refNumber, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and  A.retrRefNumber like %:refNumber% and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode like %:responseCode% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeAndwithoutAtm(String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode,B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and  A.retrRefNumber like %:refNumber% and "
			+ "A.responseMessageType like %:responseMessageType and " + "A.transactionDate like %:transactionDate% and "
			+ "A.settlementDate like %:settlementDate% and " + "A.responseCode not like %:responseCode% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeAndRespNotLikewithoutAtm(String pan, String refNumber,
			String responseMessageType, String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate like %:settlementDate% and "
			+ "A.responseCode like %:responseCode% and  A.retrRefNumber like %:refNumber%")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeWithoutTransactionTypewithoutAtm(String pan, String refNumber,
			String transactionDate, String settlementDate, String responseCode);

	@Query("Select new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode) from ChargeBackVisaOutgoing A, Tc45 B "
			+ "where A.cardNumber = B.cardNumber and " + "B.retrievalRefNumber = A.retrRefNumber and "
			+ "A.cardNumber like %:pan% and " + "B.tranType = A.requestMessageType and "
			+ "A.transactionDate like %:transactionDate% and " + "A.settlementDate  like %:settlementDate% and "
			+ "A.responseCode not like %:responseCode%  and  A.retrRefNumber like %:refNumber% ")
	List<VisaOutgoingConfig> findChargeBackVisaOutgoingWithOutSummaryCodeWithoutTransactionTypeAndRespNotLikewithoutAtm(
			String pan, String refNumber, String transactionDate, String settlementDate, String responseCode);


	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode,A.cpCode,A.summaryCode,A.authorizationIdResponseCode,A.requestMessageType) " +
			"FROM ChargeBackVisaOutgoing A, Tc45 B " +
			"WHERE A.cardNumber = B.cardNumber " +
			"AND B.retrievalRefNumber = A.retrRefNumber " +
			"AND B.tranType = A.requestMessageType " +
			"AND A.summaryCode = :summary " +
			"AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) " +
			"AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) " +
			"AND (:responseMessageType IS NULL OR (:responseMessageType = 'Autorisation' AND A.responseMessageType LIKE '%210%') OR (:responseMessageType ='Reversal' AND A.responseMessageType LIKE '%420%') OR (:responseMessageType ='Advice' AND A.responseMessageType LIKE '%430%')) " +
			"AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) " +
			"AND (:settlementDate IS NULL OR A.settlementDate LIKE CONCAT('%', :settlementDate, '%')) " +
			"AND (:atmCode IS NULL OR (:matching = 1 AND A.atm_code IS NOT NULL) OR (:matching = 2 AND A.atm_code IS NULL AND A.responseCode ='00') OR (:matching = 3 and A.cpCode is not null))  And A.statusChargeback is null")
	Page<VisaOutgoingConfig> getVisaOutgoing(Pageable pageable,int summary, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate,String atmCode,Integer matching);
	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber, A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode, A.cpCode,A.summaryCode,A.authorizationIdResponseCode,A.requestMessageType) FROM ChargeBackVisaOutgoing A, Tc45 B WHERE A.cardNumber = B.cardNumber AND B.retrievalRefNumber = A.retrRefNumber AND B.tranType = A.requestMessageType AND (:summary IS NULL or A.summaryCode = :summary) AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) AND A.statusChargeback is null AND A.requestMessageType = '0422'")
	Page<VisaOutgoingConfig> getVisaOutgoing(Pageable pageable, Integer summary, String pan, String refNumber, String transactionDate);

	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber ,A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode,A.cpCode,A.summaryCode,A.authorizationIdResponseCode,A.requestMessageType) " +
			"FROM ChargeBackVisaOutgoing A, Tc45 B " +
			"WHERE A.cardNumber = B.cardNumber " +
			"AND B.retrievalRefNumber = A.retrRefNumber " +
			"AND B.tranType = A.requestMessageType " +
			"AND A.summaryCode = :summary " +
			"AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) " +
			"AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) " +
			"AND (:responseMessageType IS NULL OR (:responseMessageType = 'Autorisation' AND A.responseMessageType LIKE '%210%') OR (:responseMessageType ='Reversal' AND A.responseMessageType LIKE '%420%') OR (:responseMessageType ='Advice' AND A.responseMessageType LIKE '%430%')) " +
			"AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) " +
			"AND (:settlementDate IS NULL OR A.settlementDate LIKE CONCAT('%', :settlementDate, '%')) " +
			"AND (:atmCode IS NULL OR (:matching = 1 AND A.atm_code IS NOT NULL) OR (:matching = 2 AND A.atm_code IS NULL AND A.responseCode ='00') OR (:matching = 3 and A.cpCode is not null)) And A.statusChargeback is null")
	List<VisaOutgoingConfig> getVisaOutgoing(int summary, String pan,  String refNumber, String responseMessageType,
			String transactionDate, String settlementDate,String atmCode,Integer matching);

	@Modifying
	@Transactional
	@Query("DELETE FROM ChargeBackVisaOutgoing CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);
	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber, A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode, A.statusChargeback) FROM ChargeBackVisaOutgoing A, Tc45 B WHERE A.cardNumber = B.cardNumber AND B.retrievalRefNumber = A.retrRefNumber AND B.tranType = A.requestMessageType AND (:summary IS NULL or A.summaryCode = :summary) AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) AND A.statusChargeback IN :status AND A.requestMessageType = '0422'")
	Page<VisaOutgoingConfig> getVisaOutgoingTreated(Pageable pageable, Integer summary, String pan, String refNumber, String transactionDate, List<Integer> status);

	@Query("SELECT distinct new com.mss.unified.entities.VisaOutgoingConfig(A.cardNumber, A.retrRefNumber, A.surcAmount, A.transAmo2, A.settAmount,A.settCurrencyCode,A.transactionDate,A.tranCurrencyCode, B.interchangeFee, B.interchangeCurrency, A.settlementDate, A.responseCode, A.transactionTime, A.atm_code, A.outComingCode, A.statusChargeback) FROM ChargeBackVisaOutgoing A, Tc45 B WHERE A.cardNumber = B.cardNumber AND B.retrievalRefNumber = A.retrRefNumber AND B.tranType = A.requestMessageType AND (:summary IS NULL or A.summaryCode = :summary) AND (:pan IS NULL OR A.cardNumber LIKE CONCAT('%', :pan, '%')) AND (:refNumber IS NULL OR A.retrRefNumber LIKE CONCAT('%', :refNumber, '%')) AND (:transactionDate IS NULL OR A.transactionDate LIKE CONCAT('%', :transactionDate, '%')) AND A.requestMessageType = '0420'")
	Page<VisaOutgoingConfig> getVisaOutgoingRepresentationEmis(Pageable pageable, Integer summary, String pan, String refNumber, String transactionDate);

	List<ChargeBackVisaOutgoing> findAllByStatusChargeback(Integer statusChargeback);
}

package com.mss.unified.repositories;

import com.mss.unified.entities.SwitchTransaction;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.LockModeType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface SwitchRepository extends JpaRepository<SwitchTransaction, Integer> {
	SwitchTransaction findBySwitchAcceptorTerminalId(String terminalId);

	SwitchTransaction findBySwitchCode(int switchCode);

	@Procedure(name = "PORTEUR.my_decrypt")
	List<SwitchTransaction> decrypt(@Param("key") String key);

//    @Query("select s from SwitchTransaction s where s.switchPan like  %:pan% and s.switchRRN like %:fid_37% and s.switchAcceptorMerchantCode like %:merchantCode% and s.switchRequestDate between FORMAT(cast(:date1 as date),'yyyy/MM/dd hh:mm:ss') and FORMAT(cast(:date2 as date),'yyyy/MM/dd hh:mm:ss')")
//    Page< SwitchTransaction> getSwitchTransactions(Pageable pageable,@Param("fid_37") String fid_37,@Param("pan") String pan,@Param("merchantCode") String merchantCode,@Param("date1") String date1,@Param("date2") String date2 );

	@Query("select e from SwitchTransaction e where e.switchPan=:D2 "
			+ "and e.switchMtiMessage in ('0100','0120','0121','0200','0220','0221') "
			+ "and e.switchEmvData is not null "
			+ "and e.tag9F26=:tag9f26 and e.switchCode!=:switchCode "
			+ "and e.switchRequestDate > CONVERT(DATETIME,:date)")
	List<SwitchTransaction> getDuplicateTrans(@Param("D2") String D2, @Param("tag9f26") String tag9f26,
			@Param("date") String date,@Param("switchCode") Integer switchCode);
	
	
	@Query("select s from SwitchTransaction s where s.switchRRN=:fid_37 and s.switchPan=:pan and s.switchDE120=:de120 and s.switchAmountTransaction=:amount")
	SwitchTransaction getSwitchDetails(@Param("fid_37") String fid_37, @Param("pan") String pan,
			@Param("de120") String de120, @Param("amount") String amount);

	@Query("select s from SwitchTransaction s where s.switchPan=:pan  and s.switchAuthNumber=:auth and s.switchDE120=:i and s.switchDE106=:switchDE106 and s.switchStatTransaction=:statTransaction")
	SwitchTransaction getSwitchPreauthDetails(@Param("pan") String pan, @Param("auth") String auth,
			@Param("i") String i, @Param("switchDE106") String switchDE106,
			@Param("statTransaction") String statTransaction);

	@Query("select s from SwitchTransaction s where s.switchPan=:pan  and s.switchAuthNumber=:auth and s.switchDE120=:i and s.switchDE106=:switchDE106 and s.switchStatTransaction=:statTransaction and s.switchRRN=:fid_37")
	SwitchTransaction getSwitchPreauthDetailsForAnnulation(@Param("pan") String pan, @Param("auth") String auth,
			@Param("i") String i, @Param("switchDE106") String switchDE106,
			@Param("statTransaction") String statTransaction, @Param("fid_37") String fid_37);

	@Query("select s from SwitchTransaction s where s.switchPan=:pan and s.switchDE120=:de120 and s.switchAuthNumber=:switchAuthNumber and s.switchDE106=:switchDE106 and s.switchStatTransaction=:statTransaction")
	SwitchTransaction getSwitchCompletionDetails(@Param("pan") String pan, @Param("de120") String de120,
			@Param("switchAuthNumber") String switchAuthNumber, @Param("switchDE106") String switchDE106,
			@Param("statTransaction") String statTransaction);

	@Query("select s from SwitchTransaction s where s.switchPan=:pan and s.switchAmountTransaction=:amount and s.switchDE120=:de120 and s.switchStatTransaction=:statTransaction")
	SwitchTransaction getSwitchTransactionTimeOutDetails(@Param("pan") String pan, @Param("amount") String amount,
			@Param("de120") String de120, @Param("statTransaction") String statTransaction);

	@Query("select e from SwitchTransaction e where e.switchPan=:D2 and e.switchAuthNumber=:D38 and e.switchAcceptorMerchantCode=:D42 and e.switchMtiMessage in ('0100','0120','0121','0200','0220','0221') and e.switchDE106=:D106 and e.switchStatTransaction=:stat")
	Optional<SwitchTransaction> getSwitchTransactionPreauth(@Param("D2") String D2, @Param("D38") String D38,
			@Param("D42") String D42, @Param("D106") String D106, @Param("stat") String stat);

	@Query("select e from SwitchTransaction e where e.switchPan=:D2 and e.switchMtiMessage in ('0100','0120','0121','0200','0220','0221') and e.switchStatTransaction=:stat and e.switchRequestDate >=CONVERT(DATETIME, :date ,102 ) and e.switchDE106 is null")
	List<SwitchTransaction> getSwitchTransactionsWithDateAndPan(@Param("D2") String D2, @Param("stat") String stat,
			@Param("date") String date);

//	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
//			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode 
	//, s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, 
//	s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
//			+ "from SwitchTransaction s  WITH (NOLOCK) ,ResponseCode r  WITH (NOLOCK) where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% "
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% ")
//	Page<Object[]> reportingWtihReversal(Pageable pageable, String pan, String amount, String responseCode,
//			String merchantId, String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	@Query(
			value="SELECT s.DE02_PAN AS switchPan, "
					+ "s.DE04_AMOUNT_TRANSACTION AS switchAmountTransaction, "
					+ "s.DE39_RESPONSE_CODE AS switchResponseCode, "
					+ "s.DE42_ACEPTOR_MERCHANT_CODE AS switchAcceptorMerchantCode, "
					+ "s.DE38_AUTH_IDENTIF_NUMBER AS switchAuthNumber, "
					+ "s.SOURCE AS source, "
					+ "s.REQUESTDATE AS switchRequestDate, "
					+ "s.STAT_TRANSACTION AS switchStatTransaction, "
					+ "s.DE32_AQCUIRER_IDENTI_CODE AS switchAcquirerIdenCode, "
					+ "s.DE49_TRANS_CURR_CODE AS switchTransactionCurrencyCode, "
					+ "s.MTI_MESSAGE_TYPE_IDENTIFIER AS switchMtiMessage, "
					+ "s.RESPONSEDATE AS switchResponseDate, "
					+ "s.DE03_PROCESSING_CODE AS switchProcessingCode, "
					+ "s.DE37_RRN AS switchRRN, "
					+ "s.DE22_POS_ENTRY_MODE AS switchPosEntryMode, "
					+ "s.DE107_RESERVED AS switchDE107, "
					+ "s.SWITCH_CODE AS switchCode, "
					+ "s.TAG_95 AS tag95, "
					+ "s.TAG_9F10 AS tag9F10, "
					+ "s.DE111_RESERVED AS switchDE111, "
					+ "s.DE43_CARD_ACCEPTOR_NAME AS switchAcceptorAcceptorName "
					+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "


					+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%'))",



			countQuery = "SELECT COUNT(*) FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "

					+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%'))"
			,nativeQuery = true)
	Page<Object[]> reportingWtihReversal(Pageable pageable, String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso );

	
	
	
//	@Query("select s.switchResponseDate ,s.switchPan,"
//			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
//			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
//			+ "from SwitchTransaction s   WITH (NOLOCK) ,ResponseCode r  WITH (NOLOCK) where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% "
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry%")
//	List<Object[]> reportingWtihReversal(String pan, String amount, String responseCode, String merchantId, String de38,
//			String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso, Sort sort);
//
//	
	
	
	
	@Query(value="select   "
			+ "s.RESPONSEDATE , "
			+ "s.DE02_PAN,"
			+ "s.DE04_AMOUNT_TRANSACTION,"
			+ "s.DE49_TRANS_CURR_CODE,"
			+ "s.DE37_RRN,"
			+ "s.DE38_AUTH_IDENTIF_NUMBER,"
			+ "s.DE39_RESPONSE_CODE,"
			+ "s.DE42_ACEPTOR_MERCHANT_CODE, "
			+"s.DE41_ACCEPTOR_TERMINAL_ID,"
			+"s.DE03_PROCESSING_CODE "
	
			+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "

			+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
			+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
			+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
			+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
			+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
			+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
			+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
			+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
			+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
			+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
			+ "and (:reversal IS NULL OR s.STAT_TRANSACTION LIKE CONCAT(:reversal, '%')) "
			+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
			+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%'))"
			,nativeQuery=true)
			
	List<Object[]> reportingWtihReversal(String pan, String amount, String responseCode, String merchantId, String de38,
			String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso );
			
	
	
	
	
//	
//	@Query("select s.switchResponseDate ,s.switchPan,"
//			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
//			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
//			+ "from SwitchTransaction s  WITH (NOLOCK),ResponseCode r  WITH (NOLOCK) where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% " 
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry%")
//	List<Object[]> reportingWtihNoReversal(String pan, String amount, String responseCode, String merchantId,
//			String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso, Sort sort);
	
	
	@Query(value="select   "
			+ "s.RESPONSEDATE , "
			+ "s.DE02_PAN,"
			+ "s.DE04_AMOUNT_TRANSACTION,"
			+ "s.DE49_TRANS_CURR_CODE,"
			+ "s.DE37_RRN,"
			+ "s.DE38_AUTH_IDENTIF_NUMBER,"
			+ "s.DE39_RESPONSE_CODE,"
			+ "s.DE42_ACEPTOR_MERCHANT_CODE, "
			+"s.DE41_ACCEPTOR_TERMINAL_ID,"
			+"s.DE03_PROCESSING_CODE "
	
			+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "


			+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
			+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
			+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
			+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
			+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
			+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
			+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
			+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
			+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
			+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
			+ "and (:reversal IS NULL OR s.STAT_TRANSACTION NOT LIKE CONCAT(:reversal, '%')) "
			+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
			+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%'))"
			,nativeQuery=true)
		
	List<Object[]> reportingWtihNoReversal(String pan, String amount, String responseCode, String merchantId,
			String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso );
	
	
//	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
//			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
//			+ "from SwitchTransaction s  WITH (NOLOCK) ,ResponseCode r  WITH (NOLOCK)  where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% " 
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% ")
//	Page<Object[]> reportingWtihNoReversal(Pageable pageable, String pan, String amount, String responseCode,
//			String merchantId, String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);

	
	
	@Query(
			value="SELECT s.DE02_PAN AS switchPan, "
					+ "s.DE04_AMOUNT_TRANSACTION AS switchAmountTransaction, "
					+ "s.DE39_RESPONSE_CODE AS switchResponseCode, "
					+ "s.DE42_ACEPTOR_MERCHANT_CODE AS switchAcceptorMerchantCode, "
					+ "s.DE38_AUTH_IDENTIF_NUMBER AS switchAuthNumber, "
					+ "s.SOURCE AS source, "
					+ "s.REQUESTDATE AS switchRequestDate, "
					+ "s.STAT_TRANSACTION AS switchStatTransaction, "
					+ "s.DE32_AQCUIRER_IDENTI_CODE AS switchAcquirerIdenCode, "
					+ "s.DE49_TRANS_CURR_CODE AS switchTransactionCurrencyCode, "
					+ "s.MTI_MESSAGE_TYPE_IDENTIFIER AS switchMtiMessage, "
					+ "s.RESPONSEDATE AS switchResponseDate, "
					+ "s.DE03_PROCESSING_CODE AS switchProcessingCode, "
					+ "s.DE37_RRN AS switchRRN, "
					+ "s.DE22_POS_ENTRY_MODE AS switchPosEntryMode, "
					+ "s.DE107_RESERVED AS switchDE107, "
					+ "s.SWITCH_CODE AS switchCode, "
					+ "s.TAG_95 AS tag95, "
					+ "s.TAG_9F10 AS tag9F10, "
					+ "s.DE111_RESERVED AS switchDE111, "
					+ "s.DE43_CARD_ACCEPTOR_NAME AS switchAcceptorAcceptorName "
					+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "

					+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
					
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION NOT LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%')) ",
			countQuery = "SELECT COUNT(*) FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "


					+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
				
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION NOT LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%')) "

					 
			,nativeQuery = true)
	Page<Object[]> reportingWtihNoReversal(Pageable pageable, String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso );

	
	
//	@Query("select s.switchResponseDate ,s.switchPan,"
//			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
//			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
//			+ "from SwitchTransaction s  WITH (NOLOCK) ,ResponseCode r  WITH (NOLOCK)  where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% " 
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
//			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
//	List<Object[]> reportingWtihStartDateAndReversal(String pan, String amount, String responseCode, String merchantId,
//			String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso, Sort sort);
//	
//	
	@Query(value="select   "
			+ "s.RESPONSEDATE , "
			+ "s.DE02_PAN,"
			+ "s.DE04_AMOUNT_TRANSACTION,"
			+ "s.DE49_TRANS_CURR_CODE,"
			+ "s.DE37_RRN,"
			+ "s.DE38_AUTH_IDENTIF_NUMBER,"
			+ "s.DE39_RESPONSE_CODE,"
			+ "s.DE42_ACEPTOR_MERCHANT_CODE, "
			+"s.DE41_ACCEPTOR_TERMINAL_ID,"
			+"s.DE03_PROCESSING_CODE "
	
			+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "

			+ "where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
			+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
			+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT( :pan, '%')) "
			+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT( :amount, '%')) "
			+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT( :responseCode, '%')) "
			+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT( :responseCodeIso, '%')) "
			+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT( :merchantId, '%')) "
			+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT( :de38, '%')) "
			+ "and (:source IS NULL OR s.source LIKE CONCAT( :source, '%')) "
			+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT( :transactionCode, '%')) "
			+ "and (:reversal IS NULL OR s.STAT_TRANSACTION LIKE CONCAT( :reversal, '%')) "
			+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT( :de32, '%')) "
			+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%')) "
			+ "and (:date1 IS NULL OR :date2 IS NULL OR s.REQUESTDATE BETWEEN "
			+ "FORMAT(CONVERT(DATETIME, :date1, 102), 'yyyy/MM/dd HH:mm:ss') AND "
			+ "FORMAT(CONVERT(DATETIME, :date2, 102), 'yyyy/MM/dd HH:mm:ss'))"

			,nativeQuery=true)
		
	List<Object[]> reportingWtihStartDateAndReversal(String pan, String amount, String responseCode, String merchantId,
			String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);

	
	
	
//	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
//			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
//			+ "from SwitchTransaction s  WITH (NOLOCK) ,ResponseCode r   WITH (NOLOCK) where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% " 
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
//			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') ")
//
//	Page<Object[]> reportingWtihStartDateAndReversal(Pageable pageable, String pan, String amount, String responseCode,
//			String merchantId, String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);

	
	@Query(
			value="SELECT s.DE02_PAN AS switchPan, "
					+ "s.DE04_AMOUNT_TRANSACTION AS switchAmountTransaction, "
					+ "s.DE39_RESPONSE_CODE AS switchResponseCode, "
					+ "s.DE42_ACEPTOR_MERCHANT_CODE AS switchAcceptorMerchantCode, "
					+ "s.DE38_AUTH_IDENTIF_NUMBER AS switchAuthNumber, "
					+ "s.SOURCE AS source, "
					+ "s.REQUESTDATE AS switchRequestDate, "
					+ "s.STAT_TRANSACTION AS switchStatTransaction, "
					+ "s.DE32_AQCUIRER_IDENTI_CODE AS switchAcquirerIdenCode, "
					+ "s.DE49_TRANS_CURR_CODE AS switchTransactionCurrencyCode, "
					+ "s.MTI_MESSAGE_TYPE_IDENTIFIER AS switchMtiMessage, "
					+ "s.RESPONSEDATE AS switchResponseDate, "
					+ "s.DE03_PROCESSING_CODE AS switchProcessingCode, "
					+ "s.DE37_RRN AS switchRRN, "
					+ "s.DE22_POS_ENTRY_MODE AS switchPosEntryMode, "
					+ "s.DE107_RESERVED AS switchDE107, "
					+ "s.SWITCH_CODE AS switchCode, "
					+ "s.TAG_95 AS tag95, "
					+ "s.TAG_9F10 AS tag9F10, "
					+ "s.DE111_RESERVED AS switchDE111, "
					+ "s.DE43_CARD_ACCEPTOR_NAME AS switchAcceptorAcceptorName "
					+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "


					+ " where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
					
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%')) "
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and (:date1 IS NULL OR :date2 IS NULL OR s.REQUESTDATE BETWEEN "
					+ "FORMAT(CONVERT(DATETIME, :date1, 102), 'yyyy/MM/dd HH:mm:ss') AND "
					+ "FORMAT(CONVERT(DATETIME, :date2, 102), 'yyyy/MM/dd HH:mm:ss'))",

			countQuery="select count(*)  FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK)"
					+ " where s.DE44_ADDITIONAL_RESP_DATA = r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE = r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
					
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%')) "
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and (:date1 IS NULL OR :date2 IS NULL OR s.REQUESTDATE BETWEEN "
					+ "FORMAT(CONVERT(DATETIME, :date1, 102), 'yyyy/MM/dd HH:mm:ss') AND "
					+ "FORMAT(CONVERT(DATETIME, :date2, 102), 'yyyy/MM/dd HH:mm:ss'))",

			nativeQuery=true)
	Page<Object[]> reportingWtihStartDateAndReversal(Pageable pageable, String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	
	
	
	
//	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
//			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
//			+ "from SwitchTransaction s  WITH (NOLOCK) ,ResponseCode r  WITH (NOLOCK)  where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% " 
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
//			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') ")
//	Page<Object[]> reportingWtihStartDateAndNoReversal(Pageable pageable, String pan, String amount,
//			String responseCode, String merchantId, String de38, String source, String date1, String date2,
//			String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	
	
	
	@Query(
			value="SELECT s.DE02_PAN AS switchPan, "
					+ "s.DE04_AMOUNT_TRANSACTION AS switchAmountTransaction, "
					+ "s.DE39_RESPONSE_CODE AS switchResponseCode, "
					+ "s.DE42_ACEPTOR_MERCHANT_CODE AS switchAcceptorMerchantCode, "
					+ "s.DE38_AUTH_IDENTIF_NUMBER AS switchAuthNumber, "
					+ "s.SOURCE AS source, "
					+ "s.REQUESTDATE AS switchRequestDate, "
					+ "s.STAT_TRANSACTION AS switchStatTransaction, "
					+ "s.DE32_AQCUIRER_IDENTI_CODE AS switchAcquirerIdenCode, "
					+ "s.DE49_TRANS_CURR_CODE AS switchTransactionCurrencyCode, "
					+ "s.MTI_MESSAGE_TYPE_IDENTIFIER AS switchMtiMessage, "
					+ "s.RESPONSEDATE AS switchResponseDate, "
					+ "s.DE03_PROCESSING_CODE AS switchProcessingCode, "
					+ "s.DE37_RRN AS switchRRN, "
					+ "s.DE22_POS_ENTRY_MODE AS switchPosEntryMode, "
					+ "s.DE107_RESERVED AS switchDE107, "
					+ "s.SWITCH_CODE AS switchCode, "
					+ "s.TAG_95 AS tag95, "
					+ "s.TAG_9F10 AS tag9F10, "
					+ "s.DE111_RESERVED AS switchDE111, "
					+ "s.DE43_CARD_ACCEPTOR_NAME AS switchAcceptorAcceptorName "
					+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "


					+ "where s.DE44_ADDITIONAL_RESP_DATA=r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE=r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
				
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION NOT LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and s.REQUESTDATE between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') "
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%'))",


			countQuery = "SELECT COUNT(*) FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "
					+ "where s.DE44_ADDITIONAL_RESP_DATA=r.RESPONSE_CODE_ISO "
					+ "and s.DE39_RESPONSE_CODE=r.MOTIF_OPPOSITION "
					+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
					+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
					+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
					+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
					+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
					+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
					+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
					+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
					
					+ "and (:reversal IS NULL OR s.STAT_TRANSACTION NOT LIKE CONCAT(:reversal, '%')) "
					+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
					+ "and s.REQUESTDATE between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') "
					+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%'))"


			,nativeQuery = true)
	Page<Object[]> reportingWtihStartDateAndNoReversal(Pageable pageable, String pan, String amount,
			String responseCode, String merchantId, String de38, String source, String date1, String date2,
			String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	
	@Query("select s from SwitchTransaction s where s.switchMtiMessage!='0420' and CAST(de04_amount_transaction AS int)>0 and s.switchResponseCode='00' and s.switchStatTransaction!='R' and s.switchResponseDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
	List<SwitchTransaction> getLatestTrans(String date1, String date2);
	
	
	@Query("select s from SwitchTransaction s where s.switchMtiMessage!='0420' and CAST(de04_amount_transaction AS int)>0 and s.switchAdditionalRespData='890' and s.switchStatTransaction!='R' and s.switchResponseDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
	List<SwitchTransaction> getLatestTransWith890(String date1, String date2);
	
	@Query("select s from SwitchTransaction s where s.switchMtiMessage!='0420' and CAST(de04_amount_transaction AS int)>0 and s.switchAdditionalRespData='959' and s.switchStatTransaction!='R' and s.switchResponseDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
	List<SwitchTransaction> getLatestTransWith959(String date1, String date2);
	
//	@Query("select s.switchResponseDate ,s.switchPan,"
//			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
//			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
//			+ "from SwitchTransaction s  WITH (NOLOCK) ,ResponseCode r  WITH (NOLOCK) where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
//			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
//			+ "and s.switchResponseCode like %:responseCode% "
//			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
//			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
//			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
//			+ "and s.switchProcessingCode like %:transactionCode% "
//			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
//			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
//			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
//	List<Object[]> reportingWtihStartDateAndNoReversal(String pan, String amount, String responseCode,
//			String merchantId, String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso,
//			Sort sort);

	@Query(value="select   "
			+ "s.RESPONSEDATE , "
			+ "s.DE02_PAN,"
			+ "s.DE04_AMOUNT_TRANSACTION,"
			+ "s.DE49_TRANS_CURR_CODE,"
			+ "s.DE37_RRN,"
			+ "s.DE38_AUTH_IDENTIF_NUMBER,"
			+ "s.DE39_RESPONSE_CODE,"
			+ "s.DE42_ACEPTOR_MERCHANT_CODE, "
			+"s.DE41_ACCEPTOR_TERMINAL_ID,"
			+"s.DE03_PROCESSING_CODE "
			+ "FROM Switch.SWITCH s WITH (NOLOCK), Switch.RESPONSE_CODE r WITH (NOLOCK) "


			+ "where s.DE44_ADDITIONAL_RESP_DATA=r.RESPONSE_CODE_ISO "
			+ "and s.DE39_RESPONSE_CODE=r.MOTIF_OPPOSITION "
			+ "and (:pan IS NULL OR s.DE02_PAN LIKE CONCAT(:pan, '%')) "
			+ "and (:amount IS NULL OR s.DE04_AMOUNT_TRANSACTION LIKE CONCAT(:amount, '%')) "
			+ "and (:responseCode IS NULL OR s.DE39_RESPONSE_CODE LIKE CONCAT(:responseCode, '%')) "
			+ "and (:responseCodeIso IS NULL OR s.DE44_ADDITIONAL_RESP_DATA LIKE CONCAT(:responseCodeIso, '%')) "
			+ "and (:merchantId IS NULL OR s.DE42_ACEPTOR_MERCHANT_CODE LIKE CONCAT(:merchantId, '%')) "
			+ "and (:de38 IS NULL OR s.DE38_AUTH_IDENTIF_NUMBER LIKE CONCAT(:de38, '%')) "
			+ "and (:source IS NULL OR s.source LIKE CONCAT(:source, '%')) "
			+ "and (:transactionCode IS NULL OR s.DE03_PROCESSING_CODE LIKE CONCAT(:transactionCode, '%')) "
			+ "and (:reversal IS NULL OR s.STAT_TRANSACTION NOT LIKE CONCAT(:reversal, '%')) "
			+ "and (:de32 IS NULL OR s.DE32_AQCUIRER_IDENTI_CODE LIKE CONCAT(:de32, '%')) "
			+ "and (:posEntry IS NULL OR s.POS_ENTRY_CHAR LIKE CONCAT(:posEntry, '%')) "
			+ "and s.REQUESTDATE between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')"

			,nativeQuery=true)

	List<Object[]> reportingWtihStartDateAndNoReversal(String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso
			 );
	
	
	@Query("select e from SwitchTransaction e where e.switchStan=:D11 and e.switchPan=:D2 and e.switchRRN=:D37")
	List<SwitchTransaction> getSwitch(@Param("D2") String D2, @Param("D11") String D11, @Param("D37") String D37);

	@Query("select e from SwitchTransaction e where e.switchStan=:D11 and e.switchPan=:D2 and e.switchRRN=:D37 and e.switchMtiMessage=0420")
	SwitchTransaction getSwitchUpdate(@Param("D2") String D2, @Param("D11") String D11, @Param("D37") String D37);

	@Query("select e from SwitchTransaction e where e.switchStan=:D11 and e.switchPan=:D2 and e.switchRRN=:D37 and e.switchMtiMessage in ('0100','0120','0121','0200','0220','0221') and e.switchStatTransaction=:stat and e.switchProcessingCode=:D03")
	SwitchTransaction getSwitchTransactionToReverse(@Param("D2") String D2, @Param("D11") String D11,
			@Param("D37") String D37, @Param("stat") String stat, @Param("D03") String D03);

	@Query("select e from SwitchTransaction e where e.switchStan=:D11 and e.switchPan=:D2 and e.switchRRN=:D37 and e.switchMtiMessage in ('0420','0421') and e.switchProcessingCode=:D03 and e.switchStatTransaction=:stat")
	SwitchTransaction getSwitchTransactionReversed(@Param("D2") String D2, @Param("D11") String D11,
			@Param("D37") String D37, @Param("D03") String D03, @Param("stat") String stat);
	
	@Query("SELECT e FROM SwitchTransaction e WHERE DATEDIFF(DAY, e.switchRequestDate, GETDATE()) > 60")
	List<SwitchTransaction> getAllForSwitchArchive();

}

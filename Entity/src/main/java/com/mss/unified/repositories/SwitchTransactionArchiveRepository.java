package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SwitchTransactionArchive;

@Repository
public interface SwitchTransactionArchiveRepository extends JpaRepository<SwitchTransactionArchive, Integer>  {
	
	@Query("SELECT e FROM SwitchTransactionArchive e WHERE e.dateArchive is null")
	List<SwitchTransactionArchive> getSwitchTransactionArchive();
	
	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
			+ "from SwitchTransactionArchive s,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% " 
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
	Page<Object[]> reportingWtihStartDateAndReversal(Pageable pageable, String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	
	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
			+ "from SwitchTransactionArchive s,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% " 
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') ")
	Page<Object[]> reportingWtihStartDateAndNoReversal(Pageable pageable, String pan, String amount,
			String responseCode, String merchantId, String de38, String source, String date1, String date2,
			String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	
	
	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
			+ "from SwitchTransactionArchive s ,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% "
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% ")
	Page<Object[]> reportingWtihReversal(Pageable pageable, String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);
	
	@Query("select s.switchPan,s.switchAmountTransaction,s.switchResponseCode,s.switchAcceptorMerchantCode,s.switchAuthNumber,"
			+ "s.source,s.switchRequestDate,s.switchStatTransaction,s.switchAcquirerIdenCode,s.switchTransactionCurrencyCode , s.switchMtiMessage, s.switchResponseDate, s.switchProcessingCode, s.switchRRN, s.switchPosEntryMode, s.switchDE107, s.switchCode,s.tag95,s.tag9F10,s.switchDE111,s.switchAcceptorAcceptorName "
			+ "from SwitchTransactionArchive s,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% " 
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% ")
	Page<Object[]> reportingWtihNoReversal(Pageable pageable, String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso);

	/******************************/
	
	@Query("select s.switchResponseDate ,s.switchPan,"
			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
			+ "from SwitchTransactionArchive s,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% " 
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss')")
	List<Object[]> reportingWtihStartDateAndReversal(String pan, String amount, String responseCode, String merchantId,
			String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso, Sort sort);
	
	@Query("select s.switchResponseDate ,s.switchPan,"
			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
			+ "from SwitchTransactionArchive s,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% " 
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% "
			+ "and s.switchRequestDate between FORMAT(CONVERT(DATETIME,:date1,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') ")
	List<Object[]> reportingWtihStartDateAndNoReversal(String pan, String amount, String responseCode,
			String merchantId, String de38, String source, String date1, String date2, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso,
			Sort sort);
	
	
	@Query("select s.switchResponseDate ,s.switchPan,"
			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
			+ "from SwitchTransactionArchive s ,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% "
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% ")
	List<Object[]> reportingWtihReversal(String pan, String amount, String responseCode, String merchantId, String de38,
			String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso, Sort sort);
	
	
	@Query("select s.switchResponseDate ,s.switchPan,"
			+ "s.switchAmountTransaction,s.switchTransactionCurrencyCode, s.switchRRN,s.switchAuthNumber,s.switchResponseCode, s.switchAcceptorMerchantCode,"
			+ "s.switchAcceptorTerminalId,s.switchProcessingCode "
			+ "from SwitchTransactionArchive s,ResponseCode r where s.switchAdditionalRespData=r.responseCodeIso and s.switchResponseCode=r.motifOpposition "
			+ "and s.switchPan like %:pan% " + "and s.switchAmountTransaction like %:amount% "
			+ "and s.switchResponseCode like %:responseCode% " 
			+ "and s.switchAdditionalRespData like %:responseCodeIso% "
			+ "and s.switchAcceptorMerchantCode like %:merchantId% "
			+ "and s.switchAuthNumber like %:de38% " + "and s.source like %:source% "
			+ "and s.switchProcessingCode like %:transactionCode% "
			+ "and s.switchStatTransaction not like %:reversal% " + "and s.switchAcquirerIdenCode like %:de32% "
			+ "and SUBSTRING (s.switchPosEntryMode,7,1) like %:posEntry% ")
	List<Object[]> reportingWtihNoReversal(String pan, String amount, String responseCode, String merchantId,
			String de38, String source, String reversal, String de32,String transactionCode,String posEntry,String responseCodeIso, Sort sort);

}

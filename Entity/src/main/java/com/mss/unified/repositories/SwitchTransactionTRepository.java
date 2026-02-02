package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SwitchTransaction;
import com.mss.unified.entities.SwitchTransactionT;
import com.mss.unified.entities.Account;
import com.mss.unified.entities.AgenceAdministration;
import com.mss.unified.entities.BinOnUs;
import com.mss.unified.entities.Merchant;

@Repository
public interface SwitchTransactionTRepository extends PagingAndSortingRepository<SwitchTransactionT, String> {
	@Query("select m.merchantId,a.accountNum from Merchant m , Account a where a.accountCode = m.account")
	List<Object[]> getMerchantAccount();

	@Query("select t from SwitchTransactionT t  "
			+ "   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM' and t.switchProcessingCode like '81%' and t.switchDE189='ATM' AND t.switchResponseCode='00' "
			+ "AND t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null ")
	public List<SwitchTransactionT> getTransactionsRetraitOnUSAASC();

	@Query("select t from SwitchTransactionT t   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM'and t.switchDE189='ATM' and t.switchProcessingCode like '81%'  AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null ")
	public List<SwitchTransactionT> getTransactionsRetraitOnUSMASC();
	@Query("select t from SwitchTransactionT t   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM'and t.switchDE189='ATM' and t.switchProcessingCode like '90%'  AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " and scriptExcDate is null ")
	public List<SwitchTransactionT> getChangementPIN();

	@Query("select t from SwitchTransactionT t  "
			+ "   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM' and t.switchProcessingCode like '01%' and t.switchDE189='ATM' AND t.switchResponseCode='00' "
			+ "AND t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null ")
	public List<SwitchTransactionT> getTransactionsRetraitOnUSAA();

	@Query("select t from SwitchTransactionT t   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM'and t.switchDE189='ATM' and t.switchProcessingCode like '01%'  AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null ")
	public List<SwitchTransactionT> getTransactionsRetraitOnUSMA();

	@Query("select t from SwitchTransactionT t  "
			+ "   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM' and t.switchProcessingCode like '01%' and t.switchDE189='ATM' AND t.switchResponseCode='00' "
			+ "AND t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5) and (chargebackStatus is null or chargebackStatus !=2)  ")
	public List<SwitchTransactionT> getTransactionsCHRetraitOnUSAA();

	@Query("select t from SwitchTransactionT t   where t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM'and t.switchDE189='ATM' and t.switchProcessingCode like '01%'  AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5) and (chargebackStatus is null or chargebackStatus !=2)   ")
	public List<SwitchTransactionT> getTransactionsCHRetraitOnUSMA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM' and t.switchProcessingCode like '31%' and t.switchDE189='ATM' AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))"
			+ " AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5)  and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsCSONUSAA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35' and "
			+ "t.source='ATM' and t.switchProcessingCode like '31%' and t.switchDE189='ATM' AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin))) "
			+ " AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5)  and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsCSONUSMA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35' AND t.source='POS' AND t.switchDE189='POS' AND t.switchProcessingCode like '00%' AND   SUBSTRING(t.switchPosEntryMode, 7, 1) not IN ('V', 'T','U','W','S')  "
			+ "   AND t.switchResponseCode='00' and t.switchStatTransaction!='R' "
			+ "AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin))) "
			+ "AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5)  and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsAchatTPEOnUSMA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35'  and t.source='POS' AND t.switchDE189='POS' and"
			+ " t.switchProcessingCode like '00%' AND   SUBSTRING(t.switchPosEntryMode, 7, 1) not IN ('V', 'T','U','W','S')  "
			+ "   AND t.switchResponseCode='00' and t.switchStatTransaction!='R' "
			+ "AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin))) "
			+ "AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5)  and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsAchatTPEOnUSAA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35' and t.source='POS' AND t.switchDE189='POS' "
			+ "and  ( t.switchProcessingCode like '00%'  or  t.switchProcessingCode like '50%' ) AND SUBSTRING(t.switchPosEntryMode, 7, 1)   IN ('V', 'T','U','W','S') "
			+ "     AND t.switchResponseCode='00' and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))  "
			+ "  AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsAchatInternetOnUSMA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35'  and t.source='POS' AND t.switchDE189='POS' "
			+ "and  ( t.switchProcessingCode like '00%'  or  t.switchProcessingCode like '50%' ) AND SUBSTRING(t.switchPosEntryMode, 7, 1)   IN ('V', 'T','U','W','S') "
			+ "     AND t.switchResponseCode='00' and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))  "
			+ "  AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsAchatInternetOnUSAA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35'  and t.source='POS' AND t.switchDE189='POS' "
			+ "and  t.switchProcessingCode like '20%' AND SUBSTRING(t.switchPosEntryMode, 7, 1) not IN ('V', 'T','U','W','S')   "
			+ "  AND t.switchResponseCode='00' and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin))) "
			+ "AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsRemboursementTPEOnUSMA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35'  and t.source='POS' AND t.switchDE189='POS' "
			+ "and  t.switchProcessingCode like '20%' AND SUBSTRING(t.switchPosEntryMode, 7, 1) not IN ('V', 'T','U','W','S')   "
			+ "  AND t.switchResponseCode='00' and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin))) "
			+ "AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsRemboursementTPEOnUSAA();

	@Query("select t from SwitchTransactionT t where  t.switchAcquirerIdenCode='35'  and t.source='POS' AND t.switchDE189='POS' and "
			+ " t.switchProcessingCode like '20%'  AND SUBSTRING(t.switchPosEntryMode, 7, 1)   IN ('V', 'T','U','W','S')    "
			+ "  AND t.switchResponseCode='00' and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))  "
			+ "AND SUBSTRING(t.switchAccountId1,3,5)=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsRemboursementInternetOnUSMA();

	@Query("select t from SwitchTransactionT t  where  t.switchAcquirerIdenCode='35'  and t.source='POS' AND t.switchDE189='POS' and "
			+ " t.switchProcessingCode like '20%'  AND SUBSTRING(t.switchPosEntryMode, 7, 1)   IN ('V', 'T','U','W','S')    "
			+ "  AND t.switchResponseCode='00' and t.switchStatTransaction!='R' AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))  "
			+ "AND SUBSTRING(t.switchAccountId1,3,5)!=SUBSTRING(t.accountCommercant,3,5) and scriptExcDate is null")
	public List<SwitchTransactionT> getTransactionsRemboursementInternetOnUSAA();

	@Query(value = "SELECT t FROM  SwitchTransactionT t "
			+ "WHERE t.switchAcquirerIdenCode='35' "
			+ "AND t.switchResponseCode='00' AND t.switchStatTransaction!='R' "
			+ "AND (:chargebackStatus IS NULL OR t.chargebackStatus = :chargebackStatus) "
			+ "AND (:pan IS NULL OR :pan = '' OR t.switchPan LIKE CONCAT('%', :pan, '%')) "
			+ "AND (:merchantId IS NULL OR :merchantId = '' OR t.switchAcceptorMerchantCode LIKE CONCAT('%', :merchantId, '%')) "
			+ "AND (:authCode IS NULL OR :authCode = '' OR t.switchAuthNumber LIKE CONCAT('%', :authCode, '%')) "
			+ "AND (:terminal IS NULL OR :terminal = '' OR t.switchAcceptorTerminalId LIKE CONCAT('%', :terminal, '%')) "
			+ "AND (:switchRRN IS NULL OR :switchRRN = '' OR t.switchRRN LIKE CONCAT('%', :switchRRN, '%')) "
			+ "AND (:startDate IS NULL OR :startDate = '' OR t.switchResponseDate >= :startDate) "
			+ "AND (:endDate IS NULL OR :endDate = '' OR t.switchResponseDate <= :endDate) "
			+ "AND ("
			+ "  (t.source='ATM' AND t.switchDE189='ATM' AND t.switchProcessingCode LIKE '01%') "
			+ "  OR (t.source='POS' AND t.switchDE189='POS' AND t.switchProcessingCode LIKE '00%' AND SUBSTRING(t.switchPosEntryMode, 7, 1) NOT IN ('V', 'T','U','W','S')) "
			+ "  OR (t.source='POS' AND t.switchDE189='POS' AND (t.switchProcessingCode LIKE '00%' OR t.switchProcessingCode LIKE '50%') AND SUBSTRING(t.switchPosEntryMode, 7, 1) IN ('V', 'T','U','W','S')) "
			+ ")" )
	public Page<SwitchTransactionT> getAllOnUsTransactions(
			org.springframework.data.domain.Pageable pageable,
			@Param("pan") String pan,
			@Param("merchantId") String merchantId,
			@Param("authCode") String authCode,
			@Param("terminal") String terminal,
			@Param("startDate") String startDate,
			@Param("endDate") String endDate,
			@Param("switchRRN") String switchRRN,
			@Param("chargebackStatus") Integer chargebackStatus);

	@Query("SELECT t FROM SwitchTransactionT t WHERE t.switchCode IN :switchCodes AND (t.chargebackStatus IS NULL OR t.chargebackStatus = 0)")
	List<SwitchTransactionT> findAllBySwitchCodeIn(@Param("switchCodes") List<String> switchCodes);

}

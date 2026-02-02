 package com.mss.unified.repositories;

import com.mss.unified.dto.TransactionValidPosDto;
import com.mss.unified.entities.*;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Pageable;



@Repository
public interface TransactionRepository extends JpaRepository<TransactionValidPos, Integer> {
	
	@Query("SELECT A FROM  TransactionValidPos A where A.compensePos is null and A.constatation is null")
	public  List<TransactionValidPos>validCompenseAndConstatation();
	
	@Query("SELECT A FROM  TransactionValidPos A where A.compensePos is null order by A.invoiceNumber")
	public  List<TransactionValidPos>validCompense();
	

	
	@Query("SELECT A FROM  DetailsClearing A WHERE  A.reversal ='0420'")
	public List<DetailsClearing> Reversal();
	@Query("SELECT A FROM  DetailsClearing A WHERE  A.reversal ='0420' and A.summaryCode =:summary")
	public List<DetailsClearing> ReversalWithSummary(int summary);
	
	@Query("SELECT B FROM TransactionValidPos B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	Page<TransactionValidPos>listPos(Pageable pageable,List<Integer> summary,String cardNumber,String mti,String authCode);
	@Query("SELECT B FROM TransactionValidPos B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.transactionType = :transactionType"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	Page<TransactionValidPos>listPosByTransactionType(Pageable pageable,List<Integer> summary,String cardNumber,String mti,String authCode,String transactionType);
	
	@Query("SELECT B FROM TransactionValidPos B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.revarsalPos is not null"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	Page<TransactionValidPos>getAllLValidWithNotNullReversal(Pageable pageable,List<Integer> summary,String cardNumber,String mti,String authCode);
	@Query("SELECT B FROM TransactionValidPos B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.revarsalPos is not null"
			+ " and B.transactionType = :transactionType and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary) ")
	Page<TransactionValidPos>getAllLValidWithNotNullReversalAndTransactionType(Pageable pageable,List<Integer> summary,String cardNumber,String mti,String authCode,String transactionType);

	TransactionValidPos findFirstByDe38AndPan(String de38, String Pan);


	@Query("SELECT A FROM  TransactionValidPos A where A.transactionCode = :code ")
	TransactionValidPos findByCode(int code);
	
	@Query("SELECT B FROM TransactionValidPos B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.revarsalPos is null"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	Page<TransactionValidPos>getAllLValidWithNullReversal(Pageable pageable,List<Integer> summary,String cardNumber,String mti,String authCode);
	@Query("SELECT B FROM TransactionValidPos B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.transactionType = :transactionType"
			+ " and B.revarsalPos is null and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	Page<TransactionValidPos>getAllLValidWithNullReversalAndTransactionType(Pageable pageable,List<Integer> summary,String cardNumber,String mti,String authCode,String transactionType);
	
	
	@Query("SELECT new com.mss.unified.dto.TransactionValidPosDto(B.reversal, B.dateTransaction, B.heureTransaction, B.terminalId,"
			+ " B.merchantId, B.terminalName, B.pan, B.experyDate, B.de38,"
			+ " B.amountTransaction, B.transactionCurrency, B.aquirerBt, B.cardOwner, B.revarsalPos)"
			+ " FROM TransactionValidPos B where B.pan like %:cardNumber%"
			+ " and B.reversal like %:mti% and B.de38 like %:authCode%"
			+ " and B.revarsalPos is not null and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	List<TransactionValidPosDto> getAllLValidWithNotNullReversal(List<Integer> summary,String cardNumber,String mti,String authCode);
	
	@Query("SELECT new com.mss.unified.dto.TransactionValidPosDto(B.reversal, B.dateTransaction, B.heureTransaction, B.terminalId,"
			+ " B.merchantId, B.terminalName, B.pan, B.experyDate, B.de38,"
			+ " B.amountTransaction, B.transactionCurrency, B.aquirerBt, B.cardOwner,"
			+ " B.revarsalPos)"
			+ " FROM TransactionValidPos B where B.pan like %:cardNumber%"
			+ " and B.reversal like %:mti% and B.de38 like %:authCode% and B.revarsalPos is null"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	List<TransactionValidPosDto> getAllLValidWithNullReversal(List<Integer> summary,String cardNumber,String mti,String authCode);
	
	@Query("SELECT new com.mss.unified.dto.TransactionValidPosDto(B.reversal, B.dateTransaction, B.heureTransaction, B.terminalId,"
			+ " B.merchantId, B.terminalName, B.pan, B.experyDate, B.de38,"
			+ " B.amountTransaction, B.transactionCurrency, B.aquirerBt, B.cardOwner,"
			+ " B.revarsalPos)"
			+ " FROM TransactionValidPos B where B.pan like %:cardNumber%"
			+ " and B.reversal like %:mti% and B.de38 like %:authCode%"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearing A WHERE A.summaryCode in :summary)")
	List<TransactionValidPosDto>listPos(List<Integer> summary,String cardNumber,String mti,String authCode);

	@Query("select T from TransactionValidPos T where T.matchingSwitch is null and fiidIssuer=:bank and fiidAquerer not in ('UPI','MDS','VISA','BNET')")
	List<TransactionValidPos> getNotMatchedSwitchTransactionPos(String bank);
	@Query("select T from TransactionValidAtm T where T.matchingSwitch is null and fiid_issuer=:bank and fiid_acqu not in ('UPI','MDS','VISA','BNET')  and amountTransaction!=0.0 ")
	List<TransactionValidAtm> getNotMatchedSwitchTransactionAtm(String bank);
	@Query("select T from TransactionValidPos T where T.matchingSwitch is null"
			+ " and TO_DATE(T.dateTransaction,'ddMMyy') between TO_DATE(:dateDebut, 'ddMMyy') and TO_DATE(:dateFin, 'ddMMyy')"
			+ " and T.pan like %:cardNumber% " +
			"and T.de38 like %:authCode%  and T.reversal like %:mti%")
	Page<TransactionValidPos> getPageNotMatchedSwitchTransactionPos(Pageable pageable,String dateDebut,String dateFin,String cardNumber,String mti,String authCode);
	@Query("select new com.mss.unified.dto.TransactionValidPosDto(T.reversal, T.dateTransaction, T.heureTransaction, T.terminalId,"
			+ " T.merchantId, T.terminalName, T.pan, T.experyDate, T.de38,"
			+ " T.amountTransaction, T.transactionCurrency, T.aquirerBt, T.cardOwner,"
			+ " T.revarsalPos) from TransactionValidPos T where T.matchingSwitch is null"
			+ " and TO_DATE(T.dateTransaction,'ddMMyy') between TO_DATE(:dateDebut, 'ddMMyy') and TO_DATE(:dateFin, 'ddMMyy')"
			+ " and T.pan like %:cardNumber%"
			+ " and T.de38 like %:authCode%  and T.reversal like %:mti%")
	List<TransactionValidPosDto> getPageNotMatchedSwitchTransactionPos(String dateDebut,String dateFin,String cardNumber,String mti,String authCode);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM TransactionValidPos s WHERE s.summaryCode = :summaryCode")
	void deleteBySummaryCode(@Param("summaryCode") Integer summaryCode);
	

	@Query("SELECT A FROM  TransactionValidPos A where A.matchingVisa is null  ")
	public List<TransactionValidPos> validATMnonMatchee();
	
	@Query("SELECT A FROM  TransactionValidPos A where (:reversal is null or reversal like  %:reversal%) "
			+ "and (:pan is null or pan like %:pan%) and (:de38 is null or de38 like %:de38%) "
			+ "and (:fiid_acqu is null or fiidAquerer like %:fiid_acqu%) and (:fiid_issuer is null or fiidIssuer like %:fiid_issuer%)"
			+ " and (:dateTransaction is null or dateTransaction like %:dateTransaction% ) "
			+ "and matchingVisa is null ")
	public Page<TransactionValidPos> notmatchingVisaATM(Pageable pageable, String reversal,
			String pan,String de38 ,String fiid_acqu,String fiid_issuer,String dateTransaction);
	


	@Query("SELECT t FROM TransactionValidPos t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence")
	List<TransactionValidPos> findByPanAndDe38AndDateTransactionAndExtourneAndAccountNum(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);

	@Query("SELECT t FROM TransactionValidPos t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence")
	List<TransactionValidPos> findByPanAndDe38AndDateTransactionAndAccountNum(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidPos t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence")
	Page<TransactionValidPos> findByPanAndDe38AndDateTransactionAndExtourneAndAccountNum(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidPos t,Card c WHERE "
	        + " t.pan LIKE %:pan%  and t.pan = c.cardNum "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence ")

			
	Page<TransactionValidPos> findByPanAndDe38AndDateTransactionAndExtourne(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidPos t ,Card c WHERE "
	        + " t.pan LIKE %:pan% and t.pan = c.cardNum  "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence ")

			
	List<TransactionValidPos> findByPanAndDe38AndDateTransactionAndExtourne(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("codeAgence") String codeAgence
	);

	@Query("SELECT t FROM TransactionValidPos t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence")
	Page<TransactionValidPos> findByPanAndDe38AndDateTransactionAndAccountNum(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidPos t, Card c WHERE "

	        + " t.pan LIKE %:pan%  and t.pan = c.cardNum "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence ")
		
	Page<TransactionValidPos> findByPanAndDe38AndDateTransaction(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidPos t,Card  c WHERE "

	        + " t.pan LIKE %:pan%  and t.pan = c.cardNum "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence ")
		
	List<TransactionValidPos> findByPanAndDe38AndDateTransaction(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("codeAgence") String codeAgence
	);
	@Transactional
	@Modifying

	@Query("update TransactionValidPos s "
			+ "set constatation=null"
			+ " WHERE "
			+ "constatation in (select STR( impCode) from IpmClearingDetails ipm where ipm.summaryCode = :summaryCode) ")
	public void unmatchingIpmPos (int summaryCode);

}

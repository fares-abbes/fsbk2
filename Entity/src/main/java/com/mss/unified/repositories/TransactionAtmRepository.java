package com.mss.unified.repositories;

import com.mss.unified.dto.TransactionValidAtmDto;
import com.mss.unified.dto.TransactionValidAtmDtoApi;

import com.mss.unified.entities.DetailsClearingAtm;
import com.mss.unified.entities.TransactionValidAtm;

import java.time.LocalDate;
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
public interface TransactionAtmRepository extends JpaRepository<TransactionValidAtm, Integer> {

	@Query("SELECT A FROM  TransactionValidAtm A where A.compense is null and A.constatation is null")
	public List<TransactionValidAtm> validCompenseAndConstatation();

	@Query("SELECT A FROM  TransactionValidAtm A where A.compense is null ")
	public List<TransactionValidAtm> validCompense();

	

	@Query("SELECT A FROM  DetailsClearingAtm A WHERE A.reversal ='0420'")

	public List<DetailsClearingAtm> Reversal();
	
	@Query("SELECT A FROM  DetailsClearingAtm A WHERE A.reversal ='0420' and summaryCode=:summary")

	public List<DetailsClearingAtm> ReversalAtm(int summary);



	// Page<Transaction_Valid_ATM2> findAllByTransactionCode(Pageable pageable,
	// Integer summary);

	@Query("SELECT B FROM TransactionValidAtm B where B.matchingVisa is null and B.pan like %:cardNumber% and B.reversal like %:mti% and B.de38 like %:authCode% and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode=:summary)")

	public Page<TransactionValidAtm> getAllLValid1(Pageable pageable, Integer summary, String cardNumber, String mti,
			String authCode);
	
	@Query("SELECT B FROM TransactionValidAtm B where B.matchingVisa is null and B.pan like %:cardNumber% and B.reversal like %:mti% and B.de38 like %:authCode% and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode=:summary)")

	public List<TransactionValidAtm> getAllLValid1( Integer summary, String cardNumber, String mti,
			String authCode);
	
	@Query("SELECT B FROM TransactionValidAtm B where B.pan like %:cardNumber%"
			+ " and B.reversal like %:mti% and B.de38 like %:authCode%"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode IN :summary)")
	public Page<TransactionValidAtm> getAllValid(Pageable pageable, List<Integer> summary, String cardNumber, String mti,
			String authCode);

	@Query("SELECT B FROM TransactionValidAtm B where B.matchingVisa is null and B.pan like %:cardNumber% and B.reversal like %:mti% and B.de38 like %:authCode% and B.reversalAtm is not null and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode=:summary)")

	public Page<TransactionValidAtm> getAllLValidWithNotNullReversal1(Pageable pageable, Integer summary,
			String cardNumber, String mti, String authCode);
	
	@Query("SELECT B FROM TransactionValidAtm B where B.matchingVisa is null and B.pan like %:cardNumber% and B.reversal like %:mti% and B.de38 like %:authCode% and B.reversalAtm is not null and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode=:summary)")

	public List<TransactionValidAtm> getAllLValidWithNotNullReversal1( Integer summary,
			String cardNumber, String mti, String authCode);
	
	@Query("SELECT B FROM TransactionValidAtm B where  B.pan like %:cardNumber%"
			+ " and B.reversal like %:mti% and B.de38 like %:authCode%"
			+ " and B.reversalAtm is not null and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode in :summary)")
	public Page<TransactionValidAtm> getAllValidWithNotNullReversal(Pageable pageable, List<Integer> summary,
			String cardNumber, String mti, String authCode);

	TransactionValidAtm findFirstByDe38AndPan(String de38, String Pan);

	@Query("SELECT A FROM  TransactionValidAtm A where A.transactionCode = :code ")

	TransactionValidAtm findByCode(int code);

	@Query("SELECT B FROM TransactionValidAtm B where B.matchingVisa is null and B.pan like %:cardNumber% and B.reversal like %:mti% and B.de38 like %:authCode% and B.reversalAtm is null and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode=:summary)")

	public Page<TransactionValidAtm> getAllValidWithNullReversal1(Pageable pageable, Integer summary, String cardNumber,
			String mti, String authCode);
	
	@Query("SELECT B FROM TransactionValidAtm B where B.matchingVisa is null and B.pan like %:cardNumber% and B.reversal like %:mti% and B.de38 like %:authCode% and B.reversalAtm is null and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode=:summary)")

	public List<TransactionValidAtm> getAllLValidWithNullReversal1(Integer summary, String cardNumber,
			String mti, String authCode);
	
	@Query("SELECT B FROM TransactionValidAtm B where"
			+ " B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.reversalAtm is null"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode IN :summary)")
	public Page<TransactionValidAtm> getAllValidWithNullReversal(Pageable pageable, List<Integer> summary, String cardNumber,
			String mti, String authCode);

	@Query("SELECT new com.mss.unified.dto.TransactionValidAtmDto(B.reversal, B.dateTransaction,"
			+ " B.heureTransaction, B.terminalId,"
			+ " B.terminalName, B.pan, B.experyDate, B.de38, B.amountTransaction,"
			+ " B.transactionCurrency, B.reversalAtm)"
			+ " FROM TransactionValidAtm B where B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.reversalAtm is null"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode IN :summary)")
	public List<TransactionValidAtmDto> getAllValidWithNullReversal(List<Integer> summary, String cardNumber, String mti,
			String authCode);

	@Query("SELECT new com.mss.unified.dto.TransactionValidAtmDto(B.reversal, B.dateTransaction,"
			+ " B.heureTransaction, B.terminalId,"
			+ " B.terminalName, B.pan, B.experyDate, B.de38, B.amountTransaction,"
			+ " B.transactionCurrency, B.reversalAtm)"
			+ " FROM TransactionValidAtm B where B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.reversalAtm is not null"
			+ " and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode IN :summary)")
	public List<TransactionValidAtmDto> getAllValidWithNotNullReversal(List<Integer> summary, String cardNumber, String mti,
			String authCode);

	@Query("SELECT new com.mss.unified.dto.TransactionValidAtmDto(B.reversal, B.dateTransaction,"
			+ " B.heureTransaction, B.terminalId,"
			+ " B.terminalName, B.pan, B.experyDate, B.de38, B.amountTransaction,"
			+ " B.transactionCurrency, B.reversalAtm)"
			+ " FROM TransactionValidAtm B where B.pan like %:cardNumber% and B.reversal like %:mti%"
			+ " and B.de38 like %:authCode% and B.codeDetails in (select A.detailCode from DetailsClearingAtm A WHERE A.summaryCode IN :summary)")
	public List<TransactionValidAtmDto> getAllValid(List<Integer> summary, String cardNumber, String mti, String authCode);

	@Query("select T from TransactionValidAtm T where T.matchingSwitch is null"
			+ " and TO_DATE(T.dateTransaction,'ddMMyy') between TO_DATE(:dateDebut, 'ddMMyy') and TO_DATE(:dateFin, 'ddMMyy')"
			+ " and T.pan like %:cardNumber% "
			+ "and T.de38 like %:authCode%  and T.reversal like %:mti% and T.amountTransaction<>0.0 and T.fiid_issuer = :bank")
	Page<TransactionValidAtm> getNotMatchedSwitchTransactionAtm(Pageable pageable, String dateDebut,String dateFin, String cardNumber,
			String mti, String authCode,String bank);
	@Query("select new com.mss.unified.dto.TransactionValidAtmDto(T.reversal, T.dateTransaction,"
			+ " T.heureTransaction, T.terminalId,"
			+ " T.terminalName, T.pan, T.experyDate, T.de38, T.amountTransaction,"
			+ " T.transactionCurrency, T.reversalAtm) from TransactionValidAtm T where T.matchingSwitch is null"
			+ " and TO_DATE(T.dateTransaction,'ddMMyy') between TO_DATE(:dateDebut, 'ddMMyy') and TO_DATE(:dateFin, 'ddMMyy')"
			+ " and T.pan like %:cardNumber% and T.de38 like %:authCode%"
			+ " and T.reversal like %:mti% and amountTransaction!=0.0 and T.fiid_issuer = :bank")
	List<TransactionValidAtmDto> getNotMatchedSwitchTransactionAtm( String dateDebut,String dateFin, String cardNumber,
			String mti, String authCode,String bank);

	@Modifying
	@Transactional
	@Query("DELETE FROM TransactionValidAtm s WHERE s.summaryCode = :summaryCode")
	void deleteBySummaryCode(@Param("summaryCode") Integer summaryCode);

	
	@Query("SELECT A FROM  TransactionValidAtm A where (:reversal is null or reversal like  %:reversal%) "
			+ "and (:pan is null or pan like %:pan%) and (:de38 is null or de38 like %:de38%) "
			+ "and (:fiid_acqu is null or fiid_acqu like %:fiid_acqu%) and (:fiid_issuer is null or fiid_issuer like %:fiid_issuer%)"
			+ " and (:dateTransaction is null or dateTransaction like %:dateTransaction% ) "
			+ "and matchingVisa is null ")
	public Page<TransactionValidAtm> notmatchingVisaATM(Pageable pageable, String reversal,
			String pan,String de38 ,String fiid_acqu,String fiid_issuer,String dateTransaction);
	@Query("SELECT A FROM  TransactionValidAtm A where A.matchingVisa is null  ")
public List<TransactionValidAtm> validATMnonMatchee();

	

//	@Query("select sum(amountTransaction) from TransactionValidAtm "
//		       + "where reversalAtm is null "
//		       + "and TO_DATE(dateTransaction, 'DDMMYY') between TO_DATE(:dateInf, 'DDMMYY') and TO_DATE(:dateSup, 'DDMMYY') "
//		       + "and terminalId = :affiliation "
//		       + " and ((TO_DATE(dateTransaction, 'DDMMYY') = TO_DATE(:dateInf, 'DDMMYY') and heureTransaction > :heureDebut)" 
//		       + " or (TO_DATE(dateTransaction, 'DDMMYY') > TO_DATE(:dateInf, 'DDMMYY') and TO_DATE(dateTransaction, 'DDMMYY') < TO_DATE(:dateSup, 'DDMMYY')) " 
//		       + " or (TO_DATE(dateTransaction, 'DDMMYY') = TO_DATE(:dateSup, 'DDMMYY') and heureTransaction <= :heureFin))")
//	Double sumTransactionAmount(String  affiliation,String dateInf,String dateSup, String heureDebut, String heureFin);
//	@Query(" select new com.mss.unified.dto.TransactionValidAtmDtoApi(pan, dateTransaction, amountTransaction,"
//			+ " de38, terminalId, heureTransaction, sequenceNumber)"
//			+ " from TransactionValidAtm where"
//			+ " reversalAtm is null"
//			+ " and TO_DATE(dateTransaction, 'DDMMYY') between TO_DATE(:dateInf, 'DDMMYY') and ( TO_DATE(:dateSup, 'DDMMYY') )"
//			+ " and terminalId =:affiliation"
//			+ " and ((TO_DATE(dateTransaction, 'DDMMYY') = TO_DATE(:dateInf, 'DDMMYY') and heureTransaction > :heureDebut)" 
//		    + " or (TO_DATE(dateTransaction, 'DDMMYY') > TO_DATE(:dateInf, 'DDMMYY') and TO_DATE(dateTransaction, 'DDMMYY') < TO_DATE(:dateSup, 'DDMMYY')) " 
//		    + " or (TO_DATE(dateTransaction, 'DDMMYY') = TO_DATE(:dateSup, 'DDMMYY') and heureTransaction <= :heureFin))")
//	List<TransactionValidAtmDtoApi> detailsTransactionAmount(String  affiliation,String dateInf,String dateSup, String heureDebut, String heureFin);
	
	@Query("SELECT t FROM TransactionValidAtm t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence")
	List<TransactionValidAtm> findByPanAndDe38AndDateTransactionAndExtourneAndAccountNum(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);

	@Query("SELECT t FROM TransactionValidAtm t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence")
	List<TransactionValidAtm> findByPanAndDe38AndDateTransactionAndAccountNum(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);

	@Query("SELECT t FROM TransactionValidAtm t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence")
	Page<TransactionValidAtm> findByPanAndDe38AndDateTransactionAndExtourneAndAccountNum(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidAtm t,Card c WHERE "
	        + " t.pan LIKE %:pan%  and t.pan = c.cardNum "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence ")

	Page<TransactionValidAtm> findByPanAndDe38AndDateTransactionAndExtourne(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidAtm t,Card c WHERE "
	        + " t.pan LIKE %:pan% and t.pan = c.cardNum  "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND t.extourne = :extourne "
	        + "AND c.agencyCode = :codeAgence ")

	List<TransactionValidAtm> findByPanAndDe38AndDateTransactionAndExtourne(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("extourne") String extourne,
	    @Param("codeAgence") String codeAgence
	);

	@Query("SELECT t FROM TransactionValidAtm t, Card c, Account A WHERE "
	        + "t.pan = c.cardNum AND c.accCode = A.accountCode "
	        + "AND A.accountNum LIKE %:accountNum% "
	        + "AND t.pan LIKE %:pan% "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence")
	Page<TransactionValidAtm> findByPanAndDe38AndDateTransactionAndAccountNum(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("accountNum") String accountNum,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidAtm t,Card c WHERE "
	        
	        + " t.pan LIKE %:pan%  and t.pan = c.cardNum  "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence ")
	Page<TransactionValidAtm> findByPanAndDe38AndDateTransaction(Pageable page,
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("codeAgence") String codeAgence
	);
	@Query("SELECT t FROM TransactionValidAtm t, Card c WHERE "
	        
	        + " t.pan LIKE %:pan% and t.pan = c.cardNum  "
	        + "AND t.de38 LIKE %:de38% "
	        + "AND t.dateTransaction LIKE %:dateTransaction% "
	        + "AND c.agencyCode = :codeAgence ")
		List<TransactionValidAtm> findByPanAndDe38AndDateTransaction(
	    @Param("pan") String pan,
	    @Param("de38") String de38,
	    @Param("dateTransaction") String dateTransaction,
	    @Param("codeAgence") String codeAgence
	);
}

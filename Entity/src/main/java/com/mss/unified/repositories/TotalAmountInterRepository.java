package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.TotalAmountSettlementInter;
import com.mss.unified.entities.TotalVisa;
import com.mss.unified.references.Recap;
import com.mss.unified.references.RecapInter;

public interface TotalAmountInterRepository extends JpaRepository<TotalAmountSettlementInter, Integer> {

	@Transactional
	@Modifying
	@Query("delete from TotalAmountSettlementInter A where A.dateSet=:fileDate ")
	void deleteByFileDate(String fileDate);
	@Transactional
	@Modifying
	@Query("delete from TotalAmountSettlementInter A where A.dateSet=:fileDate  and cat in :cats")
	void deleteByFileDateAndCategoryIn(String fileDate,List<String> cats);
	@Query("select  A from TotalAmountSettlementInter A where A.dateSet in :fileDate  and cat in :cats")
	List<TotalAmountSettlementInter> findByFileDateInAndCategoryIn(List<String> fileDate,List<String> cats);

	@Transactional
	@Modifying
	@Query("delete from TotalAmountSettlementInter A where A.dateSet=:fileDate  and cat  not in :cats")
	void deleteByFileDateAndCategoryNotIn(String fileDate,List<String> cats);

	@Query("select A from TotalAmountSettlementInter A where A.dateSet=:fileDate ")
	List<TotalAmountSettlementInter> findByFileDate(String fileDate);
	@Query("select A from TotalAmountSettlementInter A where A.dateSet=:fileDate and cat like %:cat% ")
	List<TotalAmountSettlementInter> findByFileDateAndCat(String fileDate,String cat);

	//---- single message fren n rec

	//	@Query("select    A   from DayOperationInternationalH A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file")
//	Optional<List<Object>> getSumByIdentifList(String file,List<String> identificaions);
	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.transactionAmount)  ,count(*) as nb ,A.currencyCodeSettlement ,'788'  )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement  ")
	Optional<RecapInter> getSumByIdentifList(String file,List<String> identificaions);

	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.completedAmtSettlement/A.conversionRateSettlementToTnd)  ,count(*) as nb ,A.currencyCodeSettlement ,'788'  )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement  ")
	Optional<RecapInter> getSumByIdentifListforAccess(String file,List<String> identificaions);


	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,0.0  ,count(*) as nb ,A.currencyCodeSettlement ,'788'  )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement   ")
	List<RecapInter> getSumByIdentifLists(String file,List<String> identificaions);
	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,0.0 ,count(*) as nb ,A.currencyCodeSettlement ,'788' )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement  ")
	List<RecapInter> getSumByIdentifListswithoutTransaction(String file,List<String> identificaions);


	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.transactionAmount) ,count(*) as nb ,A.currencyCodeSettlement ,'788' )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement  ")
	List<RecapInter> getSumByIdentifListswithoutTransactionWithdraw(String file,List<String> identificaions);
	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.completedAmtSettlement/A.conversionRateSettlementToTnd) ,count(*) as nb ,A.currencyCodeSettlement ,'788' )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement  ")
	List<RecapInter> getSumForAccesFee(String file,List<String> identificaions);

	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.transactionAmount)  ,count(*) as nb ,A.currencyCodeSettlement ,'788' )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file and A.completedAmtSettlement!=0 group by  A.currencyCodeSettlement  ")
	List<RecapInter> getSumByIdentifListswithoutzero(String file,List<String> identificaions);

	// -----------
	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.transactionAmount)  ,count(*) as nb ,A.currencyCodeSettlement ,'788' )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement  ")
	List<RecapInter> getSumByIdentifListswithoutTransactionVisa(String file,List<String> identificaions);
	@Query("select    new com.mss.unified.references.RecapInter( sum(A.completedAmtSettlement) ,sum(A.transactionAmount)  ,count(*) as nb ,A.currencyCodeSettlement ,A.currencyCodeTransaction )   from DayOperationInternational A,OperationCodeCommision B  where A.typeOperation=B.code and B.identification in :identificaions and A.fileDate=:file group by  A.currencyCodeSettlement,A.currencyCodeTransaction  ")
	List<RecapInter> getSumByIdentifListswithoutTransactionVisaT(String file,List<String> identificaions);

	@Query("select    new com.mss.unified.references.RecapInter( SUM(CAST(A.secondAmount AS double)) ,0.0 ,count(*) as nb ,'840' ,'840' )   from TotalVisa A  where A.businessMode=1 and A.clearingCurrencyCode in ('840','788','978' ) and A.settlementCurrencyCode='840' and summaryLevel=10 "
			+ " and reportingForSreIdentifier=fundsTransferSreIdentifier and reversalIndicator='N' and businessTransactionType='100' and summaryCode=:summuryCode   group by  A.settlementCurrencyCode  ")
	RecapInter findTotalAmountSett(Integer summuryCode);

 


}

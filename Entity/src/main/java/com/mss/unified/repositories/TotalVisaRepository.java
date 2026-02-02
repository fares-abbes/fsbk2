package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.TotalVisa;
import com.mss.unified.entities.VisaV2;

@Repository
public interface TotalVisaRepository extends JpaRepository<TotalVisa, Integer> {
	
	@Modifying
	@Transactional
	@Query("DELETE FROM TotalVisa CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);

    @Query("SELECT t FROM TotalVisa t " +
           "WHERE  t.summaryCode = :summary and   t.summaryCode = :summary and t.businessTransactionType = '100' " +
           "AND t.businessMode = 2 " +
           "AND t.reportIdentificationNumber = '130' " +
           "AND t.settlementCurrencyCode = '978' " +
           "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
           "AND t.summaryLevel = '05'")
    Optional<TotalVisa>  getTotalPurchaseEmissionEUR(@Param("summary") Integer summary);
    @Query("SELECT t FROM TotalVisa t " +
      		 "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '120' " +
      		 "AND t.businessMode = 2 " +
      		 "AND t.reportIdentificationNumber = '130' " +
      		 "AND t.settlementCurrencyCode = '978' " +
      		 "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier AND t.summaryLevel = '05'" )
       Optional<TotalVisa>  getTotalEmissionCASICASHEUR(@Param("summary") Integer summary);

    @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' and clearingCurrencyCode='788'" +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '120' " +
            "AND t.settlementCurrencyCode = '978' " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
   Optional<TotalVisa>  getTotalWithdrawalEmissionEUR(@Param("summary") Integer summary);
    @Query("SELECT t FROM TotalVisa t " +
    		"WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310'  " +
    		"AND t.businessMode = 2 " +
    		"AND t.reportIdentificationNumber = '130' " +
    		"AND t.settlementCurrencyCode = '978' " +
    		"AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
    		"AND t.summaryLevel = '05'")
    Optional<TotalVisa>  getTotalEmissionWithdrawalInterchangeEUR(@Param("summary") Integer summary);
    
    
    
    
    

    @Query("SELECT t FROM TotalVisa t " +
           "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '330' " +
           "AND t.businessMode = 2 " +
           "AND t.reportIdentificationNumber = '130' " +
           "AND t.settlementCurrencyCode = '978' " +
           "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
           "AND t.summaryLevel = '05'")
   Optional<TotalVisa>  getTotalRefundEmissionOriginalCreditEUR(@Param("summary") Integer summary);

    @Query("SELECT t FROM TotalVisa t " +
           "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '200' " +
           "AND t.businessMode = 2 " +
           "AND t.reportIdentificationNumber = '130' " +
           "AND t.settlementCurrencyCode = '978' " +
           "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
           "AND t.summaryLevel = '05'")
   Optional<TotalVisa>  getTotalRefundEmissionMerchandiseReturnEUR(@Param("summary") Integer summary);

    @Query("SELECT t FROM TotalVisa t " +
           "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '852' " +
           "AND t.businessMode = 2 " +
           "AND t.reportIdentificationNumber = '130' " +
           "AND t.settlementCurrencyCode = '978' " +
           "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
           "AND t.summaryLevel = '05'")
   Optional<TotalVisa>  getTotalBalanceInquiryEmissionEUR(@Param("summary") Integer summary);

    @Query("SELECT  t FROM TotalVisa t " +
           "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '856' " +
           "AND t.businessMode = 2 " +
           "AND t.reportIdentificationNumber = '130' " +
           "AND t.settlementCurrencyCode = '978' " +
           "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
           "AND t.summaryLevel = '05'")
   Optional<TotalVisa>  getTotalAtmDeclineEmissionEUR(@Param("summary") Integer summary);

    @Query("SELECT t FROM VisaV2 t " +
            "WHERE  t.summaryCode = :summary and  t.businessMode = '9' " +
            "AND t.amountType = 'C' " +
            "AND t.reportIdentNumb = '110' " +
            "AND t.reportingSreIdent=t.rollupSreIdent and settCurrencyCode='978'")
   Optional<VisaV2>  getTotalVisaChargeEUR(@Param("summary") Integer summary);
    
    
    
    @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '100' " +
            "AND t.businessMode = 1 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
    Optional<TotalVisa>   getTotalAcquisitionPurchaseUSD(@Param("summary") Integer summary,String currency);
    @Query("SELECT t FROM TotalVisa t " +
    		"WHERE  t.summaryCode = :summary and  t.businessTransactionType = '100' " +
    		"AND t.businessMode = 1 and t.reversalIndicator='N' and t.returnIndicator='Y' " +
    		"AND t.reportIdentificationNumber = '120' " +
    		"AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier ")
    Optional<TotalVisa>    getTotalAcquisitionReversalPurchaseUSD(@Param("summary") Integer summary);

    @Query("SELECT t FROM TotalVisa t " +
    		"WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' " +
    		"AND t.businessMode = 1 AND t.clearingCurrencyCode='788'" +
    		"AND t.reportIdentificationNumber = '120' " +
    		"AND t.settlementCurrencyCode = :currency " +
    		"AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
    		"AND t.summaryLevel = '05'" +
    		"AND t.clearingCurrencyCode = '788' ")
    Optional<TotalVisa>    getTotalAcquisitionWithdrawalUSD(@Param("summary") Integer summary,String currency);
    
    @Query("SELECT t FROM TotalVisa t " +
    		"WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' " +
    		"AND t.businessMode = 1 AND t.clearingCurrencyCode='840'" +
    		"AND t.reportIdentificationNumber = '120' " +
    		"AND t.settlementCurrencyCode = :currency " +
    		"AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
    		"AND t.summaryLevel = '05'")
    Optional<TotalVisa>    getTotalAcqWithdrawalChargeBackUSD(@Param("summary") Integer summary,String currency);
    @Query("SELECT t FROM TotalVisa t " +
    		"WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' " +
    		"AND t.businessMode = 1 " +
    		"AND t.reportIdentificationNumber = '130' " +
    		"AND t.settlementCurrencyCode = :currency " +
    		"AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
    		"AND t.summaryLevel = '05'")
    Optional<TotalVisa>  getTotalAcquisitionRetraisInterUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '330' " +
            "AND t.businessMode = 1 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalAcquisitionRefundOriginalCreditUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '200' " +
            "AND t.businessMode = 1 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalAcquisitionRefundMerchandiseReturnUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '852' " +
            "AND t.businessMode = 1 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalAcquisitionBalanceInquiryUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '856' " +
            "AND t.businessMode = 1 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalAcquisitionAtmDeclineUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.summaryLevel = '02' " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.businessMode = 1 " +
            "AND t.settlementCurrencyCode = '840' " +
            "AND t.reportIdentificationNumber = '130'")
     Optional<TotalVisa>  getTotalAcquisitionVisaChargeUSD(@Param("summary") Integer summary);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '100' " +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionPurchaseUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
             "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '120' " +
             "AND t.businessMode = 2 " +
             "AND t.reportIdentificationNumber = '130' " +
             "AND t.settlementCurrencyCode = :currency " +
             "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier AND t.summaryLevel = '05'" )
     Optional<TotalVisa>  getTotalEmissionCASICASHUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' and clearingCurrencyCode='978'" +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '120' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionWithdrawalUSD(@Param("summary") Integer summary,String currency);
     

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' " +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionWithdrawalInterchangeUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '330' " +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionRefundOriginalCreditUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '200' " +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionRefundMerchandiseReturnUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT  t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '852' " +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode =:currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionBalanceInquiryUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '856' " +
            "AND t.businessMode = 2 " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '05'")
     Optional<TotalVisa>  getTotalEmissionAtmDeclineUSD(@Param("summary") Integer summary,String currency);

     @Query("SELECT t FROM VisaV2 t " +
            "WHERE  t.summaryCode = :summary and  t.businessMode = '9' " +
            "AND t.amountType = 'C' " +
            "AND t.reportIdentNumb = '110' " +
            "AND t.reportingSreIdent=t.rollupSreIdent and settCurrencyCode=:currency")
     Optional<VisaV2>  getTotalEmissionVisaChargeUSD(@Param("summary") Integer summary,String currency);
    @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' " +
            "AND t.businessMode = '1' " +
            "AND t.reportIdentificationNumber = '120' " +
            "AND t.settlementCurrencyCode = :currency   and t.businessTransactionCycle IN ('2','7','8','3') " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier "  )
    Optional<TotalVisa>  getTotalAcquisitionAtmRepresentationSettUSD(@Param("summary") Integer summary,String currency);
    @Query("SELECT t FROM TotalVisa t " +
            "WHERE  t.summaryCode = :summary and  t.businessTransactionType = '310' " +
            "AND t.businessMode = '1' " +
            "AND t.reportIdentificationNumber = '130' " +
            "AND t.settlementCurrencyCode = :currency  and t.businessTransactionCycle IN ('2','7','8','3') " +
            "AND t.reportingForSreIdentifier = t.fundsTransferSreIdentifier " +
            "AND t.summaryLevel = '07'")
    Optional<TotalVisa>  getTotalAcquisitionAtmRepresentationInterUSD(@Param("summary") Integer summary,String currency);
}

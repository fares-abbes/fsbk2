package com.mss.unified.repositories;


import com.mss.unified.entities.Card;
import com.mss.unified.references.CardResponse;
import com.mss.unified.references.CardResponseMobile;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CardRepository  extends JpaRepository< Card,Integer > {
	
	
	
    Optional<Card> findByCardCode(Integer code);
    Optional<Card> findByCardNum(String cardNumber);
    
	@Query("select c from Card c where c.cardNum=:pan and c.agencyCode=:branch")
	Optional<Card> findByCardNumAndBranch(String pan, String branch);
	
    List<Card> findByAccCode(Integer code);

    @Query("select c from Card c where c.accCode in (select a.accountCode from Account a where a.accountNum =:code) and c.cardStatusCode in (2,3) and c.cardStatusCode =:status and c.cardNum like %:pan% ")
    Page<Card> findByAccCodeAndPanAndStatus(Pageable pageable, Integer code, int status, String pan);

    @Query("select c from Card c where c.accCode in (select a.accountCode from Account a where a.accountNum =:code) and c.cardStatusCode in (2,3) and c.cardNum like %:pan% ")
    Page<Card> findByAccCodeAndPanAndwithoutStatus(Pageable pageable, Integer code, String pan);

    @Query("select c from Card c where  c.cardStatusCode in (1,2,3,4,5,6,7,8,9,10) and c.cardStatusCode =:status and c.cardNum like %:pan%  and c.agencyCode like %:agencyCode%")
    Page<Card> findByPanAndStatus(Pageable pageable,int status, String pan,String agencyCode);

    @Query("select c from Card c where  c.cardStatusCode in (1,2,3,4,5,6,7,8,9,10) and c.cardNum like %:pan% and c.agencyCode like %:agencyCode% ")
    Page<Card> findByPanAndwithoutStatus(Pageable pageable,String pan,String agencyCode);
    
    @Query("select c from Card c where c.cardStatusCode=2 and c.cardNum like %:pan%")
    Page<Card> findActiveCards(Pageable pageable,String pan);
    
    
    @Query("select c from Card c where ((c.cardStatusCode=7 and c.cardActionsStatus is null) or (c.cardStatusCode=2 and c.cardActionsStatus=7)) and c.cardNum like %:pan% ")
    Page<Card> getReceivedCardsFromSmt(Pageable pageable,String pan);
    
    @Query("select c from Card c,Program p where c.programeId=p.programCode and c.cardStatusCode=1 and p.currency='012' ")
    List<Card> getNationalCardsForPerso();
    
    @Query("select c from Card c,Program p where c.programeId=p.programCode and c.cardStatusCode=1 and p.currency!='012'")
    List<Card> getInternationalCardsForPerso();
    
    @Query("select c from Card c where c.accCode=:accountCode and c.productCode=:productCode and c.cardStatusCode in (1,2,3,6,7,8,9,10)")
    List<Card> findCardsWithAccCodeAndProd(Integer accountCode,Integer productCode);
    @Query("select c.cardNum,acc.accountNum from Card c ,Account acc where c.accCode=acc.accountCode ")
    List<Object[]> findCardsAndAccounts();
    @Query("select c from Card c,Program p where c.programeId=p.programCode and c.cardStatusCode=2 and c.preDate is not null and p.currency='012'")
    List<Card> getNationalCardsWithPreDate();
    
    @Query("select c from Card c,Program p where c.programeId=p.programCode and c.cardStatusCode=2 and c.preDate is not null and p.currency!='012'")
    List<Card> getInternationalCardsWithPreDate();
    
//    @Query("select c from Card c,Product p where c.productCode=p.productCode and c.cardStatusCode=2 and c.startDate is not null and FORMAT(CONVERT(DATETIME,c.startDate,102),'dd')=:day "
//    		+ "and p.cpTypeCommissionAnniversary='MONTHLY'")
//    List<Card> getCardsWithStartDateByDay(String day);
    
    
    @Query("select c from Card c,Product p where c.productCode=p.productCode and c.cardStatusCode=2 and c.startDate is not null and FORMAT(CONVERT(DATETIME,c.startDate,102),'dd') in :days "
    		+ "and p.cpTypeCommissionAnniversary='MONTHLY'")
    List<Card> getCardsWithStartDateByDay(List<String> days);
    
    
    @Query("select c from Card c,Product p where c.productCode=p.productCode and c.cardStatusCode=2 and c.startDate is not null and FORMAT(CONVERT(DATETIME,c.startDate,102),'dd/MM') in :days "
    		+ "and p.cpTypeCommissionAnniversary='ANNUAL'")
    List<Card> getCardsWithStartDateByDayAndMonth(List<String> days);
    
    @Query("select c.accCode from Card c where c.cardNum = ?1 and ROWNUM=1")
    int findAccountByCardCode(String cardCode);
    
    
   

    @Query(nativeQuery = true, value = "select * from PORTEUR.CARD fetch first 10 rows only ")
    List<Card> findFirst10elements();

    //    List<Card> findAll(double price, Pageable pageable);

    List<Card> findByRevProductCode(Integer productCode);
    
    @Query("select c from Card c,Account a where c.accCode=a.accountCode and c.cardStatusCode=2 and c.cardNum like %:pan% and c.agencyCode like %:codeAgence% and a.accountNum like %:accountNumber%")
    List<Card> findCardsForComplaints(String pan,String codeAgence,String accountNumber);

    @Query("select c from Card c where c.accCode in (select a.accountCode from Account a where a.accountNum like ?1) and c.cardStatusCode in (2,3)")
    List<Card> findByAccountNumber(String accountNumber);
    
    @Query("select c from Card c,CardHistory ch, Program p where c.cardCode=ch.cardCode and c.programeId=p.programCode and c.cardStatusCode=10 and c.agencyCode =:agencyCode and ch.operation='Carte reçue en agence' and DATEDIFF(day,ch.operation_date,GETDATE()) >= p.daysNumberBeforeObliterate")
    Page<Card> getCardsForObliteration(Pageable pageable,String agencyCode);
    
    @Query("select c from Card c where c.cardStatusCode=2 and c.cardActionsStatus=6 and c.lastEmbossingSummaryFile like 'EI%' and c.agencyCode like %:agencyCode% ")
    Page<Card> getCardsForReeditionPin(Pageable pageable,String agencyCode);

	@Query("select c.cardName,c.cardNum, cst.status,cu.customerAddress,c.agencyCode,a.accountNum, "
			+ "c.startDate,c.modifDate,c.expiryDate, c.isFromMobile "
			+ "from Card c, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and cu.radical like %:radical% "
			+ "and a.accountNum like %:accountNum% "
			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	List<Object[]> reporting(String name, String pan, String cardStatus,String address,String agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String radical,Boolean isFromMobile);

	
	@Query("select c.cardName,c.cardNum, cst.status,cu.customerAddress,c.agencyCode,a.accountNum, "
			+ "c.startDate,c.modifDate,c.expiryDate "
			+ "from Card c, Account a, Customer cu, CardStatus cst,CardHistory ch,Program p where "
			+ "c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardCode=ch.cardCode and c.programeId=p.programCode "
			+ "and c.cardStatusCode=10 "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and ch.operation='Carte reçue en agence' "
			+ "and DATEDIFF(day,ch.operation_date,GETDATE()) >= p.daysNumberBeforeObliterate"
			)
	List<Object[]> reportingCardsToDelete(String agencyCode);

	
	
	@Query("select c.cardName,c.cardNum,c.cardStatusCode,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.cardCode, c.persoStatus, c.firtPositionCode, c.secondPositionCode, c.thirdPositionCode, c.programeId, cst.status, op.motifOpposition, cst.statusFr, c.pinTryLimit, cu.radical, c.cardActionsStatus, c.lastEmbossingSummaryFile, c.isFromMobile "
			+ "from Card c left join OpposedCard op on c.cardCode=op.cardCode, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and a.accountNum like %:accountNum% "
			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	Page<Object[]> reporting(Pageable pageable,String name, String pan, String cardStatus,String address,String agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String radical,Boolean isFromMobile);

	
	@Query("select c.cardName,c.cardNum,c.cardStatusCode,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.cardCode, c.persoStatus, c.firtPositionCode, c.secondPositionCode, c.thirdPositionCode, c.programeId, cst.status, op.motifOpposition, cst.statusFr, c.pinTryLimit, cu.radical, c.cardActionsStatus, c.lastEmbossingSummaryFile, c.isFromMobile "
			+ "from Card c left join OpposedCard op on c.cardCode=op.cardCode, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and a.accountCode=:accountCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and a.accountNum like %:accountNum% "
			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	Page<Object[]> reportingByAccountCode(Pageable pageable,String name, String pan, String cardStatus,String address,String agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,Integer accountCode,String radical,Boolean isFromMobile);

	@Query("select c.cardName,c.cardNum,c.cardStatusCode,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.cardCode, c.persoStatus, c.firtPositionCode, c.secondPositionCode, c.thirdPositionCode, c.programeId, cst.status, op.motifOpposition, cst.statusFr, c.pinTryLimit, cu.radical, c.cardActionsStatus, c.lastEmbossingSummaryFile, c.isFromMobile "
			+ "from Card c left join OpposedCard op on c.cardCode=op.cardCode, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and a.accountCode=:accountCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and a.accountNum like %:accountNum% "
			+ "and c.startDate between FORMAT(CONVERT(DATETIME,:startDate,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') "

//			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	Page<Object[]> reportinWithInervalByAccountCode(Pageable pageable,String name, String pan, String cardStatus,String address,String agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String date2,Integer accountCode,String radical,Boolean isFromMobile);


	@Query("select c.cardName,c.cardNum,c.cardStatusCode,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.cardCode, c.persoStatus, c.firtPositionCode, c.secondPositionCode, c.thirdPositionCode, c.programeId, cst.status, op.motifOpposition, cst.statusFr, c.pinTryLimit, cu.radical, c.cardActionsStatus, c.lastEmbossingSummaryFile, c.isFromMobile "
			+ "from Card c left join OpposedCard op on c.cardCode=op.cardCode, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and a.accountNum like %:accountNum% "
			+ "and c.startDate between FORMAT(CONVERT(DATETIME,:startDate,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') "

//			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	Page<Object[]> reportinWithInerval(Pageable pageable,String name, String pan, String cardStatus,String address,String agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String date2,String radical,Boolean isFromMobile);

	
	@Query("select c.cardName,c.cardNum, cst.status,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.isFromMobile "
			+ "from Card c, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode like %:agencyCode% "
			+ "and a.accountNum like %:accountNum% "
			+ "and c.startDate between FORMAT(CONVERT(DATETIME,:startDate,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') "

//			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	List<Object[]> reportinWithInerval(String name, String pan, String cardStatus,String address,String agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String date2,String radical,Boolean isFromMobile);

	@Query("select c.cardName,c.cardNum,c.cardStatusCode,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.cardCode, c.persoStatus, c.firtPositionCode, c.secondPositionCode, c.thirdPositionCode, c.programeId, cst.status, op.motifOpposition, cst.statusFr, c.pinTryLimit, cu.radical, c.cardActionsStatus, c.lastEmbossingSummaryFile, c.isFromMobile "
			+ "from Card c left join OpposedCard op on c.cardCode=op.cardCode, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode in :agencyCode "
			+ "and a.accountNum like %:accountNum% "
			+ "and c.startDate between FORMAT(CONVERT(DATETIME,:startDate,102),'yyyy/MM/dd HH:mm:ss') and FORMAT(CONVERT(DATETIME,:date2,102),'yyyy/MM/dd HH:mm:ss') "

//			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	Page<Object[]> reportinWithInervalWithAgenciesList(Pageable pageable,String name, String pan, String cardStatus,String address,List<String> agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String date2,String radical,Boolean isFromMobile);

	@Query("select c.cardName,c.cardNum,c.cardStatusCode,cu.customerAddress,c.agencyCode,a.accountNum,"
			+ "c.startDate,c.modifDate,c.expiryDate, c.cardCode, c.persoStatus, c.firtPositionCode, c.secondPositionCode, c.thirdPositionCode, c.programeId, cst.status, op.motifOpposition, cst.statusFr, c.pinTryLimit, cu.radical, c.cardActionsStatus, c.lastEmbossingSummaryFile, c.isFromMobile "
			+ "from Card c left join OpposedCard op on c.cardCode=op.cardCode, Account a, Customer cu, CardStatus cst where c.accCode=a.accountCode and a.customerCode=cu.customerCode and c.cardStatusCode=cst.cardStatusCode "
			+ "and c.cardName like %:name% "
			+ "and c.cardNum like %:pan% "
			+ "and CAST(c.cardStatusCode AS string) like %:cardStatus "
			+ "and cu.customerAddress like %:address% "
			+ "and cu.radical like %:radical% "
			+ "and c.agencyCode in :agencyCode "
			+ "and a.accountNum like %:accountNum% "
			+ "and CAST(c.startDate AS string) like %:startDate% "
			+ "and CAST(c.expiryDate AS string) like %:expiryDate% "
			+ "and CAST(c.modifDate AS string) like %:modifDate% "
			+ "AND (:isFromMobile IS NULL OR c.isFromMobile =:isFromMobile )")
	Page<Object[]> reportingWithAgenciesList(Pageable pageable,String name, String pan, String cardStatus,String address,List<String> agencyCode,String accountNum,String startDate,String expiryDate,String modifDate,String radical,Boolean isFromMobile);

	  @Query("select new com.mss.unified.references.CardResponse(c.expiryDate, c.cardNum, c.globalRiskCode, c.cardStatusCode, c.productCode, c.programeId) from Card c where c.accCode in (select a.accountCode from Account a where a.accountNum like ?1)")
	   List<CardResponse> findAllByAccountNumber(String accountNumber);
	   
	  @Query("select new com.mss.unified.references.CardResponseMobile(c.expiryDate, c.cardNum, c.globalRiskCode, c.cardStatusCode, c.productCode, c.programeId, c.cardCode, c.cardName, c.accCode) from Card c where c.accCode in (select a.accountCode from Account a where a.customerCode in ( select u.customerCode from Customer u where u.radical = ?1))")
	   List<CardResponseMobile> findAllByRadical(String accountNumber);
	  
	   List<CardResponse> findExpiryDateAndCardNumAndGlobalRiskCodeAndCardStatusCodeAndProductCodeAndProgrameIdByAccCode(Integer code);

//		@Query("select a.customerCode from Card c, Account a, EpaymentInfo e"
//				+ " where c.accCode=a.accountCode and e.cardNum = c.cardNum"
//				+ " and a.accountNum = :accountNum and REPLACE(e.phoneNumber, ' ', '') = phoneNumber")
//	   List<String> findCardNumByAccCode(String accountNum, String phoneNumber);  
	
}

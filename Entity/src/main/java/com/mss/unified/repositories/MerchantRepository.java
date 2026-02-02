package com.mss.unified.repositories;

import com.mss.unified.entities.AtmMerchant;
import com.mss.unified.entities.Merchant;
import com.mss.unified.entities.PosModel;
import com.mss.unified.entities.PosTerminal;
import com.mss.unified.projection.MerchantAccountribDto;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface MerchantRepository extends JpaRepository <Merchant, Integer> {
    Optional<Merchant> findByMerchantId(String id);
    
    Merchant findByMerchantCode(Integer id);
    boolean existsByMerchantId(String id);
    boolean existsByMerchantLibelle(String libelle);
    Merchant findByMerchantLibelle(String libelle);
    boolean existsByPhone(String phone);
    Merchant findByPhone(String  phone);
    @Query("SELECT m FROM Merchant m where m.account=:account")
    Merchant findByAccount(int  account);
    
    @Query("SELECT m FROM Merchant m where m.account=:account and m.merchantStatus!='4'")
    Merchant findByNumAccount(int  account);
    
    @Query("SELECT m FROM Merchant m where m.merchantStatus!='4' and m.mcc!='6011' or m.mcc is null")
    List<Merchant> findByMerchantToTM();
    
    @Query("SELECT m FROM Merchant m where m.account=:account")
    Optional<Merchant> findByAccountNumber(int  account);
    @Query(value = "SELECT current_value FROM sys.sequences where name='merchant_sequence'", nativeQuery =
            true)
    Long getCurrentValue();
    @Query(value = "select next value for pos.merchant_sequence", nativeQuery =
            true)
    Long getNextSeriesId();

    boolean existsBymerchantId(String merchantNumber);

    @Query("SELECT A from Merchant A where A.merchantId=:id")
    Merchant getMerchant(@PathVariable("id") String id);
    
    @Query("select e from Merchant e where e.merchantId like %:merchantId%")
    Optional<Merchant> getMerchantSMT(@Param("merchantId") String merchantId);
    
    @Query("select s from Merchant s,Account a where s.account=a.accountCode and s.merchantLibelle like %:nameMerchant% and s.account =:accountNumber and (s.mcc!='6011' or s.mcc is null) and a.idAgence=:agence")
    Page<Merchant> getPageMerchant(Pageable pageable,String nameMerchant, int accountNumber,int agence);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.account =:accountNumber and (s.mcc!='6011' or s.mcc is null)")
    Page<Merchant> getPageMerchantAccountNum(Pageable pageable,String nameMerchant, int accountNumber);
    
    @Query("select s from Merchant s,Account a where s.account=a.accountCode and s.merchantLibelle like %:nameMerchant% and (s.mcc!='6011' or s.mcc is null) and a.idAgence=:agence")
    Page<Merchant> getPageMerchantAgence(Pageable pageable,String nameMerchant,int agence);
    
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and (s.mcc!='6011' or s.mcc is null)")
    Page<Merchant> getPageMerchant(Pageable pageable,String nameMerchant);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.account =:accountNumber and s.merchantStatus='5' and (s.mcc!='6011' or s.mcc is null)")
    Page<Merchant> getPageMerchantResiliation(Pageable pageable,String nameMerchant, int accountNumber);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.merchantStatus='5' and(s.mcc!='6011' or s.mcc is null)")
    Page<Merchant> getPageMerchantResiliation(Pageable pageable,String nameMerchant);
    
    @Query("select s from Merchant s where s.statusBm is null and (s.mcc!='6011' or s.mcc is null) and s.merchantStatus!='4' ")
    List<Merchant> getListMerchantstausBm();
    
    @Query("select s from Merchant s where s.statusBm='C'")
    List<Merchant> getListMerchantstausBmEgaleC();
    
    @Query("select s from Merchant s where s.merchantStatus='4'and s.statusBs is null")
    List<Merchant> getListMerchantToGenerateBS();
    
    @Query("select s from Merchant s where s.statusBs='A'or s.statusBs='S'")
    List<Merchant> getListMerchantToGenerateBSFile();
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.account =:accountNumber and s.mcc='6011'")
    Page<Merchant> getPageAtmMerchant(Pageable pageable,String nameMerchant, int accountNumber);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.mcc='6011'")
    Page<Merchant> getPageAtmMerchant(Pageable pageable,String nameMerchant);
   
    @Query("SELECT s from Merchant s where s.mcc='6011'")
    List<Merchant> getMerchant6011();
    
    
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.account =:accountNumber and (s.mcc!='6011' or s.mcc is null)")
    List<Merchant> getPageMerchant(String nameMerchant, int accountNumber);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and (s.mcc!='6011' or s.mcc is null)")
    List<Merchant> getPageMerchant(String nameMerchant);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.account =:accountNumber and s.merchantStatus='5' and (s.mcc!='6011' or s.mcc is null)")
    List<Merchant> getPageMerchantResiliation(String nameMerchant, int accountNumber);
    
    @Query("select s from Merchant s where s.merchantLibelle like %:nameMerchant% and s.merchantStatus='5' and(s.mcc!='6011' or s.mcc is null)")
    List<Merchant> getPageMerchantResiliation(String nameMerchant);
    
    @Query("select s from Merchant s where s.mcc!='6011' or s.mcc is null")
    List<Merchant> findlistofMerchantPos();
    
    @Query("select s from Merchant s where s.idContrat like %:idContrat% and (s.merchantStatus='1' or s.merchantStatus='3') and (s.mcc!='6011' or s.mcc is null)")
    Merchant findMerchantByIdContrat(String idContrat);

    // JPQL constructor expression to return DTO with computed accountrib
    @Query("select new com.mss.unified.projection.MerchantAccountribDto(\n" +
           " m.merchantCode,\n" +
           " m.merchantStatus,\n" +
           " m.merchantId,\n" +
           " m.idContrat,\n" +
           " m.merchantLibelle,\n" +
           " m.city,\n" +
           " m.country,\n" +
           " m.codeZip,\n" +
           " m.phone,\n" +
           " m.creationDate,\n" +
           " m.commissionNational,\n" +
           " m.commissionInternational,\n" +
           " m.account,\n" +
           " m.address,\n" +
           " m.offshore,\n" +
           " m.commissionType,\n" +
           " m.statusBm,\n" +
           " m.statusBs,\n" +
           " m.email,\n" +
           " m.commune,\n" +
           " m.daira,\n" +
           " m.codeWilaya,\n" +
           " m.nif,\n" +
           " m.rso,\n" +
           " m.rc,\n" +
           " m.revenue,\n" +
           " m.mcc,\n" +
           " m.siteWeb,\n" +
           " m.detailResiliation,\n" +
           " concat('0', a.accountNum)\n" +
           ")\n" +
           " from Merchant m join Account a on a.accountCode = m.account\n" +
           " where a.accountNum is not null")
    List<MerchantAccountribDto> findAllMerchantAccountribDto();
   
}

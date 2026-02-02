package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionTpe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface CommissionTpeRepository extends JpaRepository<CommissionTpe,Integer> {

    @Query("select c from CommissionTpe c where c.requestCode=:code and c.commissionNational='1' and c.commissionType=2")
    List<CommissionTpe> findByRequestCodeNational( Integer code);
    @Query("select c from CommissionTpe c where c.requestCode=:code and c.commissionInterNational='1' and c.commissionType=2")
    List<CommissionTpe> findByRequestCodeInternational( Integer code);
    
    
    
    
    @Query("select c from CommissionTpe c where c.merchantCode=:code")
    List<CommissionTpe> findByMerchantCode( Integer code);
    
    @Query("select c from CommissionTpe c where c.requestCode=:code and c.commissionType=1")
    CommissionTpe findByRequestCodeComFixes( Integer code);
    @Transactional
    @Modifying
    @Query("delete  from CommissionTpe c where  c.requestCode =:requestCode ")
    void deleteCommissionByRequestCode(Integer requestCode);
    
    @Query("select c from CommissionTpe c where  c.requestCode =:requestCode ")
    List<CommissionTpe> findByRequestCode(Integer requestCode);
    
    @Query("select c from CommissionTpe c where c.merchantCode=:code and c.commissionType=1")
    CommissionTpe findByRequestMerchantCode( Integer code);
    
    @Query("select c from CommissionTpe c where c.merchantCode=:code and c.commissionInterNational='1' and c.commissionType=2")
    List<CommissionTpe> findByMerchantCodeInternational( Integer code);
    
    @Query("select c from CommissionTpe c where c.merchantCode=:code and c.commissionNational='1' and c.commissionType=2")
    List<CommissionTpe> findByMerchantCodeNational( Integer code);
    
    @Transactional
    @Modifying
    @Query("delete  from CommissionTpe c where  c.merchantCode =:merchantCode ")
    void deleteCommissionByMerchantCode(Integer merchantCode);

}


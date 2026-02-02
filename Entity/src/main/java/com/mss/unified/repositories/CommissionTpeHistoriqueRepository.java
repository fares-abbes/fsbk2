package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.CommissionTpe;
import com.mss.unified.entities.CommissionTpeHistorique;

@Repository
public interface CommissionTpeHistoriqueRepository extends JpaRepository<CommissionTpeHistorique,Integer> {

	
	 @Query("select c from CommissionTpeHistorique c where c.requestCode=:code and c.commissionType=1")
	 CommissionTpeHistorique findByRequestCodeComFixes( Integer code);
	 
	    @Query("select c from CommissionTpeHistorique c where c.requestCode=:code and c.commissionNational='1' and c.commissionType=2")
	    List<CommissionTpeHistorique> findByRequestCodeNational( Integer code);
	    @Query("select c from CommissionTpeHistorique c where c.requestCode=:code and c.commissionInterNational='1' and c.commissionType=2")
	    List<CommissionTpeHistorique> findByRequestCodeInternational( Integer code);
	    
	    @Query("select c from CommissionTpeHistorique c where  c.requestCode =:requestCode ")
	    List<CommissionTpeHistorique> findByRequestCode(Integer requestCode);
	    
	    @Transactional
	    @Modifying
	    @Query("delete from CommissionTpeHistorique c where  c.requestCode =:requestCode ")
	    void deleteCommissionHistoriqueByRequestCode(Integer requestCode);
	    
	    

	    @Query("select c from CommissionTpeHistorique c where c.merchantCode=:code")
	    List<CommissionTpeHistorique> findByMerchantCode( Integer code);
	    
	    @Query("select c.requestCode from CommissionTpeHistorique c where c.merchantCode=:code group by c.requestCode")
	    List<Integer> findByGroupeBy( Integer code);
}

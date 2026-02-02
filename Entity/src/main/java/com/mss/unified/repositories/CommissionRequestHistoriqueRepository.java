package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CommissionRequestHistorique;

public interface CommissionRequestHistoriqueRepository extends JpaRepository<CommissionRequestHistorique,Integer> {

	

	 @Query("select c from CommissionRequestHistorique c where c.requestCode=:code and c.commissionType=1")
	 CommissionRequestHistorique findByRequestCodeComFixes( Integer code);
	 
	    @Query("select c from CommissionRequestHistorique c where c.requestCode=:code and c.commissionNational='1' and c.commissionType=2")
	    List<CommissionRequestHistorique> findByRequestCodeNational( Integer code);
	    @Query("select c from CommissionRequestHistorique c where c.requestCode=:code and c.commissionInterNational='1' and c.commissionType=2")
	    List<CommissionRequestHistorique> findByRequestCodeInternational( Integer code);
	    
	    @Query("select c from CommissionRequestHistorique c where  c.requestCode =:requestCode ")
	    List<CommissionRequestHistorique> findByRequestCode(Integer requestCode);
}

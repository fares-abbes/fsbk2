package com.mss.unified.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.AtmMerchant;

public interface AtmMerchantRepository extends JpaRepository <AtmMerchant, Integer> {
	
	   @Query("select s from AtmMerchant s where s.merchantLibelle like %:nameMerchant% and s.numAccount =:accountNumber")
	    Page<AtmMerchant> getPageAtmMerchant(Pageable pageable,String nameMerchant, String accountNumber);
	    
	    @Query("select s from AtmMerchant s where s.merchantLibelle like %:nameMerchant%")
	    Page<AtmMerchant> getPageAtmMerchant(Pageable pageable,String nameMerchant);
	    
	    @Query(value = "select next value for atm.atm_merchant_sequence", nativeQuery =
	            true)
	    Long getNextSeriesId();


}

package com.mss.unified.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.DemandeResetPinOffline;

public interface DemandeResetPinOfflineRepository extends JpaRepository<DemandeResetPinOffline,Integer> {
	
	@Query("select a from DemandeResetPinOffline a where a.cardNumber=:cardNumber and a.status=1")
	Optional<DemandeResetPinOffline> findDemandeResetPinOffline(@Param("cardNumber") String cardNumber);
	
    @Transactional
	@Modifying
	@Query("update DemandeResetPinOffline u set u.status =0,u.modifiedAt=GETDATE() where u.code =:code")
	void updateDemandeResetPinOffline(Integer code);
    
	@Query("select a from DemandeResetPinOffline a where (:cardNumber IS NULL OR a.cardNumber like %:cardNumber% )")
    Page<DemandeResetPinOffline> findAll(Pageable pageable,String cardNumber);
	
}

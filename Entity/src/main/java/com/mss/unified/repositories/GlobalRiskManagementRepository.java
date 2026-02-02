package com.mss.unified.repositories;

import com.mss.unified.entities.GlobalRiskManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface GlobalRiskManagementRepository extends JpaRepository<GlobalRiskManagement, Integer> {
	
	
    @Transactional(rollbackOn = {AsyncRequestTimeoutException.class})
    Optional<GlobalRiskManagement> findByGlobalRiskManagCode(int id);
    
    
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Transactional(rollbackOn = {AsyncRequestTimeoutException.class})
    @Query("select g from GlobalRiskManagement g where g.globalRiskManagCode = ?1")
    Optional<GlobalRiskManagement> findByGlobalRiskManagCodeCMS(int id);

    @Query("select g from GlobalRiskManagement g where concat( g.globalRiskManagCode, '') = (select c.globalRiskCode from Card c where c.cardCode = ?1) ")
    GlobalRiskManagement findByGlobalRiskManagCodeByCardCode(int cardCode);
}

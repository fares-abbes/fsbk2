package com.mss.unified.repositories;

import com.mss.unified.entities.DetailRiskManagment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.async.AsyncRequestTimeoutException;

import javax.persistence.LockModeType;
import javax.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface DetailRiskManagmentRepository extends JpaRepository<DetailRiskManagment, Integer> {
    @Transactional(rollbackOn = {AsyncRequestTimeoutException.class})
    Optional<DetailRiskManagment> findByGlobalCodeAndTransactionCode(int globalRiskCode, String transactionCode);
    
    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Transactional(rollbackOn = {AsyncRequestTimeoutException.class})
    @Query("select d from DetailRiskManagment d where d.globalCode = ?1 and d.transactionCode = ?2")
    Optional<DetailRiskManagment> findByGlobalCodeAndTransactionCodeCMS(int globalRiskCode, String transactionCode);
    
    
    List<DetailRiskManagment> findByGlobalCode(Integer globalCode);


}
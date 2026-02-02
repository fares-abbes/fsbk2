package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.*;

@Repository
public interface OpeningDayMRepository extends JpaRepository<OpeningDayM, Integer> {

    @Transactional
    @Modifying
    @Query("update OpeningDayM u set u.status070 =:status where u.fileIntegration =:fileIntegration")
    void updateStatus070(String fileIntegration, String status);
    
    @Query("select u from OpeningDayM u where u.status070 is null")
    OpeningDayM findForCra();
    
    @Query("select u from OpeningDayM u where u.fileIntegration =:fileIntegration")
    Optional<OpeningDayM> findDoneOpening(String fileIntegration);
    
    @Query("select u from OpeningDayM u where u.status070 is null")
    Optional<OpeningDayM> findByStatus070();
    
    @Query("select u from OpeningDayM u where u.status070 = :status")
    Optional<OpeningDayM> findByStatus070(String status);
    
}

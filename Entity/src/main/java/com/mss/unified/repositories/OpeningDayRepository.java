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
public interface OpeningDayRepository extends JpaRepository<OpeningDay, Integer> {

    @Transactional
    @Modifying
    @Query("update OpeningDay u set u.status040 =:status where u.fileIntegration =:fileIntegration")
    void updateStatus040(String fileIntegration,  String status);
    @Transactional
    @Modifying
    @Query("update OpeningDay u set u.status050 =:status where u.fileIntegration =:fileIntegration")
    void updateStatus050(String fileIntegration,  String status);
    @Transactional
    @Modifying
    @Query("update OpeningDay u set u.status051 =:status where u.fileIntegration =:fileIntegration")
    void updateStatus051(String fileIntegration,  String status);
    
    @Query("select u from OpeningDay u where  u.status040 is null and u.status050 is null and u.status051 is null ")
    OpeningDay findForCra();
    
    @Query("select u from OpeningDay u where u.fileIntegration =:fileIntegration")
    Optional<OpeningDay> findDoneOpening(String fileIntegration);
    @Query("select u from OpeningDay u where u.status040 is null")
    Optional<OpeningDay> findByStatus040();
    @Query("select u from OpeningDay u where u.status050 is null")
    Optional<OpeningDay> findByStatus050();
    @Query("select u from OpeningDay u where u.status051 is null")
    Optional<OpeningDay> findByStatus051();
    @Query("select u from OpeningDay u where u.status051= :status")
    Optional<OpeningDay> findByStatus051(String status);
    @Query("select u from OpeningDay u where u.status050= :status")
    Optional<OpeningDay> findByStatus050(String status);
    @Query("select u from OpeningDay u where u.status040= :status")
    Optional<OpeningDay> findByStatus040(String status);
    
}

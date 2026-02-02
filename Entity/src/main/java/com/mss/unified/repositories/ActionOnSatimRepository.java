package com.mss.unified.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.ActionOnSatim;

public interface ActionOnSatimRepository extends JpaRepository<ActionOnSatim,Integer> {

    @Transactional
	@Modifying
	@Query("update ActionOnSatim u set u.actionStatus =:status,u.actionEndDate=:last where u.keys =:key")
	void updateFinishBatch(String key,Integer status,Date last);
	
   
	Optional<ActionOnSatim> findByKeys(String key);
	
    @Transactional
	@Modifying
	@Query("update ActionOnSatim u set u.actionStatus =:status, u.error=:error,u.actionEndDate=:last, u.errorStackTrace=:errorStackTrace where u.keys =:key")
	void updateStatusAndErrorBatch(String key,Integer status,String error,Date last,String errorStackTrace);
    
}

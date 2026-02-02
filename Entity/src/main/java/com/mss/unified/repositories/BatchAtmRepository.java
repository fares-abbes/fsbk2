package com.mss.unified.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.AtmTerminal;
import com.mss.unified.entities.BatchAtm;

public interface BatchAtmRepository extends JpaRepository<BatchAtm,Integer> {
	@Transactional
	@Modifying
	@Query("update BatchAtm u set u.batchStatus =:status,u.batchEndDate=:last where u.keys =:key")
	void updateFinishBatch(String key,Integer status,Date last);
	
    
	Optional<BatchAtm> findByKeys(String key);
	
	@Modifying
	@Query("update BatchAtm u set u.batchStatus =:status, u.error=:error,u.batchEndDate=:last, u.errorStackTrace=:errorStackTrace where u.keys =:key")
	void updateStatusAndErrorBatch(String key,Integer status,String error,Date last,String errorStackTrace);
    
}

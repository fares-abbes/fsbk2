package com.mss.unified.repositories;

import java.util.Date;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.BatchPos;

@Repository
public interface BatchPosRepository extends JpaRepository<BatchPos,Integer>{
	Optional<BatchPos> findByKeys(String key);
	
    @Transactional
	@Modifying
	@Query("update BatchPos u set u.batchStatus =:status,u.batchEndDate=:last where u.keys =:key")
	void updateFinishBatch(String key,Integer status,Date last);
    
    @Transactional
	@Modifying
	@Query("update BatchPos u set u.batchStatus =:status, u.error=:error,u.batchEndDate=:last, u.errorStackTrace=:errorStackTrace where u.keys =:key")
	void updateStatusAndErrorBatch(String key,Integer status,String error,Date last,String errorStackTrace);
}

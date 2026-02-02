package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.BatchPorteur;

public interface BatchPorteurRepository extends JpaRepository<BatchPorteur,Integer> {

    @Transactional
	@Modifying
	@Query("update BatchPorteur u set u.batchStatus =:status,u.batchEndDate=:last where u.keys =:key")
	void updateFinishBatch(String key,Integer status,Date last);
    
	@Query("select u from BatchPorteur u where u.batchLibelle like '%A2C%'")
	List<BatchPorteur> findVisa();
	@Query("select u from BatchPorteur u where u.batchLibelle not like '%A2C%'")
	List<BatchPorteur> findNotVisa();
	Optional<BatchPorteur> findByKeys(String key);
	
	@Transactional
	@Modifying
	@Query("update BatchPorteur u set u.fileName =:name where u.keys =:key")
	void updateFileName(String key,String name);
	
    @Transactional
	@Modifying
	@Query("update BatchPorteur u set u.batchStatus =:status, u.error=:error,u.batchEndDate=:last, u.errorStackTrace=:errorStackTrace where u.keys =:key")
	void updateStatusAndErrorBatch(String key,Integer status,String error,Date last,String errorStackTrace);
    
    @Transactional
   	@Modifying
   	@Query("update BatchPorteur u set u.batchStatus =:status,u.batchEndDate=:last where u.keys =:key")
   	void updateFinishBatch2(String key,Integer status,Date last);
}

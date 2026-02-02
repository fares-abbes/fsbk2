package com.mss.unified.repositories;

import com.mss.unified.entities.PendingTpe;
import com.mss.unified.entities.PosModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface PendingTpeRepository extends JpaRepository<PendingTpe,Integer> {

	@Query("select s from PendingTpe s where s.serialNum=:serial")
	PendingTpe getOneBySerialNum(String serial);
	
	
	  @Transactional
	    @Modifying
	    @Query("delete  from PendingTpe c where  c.code =:code ")
	    void deletePendingTpe(Integer code);
}

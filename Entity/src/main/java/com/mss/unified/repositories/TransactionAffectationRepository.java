package com.mss.unified.repositories;

import java.util.Vector;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.TransactionAffectation;

@Repository
public interface TransactionAffectationRepository extends PagingAndSortingRepository<TransactionAffectation,String> {
	
	@Query("Select e from TransactionAffectation e Where e.transId.TransAffectConfigId=:configId ")
	public Vector<TransactionAffectation> findTransByConfigId(@Param("configId") String configId);

}

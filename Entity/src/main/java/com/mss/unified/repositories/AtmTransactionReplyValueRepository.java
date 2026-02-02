package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.AtmTransactionReplyValue;

@Repository
public interface AtmTransactionReplyValueRepository extends PagingAndSortingRepository<AtmTransactionReplyValue,String>{
	
	@Query("Select e from AtmTransactionReplyValue e "
			+ "Where e.atmTransactionReplyValueId.transReplyConfigId=:configId and "
			+ "e.atmTransactionReplyValueId.transReplyTransCode=:transCode and "
			+ "e.atmTransactionReplyValueId.transReplyResponseCode=:responseCode and "
			+ "e.atmTransactionReplyValueId.transReplyIndexe=:index")
	public Optional<AtmTransactionReplyValue> findStatandScreenForTrans(@Param("configId") String configId,
			@Param("transCode") String transCode,@Param("responseCode") String responseCode,@Param("index") String index);
	
	
	@Query("Select e from AtmTransactionReplyValue e "
			+ "Where e.atmTransactionReplyValueId.transReplyConfigId=:configId and "
			+ "e.atmTransactionReplyValueId.transReplyTransCode=:transCode and "
			+ "e.atmTransactionReplyValueId.transReplyResponseCode='xx' and "
			+ "e.atmTransactionReplyValueId.transReplyIndexe=:index")
	public Optional<AtmTransactionReplyValue> findStatandScreenForAnyResp(@Param("configId") String configId,
			@Param("transCode") String transCode,@Param("index") String index);

}

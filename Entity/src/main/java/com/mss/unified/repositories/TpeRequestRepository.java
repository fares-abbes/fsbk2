package com.mss.unified.repositories;

import com.mss.unified.entities.TpeRequest;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface TpeRequestRepository extends JpaRepository<TpeRequest,Integer> {
	TpeRequest findByRequestCode(Integer code);

	
	@Query("SELECT r from TpeRequest r where r.userName like %:userName%")	
	List<TpeRequest> findAllByUsername(String userName);
	
	
	@Query("SELECT r from TpeRequest r where r.status=1")	
	List<TpeRequest> findAllTpeRequestLevel1();
	
	@Query("SELECT r from TpeRequest r where r.status=4")	
	List<TpeRequest> findAllTpeRequestLevel2();
	
	@Query("SELECT r from TpeRequest r where r.status=5")	
	List<TpeRequest> findAllTpeRequestLevel3();
	
	@Query("SELECT r from TpeRequest r where r.accountNumber=:accountNumber")	
	List<TpeRequest> findAllByAccountNumber(String accountNumber);
	
	@Query("SELECT r from TpeRequest r where r.accountNumber=:accountNumber and r.status!=6 ")	
	List<TpeRequest> findAllByAccountNumberStatus(String accountNumber);
	
	
}

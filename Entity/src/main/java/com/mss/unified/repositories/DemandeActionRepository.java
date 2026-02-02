package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.domain.Pageable;
import com.mss.unified.entities.DemandeAction;



public interface DemandeActionRepository extends JpaRepository< DemandeAction,Integer > {

	 @Query("select d  from DemandeAction d  where  d.cardNum like %:cardNum% AND  CAST(d.demandeType AS string) like %:type% "
	 		+ "AND  CAST(d.demandeStatusCode AS string) like %:status% and d.branchCode like %:branchCode%  and d.accountNumber like %:accountNumber% order by d.dateDemande desc" )
	  Page<DemandeAction> getAllDemandeAction(Pageable pageable, String cardNum,String type,String status,String branchCode , String accountNumber);
	 
	 @Query("select d  from DemandeAction d  where  d.cardNum like %:cardNum% AND d.demandeStatusCode ='2' order by d.dateDemande desc")
	 Optional<DemandeAction> findProcessingRequestByCardNum( String cardNum);
	
	 @Query("select d  from DemandeAction d  where  d.cardNum like %:cardNum% and d.demandeStatusCode=:demandeStatusCode and d.branchCode like %:branchCode% and d.accountNumber like %:accountNumber% order by d.dateDemande  desc" )
		  Page<DemandeAction> getAllDemandeActionByStatus(Pageable pageable, String cardNum,int demandeStatusCode,String branchCode, String accountNumber);
	 
	 
	 
	 @Query("select d from DemandeAction d where d.accountNumber like %:accountNumber% AND d.demandeStatusCode ='2' order by d.dateDemande desc")
	 Optional<DemandeAction> findProcessingRequestByAccountNum( String accountNumber);
 
}

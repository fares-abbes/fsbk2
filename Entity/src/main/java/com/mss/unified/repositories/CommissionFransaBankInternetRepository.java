package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionAchatInternetFB;
import com.mss.unified.entities.CommissionFransabankOnUs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionFransaBankInternetRepository extends JpaRepository<CommissionAchatInternetFB, Integer> {
   
	

	@Query("SELECT x.bankIssuer  FROM CommissionAchatInternetFB x where x.bankIssuer!=null ")
	List<String> findBankList();
	
	@Query("select A from CommissionAchatInternetFB A where  A.type=:type and A.bankIssuer is null and A.bankAck is null")
    CommissionAchatInternetFB findByType(String type );
    @Query("select A from CommissionAchatInternetFB A where  A.type=:type and A.bankIssuer=:bank ")
    CommissionAchatInternetFB findByTypeIssuer(String type, String bank);
    @Query("select A from CommissionAchatInternetFB A where  A.type=:type  and A.bankAck =:bank ")
    CommissionAchatInternetFB findByTypeAcq(String type, String bank);
    
    @Query("select A from CommissionAchatInternetFB A where  A.type='052' and A.bankIssuer is null and A.bankAck is null")
    List<CommissionAchatInternetFB> getOneCommissionAchatInternetFBfindByType();

}

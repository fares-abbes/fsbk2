package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.SettelementFransaBank;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionFransaBankRepository extends JpaRepository<CommissionFransaBank, Integer> {


	@Query("select A from CommissionFransaBank A where  A.type=:type and A.typeAcqIssuer is null")
	CommissionFransaBank findByType(String type);
	@Query("select A from CommissionFransaBank A where  A.type=:type and A.typeAcqIssuer is null and A.hostORSwitch is null")
	CommissionFransaBank findByTypeForConsultationSolde(String type);
	
	@Query("select A from CommissionFransaBank A where  A.type=:type and A.hostORSwitch='0'")
	CommissionFransaBank findByTypeHost(String type);
	@Query("select A from CommissionFransaBank A where  A.type=:type and A.hostORSwitch='1'")
	CommissionFransaBank findByTypeSwitch(String type);

	@Query("select A from CommissionFransaBank A where  A.typeIssuer=:type and A.typeAcqIssuer is null")
	CommissionFransaBank findByCodeIssuer(String type);

	@Query("select A from CommissionFransaBank A where  A.typeAcq=:type and A.typeAcqIssuer is null")
	CommissionFransaBank findByCodeAcq(String type);

//    @Query("select A from CommissionFransaBank A where  A.type=:type and A.typeAcqIssuer is null and A.comOnus=1")
//    CommissionFransaBank findByTypeOnUsAchat(String type);

	 @Query("select s from CommissionFransaBank s where s.type='050'") 
	 List<CommissionFransaBank> findCommissionFransaBankByCode();

		@Query("SELECT x.typeAcqIssuer  FROM CommissionFransaBank x where x.typeAcqIssuer!=null")
		List<String> findBankList();
		


	@Query("select A from CommissionFransaBank A where  A.typeIssuer=:type and A.typeAcqIssuer is not null")
	List<CommissionFransaBank> findByCodeIssuerNotNUll(String type);

	@Query("select A from CommissionFransaBank A where  A.typeAcq=:type and A.typeAcqIssuer is not null")
	CommissionFransaBank findByCodeAcqNotNUll(String type);

	List<CommissionFransaBank> findByTypeAcqIssuerIsNotNull();

	@Query("select A from CommissionFransaBank A where  A.typeAcq=:type and A.typeAcqIssuer=:bank")
	CommissionFransaBank findByTypeAcq(String type, String bank);

	@Query("select A from CommissionFransaBank A where  A.typeIssuer=:type and A.typeAcqIssuer=:bank")
	CommissionFransaBank findByTypeIssuer(String type, String bank);

	@Query("select A from CommissionFransaBank A where  A.type=:type and A.typeAcqIssuer=:bank")
	CommissionFransaBank findByTypeOnUs(String type, String bank);

	@Query("select A from CommissionFransaBank A where  A.type=:type  and A.typeAcqIssuer is  null")
	List<CommissionFransaBank> findByTypeOnUsIssuerNull(String type);

}

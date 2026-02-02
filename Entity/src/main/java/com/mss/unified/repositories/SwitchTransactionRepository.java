package com.mss.unified.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.SwitchTransaction;
import com.mss.unified.references.OperationsResponse;
import com.mss.unified.references.OperationsResponseMobile;

@Repository
public interface SwitchTransactionRepository extends PagingAndSortingRepository<SwitchTransaction, String> {
	@Query("select t from SwitchTransaction t     where t.switchAcquirerIdenCode='35' and " +
			" ( t.switchProcessingCode like '90%' or   t.switchProcessingCode like '81%' or  t.switchProcessingCode like '01%' or  t.switchProcessingCode like '31%' or  t.switchProcessingCode like '00%' or   t.switchProcessingCode like '50%' or   t.switchProcessingCode like '20%' ) " +
			" and t.switchDE189='ATM' AND t.switchResponseCode='00' "
			+ "and t.switchStatTransaction!='R'   "
			+ "AND t.switchMtiMessage='0100' AND NOT EXISTS ( SELECT 1 from SwitchTransactionT st where st.switchCode=t.switchCode )"
			+ "AND t.switchDE156 is null AND EXISTS (SELECT bouLowBin FROM BinOnUs where bouLowBin=SUBSTRING(t.switchPan,1,len(bouLowBin)))" )
	List<SwitchTransaction>   getAllDayOPTransaction();

	List<OperationsResponse> findBySwitchPanAndSwitchRequestDateGreaterThan(String pan, Date date);

	List<OperationsResponse> findBySwitchAccountId1AndSwitchRequestDateGreaterThan(String accountNum, Date date);

	List<OperationsResponse> findBySwitchPan(String pan);

	List<OperationsResponse> findBySwitchAccountId1(String accountNum);

	Page<OperationsResponse> findBySwitchPanAndSwitchRequestDateGreaterThan(String pan, Date date, Pageable pageable);

	Page<OperationsResponse> findBySwitchAccountId1AndSwitchRequestDateGreaterThan(String accountNum, Date date,
			Pageable pageable);

	Page<OperationsResponse> findBySwitchPan(String pan, Pageable pageable);

	Page<OperationsResponse> findBySwitchAccountId1(String accountNum, Pageable pageable);
	
	@Query("SELECT s FROM SwitchTransaction s WHERE s.switchPan = :pan"
			+ " AND s.switchRequestDate > :sixMonthsAgo AND (" +
		       " s.switchProcessingCode LIKE '00%'" +
		       " OR s.switchProcessingCode LIKE '01%'" +
		       " OR s.switchProcessingCode LIKE '18%'" +
		       " OR s.switchProcessingCode LIKE '50%'" +
		       " OR s.switchProcessingCode LIKE '20%')" +
		       " ORDER BY s.switchRequestDate DESC")
	Page<SwitchTransaction> findBySwitchPanAndSwitchRequestDateGreaterThanAndSwitchProcessingCodeInOrderBySwitchRequestDateDesc(Pageable pageable, String pan, Date sixMonthsAgo);

}

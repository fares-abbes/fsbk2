package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.dto.ChargebackVisaAndSummary;
import com.mss.unified.entities.ChargebackVisa;

@Repository
public interface ChargebackVisaRepository extends JpaRepository<ChargebackVisa, Integer> {
	// In ChargebackVisaRepository.java
	List<ChargebackVisa> findByAcquirerReferenceNumber(String acquirerReferenceNumber);
	@Query("select A from ChargebackVisa A where  transactionCode in ('15','17')  and statusChargeback is null and     (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and (:pan is null or A.accountNumber like %:pan%) and (:codeSummary is null or A.summaryCode=:codeSummary) and not exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	public Page<ChargebackVisa> chargebackRecuVisa(Pageable pageable, String pan, String acquirerReferenceNumber,
			Integer codeSummary);
	@Query("select A from ChargebackVisa A where  transactionCode in ('15','17')  and statusChargeback is null and     (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and (:pan is null or A.accountNumber like %:pan%) and (:codeSummary is null or A.summaryCode=:codeSummary) and not exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	public List<ChargebackVisa> chargebackRecuVisa( String pan, String acquirerReferenceNumber,
			Integer codeSummary);

	@Query("select A from ChargebackVisa A where A.code IN :ids")
	public List<ChargebackVisa> chargeBackAccepted(List<Integer> ids);
	@Query("select A from ChargebackVisa A where A.acquirerReferenceNumber IN :ids and constatation='1'")
	public List<ChargebackVisa> chargeBackAcceptedref(List<String> ids);

	@Query("SELECT A FROM ChargebackVisa A  WHERE   transactionCode in ('15','17')  and   "
			+ "     ( A.statusChargeback in :statusList  OR (:allowNUll =true AND  A.statusChargeback is null) )   and  (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and (:pan is null or A.accountNumber like %:pan%) and (:codeSummary is null or A.summaryCode=:codeSummary) "
			+ "AND NOT EXISTS (SELECT e FROM BinOnUs e WHERE SUBSTRING(A.accountNumber, 1, e.bouLength) BETWEEN e.bouLowBin AND e.bouHighBin)")
	public Page<ChargebackVisa> chargebackRecuVisaAccepted(Pageable pageable, String pan, List<Integer> statusList,
			String acquirerReferenceNumber, Integer codeSummary, boolean allowNUll);
	@Query("SELECT A FROM ChargebackVisa A  WHERE   transactionCode in ('15','17')  and   "
			+ "     ( A.statusChargeback in :statusList  OR (:allowNUll =true AND  A.statusChargeback is null) )   and  (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and (:pan is null or A.accountNumber like %:pan%) and (:codeSummary is null or A.summaryCode=:codeSummary) "
			+ "AND NOT EXISTS (SELECT e FROM BinOnUs e WHERE SUBSTRING(A.accountNumber, 1, e.bouLength) BETWEEN e.bouLowBin AND e.bouHighBin)")
	public List<ChargebackVisa> chargebackRecuVisaAccepted( String pan, List<Integer> statusList,
			String acquirerReferenceNumber, Integer codeSummary, boolean allowNUll);

	@Query("SELECT A FROM ChargebackVisa A  WHERE   transactionCode in ('05','07')  and   "+
			"  (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and "+
			"(:pan is null or A.accountNumber like %:pan%) and (:codeSummary is null or A.summaryCode=:codeSummary) " )
	public Page<ChargebackVisa> representationRecuVisa(Pageable pageable, String pan,  
			String acquirerReferenceNumber, Integer codeSummary );
	
	@Modifying
	@Transactional
	@Query("DELETE FROM ChargebackVisa CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);
	@Query ("select new com.mss.unified.dto.ChargebackVisaAndSummary (chargeback,summary) from   ChargebackVisa  chargeback, VisaSummary summary where chargeback.summaryCode=summary.summaryCode  and code=:code ")
	public ChargebackVisaAndSummary findByCodeAndSummary(int code);

	@Query("select A from ChargebackVisa A where A.acquirerReferenceNumber = :id and constatation='1'")
	Optional<ChargebackVisa> chargeBackAcceptedId(String id);

	@Query("select A from ChargebackVisa A where  transactionCode in ('15','17')  and statusChargeback in :statusList and (:acquirerReferenceNumber is null or A.acquirerReferenceNumber like %:acquirerReferenceNumber%) and (:pan is null or A.accountNumber like %:pan%) and (:codeSummary is null or A.summaryCode=:codeSummary) and not exists (Select e from BinOnUs e Where SUBSTRING(A.accountNumber,1,e.bouLength) between e.bouLowBin AND e.bouHighBin)")
	Page<ChargebackVisa> chargebackRecuVisaTreated(Pageable pageable, String pan, String acquirerReferenceNumber, Integer codeSummary, List<Integer> statusList);

}

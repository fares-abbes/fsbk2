package com.mss.unified.repositories;


import com.mss.unified.entities.VisaDisputeStatusAdvice;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface VisaDisputeStatusAdviceRepository extends JpaRepository<VisaDisputeStatusAdvice, Integer> {
	@Modifying
	@Transactional
	@Query("DELETE FROM VisaDisputeStatusAdvice CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);
	// In VisaDisputeStatusAdviceRepository.java
	List<VisaDisputeStatusAdvice> findByAcquirerReferenceNumber(String acquirerReferenceNumber);
	@Query("select a from VisaDisputeStatusAdvice a where (a.disputeStatus IN (:disputeStatus) )"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	Page<VisaDisputeStatusAdvice> findAllVisaDisputeFiltred(Pageable pageable, List<String> disputeStatus, String authorizationCode,String acquirerReferenceNumber );

	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus = 'F1' and statusChargeback is null"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	Page<VisaDisputeStatusAdvice> findCbVisaEmis(Pageable pageable, String authorizationCode,String acquirerReferenceNumber );

	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus = 'F1' and statusChargeback is null"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	List<VisaDisputeStatusAdvice> findCbVisaEmis(String authorizationCode,String acquirerReferenceNumber );

	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus = 'F1' and statusChargeback is null"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and not exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	Page<VisaDisputeStatusAdvice> findCbVisaRecu(Pageable pageable, String authorizationCode,String acquirerReferenceNumber );

	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus = 'F1' and statusChargeback IN :status"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and not exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	Page<VisaDisputeStatusAdvice> findCbVisaRecuTreated(Pageable pageable, String authorizationCode,String acquirerReferenceNumber, List<Integer> status );
	
	@Query("select a from VisaDisputeStatusAdvice a where (   a.disputeStatus IN (:disputeStatus) ) and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)  and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)   and (a.purchaseDate like %:purchaseDate% or :purchaseDate is null)    ")
	Page<VisaDisputeStatusAdvice> findAllVisaDisputeFiltred(Pageable pageable, List<String> disputeStatus, String authorizationCode,String acquirerReferenceNumber,String purchaseDate );
	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus in ( 'P1','L1','R1','L2','R2')"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	Page<VisaDisputeStatusAdvice> findRepresentationVisaRecu(Pageable pageable, String authorizationCode,String acquirerReferenceNumber );
	
	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus in ( 'P1','L1','R1','L2','R2')"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and not exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	Page<VisaDisputeStatusAdvice> findRepresentationVisaEmis(Pageable pageable, String authorizationCode,String acquirerReferenceNumber);


	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus in ( 'P1','L1','R1','L2','R2')"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and not exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	List<VisaDisputeStatusAdvice> findRepresentationVisaEmis(String authorizationCode,String acquirerReferenceNumber);

	List<VisaDisputeStatusAdvice> findAllByStatusChargebackAndDisputeStatus(Integer statusChargeback, String disputeStatus);

	@Query("select a from VisaDisputeStatusAdvice a where a.disputeStatus in ( 'P1','L1','R1','L2','R2')"
			+ " and (a.authorizationCode like %:authorizationCode% or :authorizationCode is null)"
			+ " and (a.acquirerReferenceNumber like %:acquirerReferenceNumber% or :acquirerReferenceNumber is null)"
			+ " and exists (Select B from BinOnUs B Where SUBSTRING(a.accountNumber,1,B.bouLength) between B.bouLowBin AND B.bouHighBin)")
	List<VisaDisputeStatusAdvice> findRepresentationVisaRecu(String authorizationCode,String acquirerReferenceNumber );


}

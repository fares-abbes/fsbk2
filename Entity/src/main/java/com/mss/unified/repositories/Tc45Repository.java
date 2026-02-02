package com.mss.unified.repositories;


import com.mss.unified.entities.Tc45;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Tc45Repository extends JpaRepository<Tc45,Integer> {

	@Query("select CP FROM Tc45 CP WHERE CP.summaryCode = :summary")
	List<Tc45> findBySummary(@Param("summary") Integer summary);
	@Modifying
	@Transactional
	@Query("DELETE FROM TotalVisa CP WHERE CP.summaryCode = :summary")
	void deleteBySummary(@Param("summary") Integer summary);
	Tc45 findByCardNumberAndRetrievalRefNumberAndTranType(String cardNumber, String retrievalRefNumber, String tranType);

	@Query("SELECT t FROM Tc45 t WHERE t.cardNumber = :cardNumber AND t.retrievalRefNumber = :retrievalRefNumber AND t.tranType = :tranType")
	List<Tc45> findListTcByCardNumberAndRetrievalRefNumberAndTranType(String cardNumber, String retrievalRefNumber, String tranType);

}

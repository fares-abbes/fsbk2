package com.mss.unified.repositories;

import com.mss.unified.entities.ChargeBackHistoryInternational;
import com.mss.unified.enumeration.ChargeBackType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ChargeBackHistoryInterRepository extends JpaRepository<ChargeBackHistoryInternational,Integer> {
    @Query("select A from ChargeBackHistoryInternational A where A.pan like %:cardNum% and A.authCode like %:numAuto% and A.transactionDate like %:dateTran%" +
            " and A.merchantId like %:merchantId% and A.rrn like %:rrn% and (:status is null or A.statusChargeback = :status ) and (:type is null or A.chargeBackType = :type )")
    Page<ChargeBackHistoryInternational> getHistory(Pageable pageable, String cardNum, String numAuto, String dateTran, String merchantId, String rrn,
                                                    Integer status,ChargeBackType type);
    @Query("select A from ChargeBackHistoryInternational A where A.pan like %:cardNum% and A.authCode like %:numAuto% and A.transactionDate like %:dateTran%" +
            " and A.merchantId like %:merchantId% and A.rrn like %:rrn% and (:status is null or A.statusChargeback = :status ) and (:type is null or A.chargeBackType = :type ) ")
    List<ChargeBackHistoryInternational> getHistory(String cardNum, String numAuto, String dateTran, String merchantId, String rrn,
                                                    Integer status,ChargeBackType type);

	@Modifying
	@Transactional
	@Query("DELETE FROM ChargeBackHistoryInternational CP WHERE CP.summaryCodeMCD = :summary")
	void deleteBySummaryIpm(@Param("summary") Integer summary);
	@Modifying
	@Transactional
	@Query("DELETE FROM ChargeBackHistoryInternational CP WHERE CP.summaryCodeVisa = :summary")
	void deleteBySummaryVisa(@Param("summary") Integer summary);


}

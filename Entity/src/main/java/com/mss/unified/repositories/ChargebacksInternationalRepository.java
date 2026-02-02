package com.mss.unified.repositories;

import com.mss.unified.entities.ChargebacksInternational;
import com.mss.unified.enumeration.ChargeBackType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ChargebacksInternationalRepository extends JpaRepository<ChargebacksInternational,Integer> {
    @Query("select A from ChargebacksInternational A where A.pan like %:cardNum% and A.authCode like %:numAuto% and A.transactionDate like %:dateTran%" +
            " and A.merchantId like %:merchantId% and A.rrn like %:rrn% and (:status is null or A.statusChargeback = :status ) and (:type is null or A.chargeBackType = :type )")
    Page<ChargebacksInternational> getHistory(Pageable pageable, String cardNum, String numAuto, String dateTran, String merchantId, String rrn,
                                                    Integer status,ChargeBackType type);
    @Query("select A from ChargebacksInternational A where A.pan like %:cardNum% and A.authCode like %:numAuto% and A.transactionDate like %:dateTran%" +
            " and A.merchantId like %:merchantId% and A.rrn like %:rrn% and (:status is null or A.statusChargeback = :status ) and (:type is null or A.chargeBackType = :type ) ")
    List<ChargebacksInternational> getHistory(String cardNum, String numAuto, String dateTran, String merchantId, String rrn,
                                                    Integer status,ChargeBackType type);

    Optional<ChargebacksInternational> findByRrn(String rrn);
    @Query(" select A from ChargebacksInternational A where  A.statusChargeback='2' ")
    List<ChargebacksInternational> findByStatus( );
    @Query("SELECT A FROM ChargebacksInternational A, Card C WHERE  A.pan = C.cardNum and ((:summaryCode is NULL )or  ( A.summaryCode=:summaryCode) ) and (A.chargeBackType = :type) " +
            " AND ((:nullFilter = true AND A.statusChargeback IS NULL) OR A.statusChargeback IN :listChargeBack) AND (:rrn IS NULL OR A.rrn LIKE %:rrn%) AND (:pan IS NULL OR A.pan LIKE %:pan%)  " +
            "AND EXISTS (SELECT e FROM BinOnUs e WHERE SUBSTRING(A.pan, 1, e.bouLength) BETWEEN e.bouLowBin AND e.bouHighBin) AND (:agencyCode IS NULL OR C.agencyCode IN :agencyCode) AND (A.statusChargeback IN :listChargeBack OR (:nullFilter = false AND A.statusChargeback IS NOT NULL)) " )
    Page<ChargebacksInternational> getAllLChargeBackEmiByFilter(Pageable pageable,String pan, String rrn, Integer summaryCode, List<Integer> listChargeBack, boolean nullFilter, List<String> agencyCode,String type);

    List<ChargebacksInternational> findByArnOrRrn(String arn, String rrn);



}

package com.mss.unified.repositories;

import com.mss.unified.entities.UAP070IN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface UAP070INRepository extends JpaRepository<UAP070IN, Integer>, JpaSpecificationExecutor<UAP070IN> {
    @Query("SELECT  DISTINCT A.dateReglement from UAP070IN A   where   CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today)   ")
    List<String> findDistinctRegDates(String today);
    @Query("SELECT u FROM UAP070IN u WHERE UPPER(u.origin) LIKE UPPER(CONCAT('%', :origin, '%'))")
    List<UAP070IN> findByOriginContainingIgnoreCase(@Param("origin") String origin);

    /**
     * Find all UAP070IN records where dateReglement is null or equals the specified value
     * @param dateReglement The dateReglement value to match (typically empty string "")
     * @return List of UAP070IN records with null or matching dateReglement
     */
    @Query("SELECT u FROM UAP070IN u WHERE u.dateReglement IS NULL OR u.dateReglement = :dateReglement")
    List<UAP070IN> findByDateReglementIsNullOrDateReglementEquals(@Param("dateReglement") String dateReglement);

    /**
     * Find all UAP070IN records by flag value
     * @param flag The flag value to match
     * @return List of UAP070IN records with the specified flag
     */
    List<UAP070IN> findByFlag(String flag);
    /**
     * Find UAP070IN records by origin (case insensitive) where dateReglement is null or empty
     * @param origin The origin value to search for
     * @return List of UAP070IN records matching origin with null/empty dateReglement
     */
    @Query("SELECT u FROM UAP070IN u WHERE UPPER(u.origin) LIKE UPPER(CONCAT('%', :origin, '%')) " +
            "AND (u.dateReglement IS NULL OR u.dateReglement = '')")
    List<UAP070IN> findByOriginContainingIgnoreCaseAndDateReglementIsNullOrEmpty(@Param("origin") String origin);

    /**
     * Find UAP070IN records by origin (case insensitive) where dateReglement is not null/empty and <= today
      * @param todayDate Today's date in yyyyMMdd format
     * @return List of UAP070IN records matching origin with dateReglement <= todayDate
     */
    @Query("SELECT u FROM UAP070IN u WHERE   u.dateReglement IS NOT NULL AND u.dateReglement <> '' " +
            "AND u.dateReglement <= :todayDate")
    List<UAP070IN> findByOriginContainingIgnoreCaseAndDateReglementLessThanOrEqual(
            @Param("todayDate") String todayDate);

    /**
     * Get total amount (sum of montantTransaction) for a specific dateReg
     * @param dateReg The dateReg value to filter by
     * @return Sum of montantTransaction as Long (in cents), or null if no records found
     */
    @Query("SELECT SUM(u.montantSettlement) FROM UAP070IN u WHERE u.dateReglement = :dateReg")
    BigDecimal getTotalAmount(@Param("dateReg") String dateReg);

}

package com.mss.unified.repositories;

import com.mss.unified.entities.UAP070FransaBank;
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
public interface UAP070FransaBankRepository extends JpaRepository<UAP070FransaBank, Integer>, JpaSpecificationExecutor<UAP070FransaBank> {

    @Query("SELECT  DISTINCT A.dateReglement from UAP070FransaBank A    where A.statusTechnique='000' and A.accepted is null and CONVERT(DATE,A.dateReglement)<= CONVERT(DATE,:today) ")
    List<String> findDistinctRegDates(String today);

    @Query("SELECT u FROM UAP070FransaBank u WHERE UPPER(u.origin) LIKE UPPER(CONCAT('%', :origin, '%'))")
    List<UAP070FransaBank> findByOriginContainingIgnoreCase(@Param("origin") String origin);
    
    /**
     * Find all UAP070FransaBank records where dateReglement is null or equals the specified value
     * @param dateReglement The dateReglement value to match (typically empty string "")
     * @return List of UAP070FransaBank records with null or matching dateReglement
     */
    @Query("SELECT u FROM UAP070FransaBank u WHERE u.dateReglement IS NULL OR u.dateReglement = :dateReglement")
    List<UAP070FransaBank> findByDateReglementIsNullOrDateReglementEquals(@Param("dateReglement") String dateReglement);
    /**
     * Find UAP070FransaBank records by origin (case insensitive) where dateReglement is null or empty
     * @param origin The origin value to search for
     * @return List of UAP070FransaBank records matching origin with null/empty dateReglement
     */
    @Query("SELECT u FROM UAP070FransaBank u WHERE UPPER(u.origin) LIKE UPPER(CONCAT('%', :origin, '%')) " +
            "AND (u.dateReglement IS NULL OR u.dateReglement = '')")
    List<UAP070FransaBank> findByOriginContainingIgnoreCaseAndDateReglementIsNullOrEmpty(@Param("origin") String origin);

    /**
     * Find UAP070FransaBank records by origin (case insensitive) where dateReglement is not null/empty and <= today
     * @param origin The origin value to search for
     * @param todayDate Today's date in yyyyMMdd format
     * @return List of UAP070FransaBank records matching origin with dateReglement <= todayDate
     */
    @Query("SELECT u FROM UAP070FransaBank u WHERE " +
            " u.dateReglement IS NOT NULL AND u.dateReglement <> '' " +
            "AND u.dateReglement <= :todayDate")
    List<UAP070FransaBank> findByOriginContainingIgnoreCaseAndDateReglementLessThanOrEqual(

            @Param("todayDate") String todayDate);

    /**
     * Get total amount (sum of montantTransaction) for a specific dateReglement
     * @param dateReglement The dateReglement value to filter by
     * @return Sum of montantTransaction as Long (in cents), or null if no records found
     */
    @Query("SELECT SUM(u.montantSettlement ) FROM UAP070FransaBank u WHERE u.dateReglement = :dateReglement")
    BigDecimal getTotalAmount(@Param("dateReglement") String dateReglement);
}

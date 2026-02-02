package com.mss.unified.repositories;

import com.mss.unified.entities.UAP052IN;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UAP052INRepository extends JpaRepository<UAP052IN, Integer> {
    
    @Query("SELECT u FROM UAP052IN u WHERE u.dateReglement IS NOT NULL AND u.dateReglement <= :date")
    List<UAP052IN> findByDateReglementIsNotNullAndDateReglementLessThanEqual(@Param("date") String date);
    
    @Query("SELECT u FROM UAP052IN u WHERE u.dateReglement IS NULL")
    List<UAP052IN> findByDateReglementIsNull();
    
    // Methods for CHA filtering (exclude transactionOrigine = '040')
    @Query("SELECT u FROM UAP052IN u WHERE u.dateReglement IS NOT NULL AND u.dateReglement <= :dateReglement AND (u.transactionOrigine IS NULL OR u.transactionOrigine <> :transactionOrigine)")
    List<UAP052IN> findByDateReglementIsNotNullAndDateReglementLessThanEqualAndTransactionOrigineNot(
        @Param("dateReglement") String dateReglement, 
        @Param("transactionOrigine") String transactionOrigine
    );
    
    @Query("SELECT u FROM UAP052IN u WHERE u.dateReglement IS NULL AND (u.transactionOrigine IS NULL OR u.transactionOrigine <> :transactionOrigine)")
    List<UAP052IN> findByDateReglementIsNullAndTransactionOrigineNot(
        @Param("transactionOrigine") String transactionOrigine
    );
    
    // Methods for CHR filtering (only transactionOrigine = '040')
    @Query("SELECT u FROM UAP052IN u WHERE u.dateReglement IS NOT NULL AND u.dateReglement <= :dateReglement AND u.transactionOrigine = :transactionOrigine")
    List<UAP052IN> findByDateReglementIsNotNullAndDateReglementLessThanEqualAndTransactionOrigine(
        @Param("dateReglement") String dateReglement, 
        @Param("transactionOrigine") String transactionOrigine
    );
    
    @Query("SELECT u FROM UAP052IN u WHERE u.dateReglement IS NULL AND u.transactionOrigine = :transactionOrigine")
    List<UAP052IN> findByDateReglementIsNullAndTransactionOrigine(
        @Param("transactionOrigine") String transactionOrigine
    );
}

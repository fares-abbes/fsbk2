package com.mss.unified.repositories;

import com.mss.unified.entities.UAP050RFransaBank;
import com.mss.unified.entities.UAP052FransaBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UAP052FransaBankRepository extends JpaRepository<UAP052FransaBank, Integer> {
    @Query("select A from UAP052FransaBank A where ( A.statusTechnique!='000'  or A.statusTechnique is null) and A.fileIntegrationDate=:fileIntegration")
    List<UAP052FransaBank> getListUAPByStatusTechniqueNV(String fileIntegration);

    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NOT NULL AND u.dateReglement <= :date")
    List<UAP052FransaBank> findByDateReglementIsNotNullAndDateReglementLessThanEqual(@Param("date") String date);
    
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NULL")
    List<UAP052FransaBank> findByDateReglementIsNull();
    
    // Methods for CHA filtering (exclude transactionOrigine = '040')
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NOT NULL AND u.dateReglement <= :dateReglement AND (u.transactionOrigine IS NULL OR u.transactionOrigine <> :transactionOrigine)")
    List<UAP052FransaBank> findByDateReglementIsNotNullAndDateReglementLessThanEqualAndTransactionOrigineNot(
        @Param("dateReglement") String dateReglement, 
        @Param("transactionOrigine") String transactionOrigine
    );
    
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NULL AND (u.transactionOrigine IS NULL OR u.transactionOrigine <> :transactionOrigine)")
    List<UAP052FransaBank> findByDateReglementIsNullAndTransactionOrigineNot(
        @Param("transactionOrigine") String transactionOrigine
    );
    
    // Methods for CHR filtering (only transactionOrigine = '040')
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NOT NULL AND u.dateReglement <= :dateReglement AND u.transactionOrigine = :transactionOrigine")
    List<UAP052FransaBank> findByDateReglementIsNotNullAndDateReglementLessThanEqualAndTransactionOrigine(
        @Param("dateReglement") String dateReglement, 
        @Param("transactionOrigine") String transactionOrigine
    );
    
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NULL AND u.transactionOrigine = :transactionOrigine")
    List<UAP052FransaBank> findByDateReglementIsNullAndTransactionOrigine(
        @Param("transactionOrigine") String transactionOrigine
    );
    
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.dateReglement IS NULL OR u.dateReglement = :dateReglement")
    List<UAP052FransaBank> findByDateReglementIsNullOrDateReglementEquals(@Param("dateReglement") String dateReglement);
    
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.fileIntegrationDate = :fileIntegration")
    List<UAP052FransaBank> findByFileIntegrationDate(@Param("fileIntegration") String fileIntegration);
    
    @Query("SELECT u FROM UAP052FransaBank u WHERE u.fileIntegrationDate = :fileIntegration")
    List<UAP052FransaBank> findByFileIntegration(@Param("fileIntegration") String fileIntegration);
}

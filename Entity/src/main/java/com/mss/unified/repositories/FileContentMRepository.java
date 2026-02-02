package com.mss.unified.repositories;

import com.mss.unified.entities.FileContentM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileContentMRepository extends JpaRepository<FileContentM, Integer>, JpaSpecificationExecutor<FileContentM> {
    @Query(value ="SELECT  count(*)     FROM FileContentM ee   GROUP BY ee.referenceTransaction, ee.numAutorisation, ee.ribRipDonneur ,ee.ribRipBeneficiaire     HAVING COUNT(*) > 1" )
    List<Integer> countDuplicate();
    // Find by transaction reference
    Optional<FileContentM> findByReferenceTransaction(String referenceTransaction);
    
    // Find by transaction type
    List<FileContentM> findByTypeTransaction(String typeTransaction);
    
    // Find by date range
    List<FileContentM> findByDateTransaction(String dateTransaction);
    
    // Find by donor phone number
    List<FileContentM> findByNumTelDonneur(String numTelDonneur);
    
    // Find by beneficiary phone number
    List<FileContentM> findByNumTelBeneficiaire(String numTelBeneficiaire);
    
    // Find by authorization number
    Optional<FileContentM> findByNumAutorisation(String numAutorisation);
    
    // Custom query to find transactions by date range and type
    @Query("SELECT m FROM FileContentM m WHERE m.dateTransaction = :date AND m.typeTransaction = :type")
    List<FileContentM> findTransactionsByDateAndType(String date, String type);
    
    // Find chargeback transactions
    List<FileContentM> findByIdChargebackIsNotNull();
    
    // Find by compensation date
    List<FileContentM> findByDateCompensation(String dateCompensation);
    // Find by summary code
    List<FileContentM> findBySummaryCode(Integer summaryCode);
}

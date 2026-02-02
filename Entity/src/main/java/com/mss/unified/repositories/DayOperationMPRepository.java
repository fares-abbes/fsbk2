package com.mss.unified.repositories;

import com.mss.unified.entities.DayOperationMP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface DayOperationMPRepository extends JpaRepository<DayOperationMP, Long> {

    // Find by primary key
    Optional<DayOperationMP> findByIddays(Long iddays);

    // Find by transaction reference number
    Optional<DayOperationMP> findByNumRefTransaction(String numRefTransaction);


    // Find by date transaction
    List<DayOperationMP> findByDateTransaction(String dateTransaction);

    // Find by file date
    List<DayOperationMP> findByFileDate(String fileDate);

    // Find by merchant ID
    List<DayOperationMP> findByIdCommercant(String idCommercant);

    // Find by transaction type
    List<DayOperationMP> findByTypeTransaction(String typeTransaction);

    // Find by done status
    List<DayOperationMP> findByDone(String done);

    // Find unprocessed transactions
    @Query("SELECT d FROM DayOperationMP d WHERE d.done = 'N' OR d.done IS NULL")
    List<DayOperationMP> findUnprocessedTransactions();

    // Find by date range
    @Query("SELECT d FROM DayOperationMP d WHERE d.dateTransaction BETWEEN :startDate AND :endDate")
    List<DayOperationMP> findByDateTransactionBetween(@Param("startDate") String startDate, @Param("endDate") String endDate);

    // Find by amount range
    @Query(
            value = "SELECT * " +
                    "FROM DAY_OPERATION_MP d " +
                    "WHERE TRY_CONVERT(decimal(18,2), d.montant_transaction) BETWEEN :minAmount AND :maxAmount",
            nativeQuery = true
    )
    List<DayOperationMP> findByMontantTransactionBetween(@Param("minAmount") BigDecimal minAmount,
            @Param("maxAmount") BigDecimal maxAmount);

    // Find by a list of identifications
    @Query("SELECT d FROM DayOperationMP d WHERE d.idenficationCode IN :identifications")
    List<DayOperationMP> findByIdentificationsCode(@Param("identifications") List<String> identifications);


    // Find by identification
    @Query("SELECT d FROM DayOperationMP d WHERE d.idenficationCode =:identifications")
    List<DayOperationMP> findByIdentificationCode(String identification);

    // Check if transaction exists by reference
    boolean existsByNumRefTransaction(String numRefTransaction);

    // Find DayOperationMP records joined with SettelementFransaBank filtered by type operation
    @Query("SELECT d FROM DayOperationMP d JOIN SettelementFransaBank s ON d.idenficationCode = s.identificationbh " +
            "WHERE s.typeOperation LIKE %:typeOperationPattern% and d.codeBankAcquereur!=:bank and d.codeBankEmetteur=:bank")
    List<DayOperationMP> findDayOperationMPByTypeOperationPatternEM(@Param("typeOperationPattern") String typeOperationPattern,String bank);
    // Find DayOperationMP records joined with SettelementFransaBank filtered by type operation
    @Query("SELECT d FROM DayOperationMP d JOIN SettelementFransaBank s ON d.idenficationCode = s.identificationbh " +
            "WHERE s.typeOperation LIKE %:typeOperationPattern% and d.codeBankAcquereur=:bank and d.codeBankEmetteur!=:bank")
    List<DayOperationMP> findDayOperationMPByTypeOperationPatternACQ(@Param("typeOperationPattern") String typeOperationPattern,String bank);

}

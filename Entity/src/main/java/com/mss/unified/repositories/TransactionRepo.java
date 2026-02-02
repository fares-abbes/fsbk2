package com.mss.unified.repositories;


import com.mss.unified.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TransactionRepo extends JpaRepository<Transaction, Integer> {

    @Query("select a from Transaction a where a.program.programCode = ?1")
    Optional<List<Transaction>> findByProgramId(Integer program_id);
    
    @Query("select a from Transaction a where a.program.programCode = ?1 and a.type.codeTransaction = ?2")
    Optional<Transaction> findByProgramIdAndTransactionType(Integer program_id,String transactionCode);
}

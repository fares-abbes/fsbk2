package com.mss.unified.repositories;

import com.mss.unified.entities.TransactionType;
import com.mss.unified.entities.TransactionTypeM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionTypesMRepository extends JpaRepository<TransactionTypeM, String>{

}

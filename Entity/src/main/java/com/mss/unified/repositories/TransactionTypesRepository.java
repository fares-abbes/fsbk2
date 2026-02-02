package com.mss.unified.repositories;

import com.mss.unified.entities.AccountStatus;
import com.mss.unified.entities.TransactionType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface TransactionTypesRepository extends JpaRepository<TransactionType, String>{

}

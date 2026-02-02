package com.mss.unified.repositories;

import com.mss.unified.entities.TransactionSource;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceRepository extends JpaRepository<TransactionSource,Integer>{

	Optional<TransactionSource> findByLibelle(String libelle);
}

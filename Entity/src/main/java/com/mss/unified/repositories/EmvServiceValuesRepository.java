package com.mss.unified.repositories;


import com.mss.unified.entities.EmvServiceValues;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface EmvServiceValuesRepository extends JpaRepository<EmvServiceValues,String> {
	Optional<EmvServiceValues> findByCodeTransaction(String codeTransaction);
	EmvServiceValues findByLibelle(String libelle);
}
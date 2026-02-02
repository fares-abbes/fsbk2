package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.OpposedCountry;

public interface OpposedCountryRepository extends JpaRepository<OpposedCountry,String > {
	
	Optional<OpposedCountry> findByOpCountryNumber(long counryCode);
}

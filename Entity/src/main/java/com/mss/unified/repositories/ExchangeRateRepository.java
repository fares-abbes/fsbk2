package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.ExchangeRate;

public interface ExchangeRateRepository extends JpaRepository<ExchangeRate,Integer> {
	
//	Optional<ExchangeRate> findByCurrencyCode(String currencyCode);
	
    @Query("SELECT r from ExchangeRate r where r.currencyBeginCode=:beginCurrency and r.currencyEndCode=:endCurrency")	
	Optional<ExchangeRate> getExchangeRate(String beginCurrency,String endCurrency);
}

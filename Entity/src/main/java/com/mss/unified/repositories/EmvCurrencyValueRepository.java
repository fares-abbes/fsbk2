package com.mss.unified.repositories;


import com.mss.unified.entities.EmvCurrencyValue;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public
interface EmvCurrencyValueRepository  extends JpaRepository<EmvCurrencyValue,String > {
	 Optional<EmvCurrencyValue> findByTransCurrCode(String code);

}

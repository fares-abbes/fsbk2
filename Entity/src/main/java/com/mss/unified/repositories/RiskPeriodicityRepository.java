package com.mss.unified.repositories;


import com.mss.unified.entities.RiskPeriodicity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public
interface RiskPeriodicityRepository extends JpaRepository<RiskPeriodicity,Integer > {
	RiskPeriodicity findByRiskPeriodicityCode(int code);
	List<RiskPeriodicity> findByProgCode(int code);
}

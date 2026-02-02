package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.CommissionSwitch;

public interface CommissionSwitchRepository extends JpaRepository<CommissionSwitch, Long> {
	CommissionSwitch findByTypeTransaction(String typeTransaction);
	 CommissionSwitch findByTypeTransactionAndMinVal(String typeTransaction,String minVal);

}
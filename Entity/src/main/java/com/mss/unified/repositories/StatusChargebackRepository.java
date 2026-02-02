package com.mss.unified.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.StatusChargeback;
@Repository
public interface StatusChargebackRepository extends JpaRepository<StatusChargeback, Integer>{
	StatusChargeback findFirstByLibelle(String libelle);

}

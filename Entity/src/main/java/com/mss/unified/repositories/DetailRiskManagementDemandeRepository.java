package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.DetailRiskManagementDemande;
import com.mss.unified.entities.DetailRiskManagment;


public interface DetailRiskManagementDemandeRepository extends JpaRepository< DetailRiskManagementDemande,Integer >{
	

	
	List<DetailRiskManagementDemande> findByGlobalDemandeCode(Integer globaldemandeCode);
}

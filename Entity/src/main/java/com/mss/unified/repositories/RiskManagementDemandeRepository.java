package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.RiskManagementDemande;

public interface RiskManagementDemandeRepository extends JpaRepository< RiskManagementDemande,Integer > {
	
	   RiskManagementDemande findByDemandeID(int demandeId);

}

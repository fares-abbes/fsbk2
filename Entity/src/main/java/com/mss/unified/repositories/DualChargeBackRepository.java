package com.mss.unified.repositories;

import com.mss.unified.entities.DualChargeBackMessage;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DualChargeBackRepository extends JpaRepository<DualChargeBackMessage, String> {
	
	Page<DualChargeBackMessage> findAll(Pageable pageable);
	Page<DualChargeBackMessage> findByAvecAgence (Pageable pageable,Boolean avecAgence );

	Page<DualChargeBackMessage> findByType(Pageable pageable,String operationcode);
	List<DualChargeBackMessage> findByType(String operationcode);
	Page<DualChargeBackMessage> findByTypeAndAvecAgence(Pageable pageable,String operationcode,Boolean AvecAgence);
	List<DualChargeBackMessage> findByTypeAndAvecAgence(String operationcode,Boolean AvecAgence);

	DualChargeBackMessage findByMotif(String motif);

}

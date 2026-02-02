package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.FamilleCommission;

@Repository
public interface FamilleCommissionRepository extends JpaRepository<FamilleCommission,Integer> {

}

package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.MargeCommission;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface MargeCommissionRepository extends JpaRepository<MargeCommission,Integer>{
	
	Optional<MargeCommission> findByMargekey(String margekey);

}

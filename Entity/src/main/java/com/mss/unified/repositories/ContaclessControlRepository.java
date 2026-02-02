package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.ContaclessControl;

@Repository
public interface ContaclessControlRepository extends JpaRepository<ContaclessControl,Integer>{

	Optional<ContaclessControl> findByProgramId(int progCode);
	
}

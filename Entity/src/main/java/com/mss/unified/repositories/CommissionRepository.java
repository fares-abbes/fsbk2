package com.mss.unified.repositories;

import com.mss.unified.entities.Commission;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionRepository extends JpaRepository<Commission,Integer> {
	List<Commission> findByprogramCode(int code);
}

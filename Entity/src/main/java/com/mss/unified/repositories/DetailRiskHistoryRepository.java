package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.DetailRiskHistory;

@Repository
public interface DetailRiskHistoryRepository extends JpaRepository < DetailRiskHistory, Integer > {
	List<DetailRiskHistory> findByGlobalhistoryCode(int code);
}

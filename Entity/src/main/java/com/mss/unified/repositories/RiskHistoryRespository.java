package com.mss.unified.repositories;


import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.RiskHistory;

@Repository
public interface RiskHistoryRespository extends JpaRepository < RiskHistory, Integer > {

	
	
	Page<RiskHistory> findByCardCode(Pageable pageable,int code);
	Optional<RiskHistory> findByHistoryCode(int code);
}

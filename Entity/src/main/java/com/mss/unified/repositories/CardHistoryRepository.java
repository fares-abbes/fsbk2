package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.CardHistory;

public interface CardHistoryRepository extends JpaRepository<CardHistory, Integer> {
	
  List<CardHistory> findByCardCode(Integer cardCode);
  
}

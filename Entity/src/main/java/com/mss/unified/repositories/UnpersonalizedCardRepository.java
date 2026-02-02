package com.mss.unified.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.mss.unified.entities.UnpersonalizedCard;

public interface UnpersonalizedCardRepository extends JpaRepository<UnpersonalizedCard, Integer> {
	
  
}

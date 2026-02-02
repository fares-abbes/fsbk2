package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.MotifOpposition;

public interface MotifOppositionRepository   extends JpaRepository<MotifOpposition,Integer>{
	
	Optional<MotifOpposition> findByMotifOpposition(String motif);

}

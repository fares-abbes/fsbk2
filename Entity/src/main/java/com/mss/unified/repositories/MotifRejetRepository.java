package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mss.unified.entities.MotifRejet;
import com.mss.unified.entities.UAP040INHistory;
import com.mss.unified.entities.UAP050FransaBankHistory;

public interface MotifRejetRepository extends JpaRepository<MotifRejet, Integer>{

	Optional<MotifRejet>  findByCode(String code);
	
}

package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mss.unified.entities.MontantOutGoingIPM;

public interface MontantOutGoingIPMRepository extends JpaRepository<MontantOutGoingIPM,Integer> {
	Optional<MontantOutGoingIPM>  findByDateInter(String dateInter);
	
	

}

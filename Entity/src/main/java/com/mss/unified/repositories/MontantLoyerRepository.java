package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.MontantLoyer;

@Repository
public interface MontantLoyerRepository extends JpaRepository<MontantLoyer,Integer> {
	@Query("SELECT p FROM MontantLoyer p where p.requestCode=:requestCode")
	MontantLoyer findMontantLoyerByRequest(int requestCode);
	
}

package com.mss.unified.repositories;

import com.mss.unified.entities.Hsm;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HsmRepo extends JpaRepository<Hsm, Integer> {

	
	List<Hsm> findByEnv(String env);
}

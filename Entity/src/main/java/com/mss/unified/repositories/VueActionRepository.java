package com.mss.unified.repositories;

import com.mss.unified.entities.VueAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueActionRepository  extends JpaRepository<VueAction,Integer> {
	boolean existsByLibelle(String libelle);
}

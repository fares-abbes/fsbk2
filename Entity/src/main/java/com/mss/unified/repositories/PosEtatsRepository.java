package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.PosEtats;

@Repository
public interface PosEtatsRepository extends JpaRepository<PosEtats, Integer> {

}

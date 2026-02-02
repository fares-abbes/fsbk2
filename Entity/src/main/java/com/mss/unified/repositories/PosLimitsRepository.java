package com.mss.unified.repositories;

import com.mss.unified.entities.PosLimits;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PosLimitsRepository extends JpaRepository<PosLimits, Integer> {

}

package com.mss.unified.repositories;

import com.mss.unified.entities.ThirdPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThirdPositionRepository extends JpaRepository<ThirdPosition,Integer> {
    Optional<ThirdPosition> findByTpscCode(int tpscCode);
}

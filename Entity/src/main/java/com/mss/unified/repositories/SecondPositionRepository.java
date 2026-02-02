package com.mss.unified.repositories;

import com.mss.unified.entities.SecondPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SecondPositionRepository extends JpaRepository<SecondPosition,Integer> {
    Optional<SecondPosition> findBySpscCode(int spscCode);
}

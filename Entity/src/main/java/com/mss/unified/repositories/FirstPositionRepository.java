package com.mss.unified.repositories;

import com.mss.unified.entities.FirstPosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface FirstPositionRepository extends JpaRepository<FirstPosition,Integer> {
    Optional<FirstPosition> findByFpscCode(int fpcscCode);
}

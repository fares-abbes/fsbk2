package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.BatchExec;

@Repository
public interface BatchExecRepository extends JpaRepository<BatchExec, Long> {
    
}

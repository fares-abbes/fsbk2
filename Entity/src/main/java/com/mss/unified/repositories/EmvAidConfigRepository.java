package com.mss.unified.repositories;

import com.mss.unified.entities.EmvAidConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmvAidConfigRepository extends JpaRepository<EmvAidConfig,Integer> {
}

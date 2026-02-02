package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.UAPFransaBank;
import com.mss.unified.entities.UAPFransaBankRHistory;
@Repository

public interface UAPFransaBankRHistoryRepository extends JpaRepository<UAPFransaBankRHistory, Integer>{
 
}

package com.mss.unified.repositories;

import com.mss.unified.entities.AtmImpressionConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmImpressionConfigurationRepository extends JpaRepository<AtmImpressionConfiguration,Integer> {

}

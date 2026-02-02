package com.mss.unified.repositories;



import com.mss.unified.entities.AtmConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public
interface AtmConfigurationRepository extends JpaRepository<AtmConfiguration,Integer > {
    Optional<AtmConfiguration> findByAtmConNum(int code);
}

package com.mss.unified.repositories;

import com.mss.unified.entities.AtmStatusConfiguration;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public
interface AtmStatusConfigurationRepository extends JpaRepository<AtmStatusConfiguration,Integer > {

	Optional<AtmStatusConfiguration> findByNumStatusApplicationCode(int code);
    @Query("SELECT r from AtmStatusConfiguration r where r.libelleStatusApplication like %:libelleStatusApplication%")
    List<AtmStatusConfiguration> findAllBylibelleStatusApplication(String libelleStatusApplication);
}

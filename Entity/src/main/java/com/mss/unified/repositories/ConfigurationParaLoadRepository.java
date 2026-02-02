package com.mss.unified.repositories;

import com.mss.unified.entities.ConfigurationParaLoad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public
interface ConfigurationParaLoadRepository extends JpaRepository<ConfigurationParaLoad,Integer > {
    Optional<ConfigurationParaLoad> findByAtmConfigParamLoadCode(int code);
}

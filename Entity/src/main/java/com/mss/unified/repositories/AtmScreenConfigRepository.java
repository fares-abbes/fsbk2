package com.mss.unified.repositories;


import com.mss.unified.entities.AtmScreenConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtmScreenConfigRepository  extends JpaRepository<AtmScreenConfig,Integer> {
    Optional<AtmScreenConfig> atmScreenConfigCode(int code);
    @Query("SELECT r from AtmScreenConfig r where r.libelle like %:libelle%")
    List<AtmScreenConfig> findAllByLibelle(String libelle);

}

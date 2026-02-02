package com.mss.unified.repositories;

import com.mss.unified.entities.Routage;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface RoutageRepository extends JpaRepository<Routage,Integer> {
    Routage findByLibelle(String libelle);
    
    Optional <Routage> findByRoutageCode(Integer code);
}

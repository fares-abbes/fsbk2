package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.AtmHardFitness;
import com.mss.unified.entities.AtmSuppliesStatus;

 
@Repository
public interface AtmSuppliesStatusRepository extends JpaRepository<AtmSuppliesStatus, String> {
    Optional<AtmSuppliesStatus> findByAtmSuppliesId(String id);
    
    @Query("SELECT p FROM AtmSuppliesStatus p where p.atmSuppliesId=:code")
  	List<AtmSuppliesStatus> findAtmSuppliesStatus(String code);


}

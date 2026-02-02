package com.mss.unified.repositories;


import com.mss.unified.entities.AtmHardFitness;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtmHardFitnessRepository extends JpaRepository<AtmHardFitness,String > {
    @Query("SELECT r from AtmHardFitness r where r.atmHardFitnessId like %:atmHardFitnessId%")
    List<AtmHardFitness> findAllByAtmHardFitnessId(String atmHardFitnessId);
    
    @Query("SELECT p FROM AtmHardFitness p where p.atmHardFitnessId=:code")
	List<AtmHardFitness> findAtmHardFitness(String code);

}

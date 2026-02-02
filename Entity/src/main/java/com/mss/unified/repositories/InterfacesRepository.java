package com.mss.unified.repositories;

import com.mss.unified.entities.Interfaces;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InterfacesRepository extends JpaRepository<Interfaces,String> {
//    List<Interfaces> findByDateAndLibelle(String data, String libelle);
    Optional<Interfaces> findByLibelle(String libelle);
    
//    Optional<Interfaces> findByDateAndStatus(String date, String status);
//    @Query("select b from Interfaces b where b.date like %:date% ")
//    List<Interfaces> findByDateS(String date);
}
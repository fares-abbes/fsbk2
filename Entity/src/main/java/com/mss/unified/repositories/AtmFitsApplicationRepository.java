package com.mss.unified.repositories;


import com.mss.unified.entities.AtmFitsApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public
interface AtmFitsApplicationRepository  extends JpaRepository<AtmFitsApplication,Integer > {

    Optional<AtmFitsApplication> findByAtmFitsApp(Integer atmFitsApp);
    boolean existsByAtmFitsApp(Integer atmFitsApp);

    @Query("SELECT r from AtmFitsApplication r where r.atmFitsAppLibelle like %:atmFitsAppLibelle%")
    List<AtmFitsApplication> findAllByatmFitsAppLibelle(String atmFitsAppLibelle);
}

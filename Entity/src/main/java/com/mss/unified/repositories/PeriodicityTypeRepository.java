package com.mss.unified.repositories;

import com.mss.unified.entities.Periodicity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface PeriodicityTypeRepository extends JpaRepository<Periodicity, Integer> {

    Periodicity findByLibelle(String libelle);
    Periodicity findByCode(int code);

}

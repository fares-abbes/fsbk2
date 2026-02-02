package com.mss.unified.repositories;

import com.mss.unified.entities.Cvr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CvrRepository extends JpaRepository<Cvr,Integer> {
    Optional<Cvr> findByLibelle(String libelle);
    Optional<Cvr> findByCvrCodee(int code);

}

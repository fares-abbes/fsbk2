package com.mss.unified.repositories;

import com.mss.unified.entities.Tvr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TvrRepository extends JpaRepository<Tvr, Integer> {
    Optional<Tvr> findByLibelle(String libelle);
    Optional<Tvr> findByTvrCode(int code);

}

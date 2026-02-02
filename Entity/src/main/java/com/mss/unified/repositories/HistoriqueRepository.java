package com.mss.unified.repositories;


import com.mss.unified.entities.Historique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public
interface HistoriqueRepository extends JpaRepository<Historique,Integer> {
    boolean existsByAccountCodeAndDate(String accountNumber,String date);
}

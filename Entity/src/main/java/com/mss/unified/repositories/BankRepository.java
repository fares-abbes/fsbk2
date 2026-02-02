package com.mss.unified.repositories;

import com.mss.unified.entities.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BankRepository  extends JpaRepository<Bank,Integer> {
    @Query("SELECT r from Bank r where r.libelle like %:libelle%")
    List<Bank> findAllByLibelle(String libelle);

}

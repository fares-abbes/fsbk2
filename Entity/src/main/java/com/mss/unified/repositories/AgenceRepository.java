package com.mss.unified.repositories;


import com.mss.unified.entities.Agence;
import com.mss.unified.entities.AgenceAdministration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AgenceRepository  extends JpaRepository<Agence,Integer> {
    List<Agence> findByBankCode(String bankCode);
    Agence findByLibelle(String libelle);
    
    @Query("select a from Agence a where a.agenceCode =:code")
    Agence findByCode(int code);
    
}

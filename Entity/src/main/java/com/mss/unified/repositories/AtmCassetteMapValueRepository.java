package com.mss.unified.repositories;


import com.mss.unified.entities.AtmCassetteMapValue;
import com.mss.unified.entities.Card;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public
interface AtmCassetteMapValueRepository extends JpaRepository<AtmCassetteMapValue,Integer > {
    Optional<AtmCassetteMapValue> findByAcmpCode(int code);

    @Query("SELECT r from AtmCassetteMapValue r where r.acmpLibelle like %:acmpLibelle%")
    Page<AtmCassetteMapValue> findAllByacmpLibelle(Pageable pageable,String acmpLibelle);
    
    @Query("SELECT r from AtmCassetteMapValue r where r.acmpLibelle like %:acmpLibelle%")
    List<AtmCassetteMapValue> findAllByacmpLibelle(String acmpLibelle);
    
    
    
     
    
}

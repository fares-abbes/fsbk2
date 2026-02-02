package com.mss.unified.repositories;

import com.mss.unified.entities.AtmCurrencyMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtmCurrencyMappingRepository  extends JpaRepository<AtmCurrencyMapping,Integer> {


    @Query(" SELECT A " +
            "FROM AtmCurrencyMapping as A, EmvCurrency B " +
            "where  A.ecmCode =  B.ecmCode " )
    List<AtmCurrencyMapping> findLibelleCurr();


    AtmCurrencyMapping  findByEcmCode(Integer ecmCode);


    @Query("SELECT r from AtmCurrencyMapping r where r.ecmLibelle like %:ecmLibelle%")
    List<AtmCurrencyMapping> findAllByEcmLibelle(String ecmLibelle);

}

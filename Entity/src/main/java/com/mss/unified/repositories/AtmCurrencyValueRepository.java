package com.mss.unified.repositories;

import com.mss.unified.entities.AtmCurrencyValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AtmCurrencyValueRepository extends JpaRepository<AtmCurrencyValue,String> {
    @Query(" SELECT A " +
            "FROM AtmCurrencyValue as A, EmvCurrency B " +
            "where  A.currCode =  B.currCode " +
            "and B.ecmCode IN (SELECT S.ecmCode from AtmConfiguration S)")
    List<AtmCurrencyValue> findLibelle();

    Optional<AtmCurrencyValue> findByCurrCode(String currCode);

    boolean existsBycurrCode(String currCode);


    Optional<AtmCurrencyValue> getCurrCodeBylibelleDevise(String libelleDevise);


    @Query("SELECT r from AtmCurrencyValue r where r.libelleDevise like %:libelleDevise%")
    List<AtmCurrencyValue> findAllBylibelleDevise(String libelleDevise);
}

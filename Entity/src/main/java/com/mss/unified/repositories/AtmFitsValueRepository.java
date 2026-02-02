package com.mss.unified.repositories;


import com.mss.unified.entities.AtmFitsValue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

@Repository
public
interface AtmFitsValueRepository  extends JpaRepository<AtmFitsValue,Integer > {
    Optional<AtmFitsValue> findByFitNumber(String fitNumber);


    List<AtmFitsValue> findByAtmFitsApp(String atmFitsApp);

    boolean existsByfitNumberAndAtmFitsApp(String fitNumber,String atmFitsApp);

    @Query("SELECT r from AtmFitsValue r where r.fitNumber like %:fitNumber%")
    List<AtmFitsValue> findAllByfitNumber(String fitNumber);

    @Query("Select e from AtmFitsValue e Where e.atmFitsApp=:configId ")
    public Vector<AtmFitsValue> findByFitsConfigId(@Param("configId") String configId);
}

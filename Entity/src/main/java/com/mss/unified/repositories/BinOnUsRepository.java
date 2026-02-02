package com.mss.unified.repositories;


import com.mss.unified.entities.BinOnUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface BinOnUsRepository  extends JpaRepository< BinOnUs,Integer > {

    @Query("Select e from BinOnUs e Where SUBSTRING(:pan,1,e.bouLength) between e.bouLowBin AND e.bouHighBin")
    Optional<BinOnUs> findBinOnUs(@Param("pan") String pan);

    BinOnUs findByBinOnUsCode(int code);
    boolean existsByBouHighBinAndBouLowBin(String highBin,String lowBin);


    @Query("select b from BinOnUs b where b.binTypeCode =4")
    List<BinOnUs> findRevolvingBins();

    @Query("select b from BinOnUs b where b.libelle like %:libelle% and b.bouLowBin like %:min% and b.bouHighBin like %:max% ")
    List<BinOnUs> getAllByFilter(String libelle, String min, String max);

}

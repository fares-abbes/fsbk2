package com.mss.unified.repositories;


import com.mss.unified.entities.HsmKeys;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public
interface HsmKeysRepository  extends JpaRepository<HsmKeys,String> {
    @Query("Select h from HsmKeys h Where h.hsmKeysId.libelle=:libelle ")
    HsmKeys findByLibelle(String libelle);
//    Optional<HsmKeys> findByBinCodeAndLibelle(String binCode, String libelle);
@Query("Select h from HsmKeys h Where h.hsmKeysId.libelle=:libelle AND h.hsmKeysId.binCode=:binCode")
Optional<HsmKeys> findByBinCodeAndLibelle(String binCode, String libelle);
    @Query("select distinct h.hsmKeysId.libelle from HsmKeys h ")
    List<String> findAllGroupByLibelle();

}


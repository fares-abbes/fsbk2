package com.mss.unified.repositories;


import com.mss.unified.entities.OpposedBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public
interface OpposedBinRepositpory extends JpaRepository<OpposedBin,Integer > {
    boolean existsByOpBinNumber(String oppBin);
    Optional<OpposedBin> findByOpBinNumber(@Param("pan") String pan);
}

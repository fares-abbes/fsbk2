package com.mss.unified.repositories;

import com.mss.unified.entities.PlusBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlusBinRepository extends JpaRepository<PlusBin, Integer> {

    @Query("Select e from PlusBin e Where SUBSTRING( e.pbLowRange,1,e.pbLength)=SUBSTRING(:pan,1,e.pbLength) ")
    Optional<PlusBin> findPlusBin(@Param("pan") String pan);
}

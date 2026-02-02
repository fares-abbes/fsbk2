package com.mss.unified.repositories;


import com.mss.unified.entities.NationalBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface NationalBinRepository extends JpaRepository<NationalBin,String> {
    @Query("select b from NationalBin b where b.nBCode =:code")
    Optional<NationalBin> findByNBCode(int code);

    @Query("select b from NationalBin b where b.nBLowBin like %:min% and b.nbHighBin like %:max% ")
    List<NationalBin> findbyFilter(String min, String max);
    @Query("Select e from NationalBin e Where SUBSTRING(e.nBLowBin,1,e.nbLength)=SUBSTRING(:pan,1,e.nbLength) ")
    Optional<NationalBin> findNationalBin(@Param("pan") String pan);

}

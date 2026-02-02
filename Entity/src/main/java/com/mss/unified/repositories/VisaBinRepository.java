package com.mss.unified.repositories;


import com.mss.unified.entities.VisaBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface VisaBinRepository extends JpaRepository<VisaBin, Integer> {
    @Query("Select e from VisaBin e Where SUBSTRING(e.vbLowRange,1,e.vbLength)=SUBSTRING(:pan,1,e.vbLength) ")
    Optional<VisaBin> findVisaBin(@Param("pan") String pan);
}

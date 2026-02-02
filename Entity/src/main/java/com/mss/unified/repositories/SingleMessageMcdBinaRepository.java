package com.mss.unified.repositories;


import com.mss.unified.entities.SingleMessageMcdBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SingleMessageMcdBinaRepository extends JpaRepository<SingleMessageMcdBin,Integer> {
    @Query("Select e from SingleMessageMcdBin e Where SUBSTRING(e.smmbLowRange,1,e.smmbLength)=SUBSTRING(:pan,1,e.smmbLength) ")
    Optional<SingleMessageMcdBin> findSingleMessageMcdBin(@Param("pan") String pan);
}

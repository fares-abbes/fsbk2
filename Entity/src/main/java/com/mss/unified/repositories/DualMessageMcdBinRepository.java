package com.mss.unified.repositories;

import com.mss.unified.entities.DualMessageMcdBin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface DualMessageMcdBinRepository extends JpaRepository<DualMessageMcdBin,Integer> {
    @Query("Select e from DualMessageMcdBin e Where SUBSTRING(e.dmmbLowRange,1,e.dmmbLength)=SUBSTRING(:pan,1,e.dmmbLength) ")
    Optional<DualMessageMcdBin> findDualMessageMcdBin(@Param("pan") String pan);
}

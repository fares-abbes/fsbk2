package com.mss.unified.repositories;

import com.mss.unified.entities.AtmHardFitnessMapError;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Vector;

@Repository
public interface AtmHardFitnessMapErrorRepository extends PagingAndSortingRepository<AtmHardFitnessMapError,String> {

    @Query("Select e from AtmHardFitnessMapError e,AtmConfigHardFitnessError b "
            + "Where b.atmConfigHardFitnessErrorId.atmConfigId=:configId and "
            + "e.atmHardFitnessErrorId=b.atmConfigHardFitnessErrorId.atmHardFitnessErrorId")
    public Vector<AtmHardFitnessMapError> findAllHardFitnessError(@Param("configId") String configId);

}

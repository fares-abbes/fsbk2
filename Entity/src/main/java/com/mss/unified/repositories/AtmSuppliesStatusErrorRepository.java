package com.mss.unified.repositories;

import com.mss.unified.entities.AtmSuppliesStatusError;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Vector;

@Repository
public interface AtmSuppliesStatusErrorRepository extends PagingAndSortingRepository<AtmSuppliesStatusError,String> {


    @Query("Select e from AtmSuppliesStatusError e,AtmConfigSuppliesStatusError b "
            + "Where b.atmConfigSuppliesStatusErrorId.atmConfigurationId=:configId and "
            + "e.atmSuppliesErrorId=b.atmConfigSuppliesStatusErrorId.atmSuppliesErrorId")
    public Vector<AtmSuppliesStatusError> findAllSuppliesStatusError(@Param("configId") String configId);


}

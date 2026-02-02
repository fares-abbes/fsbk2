package com.mss.unified.repositories;

import com.mss.unified.entities.AtmHardCondDataError;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Vector;

@Repository
public interface AtmHardCondDataErrorRepository extends PagingAndSortingRepository<AtmHardCondDataError,String> {

    @Query("Select e from AtmHardCondDataError e,AtmConfigHardDataError b "
            + "Where b.atmConfigHardDataErrorId.atmConfigId=:configId and "
            + "e.atmHardConfErrorId=b.atmConfigHardDataErrorId.atmHardConfErrorId")
    public Vector<AtmHardCondDataError> findAllHardConfError(@Param("configId") String configId);

}

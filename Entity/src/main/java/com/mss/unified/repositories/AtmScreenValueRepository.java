package com.mss.unified.repositories;

import java.util.List;
import java.util.Vector;

import com.mss.unified.entities.AtmScreenValue;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


 
@Repository
public interface AtmScreenValueRepository extends PagingAndSortingRepository<AtmScreenValue,String> {
	@Query("Select e from AtmScreenValue e Where e.atmScreenValueId.atmScreenConfigID=:configId ")
    Vector<AtmScreenValue> findByScreenConfigId(@Param("configId") String configId);

    @Query("Select e from AtmScreenValue e Where e.atmScreenValueId.atmScreenNumID=:configId ")
   AtmScreenValue findByatmScreenNumID(@Param("configId") String configId);


    @Query("Select e from AtmScreenValue e Where e.atmScreenValueId.atmScreenNumID like %:atmScreenNumID%")
    List<AtmScreenValue> findByatmScreenNumIDFilter(String atmScreenNumID);

}

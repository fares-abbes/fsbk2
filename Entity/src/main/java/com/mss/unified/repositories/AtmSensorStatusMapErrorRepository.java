package com.mss.unified.repositories;

import java.util.Vector;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.AtmSensorStatusMapError;

@Repository
public interface AtmSensorStatusMapErrorRepository  extends PagingAndSortingRepository<AtmSensorStatusMapError, String> {

	@Query("Select e from AtmSensorStatusMapError e,AtmConfigurationSensorError b "
			+ "Where b.atmConfigurationSensorErrorId.atmConfigurationId=:configId and "
			+ "e.atmSensorErrorId=b.atmConfigurationSensorErrorId.atmSensorStatusErrorId")
	public Vector<AtmSensorStatusMapError> findAllSensorStatusError(@Param("configId") String configId);
	
}

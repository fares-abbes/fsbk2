package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.AtmSensorStatus;

 
@Repository
public interface AtmSensorStatusRepository extends JpaRepository<AtmSensorStatus,String> {

	
	@Query("SELECT p FROM AtmSensorStatus p where p.atmSensorId=:code")
	List<AtmSensorStatus> findAtmSensorStatus(String code);
}

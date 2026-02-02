package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.UAP040INNotAccepted;
import com.mss.unified.entities.UAP051INNotAccepted;
@Repository
public interface UAP051InNotAcceptedRepository extends JpaRepository<UAP051INNotAccepted, Integer> {
	List <UAP051INNotAccepted> findByFileIntegrationDate(String date);
	
	List <UAP051INNotAccepted> findByControlId(String date);

}

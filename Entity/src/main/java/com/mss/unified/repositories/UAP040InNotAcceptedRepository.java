package com.mss.unified.repositories;




import com.mss.unified.entities.UAP040INNotAccepted;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UAP040InNotAcceptedRepository extends JpaRepository<UAP040INNotAccepted, Integer> {
	
	List <UAP040INNotAccepted> findByFileIntegrationDate(String date);
	List <UAP040INNotAccepted> findByControlId(String date);
}

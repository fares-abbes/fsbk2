package com.mss.unified.repositories;



import com.mss.unified.entities.UAP040FransaBankNotAccepted;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UAP040FransaBankNotAcceptedRepository extends JpaRepository<UAP040FransaBankNotAccepted, Integer> {
	
	List <UAP040FransaBankNotAccepted> findByFileIntegrationDate(String date);

}

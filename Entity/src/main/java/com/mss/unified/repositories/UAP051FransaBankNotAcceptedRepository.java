package com.mss.unified.repositories;



import com.mss.unified.entities.UAP051FransaBankNotAccepted;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UAP051FransaBankNotAcceptedRepository extends JpaRepository<UAP051FransaBankNotAccepted, Integer> {
	
	List <UAP051FransaBankNotAccepted> findByFileIntegrationDate(String date);

}

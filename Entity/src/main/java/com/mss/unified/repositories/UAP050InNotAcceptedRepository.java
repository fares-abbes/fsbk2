package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.UAP050INNotAccepted;
import com.mss.unified.entities.UAP051INNotAccepted;
@Repository
public interface UAP050InNotAcceptedRepository extends JpaRepository<UAP050INNotAccepted, Integer>{
	List <UAP050INNotAccepted> findByFileIntegrationDate(String date);
	List <UAP050INNotAccepted> findByControlId(String date);

}

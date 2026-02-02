package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.CardPersoStatus;


@Repository 
public interface CardStatusPersoRepository  extends JpaRepository < CardPersoStatus, Integer > {
	
	CardPersoStatus findByCardPersoStatusCode(int cardCode);


}

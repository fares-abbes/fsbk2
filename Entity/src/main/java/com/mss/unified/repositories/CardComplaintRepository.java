package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CardComplaint;
import com.mss.unified.entities.CardHistory;
import com.mss.unified.entities.OpposedCard;

public interface CardComplaintRepository extends JpaRepository<CardComplaint, Integer> {
	
  List<CardComplaint> findByCardCode(Integer cardCode);
  
  
  @Query("select c from CardComplaint c where c.pan like %:pan% and c.branch like %:branch% and c.status=1")
  Page<CardComplaint> getComplaints(Pageable pageable, String pan,String branch);
  
  
}

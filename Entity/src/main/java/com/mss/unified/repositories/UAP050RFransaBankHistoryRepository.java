package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.UAP050FransaBank;
import com.mss.unified.entities.UAP050INR;
import com.mss.unified.entities.UAP050RFransaBankHistory;
@Repository
public interface UAP050RFransaBankHistoryRepository extends JpaRepository<UAP050RFransaBankHistory, Integer>{
 
}

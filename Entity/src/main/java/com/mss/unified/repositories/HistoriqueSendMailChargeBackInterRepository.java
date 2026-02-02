package com.mss.unified.repositories;

import com.mss.unified.entities.HistoriqueSendmailChargeBackInter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HistoriqueSendMailChargeBackInterRepository  extends JpaRepository<HistoriqueSendmailChargeBackInter, Integer>
{
    List<HistoriqueSendmailChargeBackInter> findByChargeBackId(Integer chargeBackId);

    
    
}

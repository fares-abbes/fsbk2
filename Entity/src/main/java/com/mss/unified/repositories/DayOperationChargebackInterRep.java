package com.mss.unified.repositories;

import com.mss.unified.entities.DayOperationChargebackInternational;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOperationChargebackInterRep extends JpaRepository<DayOperationChargebackInternational, Integer>{

}

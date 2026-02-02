package com.mss.unified.repositories;


import com.mss.unified.entities.CommissionType;
import com.mss.unified.entities.TpeRequestStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommissionTypeRepository extends JpaRepository<CommissionType,Integer> {
    CommissionType findByCommissionTypeCode(Integer code);
}

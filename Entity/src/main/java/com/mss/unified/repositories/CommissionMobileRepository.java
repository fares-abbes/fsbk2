package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionMobile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommissionMobileRepository extends JpaRepository<CommissionMobile, Integer> {
    // Find by type
    List<CommissionMobile> findByType(String type);
}

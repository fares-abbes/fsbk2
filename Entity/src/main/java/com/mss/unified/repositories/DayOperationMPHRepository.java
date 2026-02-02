package com.mss.unified.repositories;

import com.mss.unified.entities.DayOperationMPH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOperationMPHRepository extends JpaRepository<DayOperationMPH, Long>, JpaSpecificationExecutor<DayOperationMPH> {

}

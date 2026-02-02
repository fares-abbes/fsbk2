package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mss.unified.entities.AgencyStatus;

public interface AgencyStatusRepository  extends JpaRepository<AgencyStatus, String> {

}

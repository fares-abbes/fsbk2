package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mss.unified.entities.Alert;

public interface AlertRepository extends JpaRepository<Alert, Integer> {

}

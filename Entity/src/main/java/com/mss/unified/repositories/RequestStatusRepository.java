package com.mss.unified.repositories;

import com.mss.unified.entities.RequestCardStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestStatusRepository extends JpaRepository<RequestCardStatus, Integer>{

}

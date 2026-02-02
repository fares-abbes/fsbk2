package com.mss.unified.repositories;

import com.mss.unified.entities.UAP070INHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UAP070INHistoryRepository extends JpaRepository<UAP070INHistory, Integer>, JpaSpecificationExecutor<UAP070INHistory> {

}

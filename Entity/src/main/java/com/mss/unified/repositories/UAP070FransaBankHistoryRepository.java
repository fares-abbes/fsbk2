package com.mss.unified.repositories;

import com.mss.unified.entities.UAP070FransaBankHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UAP070FransaBankHistoryRepository extends JpaRepository<UAP070FransaBankHistory, Integer>, JpaSpecificationExecutor<UAP070FransaBankHistory> {

}

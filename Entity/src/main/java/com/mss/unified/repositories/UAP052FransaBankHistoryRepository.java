package com.mss.unified.repositories;

import com.mss.unified.entities.UAP052FransaBankHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UAP052FransaBankHistoryRepository extends JpaRepository<UAP052FransaBankHistory, Integer> {
}

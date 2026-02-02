package com.mss.unified.repositories;

import com.mss.unified.entities.RangeStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangeStatusRepository  extends JpaRepository<RangeStatus,Integer> {
    RangeStatus findByRangeStatusCode(Integer code);

}

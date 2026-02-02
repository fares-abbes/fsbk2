package com.mss.unified.repositories;

import com.mss.unified.entities.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangeRepository  extends JpaRepository<Range,Integer> {
    boolean existsByBouHighRangeAndBouLowRange(String highRange,String lowRange);

}

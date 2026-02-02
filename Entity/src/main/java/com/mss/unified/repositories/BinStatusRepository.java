package com.mss.unified.repositories;

import com.mss.unified.entities.BinStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface BinStatusRepository extends JpaRepository<BinStatus, Integer> {
    BinStatus findByBstCode(int bstCode);

}

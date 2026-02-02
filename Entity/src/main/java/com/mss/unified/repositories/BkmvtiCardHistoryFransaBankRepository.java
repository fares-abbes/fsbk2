package com.mss.unified.repositories;


import com.mss.unified.entities.BkmvtiCardHisotryFransaBank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BkmvtiCardHistoryFransaBankRepository extends JpaRepository<BkmvtiCardHisotryFransaBank, Integer> {


}

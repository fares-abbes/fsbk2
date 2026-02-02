package com.mss.unified.repositories;

import com.mss.unified.entities.AtmEmvCurr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AtmEmvCurrRepository extends JpaRepository<AtmEmvCurr,Integer> {

    @Query("select e from AtmEmvCurr e where e.ecmCode=:ecmCode order by e.currorder ")
    List<AtmEmvCurr> findByEcmCode(Integer ecmCode);


    @Query("delete from AtmEmvCurr e where e.ecmCode=:ecmCode ")
    @Modifying
    void deleteByEcmCode(Integer ecmCode);
}

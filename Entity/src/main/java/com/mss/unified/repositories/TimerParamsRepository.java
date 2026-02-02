package com.mss.unified.repositories;


import com.mss.unified.entities.TimerParams;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public
interface TimerParamsRepository extends JpaRepository<TimerParams, Integer > {
    Optional< TimerParams > findByTimerConfigNum(Integer integer);


    @Query("SELECT r from TimerParams r where r.timerConfigLibelle like %:timerConfigLibelle%")
    List<TimerParams> findAllByTimerConfigLibelle(String timerConfigLibelle);

}

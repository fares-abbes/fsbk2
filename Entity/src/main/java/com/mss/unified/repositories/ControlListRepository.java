package com.mss.unified.repositories;



import com.mss.unified.entities.ControlList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface ControlListRepository extends JpaRepository< ControlList,String > {
    Optional<ControlList> findByControlNum(String controlNum);

    @Query("select c from ControlList c where c.controlNum in (:ids)")
    Set<ControlList> findAllByIds(Set<Integer> ids);
}

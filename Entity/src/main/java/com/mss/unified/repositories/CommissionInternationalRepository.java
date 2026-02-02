package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionInternational;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionInternationalRepository extends JpaRepository<CommissionInternational, Integer> {

    @Query("SELECT c FROM CommissionInternational c WHERE c.type = :type")
    List<CommissionInternational> findByType(@Param("type") String type);

}

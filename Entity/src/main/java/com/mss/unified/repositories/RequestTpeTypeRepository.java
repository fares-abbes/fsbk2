package com.mss.unified.repositories;

import com.mss.unified.entities.RequestTpeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestTpeTypeRepository extends JpaRepository<RequestTpeType,Integer> {

}
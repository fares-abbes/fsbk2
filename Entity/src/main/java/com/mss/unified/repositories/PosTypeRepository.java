package com.mss.unified.repositories;

import com.mss.unified.entities.PosType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PosTypeRepository  extends JpaRepository<PosType,Integer> {
	  PosType findByPosTypeCode(Integer code);

}

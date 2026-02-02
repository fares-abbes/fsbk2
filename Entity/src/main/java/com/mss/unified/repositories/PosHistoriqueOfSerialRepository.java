package com.mss.unified.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.PosHistoriqueOfSerial;

@Repository
public interface PosHistoriqueOfSerialRepository extends JpaRepository <PosHistoriqueOfSerial, Integer >{

	@Query("select s from PosHistoriqueOfSerial s where s.serialNum=:serial")
    Page<PosHistoriqueOfSerial> getPagePosHistoriqueOfSerial(Pageable pageable,String serial);

}

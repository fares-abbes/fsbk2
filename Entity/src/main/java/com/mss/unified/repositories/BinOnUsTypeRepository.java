package com.mss.unified.repositories;

import com.mss.unified.entities.BinOnUsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface BinOnUsTypeRepository extends JpaRepository< BinOnUsType,Integer > {
    BinOnUsType findByBtCode(int code);

}
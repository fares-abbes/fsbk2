package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.FileContent;
import com.mss.unified.entities.TvaCommissionFransaBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TvaCommissionFransaBankRepository extends JpaRepository<TvaCommissionFransaBank, Integer> {
    @Query("select A from TvaCommissionFransaBank A where code=1")
    TvaCommissionFransaBank findTva();
}

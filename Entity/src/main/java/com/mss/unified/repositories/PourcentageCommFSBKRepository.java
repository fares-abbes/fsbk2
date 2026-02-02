package com.mss.unified.repositories;

import com.mss.unified.entities.CodeBankBC;
import com.mss.unified.entities.PourcentageCommFSBK;
import com.mss.unified.entities.TvaCommissionFransaBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PourcentageCommFSBKRepository extends JpaRepository<PourcentageCommFSBK, Integer> {
    @Query("select A from PourcentageCommFSBK A where ROWNUM=1")
    PourcentageCommFSBK findPourcentage();
}

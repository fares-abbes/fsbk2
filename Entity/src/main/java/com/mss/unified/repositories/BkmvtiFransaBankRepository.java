package com.mss.unified.repositories;

import com.mss.unified.entities.BkmvtiFransaBank;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.DayOperationFransaBank;
import com.mss.unified.entities.UAPFransaBank;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BkmvtiFransaBankRepository extends JpaRepository<BkmvtiFransaBank, Long>, JpaSpecificationExecutor<BkmvtiFransaBank> {
	

//    @Query(value ="SELECT FRANSABANK.bkmvti_fransa_bank_sequence.nextval FROM dual", nativeQuery = true)
//    public BigDecimal getNextValMySequence();

    List<BkmvtiFransaBank> findByRefDossierContaining(String refDossier);

    @Modifying
    @Transactional
    @Query(value="update BkmvtiFransaBank set numEvenement= LPAD(id,6,'0'),pieceComptable=CONCAT('DB161',LPAD(id,6,'0'))",nativeQuery=true)
    public void updateOnUs();
    @Modifying
    @Transactional
    @Query(value="update BkmvtiFransaBank set numEvenement= LPAD(id,6,'0'),pieceComptable=CONCAT('DB162',LPAD(id,6,'0'))",nativeQuery=true)
    public void updateOffUsIssuer();
    @Modifying
    @Transactional
    @Query(value="update BkmvtiFransaBank set numEvenement= LPAD(id,6,'0'),pieceComptable=CONCAT('DB170',LPAD(id,6,'0'))",nativeQuery=true)
    public void updateOffUsAcq();
    
	@Query("select A from BkmvtiFransaBank A where A.numPiece is not null order by A.numEvenement ASC")
	List<BkmvtiFransaBank> getListByEve();

	@Query("select max(numEvenement) from BkmvtiFransaBank")
	String getLastNumIndex();
}

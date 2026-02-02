package com.mss.unified.repositories;

import com.mss.unified.entities.BkmvtiFransaBankMobile;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.DayOperationFransaBank;
import com.mss.unified.entities.UAPFransaBank;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface BkmvtiFransaBankMobileRepository extends JpaRepository<BkmvtiFransaBankMobile, Long> {


	@Query("SELECT b FROM BkmvtiFransaBankMobile b WHERE  (b.codeOperation = :ope OR :ope IS NULL) "
			+"AND  (  :dvaStart IS NULL OR  b.dateValeur >=  :dvaStart ) AND  (  :dcoEnd IS NULL OR b.dateValeur <=:dvaEnd)"
			+"AND  (  :dcoStart IS NULL OR  b.dateComptable >=  :dcoStart ) AND  (  :dcoEnd IS NULL OR b.dateComptable<=:dcoEnd )"
			+ "AND (b.agence like %:age% OR :age IS NULL) " 
			+ "AND (b.numCompte like %:ncp% OR :ncp IS NULL) " 
			+ "AND (b.numPiece like %:pie% OR :pie IS NULL) "
			+ "AND (b.pieceComptable like %:pieceComptable% OR :pieceComptable IS NULL) "
			+ "AND (b.refernceLettrage like %:referenceLettrage% OR :referenceLettrage IS NULL)")
	Page<BkmvtiFransaBankMobile>   findByfiltred(Pageable pageable, String dcoStart,String dcoEnd, String dvaStart,String dvaEnd,  String ope, String age
			, String ncp, String pie, String pieceComptable, String referenceLettrage);
	

//    @Query(value ="SELECT FRANSABANK.bkmvti_fransa_bank_sequence.nextval FROM dual", nativeQuery = true)
//    public BigDecimal getNextValMySequence();



    @Modifying
    @Transactional
    @Query(value="update BkmvtiFransaBankMobile set numEvenement= LPAD(id,6,'0'),pieceComptable=CONCAT('DB161',LPAD(id,6,'0'))",nativeQuery=true)
    public void updateOnUs();
    @Modifying
    @Transactional
    @Query(value="update BkmvtiFransaBankMobile set numEvenement= LPAD(id,6,'0'),pieceComptable=CONCAT('DB162',LPAD(id,6,'0'))",nativeQuery=true)
    public void updateOffUsIssuer();
    @Modifying
    @Transactional
    @Query(value="update BkmvtiFransaBankMobile set numEvenement= LPAD(id,6,'0'),pieceComptable=CONCAT('DB170',LPAD(id,6,'0'))",nativeQuery=true)
    public void updateOffUsAcq();
    
	@Query("select A from BkmvtiFransaBankMobile A where A.numPiece is not null order by A.numEvenement ASC")
	List<BkmvtiFransaBankMobile> getListByEve();

	@Query("select max(numEvenement) from BkmvtiFransaBankMobile")
	String getLastNumIndex();
}

package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.UAP040INHistory;
import com.mss.unified.entities.UAP050IN;
import com.mss.unified.entities.UAP050INRHistory;
@Repository
public interface UAP050INRFransaBankHistoryRepository extends JpaRepository<UAP050INRHistory, Integer>{
	List<UAP050INRHistory> findByRio(String rio);
 	@Query("select A from UAP050INRHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan and A.flag='2' and motifRejet!='002' and A.numTransaction=:numTransaction")
	List<UAP050INRHistory> findRejectedOnes(String numAutorisation,String pan,String numTransaction);

 	@Query("select A from UAP050INRHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
 	List<UAP050INRHistory> findinHistorys(String numAutorisation,String pan,String numTransaction);
    List<UAP050INRHistory> findByCopiedAndFlag(String copied,String flag);  

}

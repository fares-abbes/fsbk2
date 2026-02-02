package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.UAP040IN;
import com.mss.unified.entities.UAP040INRHistory;


public interface UAP040INRFransaBankHistoryRepository extends JpaRepository<UAP040INRHistory, Integer> {

//	@Query("select UAP040INRHistory from UAP040IN A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  , A.typeCarteDebit , A.numSeq,A.numOrdre , A.cle )=:pan ")
//	List<UAP040INRHistory> findBYNumAutorisationAndPAN(String numAutorisation, String pan);
	List<UAP040INRHistory> findByRio(String rio);
	List<UAP040INRHistory> findByRioAndMotifRejet(String rio,String motifRejet);
 	@Query("select A from UAP040INRHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  , A.typeCarteDebit , A.numSeq,A.numOrdre , A.cle )=:pan and A.flag='2' and motifRejet!='002' and A.numTransaction=:numTransaction")
	List<UAP040INRHistory> findRejectedOnes(String numAutorisation,String pan,String numTransaction);
 	@Query("select A from UAP040INRHistory A where A.numAutorisation =:numAutorisation and CONCAT(  A.codeBin  ,A.typeCarte , A.numSeq,A.numOrdre , A.cle )=:pan   and A.numTransaction=:numTransaction")
 	List<UAP040INRHistory> findinHistorys(String numAutorisation,String pan,String numTransaction);
    List<UAP040INRHistory> findByCopiedAndFlag(String copied,String flag); 

}

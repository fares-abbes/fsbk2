package com.mss.unified.repositories;


import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.DayOperationFeesCardSequence;

@Repository
public interface DayOperationFeesCardSequenceRepository extends JpaRepository<DayOperationFeesCardSequence, Integer> {

	
	   @Query("select A from DayOperationFeesCardSequence A where A.keys='sequenceTrans'")
	    Optional<DayOperationFeesCardSequence> getSeqNumTransaction();
	   
	   @Query("select A from DayOperationFeesCardSequence A where A.keys='sequencePieceComptable'")
	    Optional<DayOperationFeesCardSequence> getSeqPieceComptable();

}

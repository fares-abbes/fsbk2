package com.mss.unified.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.DayOperationFeesPosSequence;

@Repository
public interface DayOperationFeesPosSequenceRepository extends JpaRepository<DayOperationFeesPosSequence, Integer> {


	   @Query("select A from DayOperationFeesPosSequence A where A.keys='sequenceTrans'")
	    Optional<DayOperationFeesPosSequence> getSeqNumTransaction();
	   
	   @Query("select A from DayOperationFeesPosSequence A where A.keys='sequencePieceComptable'")
	    Optional<DayOperationFeesPosSequence> getSeqPieceComptable();
}

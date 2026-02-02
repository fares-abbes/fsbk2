package com.mss.unified.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.DayOperationCardFransaBank;
import com.mss.unified.entities.DayOperationCardHistoryFransaBank;

import java.util.List;

@Repository
public interface DayOperationCardHistoryFransaBankRepository extends JpaRepository<DayOperationCardHistoryFransaBank, Integer> {
//    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C001' and A.status is null")
//    List<DayOperationCardFransaBank> getListOppositionVol();
//
//    @Query("select A from DayOperationCardFransaBank A where A.Numtransaction=:numTransaction and A.status is null")
//    List<DayOperationCardFransaBank> getListOppositionVolByNumTransaction(String numTransaction);
//
//    
//    
//    @Query("select A from DayOperationCardFransaBank A where A.status='T' ")
//    List<DayOperationCardFransaBank> getListTreatedDays();

}


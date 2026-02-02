package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import com.mss.unified.entities.DayOperationPosFransaBank;

@Repository
public interface DayOperationPosFransaBankRepository extends JpaRepository<DayOperationPosFransaBank, Integer> {

    @Query("select A from DayOperationPosFransaBank A where A.idenfication='T001' and A.status is null")
    List<DayOperationPosFransaBank> getListT001();
    
    @Query("select A from DayOperationPosFransaBank A where A.idenfication='T002' and A.status is null")
    List<DayOperationPosFransaBank> getListT002();
    
    @Query("select A from DayOperationPosFransaBank A where A.idenfication='T003' and A.status is null")
    List<DayOperationPosFransaBank> getListT003();
    
    
    @Query("select A from DayOperationPosFransaBank A where A.idenfication='T004' and A.status is null")
    List<DayOperationPosFransaBank> getListT004();
    
    
    
    @Query("select A from DayOperationPosFransaBank A where A.Numtransaction=:numTransaction and A.status is null")
    List<DayOperationPosFransaBank> getListByNumTransaction(String numTransaction);

    
    
    @Query("select A from DayOperationPosFransaBank A where A.status='T' ")
    List<DayOperationPosFransaBank> getListTreatedDays();
}

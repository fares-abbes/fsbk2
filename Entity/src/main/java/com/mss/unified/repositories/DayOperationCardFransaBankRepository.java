package com.mss.unified.repositories; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.DayOperationCardFransaBank;
import java.util.List;

@Repository
public interface DayOperationCardFransaBankRepository extends JpaRepository<DayOperationCardFransaBank, Integer> {
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C001' and A.cardProduct='gold' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListOppositionGold();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C003' and A.cardProduct='classic' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListOppositionClassic();
    
//    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C003' and A.status is null")
//    List<DayOperationCardFransaBank> getListOppositionPerte();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C005' and A.cardProduct='gold' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListRefabricationGold();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C013' and A.cardProduct='classic' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListRefabricationClassic();
    
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C007' and A.cardProduct='gold' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListReedtionPinGold();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C015' and A.cardProduct='classic' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListReedtionPinClassic();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C009' and A.cardProduct='gold' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListAnnulationGold();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C017' and A.cardProduct='classic' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListAnnulationClassic();
    
    
  
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C011' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListFabricationGold();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C019' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListFabricationClassic();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C026' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListOppositionVisa();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C021' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListFabricationVisa();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C027' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListAnnulationVisa();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C029' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListReedtionPinVisa();
    
    @Query("select A from DayOperationCardFransaBank A where A.idenfication='C023' and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListRefabricationVisa();
    
    
    
    @Query("select A from DayOperationCardFransaBank A where A.Numtransaction=:numTransaction and A.status is null and montantSettlement>0")
    List<DayOperationCardFransaBank> getListByNumTransaction(String numTransaction);

    
    
    @Query("select A from DayOperationCardFransaBank A where A.status='T' ")
    List<DayOperationCardFransaBank> getListTreatedDays();

}


package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.PosSerialNumStates;

@Repository
public interface PosSerialNumStatesRepository extends JpaRepository<PosSerialNumStates,String>{
	@Query("select s from PosSerialNumStates s where s.serialNum like %:libelle% or s.serialNum in (select po.serialNum from PosTerminal po where po.serialNum like %:libelle% and po.posNum like %:posNum% )")
    Page<PosSerialNumStates> getPagePosSerialNumStates(Pageable pageable,String libelle,String posNum);
	
	@Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle% and B.posNum like %:posNum% and B.merchantCode.idContrat like %:merchantCode%")
    Page<Object[]> getPagePosSerialNumStates1(Pageable pageable,String libelle,String posNum,String merchantCode);
	
    
    @Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle%")
    Page<Object[]> getPagePosSerialNumStates2(Pageable pageable,String libelle);
    
	
	@Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle% and B.posNum like %:posNum% and B.merchantCode.idContrat like %:merchantCode% and A.statuResiliation='1'")
    Page<Object[]> getPagePosSerialNumStates3(Pageable pageable,String libelle,String posNum,String merchantCode);
	
    
    @Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle% and A.statuResiliation='1'")
    Page<Object[]> getPagePosSerialNumStates4(Pageable pageable,String libelle);
	
	
	@Query("select s from PosSerialNumStates s where s.serialNum like %:libelle% and s.statuResiliation='1'")
    Page<PosSerialNumStates> getPagePosSerialNumStatesTo(Pageable pageable,String libelle);
	
	@Query("select s from PosSerialNumStates s where s.status='1' order by serial_num ")
	List<PosSerialNumStates> getOnePosSerialNumStates();
	@Query("select s from PosSerialNumStates s,PosStock t where s.status='1' and t.stockDisponible>0 order by serial_num ")
	List<PosSerialNumStates> getOnePosSerialNumStatesAndStockSup();
	
	@Query("select s from PosSerialNumStates s where s.serialNum=:serialNum")
	PosSerialNumStates getOnePosSerialNumStat(String serialNum);
	
	
	
	@Query("select s from PosSerialNumStates s,PosStock t where s.model=t.model and s.status='1' and t.stockDisponible>0 order by serial_num ")
	List<PosSerialNumStates> getOnePosSerialNumStatesByStock();
	

	@Query("select s from PosSerialNumStates s,PosStock t,PosModel m where s.model=t.model and t.model=m.modelCode and s.status='1' and t.stockDisponible>0 and m.codeType=2 order by serial_num ")
	List<PosSerialNumStates> getOnePosSerialNumStatesByStockFixe(); 
	
	@Query("select s from PosSerialNumStates s,PosStock t,PosModel m where s.model=t.model and t.model=m.modelCode and s.status='1' and t.stockDisponible>0 and m.codeType=4 order by serial_num ")
	List<PosSerialNumStates> getOnePosSerialNumStatesByStockMobile(); 
	
	@Query("select s from PosSerialNumStates s,PosStock t,PosModel m where s.model=t.model and t.model=m.modelCode and s.status='1' and t.stockDisponible>0 and m.codeType=6 order by serial_num ")
	List<PosSerialNumStates> getOnePosSerialNumStatesByStockMPOS(); 
	
	@Query("select s from PosSerialNumStates s,PosStock t,PosModel m where s.model=t.model and s.model=m.modelCode and s.status='1' and t.stockDisponible>0 and m.codeType=:codeType order by s.model ")
	List<PosSerialNumStates> getOnePosSerialNumStatesByStockByType(Integer codeType); 
	
	@Query("select s from PosSerialNumStates s,PosStock t,PosModel m where s.model=t.model and s.model=m.modelCode and s.status='1' and t.stockDisponible>0 and s.model=:codemodel order by s.model ")
	List<PosSerialNumStates> getOnePosSerialNumStatesByStockByTypeModel(Integer codemodel); 

	
	
	
	@Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle% and B.posNum like %:posNum% and B.merchantCode.idContrat like %:merchantCode%")
    List<Object[]> getPagePosSerialNumStates1(String libelle,String posNum,String merchantCode);
	
    
    @Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle%")
    List<Object[]> getPagePosSerialNumStates2(String libelle);
    
	
	@Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle% and B.posNum like %:posNum% and B.merchantCode.idContrat like %:merchantCode% and A.statuResiliation='1'")
	List<Object[]> getPagePosSerialNumStates3(String libelle,String posNum,String merchantCode);
	
    
    @Query("select A,B.serialNum,B.posLibelle from PosSerialNumStates A LEFT JOIN PosTerminal B ON A.serialNum=B.serialNum where A.serialNum like %:libelle% and A.statuResiliation='1'")
    List<Object[]> getPagePosSerialNumStates4(String libelle);
    
    @Query("select s from PosSerialNumStates s where s.numSim like %:numSim% ")
	PosSerialNumStates findByNumSim(String numSim); 
}

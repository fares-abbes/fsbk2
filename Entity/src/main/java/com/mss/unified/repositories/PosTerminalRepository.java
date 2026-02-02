package com.mss.unified.repositories;

import com.mss.unified.entities.PosTerminal;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.Merchant;
import com.mss.unified.entities.PosService;
import com.mss.unified.entities.MccList;

@Repository
public interface PosTerminalRepository extends JpaRepository<PosTerminal, Integer> {
	
	@Query("SELECT p FROM PosTerminal p where p.merchantCode.merchantCode = :code")
    PosTerminal findByMerchantCode(Integer code);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum%")	
	PosTerminal findByposNum(String posNum);
	
	@Query("SELECT p FROM PosTerminal p where p.merchantCode.merchantCode = :code and p.posNum like %:posNum%")
	Optional<PosTerminal> findTerminal(Integer code,String posNum);
    
	@Query("Select e from Merchant e Where e.merchantCode=:id")
	Optional<Merchant> getMerchantForTerminal(@Param("id") int id);
	
	@Query("Select e from PosTerminal e Where e.posNum=:id")
	Optional<PosTerminal> getTerminal(@Param("id") String id);
	
	@Query("Select e from MccList e Where e.mccCode=:id")
	Optional<MccList> getMccCodeForTerminal(@Param("id") String id);

	@Query("SELECT p FROM PosTerminal p where p.merchantCode.merchantCode = :code")
	List<PosTerminal> findAllByMerchantCode(int code);
	
	@Query(value = "SELECT POS.PosTerminalSequence.nextval FROM dual", nativeQuery = true)
	Long getNextSeriesId();

	@Query(value = "SELECT POS.PosTerminalSequence.CURRVAL  FROM dual", nativeQuery = true)
	Long getCurrentValue();
	
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.agence like %:agence%")	
	List<PosTerminal> findAllposNum(String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.statusSup='SUPPRIME' and r.status!='SUPPRIME' and r.agence like %:agence%")	
	List<PosTerminal> findAllposNumFilterTosupp(String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.status!='SUPPRIME' and r.agence like %:agence%")	
	List<PosTerminal> findAllFilterTosupp(String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.statusUpdtae='MODIFIER' and r.status!='SUPPRIME' and r.agence like %:agence%")	
	List<PosTerminal> findAllposNumFilterToUpdate(String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.statusSup='SUPPRIME' and r.status!='SUPPRIME'")	
	List<PosTerminal> findAllposToSupp();
	
	@Query("SELECT r from PosTerminal r where r.status!='SUPPRIME'")	
	List<PosTerminal> findAllToSupp();
	
	@Query("SELECT r from PosTerminal r where r.status!='SUPPRIME' and r.serialNum!=''")	
	List<PosTerminal> findAllToRemplace();
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.status!='SUPPRIME' and r.serialNum!='' and r.agence like %:agence%")	
	List<PosTerminal> findAllFilterToRemplace(String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.statusUpdtae='MODIFIER' and r.status!='SUPPRIME'")	
	List<PosTerminal> findAllposToUpdate();
	
	@Query("SELECT r from PosTerminal r where r.status!='SUPPRIME'")	
	List<PosTerminal> getAllposToSupp();
	
	@Query("SELECT r from PosTerminal r where r.serialNum=:serialNum")	
	PosTerminal findAllposBySerialNum(String serialNum);
	
	@Query("SELECT r from PosTerminal r where r.merchantCode.merchantCode=:merchantCode and  "
			+ "FORMAT(CONVERT(DATETIME,r.creationDate,101),'yyyy-MM-dd') like %:creationDate%")	
	List<PosTerminal>  findAllposByMechantAndDate(int merchantCode,String creationDate);
	

	@Query("SELECT r from PosTerminal r where "
			+ "FORMAT(CONVERT(DATETIME,r.creationDate,101),'yyyy-MM-dd') like %:creationDate%")	
	List<PosTerminal>  findAllposByDate(String creationDate);
	
	@Query("SELECT r from PosTerminal r where r.generationTM is null and r.merchantCode.merchantStatus!='4'")	
	List<PosTerminal> getAllposTofileTM();
	
	@Query("SELECT r from PosTerminal r where r.fileTM!='A' and r.merchantCode.statusBs is null and (r.fileTS!='F' or r.fileTS is null)")	
	List<PosTerminal> getAllposTofileTS();

	
	@Query("SELECT r from PosTerminal r where r.posLibelle=:posLibelle and r.status!='SUPPRIME' and r.merchantCode.idContrat=:merchantId")	
	PosTerminal findPosTerminalByLibelle(String posLibelle, String merchantId);
	
	@Query("SELECT r from PosTerminal r where r.status!='SUPPRIME' and r.posNum like 'p%'")	
	List<PosTerminal> getAllposbeginwithP();
	
	
	@Query("SELECT r from PosTerminal r where r.status like '%En attente%'")	
	List<PosTerminal> getAllposToDeployed();
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.status like '%En attente%'  and r.agence like %:agence%")	
	List<PosTerminal> findAllposToDeployed(String posNum,String agence);
	
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.agence like %:agence%")	
	Page<PosTerminal> findPageposNum(Pageable pageable,String posNum,String agence);
	
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.agence like %:agence% and r.status!='SUPPRIME' and r.famillePosCode!=1")	
	Page<PosTerminal> findPageposNumSupp(Pageable pageable,String posNum,String agence);
	

	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.status like '%En attente%'  and r.agence like %:agence%")	
	Page<PosTerminal> findPageposToDeployed(Pageable pageable,String posNum,String agence);
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.statusSup='SUPPRIME' and r.status!='SUPPRIME' and r.agence like %:agence%")	
	Page<PosTerminal> findPageposNumFilterTosupp(Pageable pageable,String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.status!='SUPPRIME' and r.agence like %:agence%")	
	Page<PosTerminal> findPageFilterTosupp(Pageable pageable,String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.statusUpdtae='MODIFIER' and r.status!='SUPPRIME' and r.agence like %:agence%")	
	Page<PosTerminal> findPageposNumFilterToUpdate(Pageable pageable,String posNum,String agence);
	
	@Query("SELECT r from PosTerminal r where r.posNum like %:posNum% and r.status!='SUPPRIME' and r.serialNum!='' and r.agence like %:agence%")	
	Page<PosTerminal> findPageFilterToRemplace(Pageable pageable,String posNum,String agence);
	
	
	   @Query("select c from PosTerminal c where c.status='ACTIVE' and c.creationDate is not null and FORMAT(CONVERT(DATETIME,c.creationDate,102),'dd') in :days ")
	    List<PosTerminal> getPosTerminalWithStartDateByDay(List<String> days);
	
}

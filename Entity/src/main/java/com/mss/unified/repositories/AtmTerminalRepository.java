package com.mss.unified.repositories;


import com.mss.unified.entities.AtmTerminal;
import com.mss.unified.entities.EmvTerminalData;
import com.mss.unified.entities.MccList;
import com.mss.unified.entities.Merchant;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface AtmTerminalRepository extends JpaRepository<AtmTerminal, String> {
	 AtmTerminal findByAteId(String ateId);
	    
	    @Query("SELECT r from AtmTerminal r where r.ateId like %:ateId%")
	    List<AtmTerminal> findAllByateId(String ateId);
	    
	    @Query("SELECT r from AtmTerminal r where r.ateId like %:ateId%")
	    Page<AtmTerminal> findAllByateId(Pageable pageable,String ateId);
	    
	    @Query("Select e from AtmTerminal e Where e.ipAdresse=:ipadresse and e.portCon=:port")
		Optional<AtmTerminal> findByConnexion(@Param("ipadresse") String ipadresse,@Param("port") String port);
		
		@Query("Select e from MccList e Where e.mccListId=:id")
		Optional<MccList> getMccCodeForTerminal(@Param("id") String id);
		
		@Query("SELECT c FROM AtmTerminal a ,AtmConfiguration b,EmvTerminalData c " + 
				"WHERE a.atmConNum=b.atmConNum " +
				"AND c.emvTerminalDataId=b.etdCode "+
				"AND a.atmConNum=:id")
		Optional<EmvTerminalData> getAcquerierIdForTerminal(@Param("id") int id);
		
		
		@Query("Select e from Merchant e Where e.merchantCode=:id")
		Optional<Merchant> getMerchantForTerminal(@Param("id") Integer id);
		
		
		Optional<AtmTerminal> findByIpAdresseAndPortCon(String ip1,String port1);
		AtmTerminal findByMerchantCode(Integer merchantCode);
		
		 @Query("select a from AtmTerminal a WHERE a.etatTerminal='IN SERVICE'")
		    List<AtmTerminal> findTerminalStatusEgaleOnService();
		 @Query("select a from AtmTerminal a WHERE a.etatTerminal='OUT OF SERVICE'")
		    List<AtmTerminal> findTerminalStatusEgaleOutOfService();
		 @Query("select a from AtmTerminal a WHERE a.etatTerminal='DISCONNECTED'")
		    List<AtmTerminal> findTerminalStatusEgaleDisconected();
		 @Query("select a from AtmTerminal a WHERE a.etatTerminal='SUPERVISOR'")
		    List<AtmTerminal> findTerminalStatusEgaleSupervisor();
		 
			
			@Query("Select e from AtmTerminal e Where e.merchantCode=:merchantCode and e.ateId like %:id%")
			Optional<AtmTerminal>  findTerminal(Integer merchantCode,String id);
}

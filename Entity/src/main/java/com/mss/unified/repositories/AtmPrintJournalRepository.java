package com.mss.unified.repositories;

import com.mss.unified.entities.AtmPrintJournal;
import com.mss.unified.entities.AtmPrintTicket;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Vector;

@Repository
public interface AtmPrintJournalRepository extends PagingAndSortingRepository<AtmPrintJournal,String> {

    @Query("Select e from AtmPrintJournal e "
            + "Where e.atmPrintJournalId.atmPrintJournalConfigId=:configId and "
            + "e.atmPrintJournalId.atmPrintJournalTransId=:transCode order by "
            + "e.atmPrintJournalId.atmPrintJournalLineId ,e.atmPrintJournalId.atmPrintJournalColumnId")
    public Vector<AtmPrintJournal> findPrintJournalByTransId(@Param("configId") String configId,
                                                             @Param("transCode") String transCode);
    
    
    
    
	@Query("select s from AtmPrintJournal s where s.atmPrintJournalId.atmPrintJournalConfigId like %:configAtm% and "
			+ "s.atmPrintJournalId.atmPrintJournalTransId like %:transactionCode% "
			//+ "order by s.atmPrintJournalId.atmPrintJournalLineId ,s.atmPrintJournalId.atmPrintJournalColumnId"
			)
    Page<AtmPrintJournal> getAtmImpressionValues(Pageable pageable, String configAtm, String transactionCode);
	
	
	@Query("Select e from AtmPrintJournal e where e.atmPrintJournalId.atmPrintJournalLineId=:ligneNum "
			+ "and e.atmPrintJournalId.atmPrintJournalTransId=:transactionCode "
			+ "and e.atmPrintJournalId.atmPrintJournalConfigId=:configAtm "
			+ "and e.atmPrintJournalId.atmPrintJournalColumnId=(select max(a.atmPrintJournalId.atmPrintJournalColumnId) from AtmPrintJournal a)")
	Optional<AtmPrintJournal> findByIds(Integer ligneNum,String transactionCode,String configAtm);

}

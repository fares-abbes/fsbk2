package com.mss.unified.repositories;


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
public interface AtmPrintTicketRepository extends PagingAndSortingRepository<AtmPrintTicket,String>{

	@Query("Select e from AtmPrintTicket e "
			+ "Where e.atmPrintTicketId.atmPrintTicketConfigId=:configId and "
			+ "e.atmPrintTicketId.atmPrintTicketTransId=:transCode order by "
			+ "e.atmPrintTicketId.atmPrintTicketLineId ,e.atmPrintTicketId.atmPrintTicketColumnId")
	public Vector<AtmPrintTicket> findPrintTicketByTransId(@Param("configId") String configId,
														   @Param("transCode") String transCode);
	
	
	@Query("select s from AtmPrintTicket s where s.atmPrintTicketId.atmPrintTicketConfigId like %:configAtm% and "
			+ "s.atmPrintTicketId.atmPrintTicketTransId like %:transactionCode% "
			//+ "order by s.atmPrintTicketId.atmPrintTicketLineId ,s.atmPrintTicketId.atmPrintTicketColumnId"
			)
    Page<AtmPrintTicket> getAtmImpressionValues(Pageable pageable, String configAtm, String transactionCode);
	
	
	@Query("Select e from AtmPrintTicket e where e.atmPrintTicketId.atmPrintTicketLineId=:ligneNum "
			+ "and e.atmPrintTicketId.atmPrintTicketTransId=:transactionCode "
			+ "and e.atmPrintTicketId.atmPrintTicketConfigId=:configAtm "
			+ "and e.atmPrintTicketId.atmPrintTicketColumnId=(select max(a.atmPrintTicketId.atmPrintTicketColumnId) from AtmPrintTicket a)")

	Optional<AtmPrintTicket> findByIds(Integer ligneNum,String transactionCode,String configAtm);
	
	
}

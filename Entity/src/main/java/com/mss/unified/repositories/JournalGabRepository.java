package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.Account;
import com.mss.unified.entities.JournalGab;
import com.mss.unified.references.JournalGabUpdate;
@Repository
public interface JournalGabRepository extends JpaRepository<JournalGab, Integer>{

	@Query("select j.id, f.heureTransaction,f.idTerminal,j.statusSmt from JournalGab j,FileTP f where SUBSTRING(j.card, 1, 6)=SUBSTRING(f.numCartePorteur, 1, 6) and SUBSTRING(j.card, 15, 4)=SUBSTRING(f.numCartePorteur, 13, 4) and j.authCode=SUBSTRING(f.numAutorisation, 10, 6) and j.atm=f.idCommercant and SUBSTRING(j.dateTR, 1, 2)=SUBSTRING(f.dateTransaction, 7, 2) and SUBSTRING(j.dateTR, 4, 2)=SUBSTRING(f.dateTransaction, 5, 2) and SUBSTRING(j.dateTR, 7, 4)=SUBSTRING(f.dateTransaction, 1, 4) and j.utrnno=SUBSTRING(f.numtransaction, 5, 8) and j.montant=f.montantTransaction")
    List<Object[]> getLogJournalGab();
	
	@Transactional
   	@Modifying
   	@Query("update JournalGab j set j.heureTR =:heureTransaction,j.idTerminal=:idTerminal,j.statusSmt='OK' where j.id =:id")
   	void updateJournalGab(String heureTransaction,String idTerminal,int id);
	
	@Transactional
   	@Modifying
   	@Query("update JournalGab j set j.statusSmt='NOT OK' where j.statusSmt =NULL")
   	void updateJournalGabTO();
	
	
	@Query( "SELECT r from JournalGab r where r.atm like %:atm% "
	+ "and r.card like %:card% "
	+ "and r.authCode like %:authCode% "
	+ "and r.dateTR like %:dateTR% ")
	Page<JournalGab> findPageJournalGabFilter(Pageable pageable,String atm, String card,String authCode,String dateTR);
	
	
	@Query( "SELECT r from JournalGab r ")
			Page<JournalGab> findPageJournalGabFilter(Pageable pageable);
}

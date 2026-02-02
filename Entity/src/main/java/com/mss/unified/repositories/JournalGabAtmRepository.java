package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.JournalGab;
import com.mss.unified.entities.JournalGabAtm;
@Repository
public interface JournalGabAtmRepository extends JpaRepository<JournalGabAtm, Integer> {

	@Query("select j.id from JournalGabAtm j,FileContent f where j.rrn = f.Numtransaction")
    List<Object[]> getLogJournalGab();
    
    @Transactional
   	@Modifying
   	@Query("update JournalGabAtm j set j.statusSatim='FOUND' where j.id =:id")
   	void updateJournalGab(int id);
    
    @Query("select j.id from JournalGabAtm j,SwitchTransaction s where j.rrn = s.switchRRN and s.switchResponseCode='00' and s.switchStatTransaction='A'")
    List<Object[]> getLogJournalGabAuthApprouved();
    
    @Transactional
   	@Modifying
   	@Query("update JournalGabAtm j set j.statusSpark='OK' where j.id =:id")
   	void updateJournalGabAuthApprouved(int id);
	
    @Query("select j.id from JournalGabAtm j,SwitchTransaction s where j.rrn = s.switchRRN and (s.switchResponseCode!='00' or s.switchStatTransaction!='A')")
    List<Object[]> getLogJournalGabAuthNotApprouved();
    
    @Transactional
   	@Modifying
   	@Query("update JournalGabAtm j set j.statusSpark='NOT OK' where j.id =:id")
   	void updateJournalGabAuthNotApprouved(int id);
    
    @Transactional
   	@Modifying
   	@Query("update JournalGabAtm j set j.isExtourne='1' where (j.statusDab != j.statusSpark) or (j.statusDab='OK' and j.statusSpark ='OK' and j.statusSatim ='NOT FOUND' and SUBSTRING(j.card, 1, 6) != '502127')")
   	void updateJournalGabisExtourne();
    
    @Query( "SELECT r from JournalGabAtm r where "
    		+ "r.gab like %:gab% "
    		+ "and r.trx like %:trx% "
    		+ "and r.card like %:card% "
    		+ "and r.rrn like %:rrn% "
    		+ "and r.date like %:date% "
    		+ "and r.isExtourne like %:isExtourne% "
    		)
    		Page<JournalGabAtm> findPageJournalGabAtmFilter(Pageable pageable, String gab,String trx,String card,String date,String rrn,String isExtourne);
    		
    		
    		@Query( "SELECT r from JournalGabAtm r ")
    				Page<JournalGabAtm> findPageJournalGabAtm(Pageable pageable);
    
    
}


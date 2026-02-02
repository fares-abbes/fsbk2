package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mss.unified.entities.CardHolderInfo;

public interface CardHolderInfoRepository extends JpaRepository<CardHolderInfo, Integer> {
	
  Optional<CardHolderInfo> findByPan(String pan);
  
  @Query("select a from CardHolderInfo a where a.statusGeneration=:statusGeneration")
  List<CardHolderInfo> findAllCardHolderInfoByStatu(int statusGeneration);
  
  
  @Query("select c from CardHolderInfo c,Card d where c.pan=d.cardNum and c.branch like %:agencyCode% and c.pan like %:pan% "
  		+ "and d.accCode in (select a.accountCode from Account a where (a.accountNum like %:accountNumber% or a.accountNumAttached like %:accountNumber%)) order by c.modifDate desc")
	Page<CardHolderInfo> getCardHolderInfo(Pageable pageable,String agencyCode,String pan,String accountNumber);
  
}

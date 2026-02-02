package com.mss.unified.repositories;



import com.mss.unified.entities.OpposedCard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Repository
public
interface OpposedCardRepository extends JpaRepository<OpposedCard,Integer > {
    boolean existsOpposedCardByCardNumber(String cardNumber);
    Optional<OpposedCard> findByMotifOpposition(String motif);
    
    Optional<OpposedCard> findByCardNumber(String cardNumber);
    
    Optional<OpposedCard> findByCardCode(Integer cardCode);

	@Transactional	
	@Modifying
    @Query("delete from OpposedCard A where A.cardCode=:cardCode")
    void deleteByCardCode(Integer cardCode);

    
    @Query("select c from OpposedCard c where c.cardNumber like %:pan% and c.motifOpposition like %:motif% and CAST(c.dateOpposition AS string) like %:date% and c.branch like %:branch% ")
    Page<OpposedCard> getOpposedCards(Pageable pageable, String pan,String motif,String date,String branch);
    
    
	@Query("select c from OpposedCard c where c.cardNumber like %:pan% and c.motifOpposition like %:motif% "
			+ "and c.dateOpposition between FORMAT(cast(:date as date),'yyyy/MM/dd hh:mm:ss') and FORMAT(cast(:date2 as date),'yyyy/MM/dd hh:mm:ss') and c.branch like %:branch% ")
	Page<OpposedCard> getOpposedCardsWithInterval(Pageable pageable, String pan, String motif, String date,
			String date2,String branch); 
}

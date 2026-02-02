package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.ActionCard;


@Repository
public interface ActionCardRepository extends JpaRepository<ActionCard, Integer>{
	@Query("select a from ActionCard a where a.cardCode=:code and a.status=1")
	Optional<ActionCard> findByCardCode(int code);
	
	
	@Query("select a from ActionCard a where a.status=1")
	List<ActionCard> findAllActions();
	
	@Query("select a from ActionCard a where a.status=1 and isRenewel=1 and isVisa=0")
	List<ActionCard> findAllNationalRenewelActions();
	
	@Query("select a from ActionCard a where a.status=1 and isReplacement=1 and remplacementWithPin='true' and isVisa=0")
	List<ActionCard> findAllNationalReplacementWithPinActions();
	
	@Query("select a from ActionCard a where a.status=1 and isReplacement=1 and remplacementWithPin='false' and isVisa=0")
	List<ActionCard> findAllNationalReplacementWithoutPinActions();
	
	
	
	@Query("select a from ActionCard a where a.status=1 and isPinChange=1 and isVisa=0")
	List<ActionCard> findAllNationalChangePinActions();
	
	
	
	@Query("select a from ActionCard a where a.status=1 and isRenewel=1 and isVisa=1 ")
	List<ActionCard> findAllInternationalRenewelActions();
	
	@Query("select a from ActionCard a where a.status=1 and isReplacement=1 and remplacementWithPin='true' and isVisa=1")
	List<ActionCard> findAllInternationalReplacementWithPinActions();
	
	@Query("select a from ActionCard a where a.status=1 and isReplacement=1 and remplacementWithPin='false' and isVisa=1")
	List<ActionCard> findAllInternationalReplacementWithoutPinActions();
	
	
	
	@Query("select a from ActionCard a where a.status=1 and isPinChange=1 and isVisa=1")
	List<ActionCard> findAllInternationalChangePinActions();
	
	
}

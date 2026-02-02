package com.mss.unified.repositories;


 
import com.mss.unified.entities.AtmStatusValue;
import com.mss.unified.entities.StatConfig;

import java.util.Optional;


import com.mss.unified.references.AtmStates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Vector;

@Repository
public
interface AtmStatusValueRepository extends JpaRepository<AtmStatusValue, String> {


	  Optional<AtmStatusValue> findByAtmStatusCode(int code);


	  @Query(
	      "Select new  StatConfig(a.statusNum,b.statusType,a.p1Value,a.p2Value,a.p3Value,a.p4Value,a.p5Value,a.p6Value,a.p7Value,a.p8Value)  from AtmStatusValue a, AtmStatusType b "
	          + "Where a.atmStatusCode=b.atmStatusTypeCode "
	          + " and a.numStatApplication=:statApp order by a.numStatApplication ")
	  List<StatConfig> findStatus(int statApp);

	@Query("Select new com.mss.unified.references.AtmStates(e.statusNum, b.statusType, e.p1Value,"
			+ "e.p2Value, e.p3Value, e.p4Value, e.p5Value, e.p6Value, e.p7Value, e.p8Value)"
			+ " from AtmStatusValue e, AtmStatusType b Where e.numStatApplication=:configId "
			+ "and b.atmStatusTypeCode=e.atmStatusCode")
	public Vector<AtmStates> findByStatesConfigId(@Param("configId") Integer configId);
	
	
	 
	
	 
	}



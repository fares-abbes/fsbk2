package com.mss.unified.repositories;

import com.mss.unified.entities.AtmStatusType;

import java.util.Optional;

import com.mss.unified.entities.StatConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Vector;


@Repository
public
interface AtmStatusTypeRepository extends JpaRepository<AtmStatusType, Integer> {
	Optional<AtmStatusType> findByAtmStatusTypeCode(int code);

//    @Query("Select new com.mss.unified.references(e.atmStatesValueId.atmstatesValId, b.atmStatesTypeName, e.p1Value,"
//            + "e.p2Value, e.p3Value, e.p4Value, e.p5Value, e.p6Value, e.p7Value, e.p8Value)"
//            + " from AtmStatusType e, AtmStatusType b Where e.atmStatesValueId.atmstatesValConfId=:configId "
//            + "and b.atmStatesTypeId=e.atmstatesType")
//    public Vector<AtmStatusType> findByStatesConfigId(@Param("configId") String configId);



	  Optional<AtmStatusType> findByStatusType(String type);
}

package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.RemiseTotal;

@Repository
public interface RemiseTotatRepository extends PagingAndSortingRepository<RemiseTotal,Integer> {
	 
		@Query("Select t from RemiseTotal t where t.id=:id and t.identify.fid_h=:fid_h and t.identify.tpe_number=:tpe_number and t.status is null")
		RemiseTotal findByIdentify(@Param("id") int id,@Param("fid_h") String fid_h,@Param("tpe_number")String tpe_number);

		
		@Query("select t from RemiseTotal t where t.identify.fid_h=:fid_h and t.identify.tpe_number=:tpe_number and t.status is null")
		RemiseTotal findTotalRow(@Param("fid_h") String fid_h,@Param("tpe_number") String tpe_number);
	 
	}

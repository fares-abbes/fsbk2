package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.RemiseDetails;

@Repository
public interface RemiseDetailsRepository extends PagingAndSortingRepository<RemiseDetails,Integer> {

	@Query("Select d from RemiseDetails d Where d.identify.identify.fid_h=:identify and d.identify.identify.tpe_number=:tpe_number and d.card_number=:card_number and d.fid_37=:fid_37 and d.fid_38=:fid_38 and status is null")
	RemiseDetails getDetailTransaction(@Param("identify") String identify,@Param("tpe_number") String tpe_number,@Param("card_number") String card_number,@Param("fid_37") String fid_37,@Param("fid_38") String fid_38);
}

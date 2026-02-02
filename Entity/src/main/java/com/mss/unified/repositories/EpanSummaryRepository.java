package com.mss.unified.repositories;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.EpanSummary;

@Repository
public interface EpanSummaryRepository extends JpaRepository<EpanSummary, Integer>{
	
	@Query("select e from EpanSummary e where e.insertDate like %:date% order by e.insertDateTime DESC")
	Page<EpanSummary> getAll(Pageable pageable,String date);
	
	Optional<EpanSummary> getByFileName(String fileName);
}

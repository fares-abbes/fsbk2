package com.mss.unified.repositories;

import com.mss.unified.entities.EmbossingSummary;


import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EmbossingSummaryRepository extends JpaRepository<EmbossingSummary, Integer>{

	@Query("select e from EmbossingSummary e where e.fileKey=:key and e.generationDateTime=(select max(s.generationDateTime) from EmbossingSummary s where s.generationDate=:date and s.fileKey=:key)")
	Optional<EmbossingSummary> getRowMax(String date,String key);
	
	
	@Query("select e from EmbossingSummary e where e.generationDate like %:date% order by e.generationDateTime DESC")
	Page<EmbossingSummary> getAll(Pageable pageable,String date);
}

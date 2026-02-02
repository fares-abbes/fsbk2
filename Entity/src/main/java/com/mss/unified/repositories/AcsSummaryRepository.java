package com.mss.unified.repositories;

import com.mss.unified.entities.AcsSummary;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface AcsSummaryRepository extends JpaRepository<AcsSummary, Integer>{

	@Query("select e from AcsSummary e where e.generationDateTime=(select max(s.generationDateTime) from AcsSummary s where s.generationDate=:date)")
	Optional<AcsSummary> getRowMax(String date);
	
	
	@Query("select e from AcsSummary e where e.generationDate like %:date% order by e.generationDateTime DESC")
	Page<AcsSummary> getAll(Pageable pageable,String date);
}

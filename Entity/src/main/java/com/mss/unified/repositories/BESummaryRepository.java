package com.mss.unified.repositories;

import com.mss.unified.entities.BESummary;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface BESummaryRepository extends JpaRepository<BESummary, Integer>{

	@Query("select e from BESummary e where e.generationDateTime=(select max(s.generationDateTime) from BESummary s where s.generationDate=:date)")
	Optional<BESummary> getRowMax(String date);
	
	
	@Query("select e from BESummary e where e.generationDate like %:date% order by e.generationDateTime DESC")
	Page<BESummary> getAll(Pageable pageable,String date);
}

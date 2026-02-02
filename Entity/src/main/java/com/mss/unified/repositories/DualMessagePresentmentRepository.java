package com.mss.unified.repositories;

import com.mss.unified.entities.DualMessagePresentment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface DualMessagePresentmentRepository extends JpaRepository<DualMessagePresentment, Integer> {
	@Query("SELECT B from DualMessagePresentment B where B.motif=:motif")
	DualMessagePresentment getRepresentment(String motif);

	Page<DualMessagePresentment> findByType(String type, Pageable pageable);

}

package com.mss.unified.repositories;



import com.mss.unified.entities.Region;
import com.mss.unified.entities.RegionId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RegionRepository extends JpaRepository<Region, RegionId> {

	Optional<Region> findByCodeRegion(int codeRegion);

	Optional<Region> findByInitial(String initial);

	@Query("SELECT r from Region r where r.initial like %:initial%")
	List<Region> findAllByInitial(String initial);
}

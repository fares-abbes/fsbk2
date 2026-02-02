package com.mss.unified.repositories;

import com.mss.unified.entities.Zone;
import com.mss.unified.entities.ZoneId;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneRepository extends JpaRepository<Zone, ZoneId> {

	Optional<Zone> findByInitial(String initial);

	List<Zone> findByCodeRegion(int codeRegion);

	Optional<Zone> findByCodeZone(int id);

	@Query("SELECT r from Zone r where r.initial like %:initial% and r.initialRegion like %:initialRegion% ")
	List<Zone> findZoneByInitialAndInitialRegion(String initial, String initialRegion);
}

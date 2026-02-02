package com.mss.unified.repositories;

import com.mss.unified.entities.FieldM;
import com.mss.unified.entities.Synthese;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SyntheseRepository extends JpaRepository<Synthese, Integer> {

	List<Synthese> findByIdHeader(int idHeader);

}

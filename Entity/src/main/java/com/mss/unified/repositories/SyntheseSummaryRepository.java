package com.mss.unified.repositories;


import com.mss.unified.entities.FieldM;
import com.mss.unified.entities.SyntheseSummary;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public
interface SyntheseSummaryRepository extends JpaRepository<SyntheseSummary,Integer > {
	Optional<SyntheseSummary> findByDateSynthese(String dateS);


}

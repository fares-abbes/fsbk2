package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.mss.unified.entities.ProgramContract;


public interface ProgramContractRepository extends PagingAndSortingRepository<ProgramContract,Integer> {

	Optional<ProgramContract> findByProgramId(int programId);
}

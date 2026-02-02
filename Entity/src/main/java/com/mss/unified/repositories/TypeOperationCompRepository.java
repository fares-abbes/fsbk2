package com.mss.unified.repositories;

import com.mss.unified.entities.TypeOperationCompensation;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeOperationCompRepository extends JpaRepository<TypeOperationCompensation, Integer> {
	@Query("select T from TypeOperationCompensation T where T.operationCode = :operationCode1 or T.operationCode = :operationCode2")
	List<TypeOperationCompensation>findTypes(String operationCode1, String operationCode2);

	@Query("select T from TypeOperationCompensation T where T.operationCode in :operationCode")
	List<TypeOperationCompensation> findByOperationCode(List<String> operationCode);
}

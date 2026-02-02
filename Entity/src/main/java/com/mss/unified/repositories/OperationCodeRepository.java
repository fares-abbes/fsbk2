package com.mss.unified.repositories;

import com.mss.unified.entities.OperationCodeCommision;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import java.util.Optional;


@Repository
public interface OperationCodeRepository extends JpaRepository<OperationCodeCommision, Integer> {
	public OperationCodeCommision findByType(String type_op);

	//public OperationCodeCommision findByIdentification(String type_op);

	@Query("SELECT A from OperationCodeCommision A order by identification")
	public List<OperationCodeCommision> findAllWithOrderBy();


	@Query("SELECT r from OperationCodeCommision r where r.type like %:type%")
	Page<OperationCodeCommision> findAllBytypeFiltred(Pageable pageable,String type);
	
	Optional<OperationCodeCommision> findByIdentification(String identification);
	@Query("SELECT r from OperationCodeCommision r")
	Page<OperationCodeCommision> findAllFiltred(Pageable pageable);
	@Query("SELECT occ.identification FROM OperationCodeCommision occ WHERE occ.code = :typeOperation ")
	String getIdentification(int typeOperation);
	public OperationCodeCommision findFirstByIdentification(String identification);
	
}

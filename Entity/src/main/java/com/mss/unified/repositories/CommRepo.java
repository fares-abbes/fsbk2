package com.mss.unified.repositories;

import com.mss.unified.entities.Comm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface CommRepo extends JpaRepository<Comm, Integer> {
	@Query("select r from Comm r where r.program.id = ?1")
    Optional<List<Comm>> findByProgramId(int programId);
	
	@Query("select r from Comm r where r.program.id = ?1 and r.transaction.codeTransaction= ?2 and r.transactionSource= ?3")
	List<Comm> findByProgramIdAndTransactionCode(int programId,String transactionCode,Integer transactionSource);

	@Query(value = "SELECT c FROM Comm c INNER JOIN Card cr ON c.program.programCode = cr.programeId WHERE cr.cardNum = :numcard AND c.transactionSource = :transactionSource AND c.transaction.codeTransaction = :trans")
	List<Comm> findCommissionByNumcardAndTrxSourceAndTrans(String numcard, Integer transactionSource , String trans);

}

package com.mss.unified.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
import com.mss.unified.entities.TotalAmountInter;


public interface TotalAmntInterRepository extends JpaRepository<TotalAmountInter, Integer> {

	@Transactional
	@Modifying
	@Query("delete from TotalAmountInter A where A.fileDate=:fileDate ")
	void deleteByFileDate(String fileDate);

	@Query("select A from TotalAmountInter A where A.fileDate=:fileDate and A.type=:type ")
	List<TotalAmountInter> findByFileDateAndType(String fileDate, String type);

}
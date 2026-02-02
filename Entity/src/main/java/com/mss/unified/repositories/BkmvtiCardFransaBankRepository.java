package com.mss.unified.repositories;

import com.mss.unified.entities.BkmvtiCardFransaBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface BkmvtiCardFransaBankRepository extends JpaRepository<BkmvtiCardFransaBank, Integer> {
	@Query("select A from BkmvtiCardFransaBank A order by A.numEvenement ASC")
	List<BkmvtiCardFransaBank> getListByEve();


}

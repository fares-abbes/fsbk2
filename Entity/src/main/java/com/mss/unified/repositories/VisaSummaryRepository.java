package com.mss.unified.repositories;


import com.mss.unified.entities.VisaSummary;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface VisaSummaryRepository extends JpaRepository<VisaSummary,Integer> {
	
	 boolean existsBySettlementDate(String s);
	  
	  @Query("select A from VisaSummary A where A.summary_date=:date")
	  VisaSummary findByDate(String date);
	  @Query("select A from VisaSummary A where A.treat is null")
	  List<VisaSummary> findByTreatNull();
	  @Query("select A from VisaSummary A where A.treat= 'M'")
	  List<VisaSummary> findByTreatM();
	@Query("select A from VisaSummary A where A.treat = 'M' or A.treat = '1'")
	  List<VisaSummary> findByTreated();


	@Query("select A from VisaSummary A where A.summary_date=:date")
	  Optional<VisaSummary> findBydateCompensation(String date);
	  List<VisaSummary> findByTreatTransactionListIsNull();
	  List<VisaSummary> findAllByArchived(int achived);
//	@Query("SELECT A.summaryCode from VisaSummary A where TO_DATE(A.summary_date, 'yyyy-mm-dd') between TO_DATE(:dateDebut, 'yyyy-mm-dd') " +
//			"and TO_DATE(:dateFin, 'yyyy-mm-dd')")
	@Query("SELECT A.summaryCode FROM VisaSummary A  WHERE CAST(A.summary_date AS date) BETWEEN CAST(:dateDebut AS date) AND CAST(:dateFin AS date)")
	List<Integer> getCodeBySummaryDateBetween(String dateDebut,String dateFin);

}

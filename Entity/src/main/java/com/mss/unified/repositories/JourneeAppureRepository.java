package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.JourneeAppuree;
@Repository
public interface JourneeAppureRepository extends JpaRepository<JourneeAppuree, Integer>{
	
	List <JourneeAppuree> findByDateFichier(String date);
	@Modifying
	@Transactional
	@Query("delete  from JourneeAppuree A where   dateFichier =:date  and type = :type ")
	void deleteByDateFichierAndType(String date,String type);
	@Modifying
	@Transactional
	@Query("delete  from JourneeAppuree A where   dateFichier =:date  ")
	void deleteByDateFichier(String date);

	@Query("SELECT A  from JourneeAppuree A where (:date is null or  dateFichier like %:date% ) and (:type is null or type like %:type% ) ")
	Page<JourneeAppuree> findByPage(Pageable pageable, String date, String type);

 
	Optional<JourneeAppuree> findByDateFichierAndType(String date, String type);

	List<JourneeAppuree> findByDateFichierAndStatus(String date, String status);

	Optional<JourneeAppuree> findByDateFichierAndStatusAndType(String date, String status, String type);

	@Query("select s from JourneeAppuree s where s.type in ('BCT') and s.dateFichier = :dateFichier")
	JourneeAppuree findNostroNationalData(String dateFichier);

	@Query("select s from JourneeAppuree s where s.type in ('VISA','MCD') and s.dateFichier in (select distinct(fileDate) from DayOperationInternational)")
	List<JourneeAppuree> findNostroInternationalData();

	@Query("select s from JourneeAppuree s where s.type in ('MCD') and s.status='A' and s.dateFichier in (select distinct(fileDate) from DayOperationInternational)")
	List<JourneeAppuree> findClearedMcdData();

	@Query("select s from JourneeAppuree s where s.type in ('VISA','MCD','BCT') and s.dateFichier = :dateFichier and s.status = 'D'")
	List<JourneeAppuree> findNostroData(String dateFichier);
	@Query("select s from JourneeAppuree s where s.type = :type and s.dateFichier = :dateFichier and s.status = 'D'")
	List<JourneeAppuree> findAppurementByTypeAndDateFichierAndDone(String type,String dateFichier);
}

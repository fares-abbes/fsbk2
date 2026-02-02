package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.FileTpHeader;
@Repository
public interface AtmFileHeaderRepository extends JpaRepository<FileTpHeader,Integer>{
	Optional<FileTpHeader> findByfileDate(String date);    
	List<FileTpHeader> findByfileName(String fileName);    
	@Query("SELECT B from FileTpHeader B where B.fileName=:file and B.fileDate=:fileDate")    
	FileTpHeader getSummary(String file, String fileDate);    
	Optional<FileTpHeader> findByFileNameAndFileDate(String filename, String fileDate);    
	Optional<FileTpHeader> findByFileNameAndFileprocessingDate(String filename, String fileprocessingDate);

}

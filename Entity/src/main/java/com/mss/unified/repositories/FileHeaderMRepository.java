package com.mss.unified.repositories;

import com.mss.unified.entities.FileHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.FileHeaderM;

import java.util.List;
import java.util.Optional;

@Repository
public interface FileHeaderMRepository extends JpaRepository<FileHeaderM, Integer> {
    List<FileHeaderM> findByfileDate(String date);
    List<FileHeaderM> findByfileName(String fileName);
    @Query("SELECT B from FileHeaderM  B where B.fileName=:file and B.fileDate=:fileDate")
    FileHeaderM getSummary(String file,String fileDate);
    Optional<FileHeaderM> findByFileNameAndFileDate(String filename,String fileDate);


    Optional<FileHeaderM> findByFileNameAndFileprocessingDate(String filename,String fileprocessingDate);

    // Find by file status
    List<FileHeaderM> findByStatusFile(String statusFile);

}

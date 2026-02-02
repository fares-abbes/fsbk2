package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.mss.unified.entities.FileHeader;
import com.mss.unified.entities.FileHeaderT;

@Repository
public interface FileTRepository  extends JpaRepository<FileHeaderT,Integer> {


    Optional<FileHeader> findByfileDate(String date);
    List<FileHeader> findByfileName(String fileName);
    @Query("SELECT B from FileHeaderT B where B.fileName=:file and B.fileDate=:fileDate")
    FileHeader getSummary(String file,String fileDate);
    Optional<FileHeader> findByFileNameAndFileDate(String filename,String fileDate);


    Optional<FileHeader> findByFileNameAndFileprocessingDate(String filename,String fileprocessingDate);



}

package com.mss.unified.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mss.unified.entities.FileContent;
import com.mss.unified.entities.FileProcessed;
import com.mss.unified.entities.StatusFileContent;
import com.mss.unified.entities.SummaryCompensationOnUs;

public interface StatusFileContentRepository extends JpaRepository<StatusFileContent, Integer> {

}

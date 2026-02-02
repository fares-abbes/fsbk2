package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mss.unified.entities.*;

@Repository
public interface FileUsedRepository extends JpaRepository<FileUsed, Integer> {

	List<FileUsed> findByFileIntegration(String fileIntegration);
	List<FileUsed> findByFileIntegrationAndTypeFile(String fileIntegration,String typeFile);

}

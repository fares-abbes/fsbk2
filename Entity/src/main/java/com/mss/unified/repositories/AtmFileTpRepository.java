package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.FileTP;
@Repository
public interface AtmFileTpRepository extends JpaRepository<FileTP, String>{

}

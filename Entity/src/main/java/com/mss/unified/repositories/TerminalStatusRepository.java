package com.mss.unified.repositories;

import com.mss.unified.entities.TerminalStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface TerminalStatusRepository extends JpaRepository<TerminalStatus, Integer > {
    TerminalStatus findByTerstatCode(int code);
}

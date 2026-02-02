package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.ElectoricJournal;

@Repository
public interface ElectoricJournalRepository   extends JpaRepository<ElectoricJournal, Integer> {

}

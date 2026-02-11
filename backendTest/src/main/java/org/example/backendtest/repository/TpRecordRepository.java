package org.example.backendtest.repository;

import org.example.backendtest.dto.TpRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TpRecordRepository extends JpaRepository<TpRecord, Long> {
}
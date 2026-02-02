package com.mss.unified.repositories;

import com.mss.unified.entities.PosEntryModeTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PosEntryModeTypesRepository extends JpaRepository<PosEntryModeTypes, Integer> {
    PosEntryModeTypes findByPosEntryModeCode(int code);
    PosEntryModeTypes findByType(String type);
}

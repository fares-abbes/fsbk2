package com.mss.unified.repositories;


import com.mss.unified.entities.AtmCassetteCount;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Vector;


@Repository
public interface AtmCassetteCountRepository extends PagingAndSortingRepository<AtmCassetteCount,String> {
    @Query("Select e from AtmCassetteCount e Where e.atmCassetteCountId.atmCassTerminalId=:terminalId ")
    Vector<AtmCassetteCount>  findByTerminalId (@Param("terminalId") String terminalId);



}

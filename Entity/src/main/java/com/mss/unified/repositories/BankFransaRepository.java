package com.mss.unified.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.BankFransaBank;
import com.mss.unified.entities.DayOperationFransaBank;

@Repository
public interface BankFransaRepository extends JpaRepository<BankFransaBank, String> {
    Optional<BankFransaBank> findByLibelle(String libelle);

    @Query("select M from BankFransaBank M where M.code=:code  ")
    Optional<BankFransaBank> findByCodeBanque(String code);
}
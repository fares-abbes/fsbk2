package com.mss.unified.repositories;

import com.mss.unified.entities.CodeBankBC;
import com.mss.unified.entities.TvaCommissionFransaBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CodeBankBCRepository extends JpaRepository<CodeBankBC, Integer> {
    @Query("select A from CodeBankBC A ")
    CodeBankBC findIdentifiant();
}

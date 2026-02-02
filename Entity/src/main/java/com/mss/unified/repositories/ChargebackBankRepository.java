package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.ChargebackBank;
@Repository
public interface ChargebackBankRepository extends JpaRepository<ChargebackBank,String> {

}

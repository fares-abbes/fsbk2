package com.mss.unified.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.CurrencyFSBK;

@Repository
public interface CurrencyFSBKRepository extends JpaRepository<CurrencyFSBK,String> {

}

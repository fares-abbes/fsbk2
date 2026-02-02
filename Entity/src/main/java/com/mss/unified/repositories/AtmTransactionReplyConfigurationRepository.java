package com.mss.unified.repositories;

import com.mss.unified.entities.AtmTransactionReplyConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtmTransactionReplyConfigurationRepository extends JpaRepository<AtmTransactionReplyConfiguration,Integer> {
	AtmTransactionReplyConfiguration findByAtmTransactionReplyConfigurationCode(Integer code);
}

package com.mss.unified.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mss.unified.entities.NationalAcquirerFiid;

public interface NationalAcquirerFiidRepository extends JpaRepository<NationalAcquirerFiid,Integer> {
	
	Optional<NationalAcquirerFiid> findByBin(String de32);
	
	Optional<NationalAcquirerFiid> findByBankCode(String bankCode);
}

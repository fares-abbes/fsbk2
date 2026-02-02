package com.mss.unified.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.CustomerStatus;
@Repository
public
interface CustomerStatusRepository  extends JpaRepository< CustomerStatus, Integer > {
	CustomerStatus findByIdentificationTypeCode(int code);

	CustomerStatus findByLibelle(String libelle);

	CustomerStatus findByFsbkCode(String fsbkCode);

}

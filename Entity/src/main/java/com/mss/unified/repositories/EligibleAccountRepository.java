package com.mss.unified.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.EligibleAccount;

@Repository
public interface EligibleAccountRepository extends JpaRepository< EligibleAccount,Integer > {
	@Query("select s from EligibleAccount s where s.label like %:libelle%")
    Page<EligibleAccount> getPageEligibleAccount(Pageable pageable,String libelle);
}

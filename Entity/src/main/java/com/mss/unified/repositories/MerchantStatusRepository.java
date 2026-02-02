package com.mss.unified.repositories;


import com.mss.unified.entities.MerchantStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public
interface MerchantStatusRepository  extends JpaRepository <MerchantStatus, Integer > {
    MerchantStatus findByMerchantStatCode(int merchantStatCode);
    MerchantStatus findByLibelle(String libelle);
}

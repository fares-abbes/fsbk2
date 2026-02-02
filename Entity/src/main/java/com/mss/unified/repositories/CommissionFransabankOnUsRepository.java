package com.mss.unified.repositories;

import com.mss.unified.entities.CommissionFransaBank;
import com.mss.unified.entities.CommissionFransabankOnUs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionFransabankOnUsRepository extends JpaRepository<CommissionFransabankOnUs, Integer> {
    @Query("select A from CommissionFransabankOnUs A where  A.type=:type ")
    CommissionFransabankOnUs findByType(String type);
    
    @Query("select A from CommissionFransabankOnUs A where  A.type=:type and A.paiementInternet='1'")
    CommissionFransabankOnUs findByTypeAchatInternetMin(String type);
    
    @Query("select A from CommissionFransabankOnUs A where  A.type=:type and A.paiementInternet is null")
    CommissionFransabankOnUs findByTypeAchatInternetMax(String type);
}

package com.mss.unified.repositories;


import com.mss.unified.entities.AgenceAdministration;
import com.mss.unified.entities.AgenceId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AgenceAdministrationRepository extends JpaRepository<AgenceAdministration, AgenceId> {
    List<AgenceAdministration> findByCodeZone(int id);
    Optional<AgenceAdministration> findByInitial(String initial);
    Optional<AgenceAdministration> findByCodeAgence(int id);
    @Query("SELECT r from AgenceAdministration r where r.initial like %:initial% and r.initialZone in (SELECT b.initial from Zone b where b.initial like %:initialZone% and b.initialRegion like %:initialRegion%) ")
    List<AgenceAdministration> findByInitialAndInitialZoneAndInitialRegion(String initial, String initialZone, String initialRegion);
    List<AgenceAdministration> findByCodeZone(Integer zone);
    @Query("select a from AgenceAdministration a where a.codeAgence = ?1")
    List<AgenceAdministration> findAllByAgence(int code);
    @Query("select a from AgenceAdministration a where codeZone =:code")
    List<AgenceAdministration> findAllByZone(int code);
    @Query("select a from AgenceAdministration a where codeZone in ( select codeZone from Zone  where codeRegion in (select codeRegion from Region where codeRegion=:code))")
    List<AgenceAdministration> findAllByRegion(int code);
    
    @Query("SELECT r from AgenceAdministration r where r.codeAgence=:id")
    Optional<AgenceAdministration> findByIdAgence(int id);
    
    
    @Query("select a from AgenceAdministration a where a.codeAgence =:code")
    AgenceAdministration findoneBycode(int code);
    
    
    @Query("select ag from AgenceAdministration ag, Account A, Merchant M where ag.codeAgence = A.idAgence and A.accountCode=M.account and M.merchantCode=:code")
    AgenceAdministration findoneWithMerchant(int code);
    
}

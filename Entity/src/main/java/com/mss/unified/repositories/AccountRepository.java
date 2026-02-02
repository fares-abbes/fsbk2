package com.mss.unified.repositories;


import com.mss.unified.entities.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository  extends JpaRepository < Account, Integer > {
    Optional<Account> findByAccountCode(int accountCode);
    @Query("Select e from Account e Where e.customerCode=:code")
    Optional<Account> findByCustomerCode(String code);
    
    @Query("Select e from Account e Where e.customerCode=:code")
    List<Account> findAllByCustomerCode(String code);
    
    @Query("Select e from Account e Where e.customerCode=:code")
    Page<Account> findAllByCustomerCodeWithPagination(Pageable pageable,String code);
    
    @Query("Select e from Account e Where e.accountNum=:accountNum and e.idAgence=:idAgence")
    Optional<Account> findByAccountNumAndBranch(String accountNum,Integer idAgence);
    
    boolean existsByAccountNum(String  accountNum);
    boolean existsByAccountType(int  libNum);
    Account findByAccountNum(String accountNumber);
    @Query("Select e from Account e Where e.accountNum=:code ")
    Account findByNumLib(@Param("code") String code);
    @Query("Select e from Account e Where e.accountNum=:code and (e.accountType=1 or e.accountType=2)")
    Account findByNumLibStatus(@Param("code") String code);
    @Query("Select count(*) from Account e Where e.accountNum=:code and e.accountType=:libelle")
    int findPrep(@Param("code") String code,@Param("libelle") int libelle);
    Optional<List<Account>> findByAccountType(int libNum);
    @Query("Select e from Account e where e.accountType=2 and e.accountNum=:accountNumber")
    Optional<List<Account>> findAccount(@Param("accountNumber") String accountNumber);

    @Query("select a from Account a where a.accountNum = ?1")
    Optional<Account> findByAccountNbr(String accountNum);
    @Query("select a from Account a, Card c where a.accountCode=c.accCode and c.agencyCode in :codes and a.astCode =:astCode and a.accountNum like %:numAccount% and SUBSTRING(acc_num,8,6)!='100300'")
    Page<Account> findAllByAgenceAndStatusAndNum(Pageable pageable, List<String> codes, int astCode, String numAccount);

    @Query("select a from Account a, Card c where a.accountCode=c.accCode and c.agencyCode in :codes and a.accountNum like %:numAccount% and SUBSTRING(acc_num,8,6)!='100300'")
    Page<Account> findAllByAgenceAndWithoutStatusAndNum(Pageable pageable, List<String> codes, String numAccount);
    boolean existsByCustomerCode(String customerCode);

    Page<Account> findAllByCustomerCodeAndIdAgence(Pageable pageable,String code,Integer idAgence);
   
    @Query("select a from Account a where a.idAgence = ?1")
    List<Account> findAllByAgence(int code);
    
    @Query("select a from Account a where a.idAgence = ?1")
    Page<Account> findAllByAgence(Pageable pageable,int code);
    
//    @Query("select a from Account a where a.idAgence =:code and a.astCode =:astCode and a.accountNum like %:numAccount%")
//    Page<Account> findAllByAgenceAndStatusAndNum(Pageable pageable, int code, int astCode, String numAccount);
//
//    @Query("select a from Account a where a.idAgence =:code  and a.accountNum like %:numAccount%")
//    Page<Account> findAllByAgenceAndWithoutStatusAndNum(Pageable pageable, int code, String numAccount);

    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration  where codeZone =:code)")
    List<Account> findAllByZone(int code);
    
    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration  where codeZone =:code)")
    Page<Account> findAllByZone(Pageable pageable,int code);
    
    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration  where codeZone =:code) and a.astCode =:astCode and a.accountNum like %:numAccount% ")
    Page<Account> findAllByZoneAndStatusAndNum(Pageable pageable,int code, int astCode, String numAccount);
    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration  where codeZone =:code) and a.accountNum like %:numAccount% ")
    Page<Account> findAllByZoneAndWithoutStatusAndNum(Pageable pageable,int code, String numAccount);

    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration where codeZone in ( select codeZone from Zone  where codeRegion in (select codeRegion from Region where codeRegion=:code)))")
    List<Account> findAllByRegion(int code);
    
    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration where codeZone in ( select codeZone from Zone  where codeRegion in (select codeRegion from Region where codeRegion=:code)))")
    Page<Account> findAllByRegion(Pageable pageable,int code);

    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration where codeZone in ( select codeZone from Zone  where codeRegion in (select codeRegion from Region where codeRegion=:code))) and a.accountNum like %:numAccount% ")
    Page<Account> findAllByRegionAndWithoutStatusAndNum(Pageable pageable,int code, String numAccount);
    @Query("select a from Account a where a.idAgence in (select codeAgence from AgenceAdministration where codeZone in ( select codeZone from Zone  where codeRegion in (select codeRegion from Region where codeRegion=:code))) and a.astCode =:astCode and a.accountNum like %:numAccount% ")
    Page<Account> findAllByRegionAndStatusAndNum(Pageable pageable,int code, int astCode, String numAccount);

    @Query("select a from Account a where a.astCode =:astCode and a.accountNum like %:numAccount% and SUBSTRING(acc_num,8,6)!='100300'")
    Page<Account> findAllByRegionwithstatus(Pageable pageable,int astCode, String numAccount);

    @Query("select a from Account a where a.accountNum like %:numAccount% and SUBSTRING(acc_num,8,6)!='100300' ")
    Page<Account> findAllByRegionwithoutstatus(Pageable pageable,String numAccount);
    
    @Query("select a from Account a, AgenceAdministration ag where a.idAgence=ag.codeAgence and a.accountNum=:numAccount and ag.initial=:initial ")
    Account findAccountByAgence(String numAccount,String initial);
    

}

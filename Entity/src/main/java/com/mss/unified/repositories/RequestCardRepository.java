package com.mss.unified.repositories;

import com.mss.unified.entities.RequestCard;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface RequestCardRepository extends JpaRepository<RequestCard,Integer> {
    Optional<List<RequestCard>> findByAccountNumber(int AccountNumber);
    Optional <List<RequestCard>> findByCreationDate(String DateCreation);
    
    @Query("select a from RequestCard a where a.accountNumber like %:accountNumber% and a.creationDate like %:creationDate% and a.cin like %:cin% and a.preValidation=0")
    Page<RequestCard> getRequests(Pageable pageable, String accountNumber, String creationDate, String cin);
    
    @Query("select a from RequestCard a where a.accountNumber like %:accountNumber% and a.creationDate like %:creationDate% and a.cin like %:cin% and a.requestStatus=:status and a.preValidation=0")
    Page<RequestCard> getRequestsWithStatus(Pageable pageable, String accountNumber, String creationDate, String cin,int status);
    
    
    @Query("select a from RequestCard a where a.accountNumber like %:accountNumber% and a.creationDate like %:creationDate% and a.cin like %:cin% and a.preValidation=0 and a.idAgence=:idAgence")
    Page<RequestCard> getRequestsWithBranch(Pageable pageable, String accountNumber, String creationDate, String cin,int idAgence);
    
    @Query("select a from RequestCard a where a.accountNumber like %:accountNumber% and a.creationDate like %:creationDate% and a.cin like %:cin% and a.requestStatus=:status and a.preValidation=0 and a.idAgence=:idAgence")
    Page<RequestCard> getRequestsWithStatusAndBranch(Pageable pageable, String accountNumber, String creationDate, String cin,int status,int idAgence);
    
    
    
    @Query("select a from RequestCard a where a.idAgence=:branch and a.accountNumber like %:accountNumber% and a.creationDate like %:creationDate% and a.cin like %:cin% and a.preValidation=1")
    Page<RequestCard> getRequestsForValidation1(Pageable pageable, String accountNumber, String creationDate, String cin,Integer branch);
    
    @Query("select a from RequestCard a where a.accountNumber=:accountNumber and a.product=:product and a.requestStatus=2")
    List<RequestCard> getByNumAccountAndProduct(String accountNumber,int product);
    
    Optional<List<RequestCard>> findByAccountNumberAndProduct(String accountNumber, int product);

    Optional<List<RequestCard>> findByAccountNumber(String AccountNumber);

}

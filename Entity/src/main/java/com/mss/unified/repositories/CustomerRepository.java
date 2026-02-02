package com.mss.unified.repositories;


import com.mss.unified.entities.Customer;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository  extends JpaRepository< Customer,String > {
    Optional<Customer> findByCustomerCode(int customerCode);
    Optional<Customer>   findByCustomerIdentidy(String customerCode);
    
    
    List<Customer> findByCustomerIdentidyAndCustomerName(String customerCode,String customerName);

    @Query("Select c from Customer c where c.customerStatusCode=:status and c.customerIdentidy like %:identity%")
    List<Customer> findAllWithFilters(String identity, int status);

    @Query("Select c from Customer c where c.customerIdentidy like %:identity%")
    List<Customer> findAllWithoutStatus(String identity);
    
    @Query("Select c from Customer c where c.customerStatusCode=:status and c.customerIdentidy like %:identity%")
    Page<Customer> findAllWithFilters(Pageable pageable,String identity, int status);

    @Query("Select c from Customer c where c.customerIdentidy like %:identity%")
    Page<Customer> findAllWithoutStatus(Pageable pageable,String identity);
    
    @Query("Select cu from Customer cu, Account a, Card c where cu.customerCode=a.customerCode and a.accountCode=c.accCode and c.agencyCode in :codes and cu.customerStatusCode=:status and cu.customerIdentidy like %:identity%")
    Page<Customer> findAllWithFilters(Pageable pageable,String identity, int status,List<String> codes);
    

    @Query("Select cu from Customer cu, Account a, Card c where cu.customerCode=a.customerCode and a.accountCode=c.accCode and c.agencyCode in :codes and cu.customerIdentidy like %:identity%")
    Page<Customer> findAllWithoutStatus(Pageable pageable,String identity,List<String> codes);
}

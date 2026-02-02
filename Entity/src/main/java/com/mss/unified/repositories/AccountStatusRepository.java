package com.mss.unified.repositories;

import com.mss.unified.entities.AccountStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountStatusRepository extends JpaRepository<AccountStatus, String>{
    AccountStatus findByAstCode(String code);
    
    AccountStatus findByFsbkCode(String fsbkCode); 

}

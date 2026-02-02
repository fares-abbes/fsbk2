package com.mss.unified.repositories;



import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.mss.unified.entities.StoreAndForward;              
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Repository
public interface StoreAndForwardRepository extends JpaRepository<StoreAndForward, Integer>{
	
	
    @Query("select c from StoreAndForward c where c.destinationInterface=:destination and c.attempt < 3  and c.insertionDate > CONVERT(DATETIME,:date) and c.status is null and c.storeAndForwardMti in ('1420','1421') order by c.insertionDate ASC")
	List<StoreAndForward> getPendingReversals(String destination,String date);
    
//    
//    @Query("select c from StoreAndForward c where c.destinationInterface=:destination and c.attempt < 3  and c.insertionDate > CONVERT(DATETIME,:date) and c.status is null and c.storeAndForwardMti in ('0220','0221','1220','1221')")
//	List<StoreAndForward> getPendingAuth(String destination,String date);
    
    
    @Query("select c from StoreAndForward c where c.destinationInterface=:destination and c.attempt < 3  and c.insertionDate > CONVERT(DATETIME,:date) and c.status is null order by c.insertionDate ASC")
   	List<StoreAndForward> getPendingTransactions(String destination,String date);
    
    
    @Query("select c from StoreAndForward c where c.destinationInterface='HOST' and c.storeAndForwardMti in ('0220','0221') and c.switchPan=:pan and c.switchRRN=:de37 "
    		+ "and c.switchStan=:de11 and c.switchProcessingCode=:de03")
   	Optional<StoreAndForward> getAuthAdvice(String pan,String de37,String de11,String de03);
    
    
    @Query("select c from StoreAndForward c where c.destinationInterface='HOST' and c.validatedBy is not null")
   	Page<StoreAndForward> getValidatedAdvices(Pageable pageable);

}

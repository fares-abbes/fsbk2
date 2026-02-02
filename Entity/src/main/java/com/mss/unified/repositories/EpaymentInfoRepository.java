package com.mss.unified.repositories;


import com.mss.unified.entities.EpaymentInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EpaymentInfoRepository extends JpaRepository<EpaymentInfo ,Integer>{
	
	@Query("select e from EpaymentInfo e where e.creationDate=(select max(s.creationDate) from EpaymentInfo s where s.yearInYy=:date)")
	Optional<EpaymentInfo> getRowMax(String date);
	
	
	@Query("select e from EpaymentInfo e where e.statusFile=1 order by e.creationDate ASC")
	List<EpaymentInfo> getInfoToProcess();
	
	
	@Query("select c from EpaymentInfo c where c.branch like %:agencyCode% and c.cardNum like %:pan% order by c.modifDate")
	Page<EpaymentInfo> getInfos(Pageable pageable,String agencyCode,String pan);

}

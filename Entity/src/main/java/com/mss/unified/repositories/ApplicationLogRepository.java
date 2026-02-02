package com.mss.unified.repositories;
import com.mss.unified.entities.ApplicationLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ApplicationLogRepository  extends JpaRepository<ApplicationLog,Integer> {

}

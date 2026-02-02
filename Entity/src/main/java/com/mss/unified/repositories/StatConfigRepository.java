package com.mss.unified.repositories;



import com.mss.unified.entities.StatConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface StatConfigRepository extends JpaRepository<StatConfig,String > {

}

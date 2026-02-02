package com.mss.unified.repositories;


import com.mss.unified.entities.EmvServiceApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmvServiceAppRepository  extends JpaRepository<EmvServiceApp,Integer> {
}

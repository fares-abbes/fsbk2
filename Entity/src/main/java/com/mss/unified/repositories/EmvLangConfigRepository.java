package com.mss.unified.repositories;


import com.mss.unified.entities.EmvLangConfig;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmvLangConfigRepository  extends JpaRepository<EmvLangConfig,Integer> {

}

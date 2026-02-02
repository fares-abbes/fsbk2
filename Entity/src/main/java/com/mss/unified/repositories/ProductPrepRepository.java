package com.mss.unified.repositories;

import com.mss.unified.entities.ProductPrepayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductPrepRepository extends JpaRepository<ProductPrepayer, Integer> {

	
}

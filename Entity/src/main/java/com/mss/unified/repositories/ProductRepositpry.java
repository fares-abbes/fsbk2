package com.mss.unified.repositories;

import com.mss.unified.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public
interface ProductRepositpry  extends JpaRepository<Product,Integer> {
    Optional<Product> findByProductCode(int code);
    
//    Optional<Product>  findByFsbkProductCode(String fsbkProductCode);
    
//    Optional<Product> findByProductNum(Integer num);
}

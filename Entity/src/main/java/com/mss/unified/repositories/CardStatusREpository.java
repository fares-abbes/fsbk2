package com.mss.unified.repositories;


import com.mss.unified.entities.CardStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public interface CardStatusREpository  extends JpaRepository < CardStatus, Integer > {
    CardStatus findByCardStatusCode(int cardCode);
}

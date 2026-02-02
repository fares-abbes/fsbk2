package com.mss.unified.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.typeCard;


@Repository
public interface typeCardRepository extends JpaRepository<typeCard, Integer> {
Optional<typeCard> findByTypeCode(int code);
}

package com.mss.unified.repositories;

import com.mss.unified.entities.Card;
import com.mss.unified.entities.CommissionAchatFransaBank;
import com.mss.unified.entities.CommissionFransaBank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommissionAchatFransaBankRepository extends JpaRepository<CommissionAchatFransaBank, Integer> {
    Optional<CommissionAchatFransaBank> findByCode(Integer code);
}

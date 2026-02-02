package com.mss.unified.repositories;

import com.mss.unified.entities.AtmMerchant;
import com.mss.unified.entities.Merchant;
import com.mss.unified.entities.MerchantException;
import com.mss.unified.entities.PosModel;
import com.mss.unified.entities.PosTerminal;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Repository
public interface MerchantExceptionRepository extends JpaRepository<MerchantException, Integer> {

}

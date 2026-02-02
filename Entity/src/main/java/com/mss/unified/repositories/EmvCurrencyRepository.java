package com.mss.unified.repositories;

import com.mss.unified.entities.EmvCurrency;
import com.mss.unified.references.IccCurrData;

import java.util.Vector;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmvCurrencyRepository extends JpaRepository<EmvCurrency,String> {
    @Query("Select new com.mss.unified.references.IccCurrData(e.currOrder, b.currCodeID, b.currExp)"
            + " from EmvCurrency e, CurrencyValue b Where e.ecmCode=:configId "
            + "and b.currCodeID=e.currCode")
    public Vector<IccCurrData> findByFitsConfigId(@Param("configId") String configId);


}

package com.mss.unified.repositories;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mss.unified.entities.BinOnUs;
import com.mss.unified.entities.StockBin;              



@Repository
public interface StockBinRepository extends JpaRepository<StockBin, Integer>{
	//   @Query("select a.libelle,b from BinOnUs a,StockBin b where a.binOnUsCode=b.codeBinOnUs")                  
	  @Query("select s.codeBinOnUs,s.stockSatim,s.stockConsome,s.stockDisponible,s.stockReserve,b.libelle,b.binOnUsCode,b.bouLowBin,b.bouHighBin,s.damagedCards from  BinOnUs b  LEFT JOIN StockBin s ON b.binOnUsCode=s.codeBinOnUs")
       List<Object[]> AllBinOnUsStock();

 //get stock dispo 
	    @Query("Select s from StockBin s where s.codeBinOnUs=: codeBin")
	Optional<StockBin> getByBin(Integer codeBin);
		    @Query("Select s from BinOnUs b,StockBin s  Where b.binOnUsCode=:code and b.binOnUsCode=s.codeBinOnUs ")
		    StockBin findBybinOnUsCode( Integer code);
	  

}

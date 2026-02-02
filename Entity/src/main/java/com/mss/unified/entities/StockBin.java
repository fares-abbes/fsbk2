package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "BIN_ON_US_STOCK", schema = "PORTEUR")
public class StockBin {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "BinOnUsStockSequence")
    @SequenceGenerator(name = "BinOnUsStockSequence", sequenceName = "PORTEUR.BinOnUsStockSequence", allocationSize = 1)
    @Column(name = "binOnUsStockCode", nullable = false)
    private int binOnUsStockCode;
    
    
    @Column(name = "BIN_ON_US", nullable = false)
    private int codeBinOnUs;

    
    
    @Column(name = "STOCK_SATIM", nullable = false)
    private int stockSatim;
    
    @Column(name = "STOCK_CONSOME", nullable = false)
    private int stockConsome;
    
    @Column(name = "STOCK_DISPONIBLE", nullable = false)
    private int stockDisponible;

    
    @Column(name = "STOCK_RESERVE", nullable = false)
    private int stockReserve;
    
    @Column(nullable = false)
    private int damagedCards;

	public int getDamagedCards() {
		return damagedCards;
	}

	public void setDamagedCards(int damagedCards) {
		this.damagedCards = damagedCards;
	}

	public int getBinOnUsStockCode() {
		return binOnUsStockCode;
	}

	public int getStockSatim() {
		return stockSatim;
	}

	public void setStockSatim(int stockSatim) {
		this.stockSatim = stockSatim;
	}


	public void setBinOnUsStockCode(int binOnUsStockCode) {
		this.binOnUsStockCode = binOnUsStockCode;
	}

	public int getCodeBinOnUs() {
		return codeBinOnUs;
	}

	public void setCodeBinOnUs(int codeBinOnUs) {
		this.codeBinOnUs = codeBinOnUs;
	}


	public int getStockConsome() {
		return stockConsome;
	}

	public void setStockConsome(int stockConsome) {
		this.stockConsome = stockConsome;
	}

	public int getStockDisponible() {
		return stockDisponible;
	}

	public void setStockDisponible(int stockDisponible) {
		this.stockDisponible = stockDisponible;
	}

	public int getStockReserve() {
		return stockReserve;
	}

	public void setStockReserve(int stockReserve) {
		this.stockReserve = stockReserve;
	}


    
    

}

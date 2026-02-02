package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="POS_STOCK",schema="POS")
public class PosStock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosTerminalStockSequence")
	@SequenceGenerator(name = "PosTerminalStockSequence", sequenceName = "POS.PosTerminalStockSequence", allocationSize = 1)
	@Column(name = "ID_STOCK", nullable = false)
	private int idStock;
	
	@Column(name = "MODEL")
	private Integer model;
	
	 
    @Column(name = "STOCK_INITIAL")
    private int stockInitial;
    
    @Column(name = "STOCK_CONSOME")
    private int stockConsome;
    
    @Column(name = "STOCK_DISPONIBLE")
    private int stockDisponible;
    
    @Column(name = "STOCK_RESERVE")
    private int stockReserve;
    
    
    @Column(name = "STOCK_DEPLOYER")
    private int stockDeployer;
    

    @Column(name = "STOCK_HS")
    private int stockHS;
    
    @Column(name = "DATE_SAISIE")
	private String dateSaisie;

	public int getIdStock() {
		return idStock;
	}

	public void setIdStock(int idStock) {
		this.idStock = idStock;
	}

	

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public int getStockInitial() {
		return stockInitial;
	}

	public void setStockInitial(int stockInitial) {
		this.stockInitial = stockInitial;
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

	public int getStockDeployer() {
		return stockDeployer;
	}

	public void setStockDeployer(int stockDeployer) {
		this.stockDeployer = stockDeployer;
	}

	public int getStockHS() {
		return stockHS;
	}

	public void setStockHS(int stockHS) {
		this.stockHS = stockHS;
	}

	public String getDateSaisie() {
		return dateSaisie;
	}

	public void setDateSaisie(String dateSaisie) {
		this.dateSaisie = dateSaisie;
	}

	@Override
	public String toString() {
		return "PosStock [idStock=" + idStock + ", model=" + model + ", stockInitial=" + stockInitial
				+ ", stockConsome=" + stockConsome + ", stockDisponible=" + stockDisponible + ", stockReserve="
				+ stockReserve + ", stockDeployer=" + stockDeployer + ", stockHS=" + stockHS + ", dateSaisie="
				+ dateSaisie + "]";
	}

	


	
	
}

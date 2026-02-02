package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Montant_OutGoing_IPM", schema = "FRANSABANK")

public class MontantOutGoingIPM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
 	private Integer Code;
	private String dateInter;
	private double settlement;
	private double interchange;
	private String currency;
	public Integer getCode() {
		return Code;
	}
	public void setCode(Integer code) {
		Code = code;
	}

	public String getDateInter() {
		return dateInter;
	}
	public void setDateInter(String dateInter) {
		this.dateInter = dateInter;
	}
	public double getSettlement() {
		return settlement;
	}
	public void setSettlement(double settlement) {
		this.settlement = settlement;
	}
	public double getInterchange() {
		return interchange;
	}
	public void setInterchange(double interchange) {
		this.interchange = interchange;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		return "MontantOutGoingIPM [Code=" + Code + ", dateInter=" + dateInter + ", settlement=" + settlement
				+ ", interchange=" + interchange + ", currency=" + currency + "]";
	}
 
	
	
	 
}

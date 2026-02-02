package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "VisaRaport", schema = "FRANSABANK")
public class VisaRaport {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	private String raportDate;
	private String libelle;
	private Integer nbTrans;
	private Double settAmt;
	private Double interAmt;
	private String type;
	private String currency;
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String curency) {
		this.currency = curency;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Integer getNbTrans() {
		return nbTrans;
	}

	public void setNbTrans(Integer nbTrans) {
		this.nbTrans = nbTrans;
	}

	public Double getSettAmt() {
		return settAmt;
	}

	public void setSettAmt(Double settAmt) {
		this.settAmt = settAmt;
	}

	public Double getInterAmt() {
		return interAmt;
	}

	public void setInterAmt(Double interAmt) {
		this.interAmt = interAmt;
	}

	public String getRaportDate() {
		return raportDate;
	}

	public void setRaportDate(String raportDate) {
		this.raportDate = raportDate;
	}

	@Override
	public String toString() {
		return "VisaRaport [code=" + code + ", raportDate=" + raportDate + ", libelle=" + libelle + ", nbTrans="
				+ nbTrans + ", settAmt=" + settAmt + ", interAmt=" + interAmt + ", type=" + type + ", curency="
				+ currency + "]";
	}

}

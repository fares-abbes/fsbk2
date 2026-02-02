package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Chargeback_Bank", schema = "FRANSABANK")
public class ChargebackBank {
	@Id
	 private String Code;

	 private String libelle;



	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	 
	 

}

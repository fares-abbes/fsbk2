package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
@Table(name = "StatusChargeback", schema = "FRANSABANK")
public class StatusChargeback {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    @JsonProperty("statusCode")
    @Column(name = "status_code", nullable = false)
    int statusCode;
	String libelle;
	int type;
	String libelleBanque;
	String libelleAdmin;
	public String getLibelleBanque() {
		return libelleBanque;
	}
	public void setLibelleBanque(String libelleBanque) {
		this.libelleBanque = libelleBanque;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getLibelleAdmin() {
		return libelleAdmin;
	}
	public void setLibelleAdmin(String libelleAdmin) {
		this.libelleAdmin = libelleAdmin;
	}
	

}

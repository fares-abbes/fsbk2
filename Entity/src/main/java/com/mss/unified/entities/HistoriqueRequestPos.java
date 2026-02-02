package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="POS_REQUEST_HISTORIQUE",schema="POS")
public class HistoriqueRequestPos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "HistoriqueRequestPosSequence")
	@SequenceGenerator(name = "HistoriqueRequestPosSequence", sequenceName = "POS.HistoriqueRequestPosSequence", allocationSize = 1)
	@Column(name = "ID_HISTORIQUE", nullable = false)
	private int idHistorique;
	
	private int requestCode;
	
	 @Column(name = "STATU_DATE")
	  private Date dateStatu;
	 
	 @Column(name = "STATUT")
	 private String statut;
	 
	 @Column(name = "OPERATEUR")
	 private String operateur;

	public int getIdHistorique() {
		return idHistorique;
	}

	public void setIdHistorique(int idHistorique) {
		this.idHistorique = idHistorique;
	}

	public int getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(int requestCode) {
		this.requestCode = requestCode;
	}

	public Date getDateStatu() {
		return dateStatu;
	}

	public void setDateStatu(Date dateStatu) {
		this.dateStatu = dateStatu;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public String getOperateur() {
		return operateur;
	}

	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}

	@Override
	public String toString() {
		return "HistoriqueRequestPos [idHistorique=" + idHistorique + ", requestCode=" + requestCode + ", dateStatu="
				+ dateStatu + ", statut=" + statut + ", operateur=" + operateur + "]";
	}
	 
	 

}

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
@Table(name="COMMERCANT_HISTORIQUE",schema="POS")
public class HistoriqueCommercant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "HistoriqueCommercantSequence")
	@SequenceGenerator(name = "HistoriqueCommercantSequence", sequenceName = "POS.HistoriqueCommercantSequence", allocationSize = 1)
	@Column(name = "ID_HISTORIQUE", nullable = false)
	private int idHistorique;
	
	 private Integer merchantCode;
	
	 @Column(name = "STATU_DATE")
	  private Date dateStatu;
	 
	 @Column(name = "STATUT")
	 private String statut;

	public int getIdHistorique() {
		return idHistorique;
	}

	public void setIdHistorique(int idHistorique) {
		this.idHistorique = idHistorique;
	}

	public Integer getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(Integer merchantCode) {
		this.merchantCode = merchantCode;
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

	@Override
	public String toString() {
		return "HistoriqueCommercant [idHistorique=" + idHistorique + ", merchantCode=" + merchantCode + ", dateStatu="
				+ dateStatu + ", statut=" + statut + "]";
	}

	 
}

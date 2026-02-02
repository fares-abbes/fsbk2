package com.mss.unified.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( schema = "FRANSABANK",  name= "Synthese")
public class Synthese {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SyntheseSequence")
	@SequenceGenerator(name = "newSyntheseSequence", sequenceName = "FRANSABANK.SyntheseSequencens", allocationSize = 1)
    @Column(name = "code", nullable = false)
	private Integer code;
	private String onUsOffUs;
	private String transactionType;
	private Integer nb;
	private BigDecimal  montant;
	private BigDecimal  produit;
	private BigDecimal  cmi;
	private BigDecimal  cpi;
	private BigDecimal  interchange;
	private String codeBanque;
	private Integer idHeader;
	private String banqueException;

	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getOnUsOffUs() {
		return onUsOffUs;
	}
	public void setOnUsOffUs(String onUsOffUs) {
		this.onUsOffUs = onUsOffUs;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public Integer getNb() {
		return nb;
	}
	public void setNb(Integer nb) {
		this.nb = nb;
	}
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}
	public BigDecimal getProduit() {
		return produit;
	}
	public void setProduit(BigDecimal produit) {
		this.produit = produit;
	}
	public BigDecimal getCmi() {
		return cmi;
	}
	public void setCmi(BigDecimal cmi) {
		this.cmi = cmi;
	}
	public BigDecimal getCpi() {
		return cpi;
	}
	public void setCpi(BigDecimal cpi) {
		this.cpi = cpi;
	}
	public BigDecimal getInterchange() {
		return interchange;
	}
	public void setInterchange(BigDecimal interchange) {
		this.interchange = interchange;
	}
	public String getCodeBanque() {
		return codeBanque;
	}
	public void setCodeBanque(String codeBanque) {
		this.codeBanque = codeBanque;
	}
	public Integer getIdHeader() {
		return idHeader;
	}
	public void setIdHeader(Integer idHeader) {
		this.idHeader = idHeader;
	}
	public String getBanqueException() {
		return banqueException;
	}
	public void setBanqueException(String banqueException) {
		this.banqueException = banqueException;
	}
	
	

	
	
}

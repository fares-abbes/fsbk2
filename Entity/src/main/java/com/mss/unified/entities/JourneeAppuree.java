package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "Journee_Appuree", schema = "FRANSABANK")
public class JourneeAppuree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MP_CODE", nullable = false)
	private int mpCode;
	private String dateValeur;
	private String amount;
	private String numeroRefference;
	private String numeroRefferenceP;
	private String sign;
	private String dateFichier;
	private String type;
 	private String status;
	private String refS;
	private String devise;
	private String corresp;
	private String typeCompensation;
	private String chrono;
	private String amountTotal;
	private String systemDateAppurement;
	@Transient
	// dd-mm-yyyy
	private String dateIntegration;
	

	@Override
	public String toString() {
		return "JourneeAppuree [mpCode=" + mpCode + ", dateValeur=" + dateValeur + ", amount=" + amount
				+ ", numeroRefference=" + numeroRefference + ", sign=" + sign + ", dateFichier=" + dateFichier
				+ ", type=" + type + ", status=" + status + ", refS=" + refS + ", devise=" + devise + ", corresp="
				+ corresp + ", typeCompensation=" + typeCompensation + "]";
	}

	public String getDateValeur() {
		return dateValeur;
	}

	public void setDateValeur(String dateValeur) {
		this.dateValeur = dateValeur;
	}

	public String getDateFichier() {
		return dateFichier;
	}

	public void setDateFichier(String dateFichier) {
		this.dateFichier = dateFichier;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public int getMpCode() {
		return mpCode;
	}

	public void setMpCode(int mpCode) {
		this.mpCode = mpCode;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getNumeroRefference() {
		return numeroRefference;
	}

	public void setNumeroRefference(String numeroRefference) {
		this.numeroRefference = numeroRefference;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	public String getCorresp() {
		return corresp;
	}

	public void setCorresp(String corresp) {
		this.corresp = corresp;
	}

	public String getTypeCompensation() {
		return typeCompensation;
	}

	public void setTypeCompensation(String typeCompensation) {
		this.typeCompensation = typeCompensation;
	}

	public String getRefS() {
		return refS;
	}

	public void setRefS(String refS) {
		this.refS = refS;
	}

	public String getNumeroRefferenceP() {
		return numeroRefferenceP;
	}

	public void setNumeroRefferenceP(String numeroRefferenceP) {
		this.numeroRefferenceP = numeroRefferenceP;
	}

	public String getChrono() {
		return chrono;
	}

	public void setChrono(String chrono) {
		this.chrono = chrono;
	}

	public String getAmountTotal() {
		return amountTotal;
	}

	public void setAmountTotal(String amountTotal) {
		this.amountTotal = amountTotal;
	}

	public String getDateIntegration() {
		return dateIntegration;
	}

	public void setDateIntegration(String dateIntegration) {
		this.dateIntegration = dateIntegration;
	}

	public String getSystemDateAppurement() {
		return systemDateAppurement;
	}

	public void setSystemDateAppurement(String systemDateAppurement) {
		this.systemDateAppurement = systemDateAppurement;
	}
}

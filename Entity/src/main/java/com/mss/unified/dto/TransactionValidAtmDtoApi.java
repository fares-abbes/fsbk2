package com.mss.unified.dto;

public class TransactionValidAtmDtoApi {
	private String carte;
	private String date;
	private double montant;
	private String code_autorisation;
	private String affiliation;
	private String heure;
	private String transactionNumber;

	public TransactionValidAtmDtoApi(String carte, String date, double montant, String code_autorisation,
			String affiliation, String heure, String sequenceNumber) {
		super();
		this.carte = carte;
		this.date = date;
		this.montant = montant;
		this.code_autorisation = code_autorisation;
		this.affiliation = affiliation;
		this.heure = heure;
		this.transactionNumber = sequenceNumber.length() > 6 ? sequenceNumber.substring(sequenceNumber.length()-6,sequenceNumber.length()) : sequenceNumber;	
	}
	
	public String getCarte() {
		return carte;
	}

	public void setCarte(String carte) {
		this.carte = carte;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getCode_autorisation() {
		return code_autorisation;
	}

	public void setCode_autorisation(String code_autorisation) {
		this.code_autorisation = code_autorisation;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

}

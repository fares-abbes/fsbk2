package com.mss.unified.dto;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionValidPosDto {

	private String cardOwner;
    private String pan;
	private String aquirerBt;
	private String merchantId;
	private String terminalId;
	private String batchNumber;
	private String reversal;
	private String dateTransaction;
	private String heureTransaction;
	private String sequenceNumber;
	private String terminalName;
	private String banckName;
	private String terminalLocation;
	private String country;
	private String location;
	private double amountTransaction;
	private double adjustementAmount;
	private String experyDate;
	private String invoiceNumber;
	private String de38;
	private String transactionCurrency;
	private String autNumber;
	private int codeDetails;
	private String revarsalPos;
	private String compensePos;
	private String constatation;
	private Integer summaryCode;
	public TransactionValidPosDto(String reversal, String dateTransaction, String heureTransaction, String terminalId,
								  String merchantId, String terminalName, String pan, String experyDate, String de38,
								  double amountTransaction, String transactionCurrency, String aquirerBt, String cardOwner,
								  String revarsalPos) {
		super();
		this.reversal = reversal;
		this.dateTransaction = dateTransaction;
		this.heureTransaction = heureTransaction;
		this.terminalId = terminalId;
		this.merchantId = merchantId;
		this.terminalName = terminalName;
		this.pan = pan;
		this.experyDate = experyDate;
		this.de38 = de38;
		this.amountTransaction = amountTransaction;
		this.transactionCurrency = transactionCurrency;
		this.aquirerBt = aquirerBt;
		this.cardOwner = cardOwner;
		this.revarsalPos = revarsalPos;
	}

	public TransactionValidPosDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getReversal() {
		return reversal;
	}

	public void setReversal(String reversal) {
		this.reversal = reversal;
	}

	public String getDateTransaction() {
		return dateTransaction;
	}

	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}

	public String getHeureTransaction() {
		return heureTransaction;
	}

	public void setHeureTransaction(String heureTransaction) {
		this.heureTransaction = heureTransaction;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getExperyDate() {
		return experyDate;
	}

	public void setExperyDate(String experyDate) {
		this.experyDate = experyDate;
	}

	public String getDe38() {
		return de38;
	}

	public void setDe38(String de38) {
		this.de38 = de38;
	}

	public double getAmountTransaction() {
		return amountTransaction;
	}

	public void setAmountTransaction(double amountTransaction) {
		this.amountTransaction = amountTransaction;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public String getAquirerBt() {
		return aquirerBt;
	}

	public void setAquirerBt(String aquirerBt) {
		this.aquirerBt = aquirerBt;
	}

	public String getCardOwner() {
		return cardOwner;
	}

	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
	}

	public String getRevarsalPos() {
		return revarsalPos;
	}

	public void setRevarsalPos(String revarsalPos) {
		this.revarsalPos = revarsalPos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((de38 == null) ? 0 : de38.hashCode());
		result = prime * result + ((pan == null) ? 0 : pan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionValidPosDto other = (TransactionValidPosDto) obj;
		if (de38 == null) {
			if (other.de38 != null)
				return false;
		} else if (!de38.equals(other.de38))
			return false;
		if (pan == null) {
			if (other.pan != null)
				return false;
		} else if (!pan.equals(other.pan))
			return false;
		return true;
	}



}

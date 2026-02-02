package com.mss.unified.dto;

public class TransactionValidAtmDto {

	private String reversal;
	private String dateTransaction;
	private String heureTransaction;
	private String terminalId;
	private String terminalName;
	private String pan;
	private String experyDate;
	private String de38;
	private double amountTransaction;
	private String transactionCurrency;
	private String reversalAtm;

	public TransactionValidAtmDto(String reversal, String dateTransaction, String heureTransaction, String terminalId,
			String terminalName, String pan, String experyDate, String de38, double amountTransaction,
			String transactionCurrency, String reversalAtm) {
		super();
		this.reversal = reversal;
		this.dateTransaction = dateTransaction;
		this.heureTransaction = heureTransaction;
		this.terminalId = terminalId;
		this.terminalName = terminalName;
		this.pan = pan;
		this.experyDate = experyDate;
		this.de38 = de38;
		this.amountTransaction = amountTransaction;
		this.transactionCurrency = transactionCurrency;
		this.reversalAtm = reversalAtm;
	}

	public TransactionValidAtmDto() {
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

	public String getReversalAtm() {
		return reversalAtm;
	}

	public void setReversalAtm(String reversalAtm) {
		this.reversalAtm = reversalAtm;
	}

}

package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "DayOpeChargebackInter", schema = "FRANSABANK")
public class DayOperationChargebackInternational {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("code")
	@Column(name = "code", nullable = false)
	private int code;

	@JsonProperty("type_operation")
	@Column(name = "type_operation")
	private int typeOperation;

	@JsonProperty("card_number")
	@Column(name = "card_number")
	private String cardNumber;

	@JsonProperty("terminal_id")
	@Column(name = "terminal_id")
	private String terminalId;

	@JsonProperty("transaction_amount")
	@Column(name = "transaction_amount")
	private double transactionAmount;

	@JsonProperty("currency_code_transaction")
	@Column(name = "currency_code_transaction")
	private String currencyCodeTransaction;


	@JsonProperty("conversion_rate_settlement")
	@Column(name = "conversion_rate_settlement")
	private Double conversionRateSettlement;

	@JsonProperty("currency_code_settlement")
	@Column(name = "currency_code_settlement")
	private String currencyCodeSettlement;

	@JsonProperty("completed_amt_settlement")
	@Column(name = "completed_amt_settlement")
	private double completedAmtSettlement;


	@JsonProperty("code_file")
	@Column(name = "code_file")
	private String codeFile;

	@JsonProperty("compte_debit")
	@Column(name = "compte_debit")
	private String compteDebit;

	@JsonProperty("compte_credit")
	@Column(name = "compte_credit")
	private String compteCredit;

	@JsonProperty("operation_date")
	@Column(name = "operation_date")
	private Date operationDate;

	@JsonProperty("transaction_date")
	@Column(name = "transaction_date")
	private String transactionDate;

	@JsonProperty("file_date")
	@Column(name = "file_date")
	private String fileDate;

	@JsonProperty("DE_38")
	@Column(name = "DE_38")
	private String de38;

	@JsonProperty("reference_number")
	@Column(name = "reference_number")
	private String referenceNumber;

	@JsonProperty("transaction_identification")
	@Column(name = "transaction_identification")
	private String transactionIdentification;

	private String de37;
	private Double conversionRateTnd;
	private double AmountTnd;
	private String affiliation;
	private Integer summaryCode;
	private String identification;
	
	private String source;

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public Double getConversionRateTnd() {
		return conversionRateTnd;
	}

	public void setConversionRateTnd(Double conversionRateTnd) {
		this.conversionRateTnd = conversionRateTnd;
	}

	public double getAmountTnd() {
		return AmountTnd;
	}

	public void setAmountTnd(double amountTnd) {
		AmountTnd = amountTnd;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(int typeOperation) {
		this.typeOperation = typeOperation;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	
	public String getCurrencyCodeTransaction() {
		return currencyCodeTransaction;
	}

	public void setCurrencyCodeTransaction(String currencyCodeTransaction) {
		this.currencyCodeTransaction = currencyCodeTransaction;
	}

	public Double getConversionRateSettlement() {
		return conversionRateSettlement;
	}

	public void setConversionRateSettlement(Double conversionRateSettlement) {
		this.conversionRateSettlement = conversionRateSettlement;
	}

	public String getCurrencyCodeSettlement() {
		return currencyCodeSettlement;
	}

	public void setCurrencyCodeSettlement(String currencyCodeSettlement) {
		this.currencyCodeSettlement = currencyCodeSettlement;
	}

	
	public String getCodeFile() {
		return codeFile;
	}

	public void setCodeFile(String codeFile) {
		this.codeFile = codeFile;
	}

	public String getCompteDebit() {
		return compteDebit;
	}

	public void setCompteDebit(String compteDebit) {
		this.compteDebit = compteDebit;
	}

	public String getCompteCredit() {
		return compteCredit;
	}

	public void setCompteCredit(String compteCredit) {
		this.compteCredit = compteCredit;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getDe38() {
		return de38;
	}

	public void setDe38(String de38) {
		this.de38 = de38;
	}

	public String getReferenceNumber() {
		return referenceNumber;
	}

	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}

	public String getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(String transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	public String getDe37() {
		return de37;
	}

	public void setDe37(String de37) {
		this.de37 = de37;
	}


	public DayOperationChargebackInternational(String identification, String cardNumber, String terminalId, double transactionAmount,
			String currencyCodeTransaction, Double conversionRateSettlement, String currencyCodeSettlement,
			String codeFile, Date operationDate, String transactionDate, String de38, String referenceNumber,
			double completedAmtSettlement, String transactionIdentification,Double conversionTnd,double amountTnd,String affiliation,String fileDate,Integer SummaryCode,String source) {
		super();
		this.identification = identification;
		this.cardNumber = cardNumber;
		this.terminalId = (terminalId != null) ? terminalId.trim() : null;
		this.transactionAmount = transactionAmount;
		this.currencyCodeTransaction = currencyCodeTransaction;
		
		this.conversionRateSettlement = conversionRateSettlement;
		this.currencyCodeSettlement = currencyCodeSettlement;
		this.codeFile = codeFile;
		this.operationDate = operationDate;
		this.transactionDate = transactionDate;
		this.fileDate = fileDate;
		this.de38 = (de38 == null || de38.trim().isEmpty())
				? "000000"
				: de38;
		this.referenceNumber = referenceNumber;
		this.completedAmtSettlement = completedAmtSettlement;
		this.transactionIdentification = transactionIdentification;
		this.conversionRateTnd=conversionTnd;
		this.AmountTnd=amountTnd;
		this.affiliation=(affiliation != null) ? affiliation.trim() : null;
		this.summaryCode=SummaryCode;
		this.source=source;
		}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public DayOperationChargebackInternational() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public double getCompletedAmtSettlement() {
		return completedAmtSettlement;
	}

	public void setCompletedAmtSettlement(double completedAmtSettlement) {
		this.completedAmtSettlement = completedAmtSettlement;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	
}

	

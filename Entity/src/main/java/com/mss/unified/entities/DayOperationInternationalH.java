package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "international_dayH", schema = "FRANSABANK")
public class DayOperationInternationalH {
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
	private Double transactionAmount;

	@JsonProperty("transaction_currency_code")
	@Column(name = "transaction_currency_code")
	private String transactionCurrencyCode;

	@JsonProperty("conversion_rate_settlement")
	@Column(name = "conversion_rate_settlement")
	private Double conversionRateSettlement;

	@JsonProperty("currency_code_settlement")
	@Column(name = "currency_code_settlement")
	private String currencyCodeSettlement;

	@JsonProperty("completed_amt_settlement")
	@Column(name = "completed_amt_settlement")
	private Double completedAmtSettlement;

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
	private int summaryCode;
	private String affiliation;
	private String transactionNumber;
 	private Double tndAmount;
	private Double conversionRateSettlementToTnd;
	private String matchingSwitch;
	private String de37Switch;
	private String de11Switch;

	private LocalDateTime dateArchivage;
	
	private String fileDateMDSholidayMatched;
	private String accountNumberExtension="";

	public String getNationalMatch() {
		return nationalMatch;
	}

	public void setNationalMatch(String nationalMatch) {
		this.nationalMatch = nationalMatch;
	}

	private String merchantName;
	@Column(name = "NATIONAL_MATCH")
	private String nationalMatch;
	private String source;
	private String fileDateCp;

	public DayOperationInternationalH(int typeOperation, String cardNumber, String terminalId, Double transactionAmount,
									  String currencyCodeTransaction, Double conversionRateSettlement, String currencyCodeSettlement,
									  String codeFile, Date operationDate, String transactionDate, String de38, String referenceNumber,
									  Double completedAmtSettlement, String transactionIdentification, String fileDate, int codeSummary,String transactionNumber,
									  Double conversionRateSettlementToTnd, Double tndAmount, String merchantName,String source,String fileDateCp) {
		super();
		this.typeOperation = typeOperation;
		this.cardNumber = cardNumber;
		this.terminalId = terminalId;
		this.transactionAmount = transactionAmount;
		this.transactionCurrencyCode = currencyCodeTransaction;
		this.conversionRateSettlement = conversionRateSettlement;
		this.currencyCodeSettlement = currencyCodeSettlement;
		this.codeFile = codeFile;
		this.operationDate = operationDate;
		this.transactionDate = transactionDate;
		this.fileDate = fileDate;
		this.de38 = de38;
		this.referenceNumber = referenceNumber;
		this.completedAmtSettlement = completedAmtSettlement;
		this.transactionIdentification = transactionIdentification;
		this.summaryCode = codeSummary;
		this.affiliation=terminalId;
		this.transactionNumber=transactionNumber;
		this.conversionRateSettlementToTnd= conversionRateSettlementToTnd;
		this.tndAmount= tndAmount;
		this.merchantName = merchantName;
		this.fileDateCp=fileDateCp;
		this.source=source;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getFileDateMDSholidayMatched() {
		return fileDateMDSholidayMatched;
	}

	public void setFileDateMDSholidayMatched(String fileDateMDSholidayMatched) {
		this.fileDateMDSholidayMatched = fileDateMDSholidayMatched;
	}

	public LocalDateTime getDateArchivage() {
		return dateArchivage;
	}

	public void setDateArchivage(LocalDateTime dateArchivage) {
		this.dateArchivage = dateArchivage;
	}

	public Double getConversionRateSettlementToTnd() {
		return conversionRateSettlementToTnd;
	}

	public void setConversionRateSettlementToTnd(Double conversionRateSettlementToTnd) {
		this.conversionRateSettlementToTnd = conversionRateSettlementToTnd;
	}

	public String getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getAffiliation() {
		return affiliation;
	}

	public void setAffiliation(String affiliation) {
		this.affiliation = affiliation;
	}

	public int getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(int summaryCode) {
		this.summaryCode = summaryCode;
	}

	public DayOperationInternationalH() {
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

	public String getTransactionCurrencyCode() {
		return transactionCurrencyCode;
	}

	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		this.transactionCurrencyCode = transactionCurrencyCode;
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

	public String getDe37() {
		return de37;
	}

	public void setDe37(String de37) {
		this.de37 = de37;
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

	public void setDe38(String DE38) {
		this.de38 = DE38;
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



	public String getMatchingSwitch() {
		return matchingSwitch;
	}

	public void setMatchingSwitch(String matchingSwitch) {
		this.matchingSwitch = matchingSwitch;
	}

	public String getDe37Switch() {
		return de37Switch;
	}

	public void setDe37Switch(String de37Switch) {
		this.de37Switch = de37Switch;
	}

	public String getDe11Switch() {
		return de11Switch;
	}

	public void setDe11Switch(String de11Switch) {
		this.de11Switch = de11Switch;
	}

	public Double getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public Double getCompletedAmtSettlement() {
		return completedAmtSettlement;
	}

	public void setCompletedAmtSettlement(Double completedAmtSettlement) {
		this.completedAmtSettlement = completedAmtSettlement;
	}

	public Double getTndAmount() {
		return tndAmount;
	}

	public void setTndAmount(Double tndAmount) {
		this.tndAmount = tndAmount;
	}

	public String getAccountNumberExtension() {
		return accountNumberExtension;
	}

	public void setAccountNumberExtension(String accountNumberExtension) {
		this.accountNumberExtension = accountNumberExtension;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getFileDateCp() {
		return fileDateCp;
	}

	public void setFileDateCp(String fileDateCp) {
		this.fileDateCp = fileDateCp;
	}


	@Override
	public String toString() {
		return "DayOperationInternationalH [code=" + code + ", typeOperation=" + typeOperation + ", cardNumber="
				+ cardNumber + ", terminalId=" + terminalId + ", transactionAmount=" + transactionAmount
				+ ", currencyCodeTransaction=" + transactionCurrencyCode + ", conversionRateSettlement="
				+ conversionRateSettlement + ", currencyCodeSettlement=" + currencyCodeSettlement
				+ ", completedAmtSettlement=" + completedAmtSettlement + ", codeFile=" + codeFile + ", compteDebit="
				+ compteDebit + ", compteCredit=" + compteCredit + ", operationDate=" + operationDate
				+ ", transactionDate=" + transactionDate + ", fileDate=" + fileDate + ", de38=" + de38
				+ ", referenceNumber=" + referenceNumber + ", transactionIdentification=" + transactionIdentification
				+ ", de37=" + de37 + ", summaryCode=" + summaryCode + ", affiliation=" + affiliation
				+ ", transactionNumber=" + transactionNumber + ", tndAmount=" + tndAmount
				+ ", conversionRateSettlementToTnd=" + conversionRateSettlementToTnd + "]";
	}


}

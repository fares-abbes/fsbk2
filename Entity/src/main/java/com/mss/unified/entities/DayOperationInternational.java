package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

import org.springframework.lang.Nullable;

import java.util.Date;

@Entity
@Table(name = "international_day", schema = "FRANSABANK")
public class DayOperationInternational {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
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

	@JsonProperty("currency_code_transaction")
	@Column(name = "currency_code_transaction")
	private String currencyCodeTransaction;

//    @JsonProperty("access_fee")
//    @Column(name = "access_fee")
//    private String accessFee;

	@JsonProperty("conversion_rate_settlement")
	@Column(name = "conversion_rate_settlement")
	private Double conversionRateSettlement;

	@JsonProperty("currency_code_settlement")
	@Column(name = "currency_code_settlement")
	private String currencyCodeSettlement;

	@JsonProperty("completed_amt_settlement")
	@Column(name = "completed_amt_settlement")
	private Double completedAmtSettlement;

//    @JsonProperty("interchange_fee")
//    @Column(name = "interchange_fee")
//    private String interchangeFee;

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
	private String accountNumberExtension="";
	private String merchantName;
	private String source;
	private String fileDateCp;
	private String numRIBPorteur;
	private String codeDevise;
	private String idenficationCode;
	private String codeAgence;
	private String pieceComptable;

	public String getPieceComptable() {
		return pieceComptable;
	}

	public void setPieceComptable(String pieceComptable) {
		this.pieceComptable = pieceComptable;
	}

	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getIdenficationCode() {
		return idenficationCode;
	}

	public void setIdenficationCode(String idenficationCode) {
		this.idenficationCode = idenficationCode;
	}

	public String getCodeDevise() {
		return codeDevise;
	}

	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}

	public String getNumRIBPorteur() {
		return numRIBPorteur;
	}

	public void setNumRIBPorteur(String numRIBPorteur) {
		this.numRIBPorteur = numRIBPorteur;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public DayOperationInternational() {
	}

//	public DayOperationInternational(VisaOutGoingAtm visaOutGoingAtm, Tc45 tc45, int typeOperation,
//			String debit, String credit, String fileDate) {
//
//		this.typeOperation = typeOperation;
//		this.cardNumber = visaOutGoingAtm.getCardNumber();
//		this.terminalId = tc45.getTerminalId();
////		this.transactionAmount = String.valueOf(transactionAmount);
////		this.currencyCodeTransaction = visaOutGoingAtm.getTranCurrencyCode();
////		this.accessFee = visaOutGoingAtm.getSurcAmount();
////		this.conversionRateSettlement = conversionRateSettlement;
////		this.currencyCodeSettlement = visaOutGoingAtm.getSettCurrencyCode();
////		this.completedAmtSettlement = visaOutGoingAtm.getSettAmount();
////		this.interchangeFee = tc45.getInterchangeFee();
//		this.codeFile = visaOutGoingAtm.getOutComingCode().toString();
//		this.compteDebit = debit;
//		this.compteCredit = credit;
//		this.operationDate = new Date();
//		this.transactionDate = visaOutGoingAtm.getTransactionDate();
//		this.fileDate = fileDate;
//		this.de38 = visaOutGoingAtm.getAuthorizationIdResponseCode();
//		this.referenceNumber = tc45.getRetrievalRefNumber();
//		this.transactionIdentification = visaOutGoingAtm.getTransactionIdentification();
//	}
//
//	public DayOperationInternational(VisaIncoming visaIncoming, int typeOperation, String debit, String credit,
//			String currencyCodeSettlement, String completedAmtSettlement, String fileDate) {
//
//		this.typeOperation = typeOperation;
//		this.cardNumber = visaIncoming.getAccountNumber();
//		this.terminalId = visaIncoming.getTerminalId();
////		this.transactionAmount = String.valueOf(transactionAmount);
//		this.currencyCodeTransaction = visaIncoming.getSourceCurrencyCode();
////		this.accessFee = visaOutGoingAtm.getSurcAmount();
////		this.conversionRateSettlement = conversionRateSettlement;
//		this.currencyCodeSettlement = currencyCodeSettlement;
//		this.completedAmtSettlement = completedAmtSettlement;
////		this.interchangeFee = tc45.getInterchangeFee();
//		this.codeFile = visaIncoming.getIncomingCode().toString();
//		this.compteDebit = debit;
//		this.compteCredit = credit;
//		this.operationDate = new Date();
//		this.transactionDate = visaIncoming.getTransactionDate();
//		this.fileDate = fileDate;
//		this.de38 = visaIncoming.getAuthorisationCode();
//		this.referenceNumber = visaIncoming.getAcquirerReferenceNumber();
//		this.transactionIdentification = visaIncoming.getTransactionIdentifier();
//	}
//
//	public DayOperationInternational(FrecNrec frecNrec, int typeOperation,
//			String debit, String credit, String fileDate,String amount,String conversion) {
//
//		this.typeOperation = typeOperation;
//		this.cardNumber = frecNrec.getPan();
//		this.terminalId = frecNrec.getTerminalId();
//		this.currencyCodeTransaction = frecNrec.getCurrencyCodeTransaction();
//		this.transactionAmount = frecNrec.getCompletedAmtTransLocal();
//		this.currencyCodeSettlement = frecNrec.getCurrencyCodeSettlement();
//		this.completedAmtSettlement = amount;
//		this.conversionRateSettlement = conversion;
//		this.codeFile = frecNrec.getFrecCode().toString();
//		this.compteDebit = debit;
//		this.compteCredit = credit;
//		this.operationDate = new Date();
//		this.transactionDate = frecNrec.getTransactionDate();
//		this.fileDate = fileDate;
//		this.de38 = frecNrec.getAuthorizationId();
//		this.referenceNumber = frecNrec.getReferenceNumber();
////		this.transactionIdentification = frecNrec.getTransactionIdentifier();
//	}
//
//	public DayOperationInternational(IpmClearingDetails ipmClearingDetails, int typeOperation,
//			String debit, String credit, String fileDate) {
//
//		this.typeOperation = typeOperation;
//		this.cardNumber = ipmClearingDetails.getDe02();
//		this.terminalId = ipmClearingDetails.getDe42();
////		this.transactionAmount = String.valueOf(transactionAmount);----------
////		this.currencyCodeTransaction = frecNrec.getSourceCurrencyCode();---------------
////		this.accessFee = visaOutGoingAtm.getSurcAmount();
////		this.conversionRateSettlement = conversionRateSettlement;
////		this.currencyCodeSettlement = currencyCodeSettlement;-----------
//		this.completedAmtSettlement = ipmClearingDetails.getDe05();
////		this.interchangeFee = tc45.getInterchangeFee();
//		this.codeFile = ipmClearingDetails.getImpCode().toString();
//		this.compteDebit = debit;
//		this.compteCredit = credit;
//		this.operationDate = new Date();
//		this.transactionDate = ipmClearingDetails.getDe12_1Date();
//		this.fileDate = fileDate;
//		this.de38 = ipmClearingDetails.getDe38();
////		this.referenceNumber = ipmClearingDetails.getReferenceNumber();
//		this.transactionIdentification = ipmClearingDetails.getDe37();
//	}
//
//	public DayOperationInternational(IpmClearingDetails ipmClearingDetails,
//			String debit, String credit, int typeOperation, String fileDate) {
//
//		this.typeOperation = typeOperation;
//		this.cardNumber = ipmClearingDetails.getDe02();
//		this.terminalId = ipmClearingDetails.getDe42();
//		this.transactionAmount = ipmClearingDetails.getDe04();
//		this.currencyCodeTransaction = ipmClearingDetails.getDe49();
////		this.accessFee = visaOutGoingAtm.getSurcAmount();
////		this.conversionRateSettlement = conversionRateSettlement;
//		this.currencyCodeSettlement = ipmClearingDetails.getDe50();
//		this.completedAmtSettlement = ipmClearingDetails.getDe05();
////		this.interchangeFee = tc45.getInterchangeFee();
//		this.codeFile = ipmClearingDetails.getImpCode().toString();
//		this.compteDebit = debit;
//		this.compteCredit = credit;
//		this.operationDate = new Date();
//		this.transactionDate = ipmClearingDetails.getDe12();
//		this.fileDate = fileDate;
//		this.de38 = ipmClearingDetails.getDe38();
	////		this.referenceNumber = ipmClearingDetails.getReferenceNumber();
//		this.transactionIdentification = ipmClearingDetails.getDe37();
//	}

	public int getCode() {
		return code;
	}


	public void setTransactionAmount(double transactionAmount) {
		this.transactionAmount = transactionAmount;
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

//    public String getAccessFee() {
//        return accessFee;
//    }
//
//    public void setAccessFee(String accessFee) {
//        this.accessFee = accessFee;
//    }

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


	public void setCompletedAmtSettlement(double completedAmtSettlement) {
		this.completedAmtSettlement = completedAmtSettlement;
	}

//    public String getInterchangeFee() {
//        return interchangeFee;
//    }
//
//    public void setInterchangeFee(String interchangeFee) {
//        this.interchangeFee = interchangeFee;
//    }

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


	public DayOperationInternational(int typeOperation, String cardNumber, String terminalId, double transactionAmount,
									 String currencyCodeTransaction, Double conversionRateSettlement, String currencyCodeSettlement,
									 String codeFile, Date operationDate, String transactionDate, String de38, String referenceNumber,
									 double completedAmtSettlement, String transactionIdentification, String fileDate, int codeSummary, String affiliation,
									 String transactionNumber, String de37Switch,String de11Switch,String matchingSwitch, Double conversionRateSettlementToTnd,
									 double tndAmount, String merchantName,String codeDevise,String idenficationCode,String source) {


		super();
		this.typeOperation = typeOperation;
		this.cardNumber = cardNumber;
		this.terminalId = terminalId;
		this.transactionAmount = transactionAmount;
		this.currencyCodeTransaction = currencyCodeTransaction;
		this.conversionRateSettlement = conversionRateSettlement;
		this.currencyCodeSettlement = currencyCodeSettlement;
		this.codeFile = codeFile;
		this.operationDate = operationDate;
		this.transactionDate = transactionDate;
		this.fileDate = fileDate;
		this.de38 = (de38 == null || de38.trim().isEmpty()) ? "000000" : de38;
		this.referenceNumber = referenceNumber;
		this.completedAmtSettlement = completedAmtSettlement;
		this.transactionIdentification = transactionIdentification;
		this.summaryCode = codeSummary;
		this.affiliation=(affiliation != null) ? affiliation.trim() : null;
		this.transactionNumber=transactionNumber;
		this.de37Switch=de37Switch;
		this.de11Switch=de11Switch;
		this.matchingSwitch=matchingSwitch;
		//last check, only baseToCurrency of visaIncomming is under 1
		this.conversionRateSettlementToTnd= conversionRateSettlementToTnd!=null? Math.round((conversionRateSettlementToTnd>=1 ?
				conversionRateSettlementToTnd: 1/conversionRateSettlementToTnd) * Math.pow(10, 6))/ Math.pow(10, 6):null;
		this.tndAmount= tndAmount;
		this.merchantName = merchantName;
		this.source=source;
		this.codeDevise=codeDevise;
		this.idenficationCode=idenficationCode;

	}

	/**
	 * Constructor to create DayOperationInternational from ChargebacksInternational
	 * This constructor maps all fields from ChargebacksInternational to DayOperationInternational
	 * 
	 * @param chargeback The ChargebacksInternational object to copy from
	 * @param typeOperation The type of operation identifier
	 * @param codeFile The file code
	 * @param transactionIdentification The transaction identification
	 * @param fileDate The file date
	 * @param affiliation The affiliation
	 * @param transactionNumber The transaction number
	 * @param de37Switch The DE37 switch value
	 * @param de11Switch The DE11 switch value
	 * @param matchingSwitch The matching switch value
	 * @param codeDevise The devise code
	 * @param idenficationCode The identification code
	 * @param source The source identifier
	 */
	public DayOperationInternational(DayOperationChargebackInternational chargeback, int typeOperation, String codeFile,
									 String transactionIdentification, String fileDate, String affiliation,
									 String transactionNumber, String de37Switch, String de11Switch, String matchingSwitch,
									 String codeDevise, String idenficationCode, String source) {
		super();
		this.typeOperation = typeOperation;
		this.cardNumber = chargeback.getCardNumber();
		this.terminalId = chargeback.getTerminalId();
		this.transactionAmount = chargeback.getTransactionAmount();
		this.currencyCodeTransaction = chargeback.getCurrencyCodeTransaction();
		this.conversionRateSettlement = chargeback.getConversionRateSettlement();
		this.currencyCodeSettlement = chargeback.getCurrencyCodeSettlement();
		this.codeFile = codeFile;
 		this.transactionDate = chargeback.getTransactionDate();
		this.fileDate = fileDate;
		this.de38 = (chargeback.getDe38() == null || chargeback.getDe38().trim().isEmpty()) ? "000000" : chargeback.getDe38();
		this.referenceNumber = chargeback.getReferenceNumber();
		this.completedAmtSettlement = chargeback.getCompletedAmtSettlement();
		this.transactionIdentification = transactionIdentification;
		this.summaryCode =  chargeback.getSummaryCode();
		this.affiliation = (affiliation != null) ? affiliation.trim() : null;
		this.transactionNumber = transactionNumber;
		this.de37Switch = de37Switch;
		this.de11Switch = de11Switch;
		this.matchingSwitch = matchingSwitch;
		this.conversionRateSettlementToTnd = 1.0;
		this.tndAmount = chargeback.getTransactionAmount();
		this.merchantName = chargeback.getAffiliation();
		this.source = source;
		this.codeDevise = codeDevise;
		this.idenficationCode = idenficationCode;
	}


 
	@Override
	public String toString() {
		return "DayOperationInternational [code=" + code + ", typeOperation=" + typeOperation + ", cardNumber="
				+ cardNumber + ", terminalId=" + terminalId + ", transactionAmount=" + transactionAmount
				+ ", currencyCodeTransaction=" + currencyCodeTransaction + ", conversionRateSettlement="
				+ conversionRateSettlement + ", currencyCodeSettlement=" + currencyCodeSettlement
				+ ", completedAmtSettlement=" + completedAmtSettlement + ", codeFile=" + codeFile + ", compteDebit="
				+ compteDebit + ", compteCredit=" + compteCredit + ", operationDate=" + operationDate
				+ ", transactionDate=" + transactionDate + ", fileDate=" + fileDate + ", de38=" + de38
				+ ", referenceNumber=" + referenceNumber + ", transactionIdentification=" + transactionIdentification
				+ ", de37=" + de37 + ", summaryCode=" + summaryCode + ", affiliation=" + affiliation
				+ ", transactionNumber=" + transactionNumber + ", tndAmount=" + tndAmount
				+ ", conversionRateSettlementToTnd=" + conversionRateSettlementToTnd + "]";
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

	public String getFileDateCp() {
		return fileDateCp;
	}

	public void setFileDateCp(String fileDateCp) {
		this.fileDateCp = fileDateCp;
	}



}

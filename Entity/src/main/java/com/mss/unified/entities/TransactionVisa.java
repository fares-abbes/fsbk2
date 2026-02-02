package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSACTION_VISA", schema = "FRANSABANK")
public class TransactionVisa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	private int id;

	private int summaryCode;

	private String batchCodeRecord;

	private String recordSequenceNumber;

	private String operationcode;

	private String processingDate;

	private String merchantIdentification;

	private String merchantAccountNumber;

	private String merchantName;

	private String merchantAddress;

	private String terminalBachNumber;

	private String fileNumber;

	private String transactionChannel;

	private String transactionRefferenceNumber;

	private String territoryCode;

	private String cardholderNumber;

	private String cardholderAccount;

	private String cardExpiryDate;

	private String acquirerRefferenceNumber;

	private String batchNumber;

	private String batchDate;

	private String transactionOrder;

	private String transactionDate;

	private String autorizationCode;

	private double transactionAuthorizedAmount;

	private String cardCodeOrigin;

	private double originTransactionAmount;

	private String transactionCurrencyCode;

	private String numberOfDecimals;

	private double transactionSttlementAmount;

	private String currencyCodeSettAmount;

	private String numberOfDecimalsCurrency;

	private double transactionInterchangeFees;

	private double taxeFees;

	private double interchangeTaxe;

	private double ttc;

	private double transactionDebitAmount;

	private double merchantTransactionNetAmount;

	private double merchantCommision;

	private double taxe;

	private String issuerBankCtbNumberOne;

	private String issuerBankCtbNumberTwo;

	private String issuerBankIdentification;

	private String cardBranchCode;

	private String acquirerBankNumber;

	private String acquirerBankIdentification;

	private String transactionCancellationCode;

	private double localCardTransAmount;

	private double cashAdvTransFees;

	private double interchangeFees;

	private String appCode;

	private String merchantCategoryCode;

	private String transactionProv;

	private String cardSystemCode;

	private String issuerCardNetwork;

	private String merchantSector;

	private String acquirerNumberDestination;

	private String acquirerIdentifDestination;

	private Date dateInsertion;

	public String isvalidConf;

	public Integer isValidComm;

	public String valid_autorisation;

	public String traite;

	private double tvaCommission;

	private double commissionInterchangeNet;

	private Integer transactionStatus;

	private Integer statusChargeback;

	private Boolean rejected = false;

	private String interchangeIpmFixe;
	private String interchangeIpmVariable;

	private Double interchangeCalculated;
	private Double tvaInterchangeCalculated;

	private String de37;

	private Integer octfCode;

	public Double getInterchangeCalculated() {
		return interchangeCalculated;
	}

	public void setInterchangeCalculated(Double interchangeCalculated) {
		this.interchangeCalculated = interchangeCalculated;
	}

	public Double getTvaInterchangeCalculated() {
		return tvaInterchangeCalculated;
	}

	public void setTvaInterchangeCalculated(Double tvaInterchangeCalculated) {
		this.tvaInterchangeCalculated = tvaInterchangeCalculated;
	}

	public String getInterchangeIpmFixe() {
		return interchangeIpmFixe;
	}

	public void setInterchangeIpmFixe(String interchangeIpmFixe) {
		this.interchangeIpmFixe = interchangeIpmFixe;
	}

	public String getInterchangeIpmVariable() {
		return interchangeIpmVariable;
	}

	public void setInterchangeIpmVariable(String interchangeIpmVariable) {
		this.interchangeIpmVariable = interchangeIpmVariable;
	}

	public TransactionVisa() {
		super();
	}

	public TransactionVisa(String detail, int summaryCode) {
		super();
		this.summaryCode = summaryCode;
		this.batchCodeRecord = detail.substring(0, 2).trim();
		this.recordSequenceNumber = detail.substring(2, 8).trim();
		this.operationcode = detail.substring(8, 10).trim();
		this.processingDate = detail.substring(10, 16).trim();
		this.merchantIdentification = detail.substring(16, 26).trim();
		this.merchantAccountNumber = detail.substring(26, 50).trim();
		this.merchantName = detail.substring(50, 74).trim();
		this.merchantAddress = detail.substring(75, 92).trim();
		this.terminalBachNumber = detail.substring(92, 97).trim();
		this.fileNumber = detail.substring(97, 99);
		this.transactionChannel = detail.substring(99, 100).trim();
		this.transactionRefferenceNumber = detail.substring(100, 112).trim();
		this.territoryCode = detail.substring(112, 113).trim();
		this.cardholderNumber = detail.substring(113, 132).trim();
		this.cardholderAccount = detail.substring(132, 156).trim();
		this.cardExpiryDate = detail.substring(156, 160).trim();
		this.acquirerRefferenceNumber = detail.substring(162, 185).trim();
		this.batchNumber = detail.substring(185, 191).trim();
		this.batchDate = detail.substring(191, 197).trim();
		this.transactionOrder = detail.substring(197, 203).trim();
		this.transactionDate = detail.substring(203, 209).trim();
		this.autorizationCode = detail.substring(209, 215).trim();
		this.cardCodeOrigin = detail.substring(227, 228).trim();
		this.numberOfDecimals = detail.substring(265, 266).trim();
		this.numberOfDecimalsCurrency = detail.substring(249, 250).trim();
		this.transactionCurrencyCode = detail.substring(246, 249).trim();
		this.transactionAuthorizedAmount = convertAmount(detail.substring(215, 227).trim(), transactionCurrencyCode);
		this.originTransactionAmount = convertAmount(detail.substring(234, 246).trim(), transactionCurrencyCode);
		this.currencyCodeSettAmount = detail.substring(262, 265).trim();
		this.transactionSttlementAmount = convertAmount(detail.substring(250, 262).trim(), currencyCodeSettAmount);
		this.transactionInterchangeFees = convertAmount(detail.substring(266, 278).trim(), transactionCurrencyCode);
		this.taxeFees = convertAmount(detail.substring(278, 290).trim(), transactionCurrencyCode);
		this.interchangeTaxe = convertAmount(detail.substring(290, 302).trim(), transactionCurrencyCode);
		this.ttc = convertAmount(detail.substring(302, 314).trim(), transactionCurrencyCode);
		this.transactionDebitAmount = convertAmount(detail.substring(314, 326).trim(), transactionCurrencyCode);
		this.merchantTransactionNetAmount = convertAmount(detail.substring(326, 338).trim(), transactionCurrencyCode);
		this.merchantCommision = convertAmount(detail.substring(338, 350).trim(), transactionCurrencyCode);
		this.taxe = convertAmount(detail.substring(350, 362).trim(), transactionCurrencyCode);
		this.issuerBankCtbNumberOne = detail.substring(363, 366).trim();
		this.issuerBankCtbNumberTwo = detail.substring(366, 368).trim();
		this.issuerBankIdentification = detail.substring(368, 373).trim();
		this.cardBranchCode = detail.substring(373, 378).trim();
		this.acquirerBankNumber = detail.substring(378, 380).trim();
		this.acquirerBankIdentification = detail.substring(380, 385).trim();
		this.transactionCancellationCode = detail.substring(385, 386).trim();
		this.localCardTransAmount = convertAmount(detail.substring(386, 389).trim(), transactionCurrencyCode);
		this.cashAdvTransFees = convertAmount(detail.substring(398, 410).trim(), transactionCurrencyCode);
		this.interchangeFees = convertAmount(detail.substring(410, 422).trim(), transactionCurrencyCode);
		this.appCode = detail.substring(422, 423).trim();
		this.merchantCategoryCode = detail.substring(423, 427).trim();
		this.transactionProv = detail.substring(427, 428).trim();
		this.cardSystemCode = detail.substring(428, 429).trim();
		this.issuerCardNetwork = detail.substring(429, 430).trim();
		this.merchantSector = detail.substring(430, 431).trim();
		this.acquirerNumberDestination = detail.substring(432, 434).trim();
		this.acquirerIdentifDestination = detail.substring(434, 439).trim();
		this.dateInsertion = new Date();
	}

	public double convertAmount(String amount, String CurrencyCode) {
		int number = Integer.parseInt(amount);
		int nbD = Integer.parseInt(numberOfDecimals);
		return number / Math.pow(10, nbD);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(int summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getBatchCodeRecord() {
		return batchCodeRecord;
	}

	public void setBatchCodeRecord(String batchCodeRecord) {
		this.batchCodeRecord = batchCodeRecord;
	}

	public String getRecordSequenceNumber() {
		return recordSequenceNumber;
	}

	public void setRecordSequenceNumber(String recordSequenceNumber) {
		this.recordSequenceNumber = recordSequenceNumber;
	}

	public String getOperationcode() {
		return operationcode;
	}

	public void setOperationcode(String operationcode) {
		this.operationcode = operationcode;
	}

	public String getProcessingDate() {
		return processingDate;
	}

	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}

	public String getMerchantIdentification() {
		return merchantIdentification;
	}

	public void setMerchantIdentification(String merchantIdentification) {
		this.merchantIdentification = merchantIdentification;
	}

	public String getMerchantAccountNumber() {
		return merchantAccountNumber;
	}

	public void setMerchantAccountNumber(String merchantAccountNumber) {
		this.merchantAccountNumber = merchantAccountNumber;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantAddress() {
		return merchantAddress;
	}

	public void setMerchantAddress(String merchantAddress) {
		this.merchantAddress = merchantAddress;
	}

	public String getTerminalBachNumber() {
		return terminalBachNumber;
	}

	public void setTerminalBachNumber(String terminalBachNumber) {
		this.terminalBachNumber = terminalBachNumber;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public String getTransactionChannel() {
		return transactionChannel;
	}

	public void setTransactionChannel(String transactionChannel) {
		this.transactionChannel = transactionChannel;
	}

	public String getTransactionRefferenceNumber() {
		return transactionRefferenceNumber;
	}

	public void setTransactionRefferenceNumber(String transactionRefferenceNumber) {
		this.transactionRefferenceNumber = transactionRefferenceNumber;
	}

	public String getTerritoryCode() {
		return territoryCode;
	}

	public void setTerritoryCode(String territoryCode) {
		this.territoryCode = territoryCode;
	}

	public String getCardholderNumber() {
		return cardholderNumber;
	}

	public void setCardholderNumber(String cardholderNumber) {
		this.cardholderNumber = cardholderNumber;
	}

	public String getCardholderAccount() {
		return cardholderAccount;
	}

	public void setCardholderAccount(String cardholderAccount) {
		this.cardholderAccount = cardholderAccount;
	}

	public String getCardExpiryDate() {
		return cardExpiryDate;
	}

	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public String getAcquirerRefferenceNumber() {
		return acquirerRefferenceNumber;
	}

	public void setAcquirerRefferenceNumber(String acquirerRefferenceNumber) {
		this.acquirerRefferenceNumber = acquirerRefferenceNumber;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getBatchDate() {
		return batchDate;
	}

	public void setBatchDate(String batchDate) {
		this.batchDate = batchDate;
	}

	public String getTransactionOrder() {
		return transactionOrder;
	}

	public void setTransactionOrder(String transactionOrder) {
		this.transactionOrder = transactionOrder;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getAutorizationCode() {
		return autorizationCode;
	}

	public void setAutorizationCode(String autorizationCode) {
		this.autorizationCode = autorizationCode;
	}

	public double getTransactionAuthorizedAmount() {
		return transactionAuthorizedAmount;
	}

	public void setTransactionAuthorizedAmount(double transactionAuthorizedAmount) {
		this.transactionAuthorizedAmount = transactionAuthorizedAmount;
	}

	public String getCardCodeOrigin() {
		return cardCodeOrigin;
	}

	public void setCardCodeOrigin(String cardCodeOrigin) {
		this.cardCodeOrigin = cardCodeOrigin;
	}

	public double getOriginTransactionAmount() {
		return originTransactionAmount;
	}

	public void setOriginTransactionAmount(double originTransactionAmount) {
		this.originTransactionAmount = originTransactionAmount;
	}

	public String getTransactionCurrencyCode() {
		return transactionCurrencyCode;
	}

	public void setTransactionCurrencyCode(String transactionCurrencyCode) {
		this.transactionCurrencyCode = transactionCurrencyCode;
	}

	public String getNumberOfDecimals() {
		return numberOfDecimals;
	}

	public void setNumberOfDecimals(String numberOfDecimals) {
		this.numberOfDecimals = numberOfDecimals;
	}

	public double getTransactionSttlementAmount() {
		return transactionSttlementAmount;
	}

	public void setTransactionSttlementAmount(double transactionSttlementAmount) {
		this.transactionSttlementAmount = transactionSttlementAmount;
	}

	public String getCurrencyCodeSettAmount() {
		return currencyCodeSettAmount;
	}

	public void setCurrencyCodeSettAmount(String currencyCodeSettAmount) {
		this.currencyCodeSettAmount = currencyCodeSettAmount;
	}

	public String getNumberOfDecimalsCurrency() {
		return numberOfDecimalsCurrency;
	}

	public void setNumberOfDecimalsCurrency(String numberOfDecimalsCurrency) {
		this.numberOfDecimalsCurrency = numberOfDecimalsCurrency;
	}

	public double getTransactionInterchangeFees() {
		return transactionInterchangeFees;
	}

	public void setTransactionInterchangeFees(double transactionInterchangeFees) {
		this.transactionInterchangeFees = transactionInterchangeFees;
	}

	public double getTaxeFees() {
		return taxeFees;
	}

	public void setTaxeFees(double taxeFees) {
		this.taxeFees = taxeFees;
	}

	public double getInterchangeTaxe() {
		return interchangeTaxe;
	}

	public void setInterchangeTaxe(double interchangeTaxe) {
		this.interchangeTaxe = interchangeTaxe;
	}

	public double getTtc() {
		return ttc;
	}

	public void setTtc(double ttc) {
		this.ttc = ttc;
	}

	public double getTransactionDebitAmount() {
		return transactionDebitAmount;
	}

	public void setTransactionDebitAmount(double transactionDebitAmount) {
		this.transactionDebitAmount = transactionDebitAmount;
	}

	public double getMerchantTransactionNetAmount() {
		return merchantTransactionNetAmount;
	}

	public void setMerchantTransactionNetAmount(double merchantTransactionNetAmount) {
		this.merchantTransactionNetAmount = merchantTransactionNetAmount;
	}

	public double getMerchantCommision() {
		return merchantCommision;
	}

	public void setMerchantCommision(double merchantCommision) {
		this.merchantCommision = merchantCommision;
	}

	public double getTaxe() {
		return taxe;
	}

	public void setTaxe(double taxe) {
		this.taxe = taxe;
	}

	public String getIssuerBankCtbNumberOne() {
		return issuerBankCtbNumberOne;
	}

	public void setIssuerBankCtbNumberOne(String issuerBankCtbNumberOne) {
		this.issuerBankCtbNumberOne = issuerBankCtbNumberOne;
	}

	public String getIssuerBankCtbNumberTwo() {
		return issuerBankCtbNumberTwo;
	}

	public void setIssuerBankCtbNumberTwo(String issuerBankCtbNumberTwo) {
		this.issuerBankCtbNumberTwo = issuerBankCtbNumberTwo;
	}

	public String getIssuerBankIdentification() {
		return issuerBankIdentification;
	}

	public void setIssuerBankIdentification(String issuerBankIdentification) {
		this.issuerBankIdentification = issuerBankIdentification;
	}

	public String getCardBranchCode() {
		return cardBranchCode;
	}

	public void setCardBranchCode(String cardBranchCode) {
		this.cardBranchCode = cardBranchCode;
	}

	public String getAcquirerBankNumber() {
		return acquirerBankNumber;
	}

	public void setAcquirerBankNumber(String acquirerBankNumber) {
		this.acquirerBankNumber = acquirerBankNumber;
	}

	public String getAcquirerBankIdentification() {
		return acquirerBankIdentification;
	}

	public void setAcquirerBankIdentification(String acquirerBankIdentification) {
		this.acquirerBankIdentification = acquirerBankIdentification;
	}

	public String getTransactionCancellationCode() {
		return transactionCancellationCode;
	}

	public void setTransactionCancellationCode(String transactionCancellationCode) {
		this.transactionCancellationCode = transactionCancellationCode;
	}

	public double getLocalCardTransAmount() {
		return localCardTransAmount;
	}

	public void setLocalCardTransAmount(double localCardTransAmount) {
		this.localCardTransAmount = localCardTransAmount;
	}

	public double getCashAdvTransFees() {
		return cashAdvTransFees;
	}

	public void setCashAdvTransFees(double cashAdvTransFees) {
		this.cashAdvTransFees = cashAdvTransFees;
	}

	public double getInterchangeFees() {
		return interchangeFees;
	}

	public void setInterchangeFees(double interchangeFees) {
		this.interchangeFees = interchangeFees;
	}

	public String getAppCode() {
		return appCode;
	}

	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getTransactionProv() {
		return transactionProv;
	}

	public void setTransactionProv(String transactionProv) {
		this.transactionProv = transactionProv;
	}

	public String getCardSystemCode() {
		return cardSystemCode;
	}

	public void setCardSystemCode(String cardSystemCode) {
		this.cardSystemCode = cardSystemCode;
	}

	public String getIssuerCardNetwork() {
		return issuerCardNetwork;
	}

	public void setIssuerCardNetwork(String issuerCardNetwork) {
		this.issuerCardNetwork = issuerCardNetwork;
	}

	public String getMerchantSector() {
		return merchantSector;
	}

	public void setMerchantSector(String merchantSector) {
		this.merchantSector = merchantSector;
	}

	public String getAcquirerNumberDestination() {
		return acquirerNumberDestination;
	}

	public void setAcquirerNumberDestination(String acquirerNumberDestination) {
		this.acquirerNumberDestination = acquirerNumberDestination;
	}

	public String getAcquirerIdentifDestination() {
		return acquirerIdentifDestination;
	}

	public void setAcquirerIdentifDestination(String acquirerIdentifDestination) {
		this.acquirerIdentifDestination = acquirerIdentifDestination;
	}

	public Date getDateInsertion() {
		return dateInsertion;
	}

	public void setDateInsertion(Date dateInsertion) {
		this.dateInsertion = dateInsertion;
	}

	public String getIsvalidConf() {
		return isvalidConf;
	}

	public void setIsvalidConf(String isvalidConf) {
		this.isvalidConf = isvalidConf;
	}

	public Integer getIsValidComm() {
		return isValidComm;
	}

	public void setIsValidComm(Integer isValidComm) {
		this.isValidComm = isValidComm;
	}

	public String getValid_autorisation() {
		return valid_autorisation;
	}

	public void setValid_autorisation(String valid_autorisation) {
		this.valid_autorisation = valid_autorisation;
	}

	public String getTraite() {
		return traite;
	}

	public void setTraite(String traite) {
		this.traite = traite;
	}

	public double getTvaCommission() {
		return tvaCommission;
	}

	public void setTvaCommission(double tvaCommission) {
		this.tvaCommission = tvaCommission;
	}

	public double getCommissionInterchangeNet() {
		return commissionInterchangeNet;
	}

	public void setCommissionInterchangeNet(double commissionInterchangeNet) {
		this.commissionInterchangeNet = commissionInterchangeNet;
	}

	public Integer getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(Integer transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public Integer getStatusChargeback() {
		return statusChargeback;
	}

	public void setStatusChargeback(Integer statusChargeback) {
		this.statusChargeback = statusChargeback;
	}

	public Boolean getRejected() {
		return rejected;
	}

	public void setRejected(Boolean rejected) {
		this.rejected = rejected;
	}

	public String getDe37() {
		return de37;
	}

	public void setDe37(String de37) {
		this.de37 = de37;
	}

	public Integer getOctfCode() {
		return octfCode;
	}

	public void setOctfCode(Integer octfCode) {
		this.octfCode = octfCode;
	}

}

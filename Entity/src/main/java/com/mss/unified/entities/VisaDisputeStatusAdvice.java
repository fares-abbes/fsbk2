package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

import org.jline.utils.Log;

@Entity
@Table(name = "VISA_DISPUTE_STATUS_ADVICE", schema = "FRANSABANK")
public class VisaDisputeStatusAdvice {

	public VisaDisputeStatusAdvice() {
		super();
		// TODO Auto-generated constructor stub
	}

	private double convertAmount(String amount) { // , String currency
		double number = Double.parseDouble(amount);
//		if (currency!= null && currency.equals("788")) {
//			number = number/Math.pow(10, 3);
//		} else {
		number = number / Math.pow(10, 2);
//		}
		return number;
	}

	public VisaDisputeStatusAdvice(List<String> transaction, int summaryCode) {
		super();
		this.summaryCode = summaryCode;
		for (String visa : transaction) {
			switch (visa.substring(3, 4)) {
				case "0":
					// Map Row 1 data
					this.transactionCode = visa.substring(0, 2);
					this.transactionCodeQualifier = visa.substring(2, 3);
					this.destinationBin = visa.substring(4, 10);
					this.sourceBin = visa.substring(10, 16);
					this.vcrRecordIdentifier = visa.substring(16, 19);
					this.disputeStatus = visa.substring(19, 21);
					this.disputeTransactionCode = visa.substring(21, 23);
					this.disputeTransactionCodeQualifier = visa.substring(23, 24);
					this.originatorRecipientIndicator = visa.substring(24, 25);
					this.accountNumber = visa.substring(25, 41);
					this.accountNumberExtension = visa.substring(41, 44);
					this.acquirerReferenceNumber = visa.substring(44, 67);
					this.purchaseDate = visa.substring(67, 71);
					this.sourceAmount = convertAmount(visa.substring(71, 83));
					this.sourceCurrencyCode = visa.substring(83, 86);
					this.merchantName = visa.substring(86, 111);
					this.merchantCity = visa.substring(111, 124);
					this.merchantCountryCode = visa.substring(124, 127);
					this.merchantCategoryCode = visa.substring(127, 131);
					this.merchantStateCode = visa.substring(131, 134);
					this.merchantZipCode = visa.substring(134, 139);
					this.requestedPaymentService = visa.substring(139, 140);
					this.authorizationCode = visa.substring(140, 146);
					this.posEntryMode = visa.substring(146, 148);
					this.centralProcessingDate = visa.substring(148, 152);
					this.cardAcceptorId = visa.substring(152, 167);
					this.reimbursementAttribute = visa.substring(167, 168);
					break;
				case "1":
					// Map Row 2 data
					this.transactionCode = visa.substring(0, 2);
					this.transactionCodeQualifier = visa.substring(2, 3);
					this.networkIdentificationCode = visa.substring(4, 8);
					this.disputeCondition = visa.substring(8, 11);
					this.vrolFinancialId = visa.substring(11, 22);
					this.vrolCaseNumber = visa.substring(22, 32);
					this.vrolBundleCaseNumber = visa.substring(32, 42);
					this.clientCaseNumber = visa.substring(42, 62);
					this.reserved1 = visa.substring(62, 66);
					this.multipleClearingSequenceNumber = visa.substring(66, 68);
					this.multipleClearingSequenceCount = visa.substring(68, 70);
					this.productId = visa.substring(70, 72);
					this.spendQualifiedIndicator = visa.substring(72, 73);
					this.disputeFinancialReasonCode = visa.substring(73, 75);
					this.settlementFlag = visa.substring(75, 76);
					this.usageCode = visa.substring(76, 77);
					this.transactionIdentifier = visa.substring(77, 92);
					this.acquirerBusinessId = visa.substring(92, 100);
					this.originalTransactionAmount = convertAmount(visa.substring(100, 112));
					this.originalTransactionCurrencyCode = visa.substring(112, 115);
					this.specialChargebackIndicator = visa.substring(115, 116);
					this.destinationAmount = convertAmount(visa.substring(116, 128));
					this.destinationCurrencyCode = visa.substring(128, 131);
					this.reserved2 = visa.substring(131);
					break;
				default:
					// Handle unexpected sequence numbers
					Log.info("Unexpected sequence number in visa data: {}", visa.substring(0, 4));
					break;
			}
		}
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer incomingCode;

	@Column(name = "TRANSACTION_CODE")
	private String transactionCode; // Position 1-2

	@Column(name = "TRANSACTION_CODE_QUALIFIER")
	private String transactionCodeQualifier; // Position 3

	@Column(name = "TRANSACTION_COMPONENT_SEQUENCE_NUMBER")
	private String transactionComponentSequenceNumber; // Position 4

	@Column(name = "DESTINATION_BIN")
	private String destinationBin; // Position 5-10

	@Column(name = "SOURCE_BIN")
	private String sourceBin; // Position 11-16

	@Column(name = "VCR_RECORD_IDENTIFIER")
	private String vcrRecordIdentifier; // Position 17-19

	@Column(name = "DISPUTE_STATUS")
	private String disputeStatus; // Position 20-21

	@Column(name = "DISPUTE_TRANSACTION_CODE")
	private String disputeTransactionCode; // Position 22-23

	@Column(name = "DISPUTE_TRANSACTION_CODE_QUALIFIER")
	private String disputeTransactionCodeQualifier; // Position 24

	@Column(name = "ORIGINATOR_RECIPIENT_INDICATOR")
	private String originatorRecipientIndicator; // Position 25

	@Column(name = "ACCOUNT_NUMBER") //card number
	private String accountNumber; // Position 26-41

	@Column(name = "ACCOUNT_NUMBER_EXTENSION")
	private String accountNumberExtension; // Position 42-44

	@Column(name = "ACQUIRER_REFERENCE_NUMBER")
	private String acquirerReferenceNumber; // Position 45-67

	@Column(name = "PURCHASE_DATE")
	private String purchaseDate; // Position 68-71

	@Column(name = "SOURCE_AMOUNT")
	private double sourceAmount; // Position 72-83

	@Column(name = "SOURCE_CURRENCY_CODE")
	private String sourceCurrencyCode; // Position 84-86

	@Column(name = "MERCHANT_NAME")
	private String merchantName; // Position 87-111

	@Column(name = "MERCHANT_CITY")
	private String merchantCity; // Position 112-124

	@Column(name = "MERCHANT_COUNTRY_CODE")
	private String merchantCountryCode; // Position 125-127

	@Column(name = "MERCHANT_CATEGORY_CODE")
	private String merchantCategoryCode; // Position 128-131

	@Column(name = "MERCHANT_STATE_CODE")
	private String merchantStateCode; // Position 132-134

	@Column(name = "MERCHANT_ZIP_CODE")
	private String merchantZipCode; // Position 135-139

	@Column(name = "REQUESTED_PAYMENT_SERVICE")
	private String requestedPaymentService; // Position 140

	@Column(name = "AUTHORIZATION_CODE")
	private String authorizationCode; // Position 141-146

	@Column(name = "POS_ENTRY_MODE")
	private String posEntryMode; // Position 147-148

	@Column(name = "CENTRAL_PROCESSING_DATE")
	private String centralProcessingDate; // Position 149-152

	@Column(name = "CARD_ACCEPTOR_ID") // terminal id
	private String cardAcceptorId; // Position 153-167

	@Column(name = "REIMBURSEMENT_ATTRIBUTE")
	private String reimbursementAttribute; // Position 168

	@Column(name = "NETWORK_IDENTIFICATION_CODE")
	private String networkIdentificationCode; // Row 2 Position 5-8

	@Column(name = "DISPUTE_CONDITION")
	private String disputeCondition; // Row 2 Position 9-11

	@Column(name = "VROL_FINANCIAL_ID")
	private String vrolFinancialId; // Row 2 Position 12-22

	@Column(name = "VROL_CASE_NUMBER")
	private String vrolCaseNumber; // Row 2 Position 23-32

	@Column(name = "VROL_BUNDLE_CASE_NUMBER")
	private String vrolBundleCaseNumber; // Row 2 Position 33-42

	@Column(name = "CLIENT_CASE_NUMBER")
	private String clientCaseNumber; // Row 2 Position 43-62

	@Column(name = "MULTIPLE_CLEARING_SEQUENCE_NUMBER")
	private String multipleClearingSequenceNumber; // Row 2 Position 67-68

	@Column(name = "MULTIPLE_CLEARING_SEQUENCE_COUNT")
	private String multipleClearingSequenceCount; // Row 2 Position 69-70

	@Column(name = "PRODUCT_ID")
	private String productId; // Row 2 Position 71-72

	@Column(name = "SPEND_QUALIFIED_INDICATOR")
	private String spendQualifiedIndicator; // Row 2 Position 73

	@Column(name = "DISPUTE_FINANCIAL_REASON_CODE")
	private String disputeFinancialReasonCode; // Row 2 Position 74-75

	@Column(name = "SETTLEMENT_FLAG")
	private String settlementFlag; // Row 2 Position 76

	@Column(name = "USAGE_CODE")
	private String usageCode; // Row 2 Position 77

	@Column(name = "TRANSACTION_IDENTIFIER")
	private String transactionIdentifier; // Row 2 Position 78-92

	@Column(name = "ACQUIRER_BUSINESS_ID")
	private String acquirerBusinessId; // Row 2 Position 93-100

	@Column(name = "ORIGINAL_TRANSACTION_AMOUNT")
	private double originalTransactionAmount; // Row 2 Position 101-112

	@Column(name = "ORIGINAL_TRANSACTION_CURRENCY_CODE")
	private String originalTransactionCurrencyCode; // Row 2 Position 113-115

	@Column(name = "SPECIAL_CHARGEBACK_INDICATOR")
	private String specialChargebackIndicator; // Row 2 Position 116

	@Column(name = "DESTINATION_AMOUNT")
	private double destinationAmount; // Row 2 Position 117-128

	@Column(name = "DESTINATION_CURRENCY_CODE")
	private String destinationCurrencyCode; // Row 2 Position 129-131
	@Column(name = "summary_Code")
	private int summaryCode;
	@Column(name = "settlement_calculat")
	private double settlementCalculate=0;
	@Column(name = "interchange_calculat")
	private double interchangeCalculat=0;
	private double conversionRate=1;
	private double conversionRateTnd=1;
	private double amountTnd=0;
	private String reserved2;
	private String interchangeSigne;
	private String settelemntSigne;
	private String reserved1;

	private String constatation;
	private String compteBeneficiaire;
	private Integer statusChargeback;
	private String excedentType;
	private String fileDate;


	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public double getSettlementCalculate() {
		return settlementCalculate;
	}

	public void setSettlementCalculate(double settlementCalculate) {
		this.settlementCalculate = settlementCalculate;
	}

	public double getInterchangeCalculat() {
		return interchangeCalculat;
	}

	public void setInterchangeCalculat(double interchangeCalculat) {
		this.interchangeCalculat = interchangeCalculat;
	}

	public double getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	public double getConversionRateTnd() {
		return conversionRateTnd;
	}

	public void setConversionRateTnd(double conversionRateTnd) {
		this.conversionRateTnd = conversionRateTnd;
	}

	public double getAmountTnd() {
		return amountTnd;
	}

	public void setAmountTnd(double amountTnd) {
		this.amountTnd = amountTnd;
	}

	public int getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(int summaryCode) {
		this.summaryCode = summaryCode;
	}


	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public Integer getIncomingCode() {
		return incomingCode;
	}

	public void setIncomingCode(Integer incomingCode) {
		this.incomingCode = incomingCode;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransactionCodeQualifier() {
		return transactionCodeQualifier;
	}

	public void setTransactionCodeQualifier(String transactionCodeQualifier) {
		this.transactionCodeQualifier = transactionCodeQualifier;
	}

	public String getTransactionComponentSequenceNumber() {
		return transactionComponentSequenceNumber;
	}

	public void setTransactionComponentSequenceNumber(String transactionComponentSequenceNumber) {
		this.transactionComponentSequenceNumber = transactionComponentSequenceNumber;
	}

	public String getDestinationBin() {
		return destinationBin;
	}

	public void setDestinationBin(String destinationBin) {
		this.destinationBin = destinationBin;
	}

	public String getSourceBin() {
		return sourceBin;
	}

	public void setSourceBin(String sourceBin) {
		this.sourceBin = sourceBin;
	}

	public String getVcrRecordIdentifier() {
		return vcrRecordIdentifier;
	}

	public void setVcrRecordIdentifier(String vcrRecordIdentifier) {
		this.vcrRecordIdentifier = vcrRecordIdentifier;
	}

	public String getDisputeStatus() {
		return disputeStatus;
	}

	public void setDisputeStatus(String disputeStatus) {
		this.disputeStatus = disputeStatus;
	}

	public String getDisputeTransactionCode() {
		return disputeTransactionCode;
	}

	public void setDisputeTransactionCode(String disputeTransactionCode) {
		this.disputeTransactionCode = disputeTransactionCode;
	}

	public String getDisputeTransactionCodeQualifier() {
		return disputeTransactionCodeQualifier;
	}

	public void setDisputeTransactionCodeQualifier(String disputeTransactionCodeQualifier) {
		this.disputeTransactionCodeQualifier = disputeTransactionCodeQualifier;
	}

	public String getOriginatorRecipientIndicator() {
		return originatorRecipientIndicator;
	}

	public void setOriginatorRecipientIndicator(String originatorRecipientIndicator) {
		this.originatorRecipientIndicator = originatorRecipientIndicator;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountNumberExtension() {
		return accountNumberExtension;
	}

	public void setAccountNumberExtension(String accountNumberExtension) {
		this.accountNumberExtension = accountNumberExtension;
	}

	public String getAcquirerReferenceNumber() {
		return acquirerReferenceNumber;
	}

	public void setAcquirerReferenceNumber(String acquirerReferenceNumber) {
		this.acquirerReferenceNumber = acquirerReferenceNumber;
	}

	public String getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public double getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(double sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}

	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}

	public String getMerchantName() {
		return merchantName;
	}

	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getMerchantCity() {
		return merchantCity;
	}

	public void setMerchantCity(String merchantCity) {
		this.merchantCity = merchantCity;
	}

	public String getMerchantCountryCode() {
		return merchantCountryCode;
	}

	public void setMerchantCountryCode(String merchantCountryCode) {
		this.merchantCountryCode = merchantCountryCode;
	}

	public String getMerchantCategoryCode() {
		return merchantCategoryCode;
	}

	public void setMerchantCategoryCode(String merchantCategoryCode) {
		this.merchantCategoryCode = merchantCategoryCode;
	}

	public String getMerchantStateCode() {
		return merchantStateCode;
	}

	public void setMerchantStateCode(String merchantStateCode) {
		this.merchantStateCode = merchantStateCode;
	}

	public String getMerchantZipCode() {
		return merchantZipCode;
	}

	public void setMerchantZipCode(String merchantZipCode) {
		this.merchantZipCode = merchantZipCode;
	}

	public String getRequestedPaymentService() {
		return requestedPaymentService;
	}

	public void setRequestedPaymentService(String requestedPaymentService) {
		this.requestedPaymentService = requestedPaymentService;
	}

	public String getAuthorizationCode() {
		return authorizationCode;
	}

	public void setAuthorizationCode(String authorizationCode) {
		this.authorizationCode = authorizationCode;
	}

	public String getPosEntryMode() {
		return posEntryMode;
	}

	public void setPosEntryMode(String posEntryMode) {
		this.posEntryMode = posEntryMode;
	}

	public String getCentralProcessingDate() {
		return centralProcessingDate;
	}

	public void setCentralProcessingDate(String centralProcessingDate) {
		this.centralProcessingDate = centralProcessingDate;
	}

	public String getCardAcceptorId() {
		return cardAcceptorId;
	}

	public void setCardAcceptorId(String cardAcceptorId) {
		this.cardAcceptorId = cardAcceptorId;
	}

	public String getReimbursementAttribute() {
		return reimbursementAttribute;
	}

	public void setReimbursementAttribute(String reimbursementAttribute) {
		this.reimbursementAttribute = reimbursementAttribute;
	}

	public String getNetworkIdentificationCode() {
		return networkIdentificationCode;
	}

	public void setNetworkIdentificationCode(String networkIdentificationCode) {
		this.networkIdentificationCode = networkIdentificationCode;
	}

	public String getDisputeCondition() {
		return disputeCondition;
	}

	public void setDisputeCondition(String disputeCondition) {
		this.disputeCondition = disputeCondition;
	}

	public String getVrolFinancialId() {
		return vrolFinancialId;
	}

	public void setVrolFinancialId(String vrolFinancialId) {
		this.vrolFinancialId = vrolFinancialId;
	}

	public String getVrolCaseNumber() {
		return vrolCaseNumber;
	}

	public void setVrolCaseNumber(String vrolCaseNumber) {
		this.vrolCaseNumber = vrolCaseNumber;
	}

	public String getVrolBundleCaseNumber() {
		return vrolBundleCaseNumber;
	}

	public void setVrolBundleCaseNumber(String vrolBundleCaseNumber) {
		this.vrolBundleCaseNumber = vrolBundleCaseNumber;
	}

	public String getClientCaseNumber() {
		return clientCaseNumber;
	}

	public void setClientCaseNumber(String clientCaseNumber) {
		this.clientCaseNumber = clientCaseNumber;
	}

	public String getMultipleClearingSequenceNumber() {
		return multipleClearingSequenceNumber;
	}

	public void setMultipleClearingSequenceNumber(String multipleClearingSequenceNumber) {
		this.multipleClearingSequenceNumber = multipleClearingSequenceNumber;
	}

	public String getMultipleClearingSequenceCount() {
		return multipleClearingSequenceCount;
	}

	public void setMultipleClearingSequenceCount(String multipleClearingSequenceCount) {
		this.multipleClearingSequenceCount = multipleClearingSequenceCount;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSpendQualifiedIndicator() {
		return spendQualifiedIndicator;
	}

	public void setSpendQualifiedIndicator(String spendQualifiedIndicator) {
		this.spendQualifiedIndicator = spendQualifiedIndicator;
	}

	public String getDisputeFinancialReasonCode() {
		return disputeFinancialReasonCode;
	}

	public void setDisputeFinancialReasonCode(String disputeFinancialReasonCode) {
		this.disputeFinancialReasonCode = disputeFinancialReasonCode;
	}

	public String getSettlementFlag() {
		return settlementFlag;
	}

	public void setSettlementFlag(String settlementFlag) {
		this.settlementFlag = settlementFlag;
	}

	public String getUsageCode() {
		return usageCode;
	}

	public void setUsageCode(String usageCode) {
		this.usageCode = usageCode;
	}

	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	public String getAcquirerBusinessId() {
		return acquirerBusinessId;
	}

	public void setAcquirerBusinessId(String acquirerBusinessId) {
		this.acquirerBusinessId = acquirerBusinessId;
	}

	public double getOriginalTransactionAmount() {
		return originalTransactionAmount;
	}

	public void setOriginalTransactionAmount(double originalTransactionAmount) {
		this.originalTransactionAmount = originalTransactionAmount;
	}

	public String getOriginalTransactionCurrencyCode() {
		return originalTransactionCurrencyCode;
	}

	public void setOriginalTransactionCurrencyCode(String originalTransactionCurrencyCode) {
		this.originalTransactionCurrencyCode = originalTransactionCurrencyCode;
	}

	public String getSpecialChargebackIndicator() {
		return specialChargebackIndicator;
	}

	public void setSpecialChargebackIndicator(String specialChargebackIndicator) {
		this.specialChargebackIndicator = specialChargebackIndicator;
	}

	public double getDestinationAmount() {
		return destinationAmount;
	}

	public void setDestinationAmount(double destinationAmount) {
		this.destinationAmount = destinationAmount;
	}

	public String getDestinationCurrencyCode() {
		return destinationCurrencyCode;
	}

	public void setDestinationCurrencyCode(String destinationCurrencyCode) {
		this.destinationCurrencyCode = destinationCurrencyCode;
	}

	public String getConstatation() {
		return constatation;
	}

	public void setConstatation(String constatation) {
		this.constatation = constatation;
	}

	public String getCompteBeneficiaire() {
		return compteBeneficiaire;
	}

	public void setCompteBeneficiaire(String compteBeneficiaire) {
		this.compteBeneficiaire = compteBeneficiaire;
	}

	public Integer getStatusChargeback() {
		return statusChargeback;
	}

	public void setStatusChargeback(Integer statusChargeback) {
		this.statusChargeback = statusChargeback;
	}

	public String getExcedentType() {
		return excedentType;
	}

	public void setExcedentType(String excedentType) {
		this.excedentType = excedentType;
	}

	@Override
	public String toString() {
		return "VisaDisputeStatusAdvice [incomingCode=" + incomingCode + ", transactionCode=" + transactionCode
				+ ", transactionCodeQualifier=" + transactionCodeQualifier + ", transactionComponentSequenceNumber="
				+ transactionComponentSequenceNumber + ", destinationBin=" + destinationBin + ", sourceBin=" + sourceBin
				+ ", vcrRecordIdentifier=" + vcrRecordIdentifier + ", disputeStatus=" + disputeStatus
				+ ", disputeTransactionCode=" + disputeTransactionCode + ", disputeTransactionCodeQualifier="
				+ disputeTransactionCodeQualifier + ", originatorRecipientIndicator=" + originatorRecipientIndicator
				+ ", accountNumber=" + accountNumber + ", accountNumberExtension=" + accountNumberExtension
				+ ", acquirerReferenceNumber=" + acquirerReferenceNumber + ", purchaseDate=" + purchaseDate
				+ ", sourceAmount=" + sourceAmount + ", sourceCurrencyCode=" + sourceCurrencyCode + ", merchantName="
				+ merchantName + ", merchantCity=" + merchantCity + ", merchantCountryCode=" + merchantCountryCode
				+ ", merchantCategoryCode=" + merchantCategoryCode + ", merchantStateCode=" + merchantStateCode
				+ ", merchantZipCode=" + merchantZipCode + ", requestedPaymentService=" + requestedPaymentService
				+ ", authorizationCode=" + authorizationCode + ", posEntryMode=" + posEntryMode
				+ ", centralProcessingDate=" + centralProcessingDate + ", cardAcceptorId=" + cardAcceptorId
				+ ", reimbursementAttribute=" + reimbursementAttribute + ", networkIdentificationCode="
				+ networkIdentificationCode + ", disputeCondition=" + disputeCondition + ", vrolFinancialId="
				+ vrolFinancialId + ", vrolCaseNumber=" + vrolCaseNumber + ", vrolBundleCaseNumber="
				+ vrolBundleCaseNumber + ", clientCaseNumber=" + clientCaseNumber + ", multipleClearingSequenceNumber="
				+ multipleClearingSequenceNumber + ", multipleClearingSequenceCount=" + multipleClearingSequenceCount
				+ ", productId=" + productId + ", spendQualifiedIndicator=" + spendQualifiedIndicator
				+ ", disputeFinancialReasonCode=" + disputeFinancialReasonCode + ", settlementFlag=" + settlementFlag
				+ ", usageCode=" + usageCode + ", transactionIdentifier=" + transactionIdentifier
				+ ", acquirerBusinessId=" + acquirerBusinessId + ", originalTransactionAmount="
				+ originalTransactionAmount + ", originalTransactionCurrencyCode=" + originalTransactionCurrencyCode
				+ ", specialChargebackIndicator=" + specialChargebackIndicator + ", destinationAmount="
				+ destinationAmount + ", destinationCurrencyCode=" + destinationCurrencyCode + ", summaryCode="
				+ summaryCode + ", settlementCalculate=" + settlementCalculate + ", interchangeCalculat="
				+ interchangeCalculat + ", conversionRate=" + conversionRate + ", conversionRateTnd="
				+ conversionRateTnd + ", amountTnd=" + amountTnd + ", reserved2=" + reserved2 + ", interchangeSigne="
				+ interchangeSigne + ", settelemntSigne=" + settelemntSigne + ", reserved1=" + reserved1 + "]";
	}

	public String getInterchangeSigne() {
		return interchangeSigne;
	}

	public void setInterchangeSigne(String interchangeSigne) {
		this.interchangeSigne = interchangeSigne;
	}

	public String getSettelemntSigne() {
		return settelemntSigne;
	}

	public void setSettelemntSigne(String settelemntSigne) {
		this.settelemntSigne = settelemntSigne;
	}

}

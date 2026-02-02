package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Tc04", schema = "FRANSABANK")
public class Tc04 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	private int code;
	private String transactionCode;
	private String transactionCodeQualifier;
	private String transactionComponentSequenceNumber;
	private String destinationBIN;
	private String sourceBIN;
	private String originalTransactionCode;
	private String originalTransactionCodeQualifier;
	private String originalTransactionComponentSequenceNumber;
	private String sourceBatchDate;
	private String sourceBatchNumber;
	private String itemSequenceNumber;
	private String reserved1;
	private String settledInternationalFeeIndicator;
	private String settledAuthorizationCharacteristicsIndicator;
	private String settledRequestedPaymentService;
	private String settledReimbursementAttribute;
	private String derivedIRFDescriptor;
	private String settledIRFDescriptor;
	private String paymentServiceReclassificationReason;
	private String feeReclassificationReason;
	private String merchantVolumeReclassificationReason;
	private String submittedFeeProgramIndicator;
	private String assessedFeeProgramIndicator;
	private String feeProgramIndicatorReclassificationReason;
	private String mOTOECIReclassificationReason;
	private String interchangeFeeAmount;
	private String interchangeFeeSign;
	private String transactionIntegrityFeeReclassificationReason;
	private String reserved2;
	private Integer summaryCode;

	public void visaIncomingSetter(Integer summaryCode, String v04) {

		this.transactionCode = mySubString(v04, 0, 2);
		this.transactionCodeQualifier = mySubString(v04, 2, 1);
		this.transactionComponentSequenceNumber = mySubString(v04, 3, 1);
		;
		this.destinationBIN = mySubString(v04, 4, 6);
		;
		this.sourceBIN = mySubString(v04, 10, 6);
		this.originalTransactionCode = mySubString(v04, 16, 2);
		this.originalTransactionCodeQualifier = mySubString(v04, 18, 1);
		this.originalTransactionComponentSequenceNumber = mySubString(v04, 19, 1);
		this.sourceBatchDate = mySubString(v04, 20, 5);
		this.sourceBatchNumber = mySubString(v04, 25, 6);
		this.itemSequenceNumber = mySubString(v04, 31, 4);
		;
		this.reserved1 = mySubString(v04, 35, 32);
		this.settledInternationalFeeIndicator = mySubString(v04, 67, 1);
		this.settledAuthorizationCharacteristicsIndicator = mySubString(v04, 68, 1);
		this.settledRequestedPaymentService = mySubString(v04, 69, 1);
		this.settledReimbursementAttribute = mySubString(v04, 70, 1);
		this.derivedIRFDescriptor = mySubString(v04, 71, 16);
		this.settledIRFDescriptor = mySubString(v04, 87, 16);
		this.paymentServiceReclassificationReason = mySubString(v04, 103, 3);
		this.feeReclassificationReason = mySubString(v04, 106, 3);
		this.merchantVolumeReclassificationReason = mySubString(v04, 109, 3);
		this.submittedFeeProgramIndicator = mySubString(v04, 112, 3);
		this.assessedFeeProgramIndicator = mySubString(v04, 115, 3);
		this.feeProgramIndicatorReclassificationReason = mySubString(v04, 118, 3);
		this.mOTOECIReclassificationReason = mySubString(v04, 121, 3);
		this.interchangeFeeAmount = mySubString(v04, 124, 15);
		this.interchangeFeeSign = mySubString(v04, 139, 1);
		this.transactionIntegrityFeeReclassificationReason = mySubString(v04, 140, 3);
		this.reserved2 = mySubString(v04, 143, 25);
		this.summaryCode = summaryCode;

	}

	String mySubString(String myString, int start, int length) {
		return myString.substring(start, Math.min(start + length, myString.length()));
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
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

	public String getDestinationBIN() {
		return destinationBIN;
	}

	public void setDestinationBIN(String destinationBIN) {
		this.destinationBIN = destinationBIN;
	}

	public String getSourceBIN() {
		return sourceBIN;
	}

	public void setSourceBIN(String sourceBIN) {
		this.sourceBIN = sourceBIN;
	}

	public String getOriginalTransactionCode() {
		return originalTransactionCode;
	}

	public void setOriginalTransactionCode(String originalTransactionCode) {
		this.originalTransactionCode = originalTransactionCode;
	}

	public String getOriginalTransactionCodeQualifier() {
		return originalTransactionCodeQualifier;
	}

	public void setOriginalTransactionCodeQualifier(String originalTransactionCodeQualifier) {
		this.originalTransactionCodeQualifier = originalTransactionCodeQualifier;
	}

	public String getOriginalTransactionComponentSequenceNumber() {
		return originalTransactionComponentSequenceNumber;
	}

	public void setOriginalTransactionComponentSequenceNumber(String originalTransactionComponentSequenceNumber) {
		this.originalTransactionComponentSequenceNumber = originalTransactionComponentSequenceNumber;
	}

	public String getSourceBatchDate() {
		return sourceBatchDate;
	}

	public void setSourceBatchDate(String sourceBatchDate) {
		this.sourceBatchDate = sourceBatchDate;
	}

	public String getSourceBatchNumber() {
		return sourceBatchNumber;
	}

	public void setSourceBatchNumber(String sourceBatchNumber) {
		this.sourceBatchNumber = sourceBatchNumber;
	}

	public String getItemSequenceNumber() {
		return itemSequenceNumber;
	}

	public void setItemSequenceNumber(String itemSequenceNumber) {
		this.itemSequenceNumber = itemSequenceNumber;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getSettledInternationalFeeIndicator() {
		return settledInternationalFeeIndicator;
	}

	public void setSettledInternationalFeeIndicator(String settledInternationalFeeIndicator) {
		this.settledInternationalFeeIndicator = settledInternationalFeeIndicator;
	}

	public String getSettledAuthorizationCharacteristicsIndicator() {
		return settledAuthorizationCharacteristicsIndicator;
	}

	public void setSettledAuthorizationCharacteristicsIndicator(String settledAuthorizationCharacteristicsIndicator) {
		this.settledAuthorizationCharacteristicsIndicator = settledAuthorizationCharacteristicsIndicator;
	}

	public String getSettledRequestedPaymentService() {
		return settledRequestedPaymentService;
	}

	public void setSettledRequestedPaymentService(String settledRequestedPaymentService) {
		this.settledRequestedPaymentService = settledRequestedPaymentService;
	}

	public String getSettledReimbursementAttribute() {
		return settledReimbursementAttribute;
	}

	public void setSettledReimbursementAttribute(String settledReimbursementAttribute) {
		this.settledReimbursementAttribute = settledReimbursementAttribute;
	}

	public String getDerivedIRFDescriptor() {
		return derivedIRFDescriptor;
	}

	public void setDerivedIRFDescriptor(String derivedIRFDescriptor) {
		this.derivedIRFDescriptor = derivedIRFDescriptor;
	}

	public String getSettledIRFDescriptor() {
		return settledIRFDescriptor;
	}

	public void setSettledIRFDescriptor(String settledIRFDescriptor) {
		this.settledIRFDescriptor = settledIRFDescriptor;
	}

	public String getPaymentServiceReclassificationReason() {
		return paymentServiceReclassificationReason;
	}

	public void setPaymentServiceReclassificationReason(String paymentServiceReclassificationReason) {
		this.paymentServiceReclassificationReason = paymentServiceReclassificationReason;
	}

	public String getFeeReclassificationReason() {
		return feeReclassificationReason;
	}

	public void setFeeReclassificationReason(String feeReclassificationReason) {
		this.feeReclassificationReason = feeReclassificationReason;
	}

	public String getMerchantVolumeReclassificationReason() {
		return merchantVolumeReclassificationReason;
	}

	public void setMerchantVolumeReclassificationReason(String merchantVolumeReclassificationReason) {
		this.merchantVolumeReclassificationReason = merchantVolumeReclassificationReason;
	}

	public String getSubmittedFeeProgramIndicator() {
		return submittedFeeProgramIndicator;
	}

	public void setSubmittedFeeProgramIndicator(String submittedFeeProgramIndicator) {
		this.submittedFeeProgramIndicator = submittedFeeProgramIndicator;
	}

	public String getAssessedFeeProgramIndicator() {
		return assessedFeeProgramIndicator;
	}

	public void setAssessedFeeProgramIndicator(String assessedFeeProgramIndicator) {
		this.assessedFeeProgramIndicator = assessedFeeProgramIndicator;
	}

	public String getFeeProgramIndicatorReclassificationReason() {
		return feeProgramIndicatorReclassificationReason;
	}

	public void setFeeProgramIndicatorReclassificationReason(String feeProgramIndicatorReclassificationReason) {
		this.feeProgramIndicatorReclassificationReason = feeProgramIndicatorReclassificationReason;
	}

	public String getmOTOECIReclassificationReason() {
		return mOTOECIReclassificationReason;
	}

	public void setmOTOECIReclassificationReason(String mOTOECIReclassificationReason) {
		this.mOTOECIReclassificationReason = mOTOECIReclassificationReason;
	}

	public String getInterchangeFeeAmount() {
		return interchangeFeeAmount;
	}

	public void setInterchangeFeeAmount(String interchangeFeeAmount) {
		this.interchangeFeeAmount = interchangeFeeAmount;
	}

	public String getInterchangeFeeSign() {
		return interchangeFeeSign;
	}

	public void setInterchangeFeeSign(String interchangeFeeSign) {
		this.interchangeFeeSign = interchangeFeeSign;
	}

	public String getTransactionIntegrityFeeReclassificationReason() {
		return transactionIntegrityFeeReclassificationReason;
	}

	public void setTransactionIntegrityFeeReclassificationReason(String transactionIntegrityFeeReclassificationReason) {
		this.transactionIntegrityFeeReclassificationReason = transactionIntegrityFeeReclassificationReason;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

}

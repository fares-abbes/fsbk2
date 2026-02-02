package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.jline.utils.Log;
@Entity
@Table(name = "TotalVisa", schema = "FRANSABANK")
public class TotalVisa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	@Column(name = "CODE", nullable = false)
	private Integer code;
	private String transactionCode;
	private String transactionCodeQualifier;
	private String transactionComponentSequenceNumb;
	private String destinationBin;
	private String sourceBin;
	private String reportingForSreIdentifier;
	private String rollupToSreIdentifier;
	private String fundsTransferSreIdentifier;
	private String settlementServiceIdentifier;
	private String settlementCurrencyCode;
	private String clearingCurrencyCode;
	private String businessMode;
	private String noDataIndicator;
	private String reservedOne;
	private String reportGroup;
	private String reportSubgroup;
	private String reportIdentificationNumber;
	private String reportIdentitifactionSuffix;
	private String settlementDate;
	private String reportDate;
	private String fromDate;
	private String toDate;
	private String chargeTypeCode;
	private String businessTransactionType;
	private String businessTransactionCycle;
	private String reversalIndicator;
	private String returnIndicator;
	private String juristictionCode;
	private String interregionalRoutingIndicator;
	private String sourceCountryCode;
	private String destinationCountryCode;
	private String sourceRegionCode;
	private String destinationRegionCode;
	private String deeLevelDescriptor;
	private String crDbNetIndicator;
	private String summaryLevel;
	private String merchantVolumeIndicator;
	private String reservedTwo;
	private String reimbursementAttribute;
	private Integer summaryCode;
	private String currencyTableDate;
	private String firstCount;
	private String secoundCount;
	private String firstAmount;
	private String firstAmountSign;
	private String secondAmount;
	private String secondAmountSign;
	private String thirdAmount;
	private String thirdAmountSign;
	private String fourthAmount;
	private String fourthAmountSign;
	private String fifthAmount;
	private String fifthAmountSign;
	private String sixthAmount;
	private String sixthAmountSign;
	private String reservedThree;

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
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

	public String getTransactionComponentSequenceNumb() {
		return transactionComponentSequenceNumb;
	}

	public void setTransactionComponentSequenceNumb(String transactionComponentSequenceNumb) {
		this.transactionComponentSequenceNumb = transactionComponentSequenceNumb;
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

	public String getReportingForSreIdentifier() {
		return reportingForSreIdentifier;
	}

	public void setReportingForSreIdentifier(String reportingForSreIdentifier) {
		this.reportingForSreIdentifier = reportingForSreIdentifier;
	}

	public String getRollupToSreIdentifier() {
		return rollupToSreIdentifier;
	}

	public void setRollupToSreIdentifier(String rollupToSreIdentifier) {
		this.rollupToSreIdentifier = rollupToSreIdentifier;
	}

	public String getFundsTransferSreIdentifier() {
		return fundsTransferSreIdentifier;
	}

	public void setFundsTransferSreIdentifier(String fundsTransferSreIdentifier) {
		this.fundsTransferSreIdentifier = fundsTransferSreIdentifier;
	}

	public String getSettlementServiceIdentifier() {
		return settlementServiceIdentifier;
	}

	public void setSettlementServiceIdentifier(String settlementServiceIdentifier) {
		this.settlementServiceIdentifier = settlementServiceIdentifier;
	}

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

	public String getClearingCurrencyCode() {
		return clearingCurrencyCode;
	}

	public void setClearingCurrencyCode(String clearingCurrencyCode) {
		this.clearingCurrencyCode = clearingCurrencyCode;
	}

	public String getBusinessMode() {
		return businessMode;
	}

	public void setBusinessMode(String businessMode) {
		this.businessMode = businessMode;
	}

	public String getNoDataIndicator() {
		return noDataIndicator;
	}

	public void setNoDataIndicator(String noDataIndicator) {
		this.noDataIndicator = noDataIndicator;
	}

	public String getReservedOne() {
		return reservedOne;
	}

	public void setReservedOne(String reservedOne) {
		this.reservedOne = reservedOne;
	}

	public String getReportGroup() {
		return reportGroup;
	}

	public void setReportGroup(String reportGroup) {
		this.reportGroup = reportGroup;
	}

	public String getReportSubgroup() {
		return reportSubgroup;
	}

	public void setReportSubgroup(String reportSubgroup) {
		this.reportSubgroup = reportSubgroup;
	}

	public String getReportIdentificationNumber() {
		return reportIdentificationNumber;
	}

	public void setReportIdentificationNumber(String reportIdentificationNumber) {
		this.reportIdentificationNumber = reportIdentificationNumber;
	}

	public String getReportIdentitifactionSuffix() {
		return reportIdentitifactionSuffix;
	}

	public void setReportIdentitifactionSuffix(String reportIdentitifactionSuffix) {
		this.reportIdentitifactionSuffix = reportIdentitifactionSuffix;
	}

	public String getSettlementDate() {
		return settlementDate;
	}

	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public String getChargeTypeCode() {
		return chargeTypeCode;
	}

	public void setChargeTypeCode(String chargeTypeCode) {
		this.chargeTypeCode = chargeTypeCode;
	}

	public String getBusinessTransactionType() {
		return businessTransactionType;
	}

	public void setBusinessTransactionType(String businessTransactionType) {
		this.businessTransactionType = businessTransactionType;
	}

	public String getBusinessTransactionCycle() {
		return businessTransactionCycle;
	}

	public void setBusinessTransactionCycle(String businessTransactionCycle) {
		this.businessTransactionCycle = businessTransactionCycle;
	}

	public String getReversalIndicator() {
		return reversalIndicator;
	}

	public void setReversalIndicator(String reversalIndicator) {
		this.reversalIndicator = reversalIndicator;
	}

	public String getReturnIndicator() {
		return returnIndicator;
	}

	public void setReturnIndicator(String returnIndicator) {
		this.returnIndicator = returnIndicator;
	}

	public String getJuristictionCode() {
		return juristictionCode;
	}

	public void setJuristictionCode(String juristictionCode) {
		this.juristictionCode = juristictionCode;
	}

	public String getInterregionalRoutingIndicator() {
		return interregionalRoutingIndicator;
	}

	public void setInterregionalRoutingIndicator(String interregionalRoutingIndicator) {
		this.interregionalRoutingIndicator = interregionalRoutingIndicator;
	}

	public String getSourceCountryCode() {
		return sourceCountryCode;
	}

	public void setSourceCountryCode(String sourceCountryCode) {
		this.sourceCountryCode = sourceCountryCode;
	}

	public String getDestinationCountryCode() {
		return destinationCountryCode;
	}

	public void setDestinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}

	public String getSourceRegionCode() {
		return sourceRegionCode;
	}

	public void setSourceRegionCode(String sourceRegionCode) {
		this.sourceRegionCode = sourceRegionCode;
	}

	public String getDestinationRegionCode() {
		return destinationRegionCode;
	}

	public void setDestinationRegionCode(String destinationRegionCode) {
		this.destinationRegionCode = destinationRegionCode;
	}

	public String getDeeLevelDescriptor() {
		return deeLevelDescriptor;
	}

	public void setDeeLevelDescriptor(String deeLevelDescriptor) {
		this.deeLevelDescriptor = deeLevelDescriptor;
	}

	public String getCrDbNetIndicator() {
		return crDbNetIndicator;
	}

	public void setCrDbNetIndicator(String crDbNetIndicator) {
		this.crDbNetIndicator = crDbNetIndicator;
	}

	public String getSummaryLevel() {
		return summaryLevel;
	}

	public void setSummaryLevel(String summaryLevel) {
		this.summaryLevel = summaryLevel;
	}

	public String getMerchantVolumeIndicator() {
		return merchantVolumeIndicator;
	}

	public void setMerchantVolumeIndicator(String merchantVolumeIndicator) {
		this.merchantVolumeIndicator = merchantVolumeIndicator;
	}

	public String getReservedTwo() {
		return reservedTwo;
	}

	public void setReservedTwo(String reservedTwo) {
		this.reservedTwo = reservedTwo;
	}

	public String getReimbursementAttribute() {
		return reimbursementAttribute;
	}

	public void setReimbursementAttribute(String reimbursementAttribute) {
		this.reimbursementAttribute = reimbursementAttribute;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getCurrencyTableDate() {
		return currencyTableDate;
	}

	public void setCurrencyTableDate(String currencyTableDate) {
		this.currencyTableDate = currencyTableDate;
	}

	public String getFirstCount() {
		return firstCount;
	}

	public void setFirstCount(String firstCount) {
		this.firstCount = firstCount;
	}

	public String getSecoundCount() {
		return secoundCount;
	}

	public void setSecoundCount(String secoundCount) {
		this.secoundCount = secoundCount;
	}

	public String getFirstAmount() {
		return firstAmount;
	}

	public void setFirstAmount(String firstAmount) {
		this.firstAmount = firstAmount;
	}

	public String getFirstAmountSign() {
		return firstAmountSign;
	}

	public void setFirstAmountSign(String firstAmountSign) {
		this.firstAmountSign = firstAmountSign;
	}

	public String getSecondAmount() {
		return secondAmount;
	}

	public void setSecondAmount(String secondAmount) {
		this.secondAmount = secondAmount;
	}

	public String getSecondAmountSign() {
		return secondAmountSign;
	}

	public void setSecondAmountSign(String secondAmountSign) {
		this.secondAmountSign = secondAmountSign;
	}

	public String getThirdAmount() {
		return thirdAmount;
	}

	public void setThirdAmount(String thirdAmount) {
		this.thirdAmount = thirdAmount;
	}

	public String getThirdAmountSign() {
		return thirdAmountSign;
	}

	public void setThirdAmountSign(String thirdAmountSign) {
		this.thirdAmountSign = thirdAmountSign;
	}

	public String getFourthAmount() {
		return fourthAmount;
	}

	public void setFourthAmount(String fourthAmount) {
		this.fourthAmount = fourthAmount;
	}

	public String getFourthAmountSign() {
		return fourthAmountSign;
	}

	public void setFourthAmountSign(String fourthAmountSign) {
		this.fourthAmountSign = fourthAmountSign;
	}

	public String getFifthAmount() {
		return fifthAmount;
	}

	public void setFifthAmount(String fifthAmount) {
		this.fifthAmount = fifthAmount;
	}

	public String getFifthAmountSign() {
		return fifthAmountSign;
	}

	public void setFifthAmountSign(String fifthAmountSign) {
		this.fifthAmountSign = fifthAmountSign;
	}

	public String getSixthAmount() {
		return sixthAmount;
	}

	public void setSixthAmount(String sixthAmount) {
		this.sixthAmount = sixthAmount;
	}

	public String getSixthAmountSign() {
		return sixthAmountSign;
	}

	public void setSixthAmountSign(String sixthAmountSign) {
		this.sixthAmountSign = sixthAmountSign;
	}

	public String getReservedThree() {
		return reservedThree;
	}

	public void setReservedThree(String reservedThree) {
		this.reservedThree = reservedThree;
	}

	double getAmount(String amount) {
		return Double.parseDouble(amount);
	}

	public TotalVisa(int summary, String transactionCode, String transactionCodeQualifier,
			String transactionComponentSequenceNumb, String destinationBin, String sourceBin,
			String reportingForSreIdentifier, String rollupToSreIdentifier, String fundsTransferSreIdentifier,
			String settlementServiceIdentifier, String settlementCurrencyCode, String clearingCurrencyCode,
			String businessMode, String noDataIndicator, String reservedOne, String reportGroup, String reportSubgroup,
			String reportIdentificationNumber, String reportIdentitifactionSuffix, String settlementDate,
			String reportDate, String fromDate, String toDate, String chargeTypeCode, String businessTransactionType,
			String businessTransactionCycle, String reversalIndicator, String returnIndicator, String juristictionCode,
			String interregionalRoutingIndicator, String sourceCountryCode, String destinationCountryCode,
			String sourceRegionCode, String destinationRegionCode, String deeLevelDescriptor, String crDbNetIndicator,
			String summaryLevel, String merchantVolumeIndicator, String reservedTwo, String reimbursementAttribute,
			Integer summaryCode) {
		super();
		this.transactionCode = transactionCode;
		this.transactionCodeQualifier = transactionCodeQualifier;
		this.transactionComponentSequenceNumb = transactionComponentSequenceNumb;
		this.destinationBin = destinationBin;
		this.sourceBin = sourceBin;
		this.reportingForSreIdentifier = reportingForSreIdentifier;
		this.rollupToSreIdentifier = rollupToSreIdentifier;
		this.fundsTransferSreIdentifier = fundsTransferSreIdentifier;
		this.settlementServiceIdentifier = settlementServiceIdentifier;
		this.settlementCurrencyCode = settlementCurrencyCode;
		this.clearingCurrencyCode = clearingCurrencyCode;
		this.businessMode = businessMode;
		this.noDataIndicator = noDataIndicator;
		this.reservedOne = reservedOne;
		this.reportGroup = reportGroup;
		this.reportSubgroup = reportSubgroup;
		this.reportIdentificationNumber = reportIdentificationNumber;
		this.reportIdentitifactionSuffix = reportIdentitifactionSuffix;
		this.settlementDate = settlementDate;
		this.reportDate = reportDate;
		this.fromDate = fromDate;
		this.toDate = toDate;
		this.chargeTypeCode = chargeTypeCode;
		this.businessTransactionType = businessTransactionType;
		this.businessTransactionCycle = businessTransactionCycle;
		this.reversalIndicator = reversalIndicator;
		this.returnIndicator = returnIndicator;
		this.juristictionCode = juristictionCode;
		this.interregionalRoutingIndicator = interregionalRoutingIndicator;
		this.sourceCountryCode = sourceCountryCode;
		this.destinationCountryCode = destinationCountryCode;
		this.sourceRegionCode = sourceRegionCode;
		this.destinationRegionCode = destinationRegionCode;
		this.deeLevelDescriptor = deeLevelDescriptor;
		this.crDbNetIndicator = crDbNetIndicator;
		this.summaryLevel = summaryLevel;
		this.merchantVolumeIndicator = merchantVolumeIndicator;
		this.reservedTwo = reservedTwo;
		this.reimbursementAttribute = reimbursementAttribute;
		this.summaryCode = summaryCode;
	}

	public TotalVisa() {
		super();

		this.setFirstCount("000000000000000");
		this.setFirstAmount("000000000000000");
		this.setSecondAmount("000000000000000");
		this.setThirdAmount("000000000000000");

	}

	public void SetV4(Integer summaryCode, String V4) {
		this.summaryCode = summaryCode;
		switch (V4.substring(3, 4)) {
		case "0": {
			this.transactionCode = V4.substring(0, 2);
			this.transactionCodeQualifier = V4.substring(2, 3);
			this.transactionComponentSequenceNumb = V4.substring(3, 4);
			this.destinationBin = V4.substring(4, 10);
			this.sourceBin = V4.substring(10, 16);
			this.reportingForSreIdentifier = V4.substring(16, 26);
			this.rollupToSreIdentifier = V4.substring(26, 36);
			this.fundsTransferSreIdentifier = V4.substring(36, 46);
			this.settlementServiceIdentifier = V4.substring(46, 49);
			this.settlementCurrencyCode = V4.substring(49, 52);
			this.clearingCurrencyCode = V4.substring(52, 55);
			this.businessMode = V4.substring(55, 56);
			this.noDataIndicator = V4.substring(56, 57);
			this.reservedOne = V4.substring(57, 58);
			this.reportGroup = V4.substring(58, 59);
			this.reportSubgroup = V4.substring(59, 60);
			this.reportIdentificationNumber = V4.substring(60, 63);
			this.reportIdentitifactionSuffix = V4.substring(63, 65);
			this.settlementDate = V4.substring(65, 72);
			this.reportDate = V4.substring(72, 79);
			this.fromDate = V4.substring(79, 86);
			this.toDate = V4.substring(86, 93);
			this.chargeTypeCode = V4.substring(93, 96);
			this.businessTransactionType = V4.substring(96, 99);
			this.businessTransactionCycle = V4.substring(99, 100);
			this.reversalIndicator = V4.substring(100, 101);
			this.returnIndicator = V4.substring(101, 102);
			this.juristictionCode = V4.substring(102, 104);
			this.interregionalRoutingIndicator = V4.substring(104, 105);
			this.sourceCountryCode = V4.substring(105, 108);
			this.destinationCountryCode = V4.substring(108, 111);
			this.sourceRegionCode = V4.substring(111, 113);
			this.destinationRegionCode = V4.substring(113, 115);
			this.deeLevelDescriptor = V4.substring(115, 131);
			this.crDbNetIndicator = V4.substring(131, 132);
			this.summaryLevel = V4.substring(132, 134);
			this.merchantVolumeIndicator = V4.substring(134, 136);
			this.reservedTwo = V4.substring(136, 167);
			this.reimbursementAttribute = V4.substring(167, 168);

		}
			break;
		case "1": {
			Log.info("i =m in case 1 =>{}" + V4);
			this.transactionCode = V4.substring(0, 2);
			this.transactionCodeQualifier = V4.substring(2, 3);
			this.transactionComponentSequenceNumb = V4.substring(3, 4);
			this.currencyTableDate = V4.substring(4, 11);
			this.firstCount = V4.substring(11, 26);
			this.secoundCount = V4.substring(26, 41);
			this.firstAmount = V4.substring(41, 56);
			this.firstAmountSign = V4.substring(56, 58);
			this.secondAmount = V4.substring(58, 73);
			this.secondAmountSign = V4.substring(73, 75);
			this.thirdAmount = V4.substring(75, 90);
			this.thirdAmountSign = V4.substring(90, 92);
			this.fourthAmount = V4.substring(92, 107);
			this.fourthAmountSign = V4.substring(107, 109);
			this.fifthAmount = V4.substring(109, 124);
			this.fifthAmountSign = V4.substring(124, 126);
			this.sixthAmount = V4.substring(126, 141);
			this.sixthAmountSign = V4.substring(141, 143);
			this.reservedThree = V4.substring(143, 168);

		}
			break;
		default:
			Log.info("nothing");
			break;

		}

	}

	public TotalVisa(String firstCount, String firstAmount, String secondAmount, String thirdAmount) {
		super();
		this.firstCount = firstCount;
		this.firstAmount = firstAmount;
		this.secondAmount = secondAmount;
		this.thirdAmount = thirdAmount;
	}

	@Override
	public String toString() {
		return "TotalVisa [code=" + code + ", transactionCode=" + transactionCode + ", transactionCodeQualifier="
				+ transactionCodeQualifier + ", transactionComponentSequenceNumb=" + transactionComponentSequenceNumb
				+ ", destinationBin=" + destinationBin + ", sourceBin=" + sourceBin + ", reportingForSreIdentifier="
				+ reportingForSreIdentifier + ", rollupToSreIdentifier=" + rollupToSreIdentifier
				+ ", fundsTransferSreIdentifier=" + fundsTransferSreIdentifier + ", settlementServiceIdentifier="
				+ settlementServiceIdentifier + ", settlementCurrencyCode=" + settlementCurrencyCode
				+ ", clearingCurrencyCode=" + clearingCurrencyCode + ", businessMode=" + businessMode
				+ ", noDataIndicator=" + noDataIndicator + ", reservedOne=" + reservedOne + ", reportGroup="
				+ reportGroup + ", reportSubgroup=" + reportSubgroup + ", reportIdentificationNumber="
				+ reportIdentificationNumber + ", reportIdentitifactionSuffix=" + reportIdentitifactionSuffix
				+ ", settlementDate=" + settlementDate + ", reportDate=" + reportDate + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", chargeTypeCode=" + chargeTypeCode + ", businessTransactionType="
				+ businessTransactionType + ", businessTransactionCycle=" + businessTransactionCycle
				+ ", reversalIndicator=" + reversalIndicator + ", returnIndicator=" + returnIndicator
				+ ", juristictionCode=" + juristictionCode + ", interregionalRoutingIndicator="
				+ interregionalRoutingIndicator + ", sourceCountryCode=" + sourceCountryCode
				+ ", destinationCountryCode=" + destinationCountryCode + ", sourceRegionCode=" + sourceRegionCode
				+ ", destinationRegionCode=" + destinationRegionCode + ", deeLevelDescriptor=" + deeLevelDescriptor
				+ ", crDbNetIndicator=" + crDbNetIndicator + ", summaryLevel=" + summaryLevel
				+ ", merchantVolumeIndicator=" + merchantVolumeIndicator + ", reservedTwo=" + reservedTwo
				+ ", reimbursementAttribute=" + reimbursementAttribute + ", summaryCode=" + summaryCode
				+ ", currencyTableDate=" + currencyTableDate + ", firstCount=" + firstCount + ", secoundCount="
				+ secoundCount + ", firstAmount=" + firstAmount + ", firstAmountSign=" + firstAmountSign
				+ ", secondAmount=" + secondAmount + ", secondAmountSign=" + secondAmountSign + ", thirdAmount="
				+ thirdAmount + ", thirdAmountSign=" + thirdAmountSign + ", fourthAmount=" + fourthAmount
				+ ", fourthAmountSign=" + fourthAmountSign + ", fifthAmount=" + fifthAmount + ", fifthAmountSign="
				+ fifthAmountSign + ", sixthAmount=" + sixthAmount + ", sixthAmountSign=" + sixthAmountSign
				+ ", reservedThree=" + reservedThree + "]";
	}
}

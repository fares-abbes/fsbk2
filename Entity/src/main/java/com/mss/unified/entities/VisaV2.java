package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "visaV2", schema = "FRANSABANK")
public class VisaV2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer code;

	private String transactionCode;
	private String transactionCodeQualifier;
	private String transCompSeqNumn;
	private String destinationBin;
	private String sourceBin;
	private String reportingSreIdent;
	private String rollupSreIdent;
	private String fundsTransferSreIden;
	private String settServiceIdent;
	private String settCurrencyCode;
	private String noDataIndicator;
	private String reserved;
	private String reportGroup;
	private String reportSubGroup;
	private String reportIdentNumb;
	private String reportIdentSuffix;
	private String settDate;
	private String reportDate;
	private String fromDate;
	private String toDate;
	private String amountType;
	private String businessMode;
	private String count;
	private String creditAmount;
	private String debitAmount;
	private String netAmount;
	private String netAmountSign;
	private String fundsTransferDate;
	private String reservedPos165;
	private String rembAttribute;
	private Integer summaryCode;

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

	public String getTransCompSeqNumn() {
		return transCompSeqNumn;
	}

	public void setTransCompSeqNumn(String transCompSeqNumn) {
		this.transCompSeqNumn = transCompSeqNumn;
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

	public String getReportingSreIdent() {
		return reportingSreIdent;
	}

	public void setReportingSreIdent(String reportingSreIdent) {
		this.reportingSreIdent = reportingSreIdent;
	}

	public String getRollupSreIdent() {
		return rollupSreIdent;
	}

	public void setRollupSreIdent(String rollupSreIdent) {
		this.rollupSreIdent = rollupSreIdent;
	}

	public String getFundsTransferSreIden() {
		return fundsTransferSreIden;
	}

	public void setFundsTransferSreIden(String fundsTransferSreIden) {
		this.fundsTransferSreIden = fundsTransferSreIden;
	}

	public String getSettServiceIdent() {
		return settServiceIdent;
	}

	public void setSettServiceIdent(String settServiceIdent) {
		this.settServiceIdent = settServiceIdent;
	}

	public String getSettCurrencyCode() {
		return settCurrencyCode;
	}

	public void setSettCurrencyCode(String settCurrencyCode) {
		this.settCurrencyCode = settCurrencyCode;
	}

	public String getNoDataIndicator() {
		return noDataIndicator;
	}

	public void setNoDataIndicator(String noDataIndicator) {
		this.noDataIndicator = noDataIndicator;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getReportGroup() {
		return reportGroup;
	}

	public void setReportGroup(String reportGroup) {
		this.reportGroup = reportGroup;
	}

	public String getReportSubGroup() {
		return reportSubGroup;
	}

	public void setReportSubGroup(String reportSubGroup) {
		this.reportSubGroup = reportSubGroup;
	}

	public String getReportIdentNumb() {
		return reportIdentNumb;
	}

	public void setReportIdentNumb(String reportIdentNumb) {
		this.reportIdentNumb = reportIdentNumb;
	}

	public String getReportIdentSuffix() {
		return reportIdentSuffix;
	}

	public void setReportIdentSuffix(String reportIdentSuffix) {
		this.reportIdentSuffix = reportIdentSuffix;
	}

	public String getSettDate() {
		return settDate;
	}

	public void setSettDate(String settDate) {
		this.settDate = settDate;
	}

	public String getReportDate() {
		return reportDate;
	}

	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
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

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}

	public String getBusinessMode() {
		return businessMode;
	}

	public void setBusinessMode(String businessMode) {
		this.businessMode = businessMode;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(String netAmount) {
		this.netAmount = netAmount;
	}

	public String getNetAmountSign() {
		return netAmountSign;
	}

	public void setNetAmountSign(String netAmountSign) {
		this.netAmountSign = netAmountSign;
	}

	public String getFundsTransferDate() {
		return fundsTransferDate;
	}

	public void setFundsTransferDate(String fundsTransferDate) {
		this.fundsTransferDate = fundsTransferDate;
	}

	public String getReservedPos165() {
		return reservedPos165;
	}

	public void setReservedPos165(String reservedPos165) {
		this.reservedPos165 = reservedPos165;
	}

	public String getRembAttribute() {
		return rembAttribute;
	}

	public void setRembAttribute(String rembAttribute) {
		this.rembAttribute = rembAttribute;
	}

	public void visaSetter(String visa, Integer summary) {
		this.summaryCode = summary;

		this.transactionCode = mySubString(visa, 0, 2);
		this.transCompSeqNumn = mySubString(visa, 3, 1);
		this.destinationBin = mySubString(visa, 4, 6);
		this.sourceBin = mySubString(visa, 10, 6);
		this.reportingSreIdent = mySubString(visa, 16, 10);
		this.rollupSreIdent = mySubString(visa, 26, 10);
		this.fundsTransferDate = mySubString(visa, 36, 10);
		this.settServiceIdent = mySubString(visa, 46, 3);
		this.settCurrencyCode = mySubString(visa, 49, 3);
		this.noDataIndicator = mySubString(visa, 52, 1);
		this.reserved = mySubString(visa, 53, 5);
		this.reportGroup = mySubString(visa, 58, 1);
		this.reportSubGroup = mySubString(visa, 59, 1);
		this.reportIdentNumb = mySubString(visa, 60, 3);
		this.reportIdentSuffix = mySubString(visa, 63, 2);
		this.settDate = mySubString(visa, 65, 7);
		this.reportDate = mySubString(visa, 72, 7);
		this.fromDate = mySubString(visa, 79, 7);
		this.toDate = mySubString(visa, 86, 7);
		this.amountType = mySubString(visa, 93, 1);
		this.businessMode = mySubString(visa, 94, 1);
		this.count = mySubString(visa, 95, 15);
		this.creditAmount = mySubString(visa, 110, 15);
		this.debitAmount = mySubString(visa, 125, 15);
		this.netAmount = mySubString(visa, 140, 15);
		this.netAmountSign = mySubString(visa, 155, 2);
		this.fundsTransferDate = mySubString(visa, 157, 7);
		this.reserved = mySubString(visa, 164, 3);
		this.rembAttribute = mySubString(visa, 167, 1);

	}

	String mySubString(String myString, int start, int length) {
		return myString.substring(start, Math.min(start + length, myString.length()));
	}

}

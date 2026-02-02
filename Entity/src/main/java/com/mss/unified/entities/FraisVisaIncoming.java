package com.mss.unified.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FraisVisaIncoming", schema = "FRANSABANK")
public class FraisVisaIncoming {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	@Column(name = "INCOMING_CODE", nullable = false)
	private Integer incomingCode;
	private String transactionCode;
	private String transactionCodeQualifier;
	private String sequenceNumber;
	private String destinationBIN;
	private String sourceBIN;
	private String reasonCode;
	private String originatorCountryCode;
	private String eventDate;
	private String accountNumber;
	private String accountNumberExtension;
	private Double destinationAmount;
	private String destinationCurrencyCode;
	private Double sourceAmount;
	private String sourceCurrencyCode;
	private String messageText;
	private String settlementFlag;
	private String transactionIdentifier;
	private String reserved;
	private String centralProcessingDate;
	private String reimbursementAttribute;
	private Integer summaryCode;
	private String orginatorName;
	private String originatorCity;
	private String originatorzipcode;
	private String originatorSPCode;
	private String merchantTelephoneNumber;
	private String merchantverificationValue;
	private String originatorCountryCodeR2;
	private String settlementFlagR2;
	private double destinationAmountR2;
	private String centralProcessingDateR2;
	private String countryCode;
	private String reserved1;
	private String reserved2;
	private String settlementType;
	private double nationalremboursementFee;
	private String instalPaymentCount;
	private String reservd;
	private String reservd3;
	private String biusnessFormatCode;
	private String promotionType;
	private String promotionCode;
	private String networkIdentificationCode;
	private String reseved4;

	public Integer getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public FraisVisaIncoming() {
	}

	public FraisVisaIncoming(String visa, Integer summarayCode) {
		super();
		if (visa.substring(0, 2).equals("10")) {

			this.transactionCode = visa.substring(0, 2);
			this.transactionCodeQualifier = visa.substring(2, 3);
			this.sequenceNumber = visa.substring(3, 4);
			this.destinationBIN = visa.substring(4, 10);
			this.sourceBIN = visa.substring(10, 16);
			this.reasonCode = visa.substring(16, 20);
			this.originatorCountryCode = visa.substring(20, 23);
			this.eventDate = visa.substring(23, 27);
			this.accountNumber = visa.substring(27, 43);
			this.accountNumberExtension = visa.substring(43, 46);
			this.destinationAmount = convertAmount(visa.substring(46, 58));
			this.destinationCurrencyCode = visa.substring(58, 61);
			this.sourceAmount = convertAmount(visa.substring(61, 73));
			this.sourceCurrencyCode = visa.substring(73, 76);
			this.messageText = visa.substring(76, 146);
			this.settlementFlag = visa.substring(146, 147);
			this.transactionIdentifier = visa.substring(147, 162);
			this.reserved = visa.substring(162, 163);
			this.centralProcessingDate = visa.substring(163, 167);
			this.reimbursementAttribute = visa.substring(167, 168);
			this.summaryCode = summarayCode;
		}
	}

	public FraisVisaIncoming(List<String> visarows, Integer summarayCode) {
		super();
		for (String visa : visarows) {
			if (visa.substring(0, 2).equals("20") && visa.substring(2, 4).equals("00")) {
				this.transactionCode = visa.substring(0, 2);
				this.transactionCodeQualifier = visa.substring(2, 3);
				this.sequenceNumber = visa.substring(3, 4);
				this.destinationBIN = visa.substring(4, 10);
				this.sourceBIN = visa.substring(10, 16);
				this.reasonCode = visa.substring(16, 20);
				this.originatorCountryCode = visa.substring(20, 23);
				this.eventDate = visa.substring(23, 27);
				this.accountNumber = visa.substring(27, 43);
				this.accountNumberExtension = visa.substring(43, 46);
				this.destinationAmount = convertAmount(visa.substring(46, 58));
				this.destinationCurrencyCode = visa.substring(58, 61);
				this.sourceAmount = convertAmount(visa.substring(61, 73));
				this.sourceCurrencyCode = visa.substring(73, 76);
				this.messageText = visa.substring(76, 146);
				this.settlementFlag = visa.substring(146, 147);
				this.transactionIdentifier = visa.substring(147, 162);
				this.reserved = visa.substring(162, 163);
				this.centralProcessingDate = visa.substring(163, 167);
				this.reimbursementAttribute = visa.substring(167, 168);
				this.summaryCode = summarayCode;
			} else if (visa.substring(0, 2).equals("20") && visa.substring(2, 4).equals("02")) {
				this.reserved1 = visa.substring(6, 16);
				this.countryCode = visa.substring(16, 19);
				this.reserved2 = visa.substring(19, 22);
				this.settlementType = visa.substring(22, 25);
				this.nationalremboursementFee = convertAmount(visa.substring(25, 35).trim());
				// YDDD
				this.centralProcessingDateR2 = visa.substring(35, 39);
				this.instalPaymentCount = visa.substring(39, 41);
				this.reservd3 = visa.substring(41);
			} else if (visa.substring(0, 2).equals("20") && visa.substring(2, 4).equals("04")) {
				this.biusnessFormatCode = visa.substring(4, 6);
				this.promotionType = visa.substring(6, 8);
				this.promotionCode = visa.substring(8, 33);
				this.networkIdentificationCode = visa.substring(33, 37);
				this.reseved4 = visa.substring(37);
			}
		}

	}

	private double convertAmount(String amount) { // , String currency
		double number = Double.parseDouble(amount);
		number = number / Math.pow(10, 2);
		return number;
	}

	public String convertCurrency(String s) {
		if (s.contains("{") || s.contains("P")) {
			s = s.replace("{", "00").replace("P", "0");
		} else if (s.contains("A") || s.contains("Q")) {
			s = s.replace("A", "1").replace("Q", "1");

		} else if (s.contains("B") || s.contains("R")) {
			s = s.replace("B", "2").replace("R", "2");
		} else if (s.contains("C") || s.contains("S")) {
			s = s.replace("C", "3").replace("S", "3");
		} else if (s.contains("D") || s.contains("T")) {
			s = s.replace("D", "4").replace("T", "4");
		} else if (s.contains("E") || s.contains("U")) {
			s = s.replace("E", "5").replace("E", "5");

		} else if (s.contains("F") || s.contains("V")) {
			s = s.replace("F", "6").replace("F", "6");
		} else if (s.contains("G") || s.contains("W")) {
			s = s.replace("G", "7").replace("W", "7");
		} else if (s.contains("H") || s.contains("X")) {
			s = s.replace("H", "8").replace("X", "8");
		} else if (s.contains("I") || s.contains("Y")) {
			s = s.replace("I", "9").replace("Y", "9");
		}
		return s;
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

	public String getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(String sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
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

	public String getReasonCode() {
		return reasonCode;
	}

	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}

	public String getOriginatorCountryCode() {
		return originatorCountryCode;
	}

	public void setOriginatorCountryCode(String originatorCountryCode) {
		this.originatorCountryCode = originatorCountryCode;
	}

	public String getEventDate() {
		return eventDate;
	}

	public void setEventDate(String eventDate) {
		this.eventDate = eventDate;
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

	public Double getSourceAmount() {
		return sourceAmount;
	}

	public void setSourceAmount(Double sourceAmount) {
		this.sourceAmount = sourceAmount;
	}

	public void setDestinationAmount(Double destinationAmount) {
		this.destinationAmount = destinationAmount;
	}

	public String getSourceCurrencyCode() {
		return sourceCurrencyCode;
	}

	public void setSourceCurrencyCode(String sourceCurrencyCode) {
		this.sourceCurrencyCode = sourceCurrencyCode;
	}

	public String getSettlementFlag() {
		return settlementFlag;
	}

	public void setSettlementFlag(String settlementFlag) {
		this.settlementFlag = settlementFlag;
	}

	public String getTransactionIdentifier() {
		return transactionIdentifier;
	}

	public void setTransactionIdentifier(String transactionIdentifier) {
		this.transactionIdentifier = transactionIdentifier;
	}

	public String getReserved() {
		return reserved;
	}

	public void setReserved(String reserved) {
		this.reserved = reserved;
	}

	public String getCentralProcessingDate() {
		return centralProcessingDate;
	}

	public void setCentralProcessingDate(String centralProcessingDate) {
		this.centralProcessingDate = centralProcessingDate;
	}

	public String getReimbursementAttribute() {
		return reimbursementAttribute;
	}

	public void setReimbursementAttribute(String reimbursementAttribute) {
		this.reimbursementAttribute = reimbursementAttribute;
	}

	public Integer getIncomingCode() {
		return incomingCode;
	}

	public void setIncomingCode(Integer incomingCode) {
		this.incomingCode = incomingCode;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public String getOrginatorName() {
		return orginatorName;
	}

	public void setOrginatorName(String orginatorName) {
		this.orginatorName = orginatorName;
	}

	public String getOriginatorCity() {
		return originatorCity;
	}

	public void setOriginatorCity(String originatorCity) {
		this.originatorCity = originatorCity;
	}

	public String getOriginatorzipcode() {
		return originatorzipcode;
	}

	public void setOriginatorzipcode(String originatorzipcode) {
		this.originatorzipcode = originatorzipcode;
	}

	public String getOriginatorSPCode() {
		return originatorSPCode;
	}

	public void setOriginatorSPCode(String originatorSPCode) {
		this.originatorSPCode = originatorSPCode;
	}

	public String getMerchantTelephoneNumber() {
		return merchantTelephoneNumber;
	}

	public void setMerchantTelephoneNumber(String merchantTelephoneNumber) {
		this.merchantTelephoneNumber = merchantTelephoneNumber;
	}

	public String getMerchantverificationValue() {
		return merchantverificationValue;
	}

	public void setMerchantverificationValue(String merchantverificationValue) {
		this.merchantverificationValue = merchantverificationValue;
	}

	public String getOriginatorCountryCodeR2() {
		return originatorCountryCodeR2;
	}

	public void setOriginatorCountryCodeR2(String originatorCountryCodeR2) {
		this.originatorCountryCodeR2 = originatorCountryCodeR2;
	}

	public String getSettlementFlagR2() {
		return settlementFlagR2;
	}

	public void setSettlementFlagR2(String settlementFlagR2) {
		this.settlementFlagR2 = settlementFlagR2;
	}

	public double getDestinationAmountR2() {
		return destinationAmountR2;
	}

	public void setDestinationAmountR2(double destinationAmountR2) {
		this.destinationAmountR2 = destinationAmountR2;
	}

	public String getCentralProcessingDateR2() {
		return centralProcessingDateR2;
	}

	public void setCentralProcessingDateR2(String centralProcessingDateR2) {
		this.centralProcessingDateR2 = centralProcessingDateR2;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getReserved1() {
		return reserved1;
	}

	public void setReserved1(String reserved1) {
		this.reserved1 = reserved1;
	}

	public String getReserved2() {
		return reserved2;
	}

	public void setReserved2(String reserved2) {
		this.reserved2 = reserved2;
	}

	public String getSettlementType() {
		return settlementType;
	}

	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType;
	}

	public double getNationalremboursementFee() {
		return nationalremboursementFee;
	}

	public void setNationalremboursementFee(double nationalremboursementFee) {
		this.nationalremboursementFee = nationalremboursementFee;
	}

	public String getInstalPaymentCount() {
		return instalPaymentCount;
	}

	public void setInstalPaymentCount(String instalPaymentCount) {
		this.instalPaymentCount = instalPaymentCount;
	}

	public String getReservd() {
		return reservd;
	}

	public void setReservd(String reservd) {
		this.reservd = reservd;
	}

	public String getReservd3() {
		return reservd3;
	}

	public void setReservd3(String reservd3) {
		this.reservd3 = reservd3;
	}

	public String getBiusnessFormatCode() {
		return biusnessFormatCode;
	}

	public void setBiusnessFormatCode(String biusnessFormatCode) {
		this.biusnessFormatCode = biusnessFormatCode;
	}

	public String getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getNetworkIdentificationCode() {
		return networkIdentificationCode;
	}

	public void setNetworkIdentificationCode(String networkIdentificationCode) {
		this.networkIdentificationCode = networkIdentificationCode;
	}

	public String getReseved4() {
		return reseved4;
	}

	public void setReseved4(String reseved4) {
		this.reseved4 = reseved4;
	}

}

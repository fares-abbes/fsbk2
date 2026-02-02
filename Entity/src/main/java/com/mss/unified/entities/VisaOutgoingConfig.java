package com.mss.unified.entities;

import javax.persistence.Id;

public class VisaOutgoingConfig {
    @Id
    private int configNum;
    private String cardNumber;
    private String retrRefNumber;
    private double surcAmount;
    private double transAmo2;
    private double settAmount;
    private String settCurrencyCode;
    private String transactionDate;
    private String tranCurrencyCode;
    private String interchangeFee;
    private String interchangeCurrency;
    private String settlementDate;
    private String responseCode;
    private String transactionTime;
    private String atm_code;
    private Integer outComingCode;
    private Integer cp_code;
    private Integer statusChargeback;
    private Integer summaryCode;
    private String authorizationIdResponseCode;
    private String UnMaskedCard;
    public Integer getStatusChargeback() {
        return statusChargeback;
    }
    public String requestMessageType;

    public void setStatusChargeback(Integer statusChargeback) {
        this.statusChargeback = statusChargeback;
    }
//    public VisaOutgoingConfig(String cardNumber, String retrievalRefNumber, String surcAmount, String transAmo2, String settAmount, String settCurrencyCode, String transactionDate, String tranCurrencyCode, String interchangeFee, String interchangeCurrency, String settlementDate, String responseCode, String transactionTime, Integer outComingCode) {
//        this.cardNumber = cardNumber;
//        this.retrievalRefNumber = retrievalRefNumber;
//        this.surcAmount = surcAmount;
//        this.transAmo2 = transAmo2;
//        this.settAmount = settAmount;
//        this.settCurrencyCode = settCurrencyCode;
//        this.transactionDate = transactionDate;
//        this.tranCurrencyCode = tranCurrencyCode;
//        this.interchangeFee = interchangeFee;
//        this.interchangeCurrency = interchangeCurrency;
//        this.settlementDate = settlementDate;
//        this.responseCode = responseCode;
//        this.transactionTime = transactionTime;
//        this.outComingCode = outComingCode;
//    }


    public VisaOutgoingConfig() {
    }

    public VisaOutgoingConfig(String cardNumber, String retrRefNumber, double surcAmount, double transAmo2, double settAmount, String settCurrencyCode, String transactionDate, String tranCurrencyCode, String interchangeFee, String interchangeCurrency, String settlementDate, String responseCode, String transactionTime, String atm_code, Integer outComingCode) {
        this.cardNumber = cardNumber;
        this.retrRefNumber = retrRefNumber;
        this.surcAmount = surcAmount;
        this.transAmo2 = transAmo2;
        this.settAmount = settAmount;
        this.settCurrencyCode = settCurrencyCode;
        this.transactionDate = transactionDate;
        this.tranCurrencyCode = tranCurrencyCode;
        this.interchangeFee = interchangeFee;
        this.interchangeCurrency = interchangeCurrency;
        this.settlementDate = settlementDate;
        this.responseCode = responseCode;
        this.transactionTime = transactionTime;
        this.atm_code = atm_code;
        this.outComingCode = outComingCode;
  
    }
    public VisaOutgoingConfig(String cardNumber, String retrRefNumber, double surcAmount, double transAmo2, double settAmount, String settCurrencyCode, String transactionDate, String tranCurrencyCode, String interchangeFee, String interchangeCurrency, String settlementDate, String responseCode, String transactionTime, String atm_code, Integer outComingCode,Integer cp_code) {
        this.cardNumber = cardNumber;
        this.retrRefNumber = retrRefNumber;
        this.surcAmount = surcAmount;
        this.transAmo2 = transAmo2;
        this.settAmount = settAmount;
        this.settCurrencyCode = settCurrencyCode;
        this.transactionDate = transactionDate;
        this.tranCurrencyCode = tranCurrencyCode;
        this.interchangeFee = interchangeFee;
        this.interchangeCurrency = interchangeCurrency;
        this.settlementDate = settlementDate;
        this.responseCode = responseCode;
        this.transactionTime = transactionTime;
        this.atm_code = atm_code;
        this.outComingCode = outComingCode;
        this.cp_code=cp_code;

    }
    public VisaOutgoingConfig(
            String cardNumber, String retrRefNumber, double surcAmount,
            double transAmo2, double settAmount, String settCurrencyCode,
            String transactionDate, String tranCurrencyCode, String interchangeFee,
            String interchangeCurrency, String settlementDate, String responseCode,
            String transactionTime, String atm_code, Integer outComingCode,Integer cp_code,
            Integer summaryCode,String authorizationIdResponseCode,String requestMessageType) {

        this.cardNumber = cardNumber;
        this.retrRefNumber = retrRefNumber;
        this.surcAmount = surcAmount;
        this.transAmo2 = transAmo2;
        this.settAmount = settAmount;
        this.settCurrencyCode = settCurrencyCode;
        this.transactionDate = transactionDate;
        this.tranCurrencyCode = tranCurrencyCode;
        this.interchangeFee = interchangeFee;
        this.interchangeCurrency = interchangeCurrency;
        this.settlementDate = settlementDate;
        this.responseCode = responseCode;
        this.transactionTime = transactionTime;
        this.atm_code = atm_code;
        this.outComingCode = outComingCode;
        this.cp_code=cp_code;
        this.summaryCode = summaryCode;
        this.authorizationIdResponseCode=authorizationIdResponseCode;
        this.requestMessageType=requestMessageType;
    }

    public Integer getOutComingCode() {
        return outComingCode;
    }

    public void setOutComingCode(Integer outComingCode) {
        this.outComingCode = outComingCode;
    }

    public String getAtm_code() {
        return atm_code;
    }

    public void setAtm_code(String atm_code) {
        this.atm_code = atm_code;
    }

    public int getConfigNum() {
        return configNum;
    }

    public void setConfigNum(int configNum) {
        this.configNum = configNum;
    }

    public String getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(String transactionTime) {
        this.transactionTime = transactionTime;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getSettlementDate() {
        return settlementDate;
    }

    public void setSettlementDate(String settlementDate) {
        this.settlementDate = settlementDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getRetrRefNumber() {
        return retrRefNumber;
    }

    public void setRetrRefNumber(String retrRefNumber) {
        this.retrRefNumber = retrRefNumber;
    }

    public double getSurcAmount() {
        return surcAmount;
    }

    public void setSurcAmount(double surcAmount) {
        this.surcAmount = surcAmount;
    }

    public double getTransAmo2() {
        return transAmo2;
    }

    public void setTransAmo2(double transAmo2) {
        this.transAmo2 = transAmo2;
    }

    public double getSettAmount() {
        return settAmount;
    }

    public void setSettAmount(double settAmount) {
        this.settAmount = settAmount;
    }

    public String getSettCurrencyCode() {
        return settCurrencyCode;
    }

    public void setSettCurrencyCode(String settCurrencyCode) {
        this.settCurrencyCode = settCurrencyCode;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTranCurrencyCode() {
        return tranCurrencyCode;
    }

    public void setTranCurrencyCode(String tranCurrencyCode) {
        this.tranCurrencyCode = tranCurrencyCode;
    }

    public String getInterchangeFee() {
        return interchangeFee;
    }

    public void setInterchangeFee(String interchangeFee) {
        this.interchangeFee = interchangeFee;
    }

    public String getInterchangeCurrency() {
        return interchangeCurrency;
    }

    public void setInterchangeCurrency(String interchangeCurrency) {
        this.interchangeCurrency = interchangeCurrency;
    }

	public Integer getCp_code() {
		return cp_code;
	}

	public void setCp_code(Integer cp_code) {
		this.cp_code = cp_code;
	}

    public Integer getSummaryCode() {
        return summaryCode;
    }

    public void setSummaryCode(Integer summaryCode) {
        this.summaryCode = summaryCode;
    }

    public String getAuthorizationIdResponseCode() {
        return authorizationIdResponseCode;
    }

    public void setAuthorizationIdResponseCode(String authorizationIdResponseCode) {
        this.authorizationIdResponseCode = authorizationIdResponseCode;
    }

    public String getUnMaskedCard() {
        return UnMaskedCard;
    }

    public void setUnMaskedCard(String unMaskedCard) {
        UnMaskedCard = unMaskedCard;
    }

    public String getRequestMessageType() {
        return requestMessageType;
    }

    public void setRequestMessageType(String requestMessageType) {
        this.requestMessageType = requestMessageType;
    }
}

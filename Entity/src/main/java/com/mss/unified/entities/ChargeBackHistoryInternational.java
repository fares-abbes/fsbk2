package com.mss.unified.entities;


import com.mss.unified.enumeration.ChargeBackType;
import com.mss.unified.enumeration.TypeChargeback;
import com.mss.unified.enumeration.TypeDossier;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Chargeback_History_inter", schema = "FRANSABANK")
public class ChargeBackHistoryInternational {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "Summary_Code_visa")
    private int summaryCodeVisa;
    @Column(name = "Summary_Code_mcd")
    private int summaryCodeMCD;
    @Column(name = "Summary_Code_erec")
    private Integer summaryCodeErec;

    private String pan;
    @Column(name = "OPERATION")
    private int operation;
    @Column(name = "Amount_transaction")
    private double amountTransaction;
    @Column(name = "Transaction_Currency")
    private String transactionCurrency;
    @Column(name = "Settlement_Amount")
    private double settlementAmount;
    @Column(name = "Settlement_Currency")
    private String settlementCurrency;
    private Double interchange;
    @Column(name = "Source_Amount")
    private double sourceAmount;
    @Column(name = "Source_Currency")
    private double sourceCurrency;
    @Column(name = "RRN")
    private String rrn;
    @Column(name = "ARN")
    private String arn;
    @Column(name = "treatment_date")
    private Date treatmentDate;
    @Column(name = "Transaction_Date")
    private String transactionDate;
    @Column(name = "Auth_Code")
    private String authCode;
    @Column(name = "Merchant_ID")
    private String merchantId;
    @Column(name = "Merchant_Name")
    private String merchantName;
    @Column(name = "Reason_Code")
    private String reasonCode;
    private Integer statusChargeback;

    private String messageReject;

    @Enumerated(EnumType.STRING)
    private ChargeBackType chargeBackType;
    @Column(length = 4000)
    private String additionalMessage;
    @Enumerated(EnumType.STRING)
    private TypeDossier typeDossier;
    @Enumerated(EnumType.STRING)
    private TypeChargeback typeChargeBack;

    public ChargeBackHistoryInternational(IpmClearingDetails ipmClearingDetails){
        this.pan = ipmClearingDetails.getDe02();
        this.operation = Integer.parseInt(ipmClearingDetails.getDe03());
        this.amountTransaction = ipmClearingDetails.getDe04();
        this.transactionCurrency = ipmClearingDetails.getDe49();
        this.settlementAmount = ipmClearingDetails.getDe05();
        this.settlementCurrency = ipmClearingDetails.getDe50();
        if (ipmClearingDetails.getP0146_AMOUNTS_TRANSACTION_FEE()!=null)
        {
            this.interchange= convertAmt(ipmClearingDetails.getP0146_AMOUNTS_TRANSACTION_FEE().substring(24),
                    ipmClearingDetails.getP0146_AMOUNTS_TRANSACTION_FEE().substring(21, 24));
        }
        else {
            this.interchange=0.0;
        }

        this.rrn = ipmClearingDetails.getDe37();
        //this.arn = ipmClearingDetails.getAr
        this.setTreatmentDate(new Date());
        this.transactionDate = ipmClearingDetails.getDe12();
        this.authCode = ipmClearingDetails.getDe38();
        this.merchantId = ipmClearingDetails.getDe42();
        this.merchantName = ipmClearingDetails.getDe43();
        this.reasonCode = ipmClearingDetails.getDe25();
        this.statusChargeback = ipmClearingDetails.getStatusChargeback();
        this.messageReject = ipmClearingDetails.getMessageReject();
        this.summaryCodeMCD = ipmClearingDetails.getSummaryCode();
    }
    public ChargeBackHistoryInternational(VisaIncoming visaIncoming){
        this.pan = visaIncoming.getAccountNumber();
        this.operation = Integer.parseInt(visaIncoming.getTransactionCode());
        this.amountTransaction = visaIncoming.getSourceAmount();
        this.transactionCurrency = visaIncoming.getSourceCurrencyCode();
        this.settlementAmount = visaIncoming.getBaseAmount();
        this.settlementCurrency = visaIncoming.getBaseCurrency();
        if("C".equals(visaIncoming.getInterchangeFeeSign())){
            this.interchange = visaIncoming.getInterchangeFeeAmount();
        }else{
            this.interchange = -visaIncoming.getInterchangeFeeAmount();
        }
        this.sourceAmount = visaIncoming.getSourceAmount();
        this.sourceCurrency = Double.parseDouble(visaIncoming.getSourceCurrencyCode());
        this.rrn = visaIncoming.getAcquirerReferenceNumber();
        //this.arn = visaIncoming.getAr
        this.setTreatmentDate(new Date());
        this.transactionDate = visaIncoming.getPurchaseDate();
        this.authCode = visaIncoming.getAuthorisationCode();
        this.merchantId = visaIncoming.getTerminalId();
        this.merchantName = visaIncoming.getMerchantName();
        this.reasonCode = visaIncoming.getReasonCode();
        this.statusChargeback = Integer.valueOf(visaIncoming.getStatusChargeback());
        this.summaryCodeVisa = visaIncoming.getSummaryCode();
    }
    public ChargeBackHistoryInternational(ChargebackVisa chargebackVisa){
        this.pan = chargebackVisa.getAccountNumber();
        this.operation = Integer.parseInt(chargebackVisa.getTransactionCode());
        this.amountTransaction = chargebackVisa.getSourceAmount();
        this.transactionCurrency = chargebackVisa.getSourceCurrencyCode();
        this.settlementAmount = chargebackVisa.getBaseAmount();
        this.settlementCurrency = chargebackVisa.getBaseCurrency();
        if("C".equals(chargebackVisa.getInterchangeFeeSign())){
            this.interchange = chargebackVisa.getInterchangeFeeAmount();
        }else{
            this.interchange = -chargebackVisa.getInterchangeFeeAmount();
        }
        this.sourceAmount = chargebackVisa.getSourceAmount();
        this.sourceCurrency = Double.parseDouble(chargebackVisa.getSourceCurrencyCode());
        this.rrn = chargebackVisa.getAcquirerReferenceNumber();
        //this.arn = chargebackVisa.getAr
        this.setTreatmentDate(new Date());
        this.transactionDate = chargebackVisa.getPurchaseDate();
        this.authCode = chargebackVisa.getAuthorisationCode();
        this.merchantId = chargebackVisa.getTerminalId();
        this.merchantName = chargebackVisa.getMerchantName();
        this.reasonCode = chargebackVisa.getReasonCode();
        this.statusChargeback = chargebackVisa.getStatusChargeback();
        this.messageReject = chargebackVisa.getMessageReject();
        this.summaryCodeVisa = chargebackVisa.getSummaryCode();
    }
    public ChargeBackHistoryInternational(ChargeBackVisaOutgoing chargeBackVisaOutgoing) {
        this.pan = chargeBackVisaOutgoing.getCardNumber();
        this.operation = 17;
        this.amountTransaction = chargeBackVisaOutgoing.getSurcAmount();
        this.transactionCurrency = chargeBackVisaOutgoing.getTranCurrencyCode();
        this.settlementAmount = chargeBackVisaOutgoing.getSettAmount();
        this.settlementCurrency = chargeBackVisaOutgoing.getSettCurrencyCode();
        this.sourceAmount = chargeBackVisaOutgoing.getSurcAmount();
        this.rrn = chargeBackVisaOutgoing.getRetrRefNumber();
        this.setTreatmentDate(new Date());
        this.transactionDate = chargeBackVisaOutgoing.getTransactionDateWithYear();
        this.authCode = chargeBackVisaOutgoing.getAuthResCode();
        this.merchantId = chargeBackVisaOutgoing.getCardAccepId();
        this.merchantName = chargeBackVisaOutgoing.getCardAcceptorName();
        this.summaryCodeVisa = chargeBackVisaOutgoing.getSummaryCode();
    }

    public ChargeBackHistoryInternational(ChargeBackVisaOutgoing chargebackVisa,Tc45 tc45,
                                          Integer statusChargeback){
        this.pan = chargebackVisa.getCardNumber();
        this.amountTransaction = chargebackVisa.getTransAmo2();
        this.transactionCurrency = chargebackVisa.getTranCurrencyCode();
        this.settlementAmount = chargebackVisa.getSettAmount();
        this.settlementCurrency = chargebackVisa.getSettCurrencyCode();
        if("DR".equals(tc45.getInterchangeCurrency())){
            this.interchange = -Double.parseDouble(tc45.getInterchangeFee().trim());
        }else{
            this.interchange = Double.parseDouble(tc45.getInterchangeFee().trim());
        }
        this.sourceAmount = chargebackVisa.getSurcAmount();
        this.rrn = chargebackVisa.getRetrRefNumber();
        this.setTreatmentDate(new Date());
        this.transactionDate = chargebackVisa.getTransactionDate();
        this.authCode = chargebackVisa.getAuthorizationIdResponseCode();
        this.merchantId = chargebackVisa.getCardAccepId();
        this.merchantName = chargebackVisa.getCardAcceptorName();
        this.reasonCode = tc45.getReasonCode();
        this.statusChargeback = statusChargeback;
        this.summaryCodeVisa = chargebackVisa.getSummaryCode();
        this.setChargeBackType(ChargeBackType.VISA);
    }

    public ChargeBackHistoryInternational(VisaDisputeStatusAdvice visaDisputeStatusAdvice) {
        this.pan = visaDisputeStatusAdvice.getAccountNumber();
        this.operation = Integer.parseInt(visaDisputeStatusAdvice.getTransactionCode());
        this.amountTransaction = visaDisputeStatusAdvice.getSourceAmount();
        this.transactionCurrency = visaDisputeStatusAdvice.getOriginalTransactionCurrencyCode();
        this.settlementAmount = visaDisputeStatusAdvice.getSettlementCalculate();
        this.settlementCurrency = visaDisputeStatusAdvice.getDestinationCurrencyCode();
        this.interchange = visaDisputeStatusAdvice.getInterchangeCalculat();
        this.sourceAmount = visaDisputeStatusAdvice.getSourceAmount();
        this.sourceCurrency = Double.parseDouble(visaDisputeStatusAdvice.getSourceCurrencyCode());
        this.arn = visaDisputeStatusAdvice.getAcquirerReferenceNumber();
        this.setTreatmentDate(new Date());
        this.transactionDate = visaDisputeStatusAdvice.getPurchaseDate();
        this.authCode = visaDisputeStatusAdvice.getAuthorizationCode();
        this.merchantId = visaDisputeStatusAdvice.getCardAcceptorId();
        this.merchantName = visaDisputeStatusAdvice.getMerchantName();
        this.summaryCodeVisa = visaDisputeStatusAdvice.getSummaryCode();
    }
    public ChargeBackHistoryInternational() {

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public int getSummaryCodeVisa() {
        return summaryCodeVisa;
    }

    public void setSummaryCodeVisa(int summaryCodeVisa) {
        this.summaryCodeVisa = summaryCodeVisa;
    }

    public int getSummaryCodeMCD() {
        return summaryCodeMCD;
    }

    public void setSummaryCodeMCD(int summaryCodeMCD) {
        this.summaryCodeMCD = summaryCodeMCD;
    }

    public int getOperation() {
        return operation;
    }

    public void setOperation(int operation) {
        this.operation = operation;
    }

    public double getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(double amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public double getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(double settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public Double getInterchange() {
        return interchange;
    }

    public void setInterchange(Double interchange) {
        this.interchange = interchange;
    }

    public double getSourceAmount() {
        return sourceAmount;
    }

    public void setSourceAmount(double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public double getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(double sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getRrn() {
        return rrn;
    }

    public void setRrn(String rrn) {
        this.rrn = rrn;
    }

    public String getArn() {
        return arn;
    }

    public void setArn(String arn) {
        this.arn = arn;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public String getAuthCode() {
        return authCode;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public Integer getStatusChargeback() {
        return statusChargeback;
    }

    public void setStatusChargeback(Integer statusChargeback) {
        this.statusChargeback = statusChargeback;
    }

    public String getMessageReject() {
        return messageReject;
    }

    public void setMessageReject(String messageReject) {
        this.messageReject = messageReject;
    }

    public ChargeBackType getChargeBackType() {
        return chargeBackType;
    }

    public void setChargeBackType(ChargeBackType chargeBackType) {
        this.chargeBackType = chargeBackType;
    }

    private double convertAmt(String amount, String currency) {
        double number = Double.parseDouble(amount);
        if (currency.equals("788")) {
            number = number / Math.pow(10, 3);
        } else {
            number = number / Math.pow(10, 2);
        }
        return number;
    }

    public String getAdditionalMessage() {
        return additionalMessage;
    }

    public void setAdditionalMessage(String additionalMessage) {
        this.additionalMessage = additionalMessage;
    }

    public TypeDossier getTypeDossier() {
        return typeDossier;
    }

    public void setTypeDossier(TypeDossier typeDossier) {
        this.typeDossier = typeDossier;
    }

    public TypeChargeback getTypeChargeBack() {
        return typeChargeBack;
    }

    public void setTypeChargeBack(TypeChargeback typeChargeBack) {
        this.typeChargeBack = typeChargeBack;
    }




}

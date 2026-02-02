package com.mss.unified.entities;


import com.mss.unified.enumeration.ChargeBackType;
import com.mss.unified.enumeration.TypeDossier;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "Chargeback_inter", schema = "FRANSABANK")
public class ChargebacksInternational {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    @Column(name = "Summary_Code")
    private int summaryCode ;

    private String pan;
    @Column(name = "OPERATION")
    private String operation;
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
    private Double sourceAmount=0.0;
    @Column(name = "Source_Currency")
    private Integer sourceCurrency=0;
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
    private String journeeComptable;
    private Double montantOrigin;
    private String currencyOrigin;
    private String dateConfirmation;
    private Double conversionRate=1.0;
    private Double conversionRateToTND=1.0;
    private String codePays;
    @Column(length = 4000)
    private String additionalMessage;
    @Enumerated(EnumType.STRING)
    private TypeDossier typeDossier;

    public int getSummaryCode() {
        return summaryCode;
    }

    public void setSummaryCode(int summaryCode) {
        this.summaryCode = summaryCode;
    }

    public String getCodePays() {
        return codePays;
    }

    public void setCodePays(String codePays) {
        this.codePays = codePays;
    }

    public Double getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Double getConversionRateToTND() {
        return conversionRateToTND;
    }

    public void setConversionRateToTND(Double conversionRateToTND) {
        this.conversionRateToTND = conversionRateToTND;
    }

    public void setSourceCurrency(int sourceCurrency) {
        this.sourceCurrency = sourceCurrency;
    }

    public String getDateConfirmation() {
        return dateConfirmation;
    }

    public void setDateConfirmation(String dateConfirmation) {
        this.dateConfirmation = dateConfirmation;
    }

    private String messageReject;

    @Enumerated(EnumType.STRING)
    private ChargeBackType chargeBackType;

     public ChargebacksInternational(VisaIncoming visaIncoming){
        this.pan = visaIncoming.getAccountNumber();
        this.operation = visaIncoming.getTransactionCode();
        this.amountTransaction = visaIncoming.getSourceAmount();
        this.transactionCurrency = visaIncoming.getSourceCurrencyCode();
        this.settlementAmount = visaIncoming.getBaseAmount();
        this.settlementCurrency = visaIncoming.getBaseCurrency();
        this.conversionRate= getSourceToBaseExchangeRateInverse(visaIncoming);
        this.conversionRateToTND= visaIncoming.getBaseCurrencyToDestinationCurrencyExchangeRate();
        if("C".equals(visaIncoming.getInterchangeFeeSign())){
            this.interchange = visaIncoming.getInterchangeFeeAmount();
        }else{
            this.interchange = -visaIncoming.getInterchangeFeeAmount();
        }
        this.sourceAmount = visaIncoming.getSourceAmount();
        this.sourceCurrency = Integer.parseInt(visaIncoming.getSourceCurrencyCode());
        this.rrn = visaIncoming.getAcquirerReferenceNumber();
        //this.arn = visaIncoming.getAr
        this.setTreatmentDate(new Date());
        this.transactionDate = visaIncoming.getPurchaseDate();
        this.authCode = visaIncoming.getAuthorisationCode();
        this.merchantId = visaIncoming.getTerminalId();
        this.merchantName = visaIncoming.getMerchantName();
        this.reasonCode = visaIncoming.getReasonCode();
        this.statusChargeback = Integer.valueOf(visaIncoming.getStatusChargeback());
        this.summaryCode  = visaIncoming.getSummaryCode();
    }
    public ChargebacksInternational(ChargebackVisa chargebackVisa){
        this.pan = chargebackVisa.getAccountNumber();
        this.operation = chargebackVisa.getTransactionCode();
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
        this.sourceCurrency = Integer.parseInt(chargebackVisa.getSourceCurrencyCode());
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
        this.summaryCode = chargebackVisa.getSummaryCode();
    }
    public ChargebacksInternational(ChargeBackVisaOutgoing chargebackVisa,Tc45 tc45,
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
        this.summaryCode = chargebackVisa.getSummaryCode();
        this.setChargeBackType(ChargeBackType.VISA);
    }

    public ChargebacksInternational(VisaDisputeStatusAdvice visaDisputeStatusAdvice) {
        this.pan = visaDisputeStatusAdvice.getAccountNumber();
        this.operation = visaDisputeStatusAdvice.getTransactionCode() ;
        this.amountTransaction = visaDisputeStatusAdvice.getSourceAmount();
        this.transactionCurrency = visaDisputeStatusAdvice.getOriginalTransactionCurrencyCode();
        this.settlementAmount = visaDisputeStatusAdvice.getSettlementCalculate();
        this.settlementCurrency = visaDisputeStatusAdvice.getDestinationCurrencyCode();
        this.interchange = visaDisputeStatusAdvice.getInterchangeCalculat();
        this.sourceAmount = visaDisputeStatusAdvice.getSourceAmount();
        this.sourceCurrency = Integer.parseInt(visaDisputeStatusAdvice.getSourceCurrencyCode());
        this.arn = visaDisputeStatusAdvice.getAcquirerReferenceNumber();
        this.setTreatmentDate(new Date());
        this.transactionDate = visaDisputeStatusAdvice.getPurchaseDate();
        this.authCode = visaDisputeStatusAdvice.getAuthorizationCode();
        this.merchantId = visaDisputeStatusAdvice.getCardAcceptorId();
        this.merchantName = visaDisputeStatusAdvice.getMerchantName();
        this.summaryCode = visaDisputeStatusAdvice.getSummaryCode();
    }
    public ChargebacksInternational() {

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



    public String getOperation() {
        return operation;
    }


    public void setOperation(String operation) {
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

    public Integer getSourceCurrency() {
        return sourceCurrency;
    }

    public void setSourceCurrency(Integer sourceCurrency) {
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

    public void setSourceAmount(Double sourceAmount) {
        this.sourceAmount = sourceAmount;
    }

    public String getJourneeComptable() {
        return journeeComptable;
    }

    public void setJourneeComptable(String journeeComptable) {
        this.journeeComptable = journeeComptable;
    }

    public Double getMontantOrigin() {
        return montantOrigin;
    }

    public void setMontantOrigin(Double montantOrigin) {
        this.montantOrigin = montantOrigin;
    }

    public String getCurrencyOrigin() {
        return currencyOrigin;
    }

    public void setCurrencyOrigin(String currencyOrigin) {
        this.currencyOrigin = currencyOrigin;
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
    private Double getDe09inverse(Double de09) {
        if (de09 == null || de09 == 0) {
            return 1.0;
        }
        return Math.round((1 / de09) * 1000000) / 1000000.0;
    }

    private Double getSourceToBaseExchangeRateInverse(VisaIncoming v) {
        if (v.getSourceCurrencyToBaseCurrencyExchangeRate() == 0) {
            return 1.0;
        }
        double exRate=v.getSourceCurrencyToBaseCurrencyExchangeRate();
        //exchange rate SourceCurrencyToBaseCurrencyExchangeRate fixxxx
        if(("788".equals(v.getSourceCurrencyCode()) && v.getSourceCurrencyToBaseCurrencyExchangeRate()==1) &&
                !Arrays.asList(0.0,1.0).contains(v.getBaseCurrencyToDestinationCurrencyExchangeRate())){
            exRate=v.getBaseCurrencyToDestinationCurrencyExchangeRate();
        }
        return Math.round((1 / exRate) * 1000000) / 1000000.0;
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
}

package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "TC45",schema = "FRANSABANK")
public class Tc45 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tc45Code;

    @Column(name = "BATCH_NUMBER")
    private String batchNumber;

    @Column(name = "TRANSMISSION_DATE")
    private String transmissionDate;

    @Column(name = "TRANSMISSION_TIME")
    private String transmissionTime;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;
    @Column(name = "Account_Number_Extension")
    private String accountNumberExtension;
    @Column(name = "RETRIEVAL_REF_NUMBER")
    private String retrievalRefNumber;

    @Column(name = "TRACE_NUMBER")
    private String traceNumber;

    @Column(name = "ISSUER_ID")
    private String issuerId;

    @Column(name = "TRAN_TYPE")
    private String tranType;

    @Column(name = "PROCESS_CODE")
    private String processCode;

    @Column(name = "REASON_CODE")
    private String reasonCode;

    @Column(name = "POS_CON")
    private String posCon;

    @Column(name = "RSP_CODE")
    private String rspCode;

    @Column(name = "TRANSACTION_AMOUNT")
    private String transactionAmount;

    @Column(name = "TRANSACTION_CURRENCY")
    private String transactionCurrency;

    @Column(name = "REJECT_CODE")
    private String rejectCode;



    @Column(name = "ENTRY_MODE")
    private String entryMode;
    @Column(name = "FPI")
    private String fpi;
    @Column(name = "DG_CD")
    private String dgCd;
    @Column(name = "ACI")
    private String aci;
    @Column(name = "SCHG")
    private String schg;
    @Column(name = "FEE_JURIS")
    private String feeJuris;
    @Column(name = "ROUTING")
    private String routing;
    private String settlementAmount;
    private String settlementCurrency;
    private String terminalId;
    private String merchantId;
    private String merchantName;
    private String merchantCountry;
    private String merchantZipcode;
    @Column(name = "CN_STP")
    private String cnStp;
    @Column(name = "CD_SQ")
    private String cdSq;
    @Column(name = "ATC")
    private String atc;
    @Column(name = "CI")
    private String ci;
    @Column(name = "TR_ID")
    private String trId;
    @Column(name = "VC")
    private String vc;

    private String zipCode;
    private String interchangeMessage;
    @Column(name = "INTERCHANGE_FEE")
    private String interchangeFee;

    @Column(name = "INTERCHANGE_CURRENCY")
    private String interchangeCurrency;

    private Integer summaryCode;

    public Tc45() {}

    public void tc45Setter(String visa, int summary) {
        if (visa.substring(0, 17).equals("45004126184000820")//45004550404000820
                && !visa.substring(17).startsWith("--------") && !visa.contains("RESPONSE COD")
                && visa.charAt(17)==' ') {
            setSummaryCode(summary);
            setBatchNumber(visa.substring(18, 20));
            setTransmissionDate(visa.substring(21, 26));
            setTransmissionTime(visa.substring(27, 35));
            setCardNumber(visa.substring(36, 52).trim());
            setAccountNumberExtension(visa.substring(52, 55).trim());
            setRetrievalRefNumber(visa.substring(56, 68));
            setTraceNumber(visa.substring(69, 75));
            setIssuerId(visa.substring(76, 82));
            setTranType(visa.substring(88, 92));
            setProcessCode(visa.substring(93, 99));
            setEntryMode(visa.substring(100, 103));
            setReasonCode(visa.substring(104, 107));
            setCnStp(visa.substring(109, 111));
            setRspCode(visa.substring(113, 115));
            setTransactionAmount(visa.substring(119, 129));
            setTransactionCurrency(visa.substring(130, 133));
            setSettlementAmount(visa.substring(138, 146));
            setSettlementCurrency(visa.substring(146, 148));

        }else if (visa.substring(0, 17).equals("45004126184000820")//45004550404000820
                && !visa.substring(17).startsWith("--------") && !visa.contains("RESPONSE COD")
                && visa.substring(88, 92).equals("0422")) {
            setSummaryCode(summary);
            setBatchNumber(visa.substring(18, 20));
            setTransmissionDate(visa.substring(21, 26));
            setTransmissionTime(visa.substring(27, 35));
            setCardNumber(visa.substring(36, 52).trim());
            setAccountNumberExtension(visa.substring(52, 55).trim());
            setRetrievalRefNumber(visa.substring(56, 68));
            setTraceNumber(visa.substring(69, 75));
            setIssuerId(visa.substring(76, 82));
            setTranType(visa.substring(88, 92));
            setProcessCode(visa.substring(93, 99));
            setEntryMode(visa.substring(100, 103));
            setReasonCode(visa.substring(104, 107));
            setCnStp(visa.substring(109, 111));
            setRspCode(visa.substring(113, 115));
            setTransactionAmount(visa.substring(119, 129));
            setTransactionCurrency(visa.substring(130, 133));
            setSettlementAmount(visa.substring(138, 146));
            setSettlementCurrency(visa.substring(146, 148));

        }

        if (visa.contains("CA ID")) {
            setTerminalId(visa.substring(43, 52));
            setMerchantId(visa.substring(53, 64));
            setMerchantName(visa.substring(79, 105));
            setMerchantCountry(visa.substring(105, 107));
            setMerchantZipcode(visa.substring(110, 114));
        }
        if (visa.contains("FPI")) {
            setFpi(visa.substring(136, 139));
        }
        if (visa.contains("CD SQ")) {
            setCdSq(visa.substring(36, 38));
        }
        if (visa.contains("ATC")) {
            setAtc(visa.substring(75, 80));
        }
        if (visa.contains("CI")) {
            setCi(visa.substring(105, 106));
        }
        if (visa.contains("TR ID")) {
            setTrId(visa.substring(43, 59));
        }
        if (visa.contains("ACI")) {
            setAci(visa.substring(68, 69));
        }
        if (visa.contains("VC")) {
            setVc(visa.substring(73, 78));
        }
        if (visa.contains("SCHG")) {
            setSchg(visa.substring(124, 130));
        }
        if (visa.contains("FEE JURIS")) {
            setFeeJuris(visa.substring(32, 50));
        }
        if (visa.contains("ROUTING")) {
            setRouting(visa.substring(66, 88));
        }
        if (visa.contains("FEE LEVEL")) {
            setInterchangeMessage(visa.substring(106, 122));
            setInterchangeFee(visa.substring(130, 146));
            setInterchangeCurrency(visa.substring(146, 148));
        }
        if (visa.contains("DG CD")) {
            setDgCd(visa.substring(43, 46));
        }
    }


    public Integer getTc45Code() {
        return tc45Code;
    }

    public void setTc45Code(Integer tc45Code) {
        this.tc45Code = tc45Code;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getTransmissionDate() {
        return transmissionDate;
    }

    public void setTransmissionDate(String transmissionDate) {
        this.transmissionDate = transmissionDate;
    }

    public String getTransmissionTime() {
        return transmissionTime;
    }

    public void setTransmissionTime(String transmissionTime) {
        this.transmissionTime = transmissionTime;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getRetrievalRefNumber() {
        return retrievalRefNumber;
    }

    public void setRetrievalRefNumber(String retrievalRefNumber) {
        this.retrievalRefNumber = retrievalRefNumber;
    }

    public String getTraceNumber() {
        return traceNumber;
    }

    public void setTraceNumber(String traceNumber) {
        this.traceNumber = traceNumber;
    }

    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public String getTranType() {
        return tranType;
    }

    public void setTranType(String tranType) {
        this.tranType = tranType;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getPosCon() {
        return posCon;
    }

    public void setPosCon(String posCon) {
        this.posCon = posCon;
    }

    public String getRspCode() {
        return rspCode;
    }

    public void setRspCode(String rspCode) {
        this.rspCode = rspCode;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getRejectCode() {
        return rejectCode;
    }

    public void setRejectCode(String rejectCode) {
        this.rejectCode = rejectCode;
    }

    public String getEntryMode() {
        return entryMode;
    }

    public void setEntryMode(String entryMode) {
        this.entryMode = entryMode;
    }

    public String getFpi() {
        return fpi;
    }

    public void setFpi(String fpi) {
        this.fpi = fpi;
    }

    public String getDgCd() {
        return dgCd;
    }

    public void setDgCd(String dgCd) {
        this.dgCd = dgCd;
    }

    public String getAci() {
        return aci;
    }

    public void setAci(String aci) {
        this.aci = aci;
    }

    public String getSchg() {
        return schg;
    }

    public void setSchg(String schg) {
        this.schg = schg;
    }

    public String getFeeJuris() {
        return feeJuris;
    }

    public void setFeeJuris(String feeJuris) {
        this.feeJuris = feeJuris;
    }

    public String getRouting() {
        return routing;
    }

    public void setRouting(String routing) {
        this.routing = routing;
    }

    public String getSettlementAmount() {
        return settlementAmount;
    }

    public void setSettlementAmount(String settlementAmount) {
        this.settlementAmount = settlementAmount;
    }

    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    public void setSettlementCurrency(String settlementCurrency) {
        this.settlementCurrency = settlementCurrency;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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

    public String getMerchantCountry() {
        return merchantCountry;
    }

    public void setMerchantCountry(String merchantCountry) {
        this.merchantCountry = merchantCountry;
    }

    public String getMerchantZipcode() {
        return merchantZipcode;
    }

    public void setMerchantZipcode(String merchantZipcode) {
        this.merchantZipcode = merchantZipcode;
    }

    public String getCnStp() {
        return cnStp;
    }

    public void setCnStp(String cnStp) {
        this.cnStp = cnStp;
    }

    public String getCdSq() {
        return cdSq;
    }

    public void setCdSq(String cdSq) {
        this.cdSq = cdSq;
    }

    public String getAtc() {
        return atc;
    }

    public void setAtc(String atc) {
        this.atc = atc;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getTrId() {
        return trId;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }

    public String getVc() {
        return vc;
    }

    public void setVc(String vc) {
        this.vc = vc;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getInterchangeMessage() {
        return interchangeMessage;
    }

    public void setInterchangeMessage(String interchangeMessage) {
        this.interchangeMessage = interchangeMessage;
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

    public Integer getSummaryCode() {
        return summaryCode;
    }

    public void setSummaryCode(Integer summaryCode) {
        this.summaryCode = summaryCode;
    }

    public String getAccountNumberExtension() {
        return accountNumberExtension;
    }

    public void setAccountNumberExtension(String accountNumberExtension) {
        this.accountNumberExtension = accountNumberExtension;
    }
}

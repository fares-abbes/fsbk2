package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.persistence.*;

@Entity
@Table(name = "POS_ACTIVITY_DETAIL", schema = "FRANSABANK")
public class DetailsClearing {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )

	@JsonProperty("DetailsCode")
	@Column(name = "DETAIL_CODE", nullable = false)
    private int detailCode;

    @JsonProperty("summaryCode")
    @Column(name = "SUMMURY_CODE", nullable = false)
    private int summaryCode;

    @JsonProperty("customer_transaction")
    @Column(name = "CUSTOMER_TRANSACTION")
    private String customerTransaction;

    @JsonProperty("card_owner")
    @Column(name = "NETWORK_ISSUER")
    private String cardOwner;

    @JsonProperty("fid_issue")
    @Column(name = "FIID_ISSUER")
    private String fidIssue;

    @JsonProperty("pan")
    @Column(name = "PAN")
    private String pan;

    @JsonProperty("aquirer_BT")
    @Column(name = "NETWORK_ACQUERER")
    private String aquirerBt;

    @JsonProperty("FIID_AQUERER")
    @Column(name = "FIID_ACQUERER")
    private String fiidAquerer;

    @JsonProperty("merchant_ID")
    @Column(name = "MERCHANT_ID")
    private String merchantId;

    @JsonProperty("terminal_ID")
    @Column(name = "TERMINAL_ID")
    private String terminalId;

    @JsonProperty("batch_Number")
    @Column(name = "BATCH_ID")
    private String batchNumber;

    @JsonProperty("reversal")
    @Column(name = "MTI")
    private String reversal;

    @JsonProperty("device_controlled")
    @Column(name = "ORIGINATOR")
    private String deviceControlled;

    @JsonProperty("Interchange")
    @Column(name = "RESPONDER")
    private double interchange;

    @JsonProperty("date_trasaction")
    @Column(name = "TRANSACTION_DATE")
    private String dateTrasaction;

    @JsonProperty("heure_transaction")
    @Column(name = "TRANSACTION_TIME")
    private String heureTransaction;

    @JsonProperty("sequence_number")
    @Column(name = "SEQUENCE_NUMBER")
    private String sequenceNumber;

    @JsonProperty("terminal_name")
    @Column(name = "TERMINAL_NAME")
    private String terminalName;

    @JsonProperty("banck_name")
    @Column(name = "TERMINAL_OWNER")
    private String banckName;

    @JsonProperty("terminal_location")
    @Column(name = "TERMINAL_CITY")
    private String terminalLocation;

    @JsonProperty("location")
    @Column(name = "TERMINAL_STATE")
    private String location;

    @JsonProperty("country")
    @Column(name = "TERMINAL_COUNTRY")
    private String country;

    @JsonProperty("mcc")
    @Column(name = "MCC")
    private String mcc;

    @JsonProperty("preautorisation")
    @Column(name = "TRANSACTION_TYPE")
    private String preautorisation;

    @JsonProperty("response_code")
    @Column(name = "RESPONSE_CODE")
    private String responseCode;

    @JsonProperty("amount_transaction")
    @Column(name = "TRANSACTION_AMOUNT")
    private double amountTransaction;

    @JsonProperty("adjustement_amount")
    @Column(name = "ADJUSTEMENT_AMOUNT")
    private double adjustementAmount;

    @JsonProperty("expery_date")
    @Column(name = "EXPARY_DATE")
    private String experyDate;

    @JsonProperty("invoice_number")
    @Column(name = "INVOICE_NUMBER")
    private String invoiceNumber;

    @JsonProperty("DE_38")
    @Column(name = "DE38")
    private String de38;

    @JsonProperty("authorize_only")
    @Column(name = "ACTION_CODE")
    private String authorizeOnly;

    @JsonProperty("customer_canceled")
    @Column(name = "REVERSAL_REASON")
    private String customerCanceled;

    @JsonProperty("transaction_currency")
    @Column(name = "DE49")
    private String transactionCurrency;

    @JsonProperty("normal_transaction")
    @Column(name = "CRT")
    private String normalTransaction;

    @JsonProperty("blanc")
    @Column(name = "AUTHORIZER")
    private String blanc;

    @JsonProperty("token_B2")
    @Column(name = "TOKEN_B2")
    private String tokenB2;

    @JsonProperty("token_B3")
    @Column(name = "TOKEN_B3")
    private String tokenB3;

    @JsonProperty("Token_B4")
    @Column(name = "TOKEN_B4")
    private String tokenB4;

    @JsonProperty("Token_B5")
    @Column(name = "TOKEN_B5")
    private String tokenB5;

    @JsonProperty("token_C0")
    @Column(name = "TOKEN_C0")
    private String tokenC0;

    @JsonProperty("aut_number")
    @Column(name = "UTRRNO")
    private String autNumber;

    @JsonProperty("reposne_code_approuved")
    @Column(name = "SMARTVISRA_RESPONSE")
    private String reponseCodeApprouved;
    
    private String de11;
    private Integer matchingSwitch;
    public DetailsClearing() {}
    

	public DetailsClearing(String detail, int summaryCode) {
		super();
		this.summaryCode = summaryCode;
		this.customerTransaction = detail.substring(2, 4).trim();
		this.cardOwner = detail.substring(2, 4).trim();
		this.fidIssue = detail.substring(8, 12).trim();
		this.pan = detail.substring(12, 31).trim();
		this.aquirerBt = detail.substring(31, 35).trim();
		this.fiidAquerer = detail.substring(35, 39).trim();
		this.merchantId = detail.substring(39, 58).trim();
		this.terminalId = detail.substring(58, 74).trim();
		this.batchNumber = detail.substring(74, 77).trim();
		this.reversal = detail.substring(77, 81).trim();
		this.deviceControlled = detail.substring(81, 82).trim();
		this.transactionCurrency = detail.substring(246, 249).trim();
		this.interchange = convertAmount(detail.substring(82, 83).trim(), transactionCurrency);
		this.dateTrasaction = detail.substring(83, 89).trim();
		this.heureTransaction = detail.substring(89, 97).trim();
		this.sequenceNumber = detail.substring(97, 109).trim();
		this.terminalName = detail.substring(109, 134).trim();
		this.banckName = detail.substring(134, 156).trim();
		this.terminalLocation = detail.substring(156, 169).trim();
		this.location = detail.substring(169, 172).trim();
		this.country = detail.substring(172, 174).trim();
		this.mcc = detail.substring(174, 178).trim();
		this.preautorisation = detail.substring(178, 180).trim();
		this.responseCode = detail.substring(180, 183).trim();
		this.amountTransaction = convertAmount(detail.substring(183, 202).trim(), transactionCurrency);
		this.adjustementAmount = convertAmount(detail.substring(202, 221).trim(), transactionCurrency);
		this.experyDate = detail.substring(221, 225).trim();
		this.invoiceNumber = detail.substring(225, 235).trim();
		this.de38 = detail.substring(235, 243).trim();
		this.authorizeOnly = detail.substring(243, 244).trim();
		this.customerCanceled = detail.substring(244, 246).trim();		
		this.normalTransaction = detail.substring(249, 250).trim();
		this.blanc = detail.substring(250, 266).trim();
		this.tokenB2 = detail.substring(268, 434).trim();
		this.tokenB3 = detail.substring(436, 436 + 88).trim();
		this.tokenB4 = detail.substring(526, 526 + 28).trim();
		this.tokenB5 = detail.substring(556, 556 + 46).trim();
		this.tokenC0 = detail.substring(604, 604 + 34).trim();
		if(this.de38==null) {
			this.de38="000000";
		}else if(de38.trim().equals("")) {
			this.de38="000000";
		}
		
		this.autNumber = detail.substring(638, 638 + 12).trim();
		this.reponseCodeApprouved = detail.substring(650, 651).trim();
		
	}
	public static double roundUsingBigDecimal(double value, int nbDecimals) {
	    BigDecimal bd = BigDecimal.valueOf(value);
	    bd = bd.setScale(nbDecimals, RoundingMode.HALF_UP);
	    return bd.doubleValue();
	}


	
	public static double convertAmountToDouble(double amount, int nb) {
	    return roundUsingBigDecimal(amount, nb);
	}


	public double convertAmount(String amount, String CurrencyCode) {
		
			double number = Double.parseDouble(amount);
			 int nbD=3;
			 if(!CurrencyCode.equals("788")) {			 
				 nbD = 2;
			 }		 
			 double amountDouble= number/ Math.pow(10, nbD);
			 
			return convertAmountToDouble(amountDouble,20);
		
	}

	public int getDetailCode() {
        return detailCode;
    }

    public void setDetailCode(int detailCode) {
        this.detailCode = detailCode;
    }

    public int getSummaryCode() {
        return summaryCode;
    }

    public void setSummaryCode(int summaryCode) {
        this.summaryCode = summaryCode;
    }

    public String getCustomerTransaction() {
        return customerTransaction;
    }

    public void setCustomerTransaction(String customerTransaction) {
        this.customerTransaction = customerTransaction;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public String getFidIssue() {
        return fidIssue;
    }

    public void setFidIssue(String fidIssue) {
        this.fidIssue = fidIssue;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getAquirerBt() {
        return aquirerBt;
    }

    public void setAquirerBt(String aquirerBt) {
        this.aquirerBt = aquirerBt;
    }

    public String getFiidAquerer() {
        return fiidAquerer;
    }

    public void setFiidAquerer(String fiidAquerer) {
        this.fiidAquerer = fiidAquerer;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getReversal() {
        return reversal;
    }

    public void setReversal(String reversal) {
        this.reversal = reversal;
    }

    public String getDeviceControlled() {
        return deviceControlled;
    }

    public void setDeviceControlled(String deviceControlled) {
        this.deviceControlled = deviceControlled;
    }

    public double getInterchange() {
        return interchange;
    }

    public void setInterchange(double interchange) {
        this.interchange = interchange;
    }

    public String getDateTrasaction() {
        return dateTrasaction;
    }

    public void setDateTrasaction(String dateTrasaction) {
        this.dateTrasaction = dateTrasaction;
    }

    public String getHeureTransaction() {
        return heureTransaction;
    }

    public void setHeureTransaction(String heureTransaction) {
        this.heureTransaction = heureTransaction;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public String getBanckName() {
        return banckName;
    }

    public void setBanckName(String banckName) {
        this.banckName = banckName;
    }

    public String getTerminalLocation() {
        return terminalLocation;
    }

    public void setTerminalLocation(String terminalLocation) {
        this.terminalLocation = terminalLocation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getPreautorisation() {
        return preautorisation;
    }

    public void setPreautorisation(String preautorisation) {
        this.preautorisation = preautorisation;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public double getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(double amountTransaction) {
        this.amountTransaction = amountTransaction;
    }

    public double getAdjustementAmount() {
        return adjustementAmount;
    }

    public void setAdjustementAmount(double adjustementAmount) {
        this.adjustementAmount = adjustementAmount;
    }

    public String getExperyDate() {
        return experyDate;
    }

    public void setExperyDate(String experyDate) {
        this.experyDate = experyDate;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getDe38() {
        return de38;
    }

    public void setDe38(String de38) {
        this.de38 = de38;
    }

    public String getAuthorizeOnly() {
        return authorizeOnly;
    }

    public void setAuthorizeOnly(String authorizeOnly) {
        this.authorizeOnly = authorizeOnly;
    }

    public String getCustomerCanceled() {
        return customerCanceled;
    }

    public void setCustomerCanceled(String customerCanceled) {
        this.customerCanceled = customerCanceled;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getNormalTransaction() {
        return normalTransaction;
    }

    public void setNormalTransaction(String normalTransaction) {
        this.normalTransaction = normalTransaction;
    }

    public String getBlanc() {
        return blanc;
    }

    public void setBlanc(String blanc) {
        this.blanc = blanc;
    }

    public String getTokenB2() {
        return tokenB2;
    }

    public void setTokenB2(String tokenB2) {
        this.tokenB2 = tokenB2;
    }

    public String getTokenB3() {
        return tokenB3;
    }

    public void setTokenB3(String tokenB3) {
        this.tokenB3 = tokenB3;
    }

    public String getTokenB4() {
        return tokenB4;
    }

    public void setTokenB4(String tokenB4) {
        this.tokenB4 = tokenB4;
    }

    public String getTokenB5() {
        return tokenB5;
    }

    public void setTokenB5(String tokenB5) {
        this.tokenB5 = tokenB5;
    }

    public String getTokenC0() {
        return tokenC0;
    }

    public void setTokenC0(String tokenC0) {
        this.tokenC0 = tokenC0;
    }

    public String getAutNumber() {
        return autNumber;
    }

    public void setAutNumber(String autNumber) {
        this.autNumber = autNumber;
    }

    public String getReponseCodeApprouved() {
        return reponseCodeApprouved;
    }

    public void setReponseCodeApprouved(String reponseCodeApprouved) {
        this.reponseCodeApprouved = reponseCodeApprouved;
    }


	public String getDe11() {
		return de11;
	}


	public void setDe11(String de11) {
		this.de11 = de11;
	}


	public Integer getMatchingSwitch() {
		return matchingSwitch;
	}


	public void setMatchingSwitch(Integer matchingSwitch) {
		this.matchingSwitch = matchingSwitch;
	}


}

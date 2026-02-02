package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "ATM_ACTIVITY_DETAIL", schema = "FRANSABANK")
public class DetailsClearingAtm {
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

    @JsonProperty("aquirer_BT")
    @Column(name = "NETWORK_ACQUERER")
    private String aquirerBT;

    @JsonProperty("FIID_AQUERER")
    @Column(name = "FIID_ACQUERER")
    private String fiidAquerer;

    @JsonProperty("terminal_ID")
    @Column(name = "TERMINAL_ID")
    private String terminalId;

    @JsonProperty("card_owner")
    @Column(name = "NETWORK_ISSUER")
    private String cardOwner;

    @JsonProperty("fid_issue")
    @Column(name = "FIID_ISSUER")
    private String fidIssue;

    @JsonProperty("pan")
    @Column(name = "PAN")
    private String pan;

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
    private String dateTransaction;

    @JsonProperty("heure_transaction")
    @Column(name = "TRANSACTION_TIME")
    private String heureTransaction;

    @JsonProperty("sequence_number")
    @Column(name = "SEQUENCE_NUMBER")
    private String sequenceNumber;

    @JsonProperty("Unkown_number")
    @Column(name = "UNKNOWN")
    private String unkownNumber;

    @JsonProperty("amount_transaction")
    @Column(name = "TRANSACTION_AMOUNT")
    private double amountTransaction;
    
    @JsonProperty("amount_transaction_InValid")
    @Column(name = "InValid_TRANSACTION_AMOUNT")
    private String amountTransactionInValid;

    @JsonProperty("adjustement_amount")
    @Column(name = "OTHER_AMOUNT")
    private double adjustementAmount;

    @JsonProperty("response_code")
    @Column(name = "RESPONSE_CODE")
    private String responseCode;


    @JsonProperty("de_38")
    @Column(name = "DE38")
    private String de38;

    @JsonProperty("expery_date")
    @Column(name = "EXPARY_DATE")
    private String experyDate;

    @JsonProperty("terminal_name")
    @Column(name = "TERMINAL_NAME")
    private String terminalName;

    @JsonProperty("banck_name")
    @Column(name = "TERMINAL_OWNER")
    private String banckName;

    @JsonProperty("terminal_location")
    @Column(name = "TERMINAL_CITY")
    private String terminalLocation;

    @JsonProperty("country")
    @Column(name = "TERMINAL_COUNTRY")
    private String country;

    @JsonProperty("location")
    @Column(name = "TERMINAL_STATE")
    private String location;

    @JsonProperty("currency")
    @Column(name = "CURRENCY")
    private String currency;

    @JsonProperty("reason_code")
    @Column(name = "REASON_CODE")
    private String reasonCode;

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

    @JsonProperty("aut_number")
    @Column(name = "UTRRNO")
    private String autNumber;

    @JsonProperty("reposne_code_approuved")
    @Column(name = "SMARTVISRA_RESPONSE")
    private String responseCodeApprouved;
    
    private String de11;
    private Integer matchingSwitch;
    public DetailsClearingAtm() {}
    

	public DetailsClearingAtm(String detail, int summaryCode) {
		super();
		this.summaryCode = summaryCode;
		this.customerTransaction = detail.substring(2, 4).trim();
		this.aquirerBT = detail.substring(4, 8).trim();
		this.fiidAquerer = detail.substring(8, 12).trim();
		this.terminalId = detail.substring(12, 28).trim();
		this.cardOwner = detail.substring(28, 32).trim();
		this.fidIssue = detail.substring(32, 36).trim();
		this.pan = detail.substring(36, 55).trim();
		this.reversal = detail.substring(55, 59).trim();
		this.deviceControlled = detail.substring(59, 60).trim();
		this.currency = detail.substring(209, 212).trim();
		this.interchange = convertAmount(detail.substring(60, 61).trim(), currency);
		this.dateTransaction = detail.substring(61, 67).trim();
		this.heureTransaction = detail.substring(67, 75).trim();
		this.sequenceNumber = detail.substring(75, 87).trim();
		this.unkownNumber = detail.substring(87, 93).trim();
		this.amountTransaction = convertAmountOrSetInValid(detail.substring(93, 112).trim(), currency);
		this.adjustementAmount = convertAmount(detail.substring(112, 131).trim(), currency);
		this.responseCode = detail.substring(131, 134).trim();
		this.de38 = detail.substring(134, 140).trim();
		this.experyDate = detail.substring(140, 144).trim();
		this.terminalName = detail.substring(144, 169).trim();
		this.banckName = detail.substring(169, 191).trim();
		this.terminalLocation = detail.substring(191, 204).trim();
		this.country = detail.substring(204, 207).trim();
		this.location = detail.substring(207, 209).trim();		
		this.reasonCode = detail.substring(212, 214).trim();
		this.tokenB2 = detail.substring(214, 382).trim();
		this.tokenB3 = detail.substring(382, 472).trim();
		this.tokenB4 = detail.substring(472, 502).trim();
		this.tokenB5 = detail.substring(502, 550).trim();
		if(this.de38==null) {
			this.de38="000000";
		}else if(de38.trim().equals("")) {
			this.de38="000000";
		}
		this.autNumber= detail.substring(550, 562).trim();
		this.responseCodeApprouved= detail.substring(562, 565).trim();
		
	}

	public double convertAmountOrSetInValid(String amount, String CurrencyCode) {
		try {
			 int number = Integer.parseInt(amount);
			 int nbD=3;
			 if(!CurrencyCode.equals("788")) {			 
				 nbD = 2;
			 }		 
			return number/Math.pow(10, nbD);
		}
		catch (Exception e) {
			this.amountTransactionInValid= amount;
			System.out.println("exeption convertAmount ATM");
			return -1;
		}		
	}	
	public double convertAmount(String amount, String CurrencyCode) {
		
			 long number = Long.parseLong(amount);
			 int nbD=3;
			 if(!CurrencyCode.equals("788")) {			 
				 nbD = 2;
			 }		 
			return number/Math.pow(10, nbD);	
		
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

    public String getAquirerBT() {
        return aquirerBT;
    }

    public void setAquirerBT(String aquirerBT) {
        this.aquirerBT = aquirerBT;
    }

    public String getFiidAquerer() {
        return fiidAquerer;
    }

    public void setFiidAquerer(String fiidAquerer) {
        this.fiidAquerer = fiidAquerer;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
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

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
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

    public String getUnkownNumber() {
        return unkownNumber;
    }

    public void setUnkownNumber(String unkownNumber) {
        this.unkownNumber = unkownNumber;
    }

    public double getAmountTransaction() {
        return amountTransaction;
    }

    public void setAmountTransaction(double amountTransaction) {
        this.amountTransaction = amountTransaction;
    }
    
    public String getAmountTransactionInValid() {
		return amountTransactionInValid;
	}


	public void setAmountTransactionInValid(String amountTransactionInValid) {
		this.amountTransactionInValid = amountTransactionInValid;
	}


	public double getAdjustementAmount() {
        return adjustementAmount;
    }

    public void setAdjustementAmount(double adjustementAmount) {
        this.adjustementAmount = adjustementAmount;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getDe38() {
        return de38;
    }

    public void setDe38(String de38) {
        this.de38 = de38;
    }

    public String getExperyDate() {
        return experyDate;
    }

    public void setExperyDate(String experyDate) {
        this.experyDate = experyDate;
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

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
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

    public String getAutNumber() {
        return autNumber;
    }

    public void setAutNumber(String autNumber) {
        this.autNumber = autNumber;
    }

    public String getResponseCodeApprouved() {
        return responseCodeApprouved;
    }

    public void setResponseCodeApprouved(String responseCodeApprouved) {
        this.responseCodeApprouved = responseCodeApprouved;
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

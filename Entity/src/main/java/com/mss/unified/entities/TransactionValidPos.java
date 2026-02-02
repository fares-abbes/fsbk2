package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TRANSACTION_VALID_POS", schema = "FRANSABANK")
public class TransactionValidPos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "TRANSACTION_CODE", nullable = false)
	private int transactionCode;
	@JsonProperty("card_owner")
	@Column(name = "NETWORK_ISSUER")
	private String cardOwner;
	@Column(name = "PAN")
	private String pan;
	@JsonProperty("aquirer_BT")
	@Column(name = "NETWORK_ACQUERER")
	private String aquirerBt;
	@JsonProperty("merchant_ID")
	@Column(name = "MERCHANT_ID")
	private String merchantId;
    @JsonProperty("terminal_ID")
	@Column(name = "TERMINAL_ID")
	private String terminalId;
	@Column(name = "BATCH_ID")
	private String batchNumber;
	
	@Column(name = "MTI")
	private String reversal;
	@JsonProperty("date_trasaction")
	@Column(name = "TRANSACTION_DATE")
	private String dateTransaction;
	@JsonProperty("heure_transaction")
	@Column(name = "TRANSACTION_TIME")
	private String heureTransaction;
	@Column(name = "SEQUENCE_NUMBER")
	private String sequenceNumber;
	@JsonProperty("terminal_name")
	@Column(name = "TERMINAL_NAME")
	private String terminalName;
	@Column(name = "TERMINAL_OWNER")
	private String banckName;
	@Column(name = "TERMINAL_CITY")
	private String terminalLocation;
	@Column(name = "TERMINAL_COUNTRY")
	private String country;
	@Column(name = "TERMINAL_STATE")

	private String location;
	@JsonProperty("amount_transaction")
	@Column(name = "TRANSACTION_AMOUNT")
	private double amountTransaction;
	@Column(name = "ADJUSTEMENT_AMOUNT")
	private double adjustementAmount;
	@JsonProperty("expery_date")
	@Column(name = "EXPARY_DATE")
	private String experyDate;
	@Column(name = "INVOICE_NUMBER")
	private String invoiceNumber;
	@Column(name = "DE38")
	private String de38;
	@JsonProperty("transaction_currency")
	@Column(name = "DE49")
	private String transactionCurrency;
	@JsonProperty("aut_number")
	@Column(name = "UTRRNO")
	private String autNumber;
	@Column(name = "code_details")
	private int codeDetails;
	@JsonProperty("revarsal_pos")
	@Column(name = "Reversal_pos")
	private String revarsalPos;
	@Column(name = "compense_pos")
	private String compensePos;
	@Column(name = "constatation")
	private String constatation;
	private Integer summaryCode;

	@Column(name = "matching_switch")
	private Integer matchingSwitch;
	private String de11;
	private String de37;
	
    @JsonProperty("FIID_AQUERER")
    @Column(name = "FIID_ACQUERER")
    private String fiidAquerer;
    @JsonProperty("fiid_issuer")
    @Column(name = "FIID_ISSUER")
    private String fiidIssuer;
    
    @JsonProperty("transaction_type")
    @Column(name = "TRANSACTION_TYPE")
    private String transactionType;
    private String matchingVisa;
    private String extourne;
	public TransactionValidPos() {}
	

	public TransactionValidPos(DetailsClearing detailsClearing) {
		super();
		this.cardOwner = detailsClearing.getCardOwner();
		this.pan = detailsClearing.getPan();
		this.aquirerBt = detailsClearing.getAquirerBt();
		this.merchantId = detailsClearing.getMerchantId();
		this.terminalId = detailsClearing.getTerminalId();
		this.batchNumber = detailsClearing.getBatchNumber();
		this.reversal = detailsClearing.getReversal();
		this.dateTransaction = this.formatagedate( detailsClearing.getDateTrasaction());
		this.heureTransaction = detailsClearing.getHeureTransaction();
		this.sequenceNumber = detailsClearing.getSequenceNumber();
		this.terminalName = detailsClearing.getTerminalName();
		this.banckName = detailsClearing.getBanckName();
		this.terminalLocation = detailsClearing.getTerminalLocation();
		this.country = detailsClearing.getCountry();
		this.location = detailsClearing.getLocation();
		this.amountTransaction = detailsClearing.getAmountTransaction();
		this.adjustementAmount = detailsClearing.getAdjustementAmount();
		this.experyDate = detailsClearing.getExperyDate();
		this.invoiceNumber = detailsClearing.getInvoiceNumber();
		this.de38 = detailsClearing.getDe38();
		this.transactionCurrency = detailsClearing.getTransactionCurrency();
		this.autNumber = detailsClearing.getAutNumber();
		this.codeDetails = detailsClearing.getDetailCode();
		this.summaryCode = detailsClearing.getSummaryCode();
		this.de11=detailsClearing.getDe11();
		this.matchingSwitch=detailsClearing.getMatchingSwitch();
		this.fiidIssuer=detailsClearing.getFidIssue();
		this.fiidAquerer=detailsClearing.getFiidAquerer();
		this.transactionType= detailsClearing.getPreautorisation();
	}


	public int getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(int transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getCardOwner() {
		return cardOwner;
	}

	public void setCardOwner(String cardOwner) {
		this.cardOwner = cardOwner;
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

	public String getMerchantId() {
		return merchantId;
	}
	private String formatagedate(String date)
	{String dateRetour=date.substring(4);

	dateRetour+=date.substring(2,4);

	dateRetour+= date.substring(0,2);
	
	return dateRetour;
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

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public String getAutNumber() {
		return autNumber;
	}

	public void setAutNumber(String autNumber) {
		this.autNumber = autNumber;
	}

	public int getCodeDetails() {
		return codeDetails;
	}

	public void setCodeDetails(int codeDetails) {
		this.codeDetails = codeDetails;
	}

	public String getRevarsalPos() {
		return revarsalPos;
	}

	public void setRevarsalPos(String revarsalPos) {
		this.revarsalPos = revarsalPos;
	}

	public String getCompensePos() {
		return compensePos;
	}

	public void setCompensePos(String compensePos) {
		this.compensePos = compensePos;
	}

	public String getConstatation() {
		return constatation;
	}

	public void setConstatation(String constatation) {
		this.constatation = constatation;
	}


	public Integer getSummaryCode() {
		return summaryCode;
	}


	public void setSummaryCode(Integer summaryCode) {
		this.summaryCode = summaryCode;
	}

	public Integer getMatchingSwitch() {
		return matchingSwitch;
	}

	public void setMatchingSwitch(Integer matchingSwitch) {
		this.matchingSwitch = matchingSwitch;
	}


	public String getDe11() {
		return de11;
	}


	public void setDe11(String de11) {
		this.de11 = de11;
	}


	public String getFiidAquerer() {
		return fiidAquerer;
	}


	public void setFiidAquerer(String fiidAquerer) {
		this.fiidAquerer = fiidAquerer;
	}

	public String getFiidIssuer() {
		return fiidIssuer;
	}


	public void setFiidIssuer(String fiidIssuer) {
		this.fiidIssuer = fiidIssuer;
	}


	public String getTransactionType() {
		return transactionType;
	}


	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}


	public String getMatchingVisa() {
		return matchingVisa;
	}


	public void setMatchingVisa(String matchingVisa) {
		this.matchingVisa = matchingVisa;
	}


	public String getExtourne() {
		return extourne;
	}


	public void setExtourne(String extourne) {
		this.extourne = extourne;
	}


	public String getDe37() {
		return de37;
	}


	public void setDe37(String de37) {
		this.de37 = de37;
	}
	
	
	
}
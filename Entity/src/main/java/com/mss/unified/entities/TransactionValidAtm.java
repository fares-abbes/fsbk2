package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TRANSACTION_VALID_ATM", schema = "FRANSABANK")
public class TransactionValidAtm {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY )
	    private int transactionCode;
	    @JsonProperty("card_owner")
		@Column(name = "NETWORK_ISSUER") 
		private String cardOwner;
		@Column(name = "PAN") 
		private String pan;
		@JsonProperty("aquirer_BT")
		@Column(name = "NETWORK_ACQUERER")
		private String aquirerBt;
	    @JsonProperty("terminal_ID")
		@Column(name = "TERMINAL_ID")
		private String terminalId;
	
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
		@Column(name = "TERMINAL_STATE")
		private String country;
		@Column(name = "TERMINAL_COUNTRY")
		private String location;
		@JsonProperty("amount_transaction")
		@Column(name = "TRANSACTION_AMOUNT")
		private double amountTransaction;
		@Column(name = "ADJUSTEMENT_AMOUNT")
		private double adjustementAmount;
		@JsonProperty("expery_date")
		@Column(name = "EXPARY_DATE")
		private String experyDate;
	
		@Column(name = "DE38")
		private String de38;
		@JsonProperty("transaction_currency")
		@Column(name = "DE49")
		private String transactionCurrency;
		@Column(name = "UTRRNO")
	    private String autNumber;
		@Column(name = "code_details", nullable = false)
	    private int codeDetails;
		@JsonProperty("reversal_ATM")
		@Column(name = "reversal")
     	private String reversalAtm;
		@Column(name = "compense")
     	private String compense;
		@Column(name = "constatation")
     	private String constatation;
		private int summaryCode;
		@Column(name = "fiid_issuer")
     	private String fiid_issuer;
		@Column(name = "fiid_acqu")
     	private String fiid_acqu;
		@Column(name = "visa_code")
     	private String visaCode;
		@Column(name = "MDS_code")
     	private String mdsCode;
		@Column(name = "ipm_code")
     	private String ipmCode;
		@Column(name = "tokenB2")
     	private String tokenB2;
		@Column(name = "matching_switch")
		private Integer matchingSwitch;
		
		private String de11;
		@JsonProperty("Unkown_number")
		@Column(name = "UNKNOWN")
		private String unkownNumber;
		private String matchingVisa;   
	    private String extourne;
	    private String de37;

	public String getUnkownNumber() {
			return unkownNumber;
		}


		public void setUnkownNumber(String unkownNumber) {
			this.unkownNumber = unkownNumber;
		}


	public String getIpmCode() {
			return ipmCode;
		}


		public void setIpmCode(String ipmCode) {
			this.ipmCode = ipmCode;
		}


	public String getMdsCode() {
			return mdsCode;
		}


		public void setMdsCode(String mdsCode) {
			this.mdsCode = mdsCode;
		}


	public String getVisaCode() {
			return visaCode;
		}


		public void setVisaCode(String visaCode) {
			this.visaCode = visaCode;
		}


	public String getTokenB2() {
			return tokenB2;
		}


		public void setTokenB2(String tokenB2) {
			this.tokenB2 = tokenB2;
		}


	public String getFiid_issuer() {
			return fiid_issuer;
		}


		public void setFiid_issuer(String fiid_issuer) {
			this.fiid_issuer = fiid_issuer;
		}


		public String getFiid_acqu() {
			return fiid_acqu;
		}


		public void setFiid_acqu(String fiid_acqu) {
			this.fiid_acqu = fiid_acqu;
		}


	public TransactionValidAtm() {}
	

	public TransactionValidAtm(DetailsClearingAtm detAtm) {
		super();
		this.cardOwner = detAtm.getCardOwner();
		this.pan = detAtm.getPan();
		this.aquirerBt = detAtm.getAquirerBT();
		this.terminalId = detAtm.getTerminalId();
		this.reversal = detAtm.getReversal();
		this.dateTransaction = formatagedate(detAtm.getDateTransaction());
		this.heureTransaction = detAtm.getHeureTransaction();
		this.sequenceNumber = detAtm.getSequenceNumber();
		this.terminalName = detAtm.getTerminalName();
		this.banckName = detAtm.getBanckName();
		this.terminalLocation = detAtm.getTerminalLocation();
		this.country = detAtm.getCountry();
		this.location = detAtm.getLocation();
		this.amountTransaction = detAtm.getAmountTransaction();
		this.adjustementAmount = detAtm.getAdjustementAmount();
		this.experyDate = detAtm.getExperyDate();
		this.de38 = detAtm.getDe38();
		this.transactionCurrency = detAtm.getCurrency();
		this.autNumber = detAtm.getAutNumber();
		this.codeDetails = detAtm.getDetailCode();
		this.summaryCode = detAtm.getSummaryCode();
		this.fiid_acqu=detAtm.getFiidAquerer();
		this.fiid_issuer=detAtm.getFidIssue();
		this.tokenB2=detAtm.getTokenB2();
		this.de11=detAtm.getDe11();
		this.matchingSwitch=detAtm.getMatchingSwitch();
		this.unkownNumber=detAtm.getUnkownNumber();
	}
	private String formatagedate(String date)
	{String dateRetour=date.substring(4);

	dateRetour+=date.substring(2,4);

	dateRetour+= date.substring(0,2);
	
	return dateRetour;
	}


	public int getSummaryCode() {
			return summaryCode;
		}

		public void setSummaryCode(int summaryCode) {
			this.summaryCode = summaryCode;
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

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
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

	public String getReversalAtm() {
		return reversalAtm;
	}

	public void setReversalAtm(String reversalAtm) {
		this.reversalAtm = reversalAtm;
	}

	public String getCompense() {
		return compense;
	}

	public void setCompense(String compense) {
		this.compense = compense;
	}

	public String getConstatation() {
		return constatation;
	}

	public void setConstatation(String constatation) {
		this.constatation = constatation;
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

package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="POS_SERVICE",schema="POS")
public class PosService {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosServiceSequence")
	@SequenceGenerator(name = "PosServiceSequence", sequenceName = "POS.PosServiceSequence", allocationSize = 1)
	@Column(name = "PS_CODE", nullable = false)
	@JsonProperty("ps_CODE")
	private int psCode;
	
	@Column(name = "CARD_TYPE")
	@JsonProperty("card_TYPE")
	private String cardType;
	
	@Column(name = "PURCHAISE_FLOOR_LIMIT")
	@JsonProperty("purchaise_FLOOR_LIMIT")
	private String purchaiseFloorLimit;
	
	@Column(name = "CASHADVANCE_FLOOR_LIMIT")
	@JsonProperty("cashadvance_FLOOR_LIMIT")
	private String cashadvanceFloorLimit;
	
	@Column(name = "MAIL_FLOOR_LIMIT")
	@JsonProperty("mail_FLOOR_LIMIT")
	private String mailFloorLimit;
	
	@Column(name = "TRANSACTION_LIMIT")
	@JsonProperty("transaction_LIMIT")
	private String transactionLimit;
	
	@Column(name = "TRANSACTION_PROFILE")
	@JsonProperty("transaction_PROFILE")
	private String transactionProfile;

	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,CascadeType.MERGE,
	        CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name = "POS_SERVICE_AFFECT",schema="POS", 
     joinColumns = @JoinColumn(name="PS_CODE"), 
     inverseJoinColumns = @JoinColumn(name = "PSC_CODE"))
    private Set<PosServiceConf> posServiceConfLIST = new HashSet<>();
    


	public PosService(String cardType, String purchaiseFloorLimit, String cashadvanceFloorLimit, String mailFloorLimit,
			String transactionLimit, String transactionProfile) {
		super();
		this.cardType = cardType;
		this.purchaiseFloorLimit = purchaiseFloorLimit;
		this.cashadvanceFloorLimit = cashadvanceFloorLimit;
		this.mailFloorLimit = mailFloorLimit;
		this.transactionLimit = transactionLimit;
		this.transactionProfile = transactionProfile;
	}

	public PosService() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPsCode() {
		return psCode;
	}

	public void setPsCode(int psCode) {
		this.psCode = psCode;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getPurchaiseFloorLimit() {
		return purchaiseFloorLimit;
	}

	public void setPurchaiseFloorLimit(String purchaiseFloorLimit) {
		this.purchaiseFloorLimit = purchaiseFloorLimit;
	}

	public String getCashadvanceFloorLimit() {
		return cashadvanceFloorLimit;
	}

	public void setCashadvanceFloorLimit(String cashadvanceFloorLimit) {
		this.cashadvanceFloorLimit = cashadvanceFloorLimit;
	}

	public String getMailFloorLimit() {
		return mailFloorLimit;
	}

	public void setMailFloorLimit(String mailFloorLimit) {
		this.mailFloorLimit = mailFloorLimit;
	}

	public String getTransactionLimit() {
		return transactionLimit;
	}

	public void setTransactionLimit(String transactionLimit) {
		this.transactionLimit = transactionLimit;
	}

	public String getTransactionProfile() {
		return transactionProfile;
	}

	public void setTransactionProfile(String transactionProfile) {
		this.transactionProfile = transactionProfile;
	}

	public Set<PosServiceConf> getPosServiceConfLIST() {
		return posServiceConfLIST;
	}

	public void setPosServiceConfLIST(Set<PosServiceConf> posServiceConfLIST) {
		this.posServiceConfLIST = posServiceConfLIST;
	}
}

package com.mss.unified.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "POS_BIN", schema = "POS")
public class PosBin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "BIN_CODE", nullable = false)
	@JsonProperty("bin_CODE")
	private int binCode;
	
	@Column(name = "LOW_PREFIX")
	@JsonProperty("low_PREFIX")
	private String lowPrefix;
	
	@Column(name = "HIGH_PREFIX")
	@JsonProperty("high_PREFIX")
	private String highPrefix;
	
	@Column(name = "MAIN_TEL_NUMBER")
	@JsonProperty("main_TEL_NUMBER")
	private String mainTelNumber;
	
	@Column(name = "BACH_TEL_NUMBER")
	@JsonProperty("bach_TEL_NUMBER")
	private String bachTelNumber;
	
	@Column(name = "REFERRAL_TEL_NUMBER")
	@JsonProperty("referral_TEL_NUMBER")
	private String referralTelNumber;
	
	@Column(name = "RETAILER_ID")
	@JsonProperty("retailer_ID")
	private String retailerId;
	
	@Column(name = "DRAFT_CAPTURE_FLAG")
	@JsonProperty("draft_CAPTURE_FLAG")
	private String draftCaptureFlag;
	
	@Column(name = "TOTALS_FLAG")
	@JsonProperty("totals_FLAG")
	private String totalsFlag;
	
	@Column(name = "PIN_VALIDATION_FLAG")
	@JsonProperty("pin_VALIDATION_FLAG")
	private String pinValidationFlag;
	
	@Column(name = "RECEIPT_FLAG")
	@JsonProperty("receipt_FLAG")
	private String receiptFlag;
	
	@Column(name = "MOD_10_CHECK_FLAG")
	@JsonProperty("mod_10_CHECK_FLAG")
	private String mod10CheckFlag;
	
	@Column(name = "PAN_FRAUD_CHECK_FLAG")
	@JsonProperty("pan_FRAUD_CHECK_FLAG")
	private String panFraudCheckFlag;
	
	@Column(name = "USER_DEFINED_DATA")
	@JsonProperty("user_DEFINED_DATA")
	private String userDefinedData;

	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
	@OnDelete(action = OnDeleteAction.CASCADE)

	@JoinTable(name = "BIN_List", schema = "POS", joinColumns = @JoinColumn(name = "BIN_CODE"), inverseJoinColumns = @JoinColumn(name = "PBC_CODE"))
	private Set<PosBinConf> posBinConfsList = new HashSet<>();

	public PosBin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getBinCode() {
		return binCode;
	}

	public void setBinCode(int binCode) {
		this.binCode = binCode;
	}

	public String getLowPrefix() {
		return lowPrefix;
	}

	public void setLowPrefix(String lowPrefix) {
		this.lowPrefix = lowPrefix;
	}

	public String getHighPrefix() {
		return highPrefix;
	}

	public void setHighPrefix(String highPrefix) {
		this.highPrefix = highPrefix;
	}

	public String getMainTelNumber() {
		return mainTelNumber;
	}

	public void setMainTelNumber(String mainTelNumber) {
		this.mainTelNumber = mainTelNumber;
	}

	public String getBachTelNumber() {
		return bachTelNumber;
	}

	public void setBachTelNumber(String bachTelNumber) {
		this.bachTelNumber = bachTelNumber;
	}

	public String getReferralTelNumber() {
		return referralTelNumber;
	}

	public void setReferralTelNumber(String referralTelNumber) {
		this.referralTelNumber = referralTelNumber;
	}

	public String getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
	}

	public String getDraftCaptureFlag() {
		return draftCaptureFlag;
	}

	public void setDraftCaptureFlag(String draftCaptureFlag) {
		this.draftCaptureFlag = draftCaptureFlag;
	}

	public String getTotalsFlag() {
		return totalsFlag;
	}

	public void setTotalsFlag(String totalsFlag) {
		this.totalsFlag = totalsFlag;
	}

	public String getPinValidationFlag() {
		return pinValidationFlag;
	}

	public void setPinValidationFlag(String pinValidationFlag) {
		this.pinValidationFlag = pinValidationFlag;
	}

	public String getReceiptFlag() {
		return receiptFlag;
	}

	public void setReceiptFlag(String receiptFlag) {
		this.receiptFlag = receiptFlag;
	}

	public String getMod10CheckFlag() {
		return mod10CheckFlag;
	}

	public void setMod10CheckFlag(String mod10CheckFlag) {
		this.mod10CheckFlag = mod10CheckFlag;
	}

	public String getPanFraudCheckFlag() {
		return panFraudCheckFlag;
	}

	public void setPanFraudCheckFlag(String panFraudCheckFlag) {
		this.panFraudCheckFlag = panFraudCheckFlag;
	}

	public String getUserDefinedData() {
		return userDefinedData;
	}

	public void setUserDefinedData(String userDefinedData) {
		this.userDefinedData = userDefinedData;
	}

	public Set<PosBinConf> getPosBinConfsList() {
		return posBinConfsList;
	}

	public void setPosBinConfsList(Set<PosBinConf> posBinConfsList) {
		this.posBinConfsList = posBinConfsList;
	}
}

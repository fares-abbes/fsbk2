package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DETAIL_RISK_MANAGEMENT_DEMANDE",schema = "PORTEUR")
public class DetailRiskManagementDemande {

	
	@Id
    @Column(name = "DETAIL_CODE", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DetailDemandeSequence")
    @SequenceGenerator(name = "DetailDemandeSequence", sequenceName = "PORTEUR.DetailDemandeSequence", allocationSize = 1)
	private int DetailCode;
	
	@Column(name = "GLOBAL_DEMANDE_CODE")
	private int globalDemandeCode;
	
	@Column(name = "DRM_TR_AMOUNT_MIN")
    private long minAmount;
    @Column(name = "DRM_TR_code")
    private String transactionCode;
  
    @Column(name = "DR_TR_AMOUNT_MAX")
    private long maxAmount;

    @Column(name = "DR_AMOUNT_LIMIT", nullable = false)
    private String drAmountLimit;

    @Column(name = "DR_NUMEBR_LIMIT")
    private long drNumberLimit;


    @Column(name = "DR_START_DATE")
    private Date drStartDate;
    @Column(name = "DR_END_DATE")
    private Date drEndDate;


    @Column(name = "DR_CURR_AMOUNT")
    private long drCurrencyAmount;
    @Column(name = "DR_CURR_NUMBER")
    private long drCurrencyNumber;
    private int typePeriodicity;
    
    
	public int getDetailCode() {
		return DetailCode;
	}


	public void setDetailCode(int detailCode) {
		DetailCode = detailCode;
	}


	public int getGlobalDemandeCode() {
		return globalDemandeCode;
	}


	public void setGlobalDemandeCode(int globalDemandeCode) {
		this.globalDemandeCode = globalDemandeCode;
	}


	public long getMinAmount() {
		return minAmount;
	}


	public void setMinAmount(long minAmount) {
		this.minAmount = minAmount;
	}


	public String getTransactionCode() {
		return transactionCode;
	}


	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}


	public long getMaxAmount() {
		return maxAmount;
	}


	public void setMaxAmount(long maxAmount) {
		this.maxAmount = maxAmount;
	}


	public String getDrAmountLimit() {
		return drAmountLimit;
	}


	public void setDrAmountLimit(String drAmountLimit) {
		this.drAmountLimit = drAmountLimit;
	}


	public long getDrNumberLimit() {
		return drNumberLimit;
	}


	public void setDrNumberLimit(long drNumberLimit) {
		this.drNumberLimit = drNumberLimit;
	}


	public Date getDrStartDate() {
		return drStartDate;
	}


	public void setDrStartDate(Date drStartDate) {
		this.drStartDate = drStartDate;
	}


	public Date getDrEndDate() {
		return drEndDate;
	}


	public void setDrEndDate(Date drEndDate) {
		this.drEndDate = drEndDate;
	}


	public long getDrCurrencyAmount() {
		return drCurrencyAmount;
	}


	public void setDrCurrencyAmount(long drCurrencyAmount) {
		this.drCurrencyAmount = drCurrencyAmount;
	}


	public long getDrCurrencyNumber() {
		return drCurrencyNumber;
	}


	public void setDrCurrencyNumber(long drCurrencyNumber) {
		this.drCurrencyNumber = drCurrencyNumber;
	}


	public int getTypePeriodicity() {
		return typePeriodicity;
	}


	public void setTypePeriodicity(int typePeriodicity) {
		this.typePeriodicity = typePeriodicity;
	}


	public DetailRiskManagementDemande( int globalDemandeCode, long minAmount, String transactionCode,
			long maxAmount, String drAmountLimit, long drNumberLimit, Date drStartDate, Date drEndDate,
			long drCurrencyAmount, long drCurrencyNumber, int typePeriodicity) {
		super();		
		this.globalDemandeCode = globalDemandeCode;
		this.minAmount = minAmount;
		this.transactionCode = transactionCode;
		this.maxAmount = maxAmount;
		this.drAmountLimit = drAmountLimit;
		this.drNumberLimit = drNumberLimit;
		this.drStartDate = drStartDate;
		this.drEndDate = drEndDate;
		this.drCurrencyAmount = drCurrencyAmount;
		this.drCurrencyNumber = drCurrencyNumber;
		this.typePeriodicity = typePeriodicity;
	}


	public DetailRiskManagementDemande() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "DetailRiskManagementDemande [DetailCode=" + DetailCode + ", globalDemandeCode=" + globalDemandeCode
				+ ", minAmount=" + minAmount + ", transactionCode=" + transactionCode + ", maxAmount=" + maxAmount
				+ ", drAmountLimit=" + drAmountLimit + ", drNumberLimit=" + drNumberLimit + ", drStartDate="
				+ drStartDate + ", drEndDate=" + drEndDate + ", drCurrencyAmount=" + drCurrencyAmount
				+ ", drCurrencyNumber=" + drCurrencyNumber + ", typePeriodicity=" + typePeriodicity + "]";
	}
	
	
	
	
}

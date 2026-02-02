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
@Table(name = "RISCK_MANAGEMENT_DEMANDE", schema = "PORTEUR")
public class RiskManagementDemande {
	@Id
    @Column(name = "GLOBAL_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "GlobalDemandeSequence")
    @SequenceGenerator(name = "GlobalDemandeSequence", sequenceName = "PORTEUR.GlobalDemandeSequence", allocationSize = 1)
    private int globalId;
	
	
	@Column(name = "DEMANDE_ID")
    private int demandeID;
	
	@Column(name = "GR_TR_AMOUNT_MIN")
    private long minAmount;
    @Column(name = "GR_TR_AMOUNT_MAX")
    private long maxAmount;

    @Column(name = "GR_GL_AMOUNT", nullable = false)
    private String golbalAmount;

    @Column(name = "GR_GL_NUMBER")
    private long globalNumber;
    @Column(name = "GR_CURR_AMOUNT")
    private long glCurrencyAmount;
    @Column(name = "GR_CURR_NUMBER", nullable = false)
    private String glCurrencyNumber;

    @Column(name = "GR_STAR_DATE")
    private Date glStartDate;
    @Column(name = "GR_END_DATE")
    private Date glEndDate;
    @Column(name = "PeriodicityType")
    private int periodicityType;

	
	public int getGlobalId() {
		return globalId;
	}
	public void setGlobalId(int globalId) {
		this.globalId = globalId;
	}
	public int getDemandeID() {
		return demandeID;
	}
	public void setDemandeID(int demandeID) {
		this.demandeID = demandeID;
	}
	public long getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(long minAmount) {
		this.minAmount = minAmount;
	}
	public long getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(long maxAmount) {
		this.maxAmount = maxAmount;
	}
	public String getGolbalAmount() {
		return golbalAmount;
	}
	public void setGolbalAmount(String golbalAmount) {
		this.golbalAmount = golbalAmount;
	}
	public long getGlobalNumber() {
		return globalNumber;
	}
	public void setGlobalNumber(long globalNumber) {
		this.globalNumber = globalNumber;
	}
	public long getGlCurrencyAmount() {
		return glCurrencyAmount;
	}
	public void setGlCurrencyAmount(long glCurrencyAmount) {
		this.glCurrencyAmount = glCurrencyAmount;
	}
	public String getGlCurrencyNumber() {
		return glCurrencyNumber;
	}
	public void setGlCurrencyNumber(String glCurrencyNumber) {
		this.glCurrencyNumber = glCurrencyNumber;
	}
	public Date getGlStartDate() {
		return glStartDate;
	}
	public void setGlStartDate(Date glStartDate) {
		this.glStartDate = glStartDate;
	}
	public Date getGlEndDate() {
		return glEndDate;
	}
	public void setGlEndDate(Date glEndDate) {
		this.glEndDate = glEndDate;
	}
	public int getPeriodicityType() {
		return periodicityType;
	}
	public void setPeriodicityType(int periodicityType) {
		this.periodicityType = periodicityType;
	}
	public RiskManagementDemande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RiskManagementDemande(int demandeID, long minAmount, long maxAmount, String golbalAmount, long globalNumber,
			long glCurrencyAmount, String glCurrencyNumber, Date glStartDate, Date glEndDate, int periodicityType) {
		super();
		this.demandeID = demandeID;
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
		this.golbalAmount = golbalAmount;
		this.globalNumber = globalNumber;
		this.glCurrencyAmount = glCurrencyAmount;
		this.glCurrencyNumber = glCurrencyNumber;
		this.glStartDate = glStartDate;
		this.glEndDate = glEndDate;
		this.periodicityType = periodicityType;

	}
	@Override
	public String toString() {
		return "RiskManagementDemande [globalId=" + globalId + ", demandeID=" + demandeID + ", minAmount=" + minAmount
				+ ", maxAmount=" + maxAmount + ", golbalAmount=" + golbalAmount + ", globalNumber=" + globalNumber
				+ ", glCurrencyAmount=" + glCurrencyAmount + ", glCurrencyNumber=" + glCurrencyNumber + ", glStartDate="
				+ glStartDate + ", glEndDate=" + glEndDate + ", periodicityType=" + periodicityType+ "]";
	}


}

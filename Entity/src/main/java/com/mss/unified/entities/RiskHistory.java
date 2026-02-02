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
@Table(name = "RiskHistory", schema = "PORTEUR")
public class RiskHistory {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "RiskHistorySequence")
    @SequenceGenerator(name = "RiskHistorySequence", sequenceName = "PORTEUR.RiskHistorySequence", allocationSize = 1)

    private int historyCode; 
	private int cardCode;
	private Date operationDate;
	private String editedBy;

	@Column(name = "GR_TR_AMOUNT_MIN")
    private long minAmount;
    @Column(name = "GR_TR_AMOUNT_MAX")
    private long maxAmount;

    @Column(name = "GR_GL_AMOUNT", nullable = false)
    private String golbalAmount;

    @Column(name = "GR_GL_NUMBER")
    private long globalNumber;

    @Column(name = "PeriodicityType")
    private int periodicityType;
	
    private int changeRequestId;

    
    public int getChangeRequestId() {
		return changeRequestId;
	}

	public void setChangeRequestId(int changeRequestId) {
		this.changeRequestId = changeRequestId;
	}

	public int getHistoryCode() {
		return historyCode;
	}

	public void setHistoryCode(int historyCode) {
		this.historyCode = historyCode;
	}

	public int getCardCode() {
		return cardCode;
	}

	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}
	
	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
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

	public int getPeriodicityType() {
		return periodicityType;
	}

	public void setPeriodicityType(int periodicityType) {
		this.periodicityType = periodicityType;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}
	
}

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
@Table(name = "Opening_Day_Summary", schema = "FRANSABANK")
public class OpeningDaySummary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int summaryCode;
	private String fileDate;
	private Date treatmentDate;
	   @Column(length = 1)
	private Integer currentOrder;
	   @Column(length = 1)
	private Integer closed;
	private Date closeDate;
	

	public Integer getClosed() {
		return closed;
	}

	public void setClosed(Integer closed) {
		this.closed = closed;
	}

	public Date getCloseDate() {
		return closeDate;
	}

	public void setCloseDate(Date closeDate) {
		this.closeDate = closeDate;
	}

	public int getSummaryCode() {
		return summaryCode;
	}

	public void setSummaryCode(int summaryCode) {
		this.summaryCode = summaryCode;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public Date getTreatmentDate() {
		return treatmentDate;
	}

	public void setTreatmentDate(Date treatmentDate) {
		this.treatmentDate = treatmentDate;
	}

	public Integer getCurrentOrder() {
		return currentOrder;
	}

	public void setCurrentOrder(Integer currentOrder) {
		this.currentOrder = currentOrder;
	}

}

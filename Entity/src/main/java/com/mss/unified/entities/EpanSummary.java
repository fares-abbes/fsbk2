package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "EPAN_SUMMARY",schema = "PORTEUR")
public class EpanSummary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EPAN_SUMMARYSequence")
    @SequenceGenerator(name = "EPAN_SUMMARYSequence", sequenceName = "PORTEUR.EPAN_SUMMARYSequence", allocationSize = 1)
	private int summaryId;
	
	private String insertDate;
	private Date insertDateTime;
	private int cardsNumber;
	private String fileName;
	
	
	
	public int getSummaryId() {
		return summaryId;
	}
	public void setSummaryId(int summaryId) {
		this.summaryId = summaryId;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public Date getInsertDateTime() {
		return insertDateTime;
	}
	public void setInsertDateTime(Date insertDateTime) {
		this.insertDateTime = insertDateTime;
	}
	public int getCardsNumber() {
		return cardsNumber;
	}
	public void setCardsNumber(int cardsNumber) {
		this.cardsNumber = cardsNumber;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}

package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "BESummary",schema = "PORTEUR")
public class BESummary {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "BESummarySequence")
    @SequenceGenerator(name = "BESummarySequence", sequenceName = "PORTEUR.BESummarySequence", allocationSize = 1)
	private int summaryId;
	
	private String generationDate;
	private Date generationDateTime;
	private int sequence;
	private int cardsNumber;
	private String fileName;
	
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public int getCardsNumber() {
		return cardsNumber;
	}
	public void setCardsNumber(int cardsNumber) {
		this.cardsNumber = cardsNumber;
	}
	public Date getGenerationDateTime() {
		return generationDateTime;
	}
	public void setGenerationDateTime(Date generationDateTime) {
		this.generationDateTime = generationDateTime;
	}
	public int getSummaryId() {
		return summaryId;
	}
	public void setSummaryId(int summaryId) {
		this.summaryId = summaryId;
	}
	public String getGenerationDate() {
		return generationDate;
	}
	public void setGenerationDate(String generationDate) {
		this.generationDate = generationDate;
	}

	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

}

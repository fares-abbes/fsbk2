package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "EMBOSSING_SUMMARY",schema = "PORTEUR")
public class EmbossingSummary {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EMBOSSING_SUMMARYSequence")
    @SequenceGenerator(name = "EMBOSSING_SUMMARYSequence", sequenceName = "PORTEUR.EMBOSSING_SUMMARYSequence", allocationSize = 1)
	private int summaryId;
	
	private String fileKey;
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
	public String getFileKey() {
		return fileKey;
	}
	public void setFileKey(String fileKey) {
		this.fileKey = fileKey;
	}
	
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

}

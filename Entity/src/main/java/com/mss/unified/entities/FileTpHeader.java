package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FILE_TP_HEADER",schema = "ATM")
public class FileTpHeader {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "FILETPHEADERSequence")
    @SequenceGenerator(name = "FILETPHEADERSequence", sequenceName = "FILETPHEADERSequence", allocationSize = 1)
	
	@Column(name = "Id", nullable = false)
	private int Id;
	
	@Column(name = "FILE_NAME")   
	private String fileName;    
	
	@Column(name = "FILE_DATE")    
	private String fileDate;    
	
	@Column(name = "FILE_ProcessingDATE")    
	private String fileprocessingDate;    
	
	@Column(name = "DESTINATION_BANK")    
	private String destinationBankIdentification;

	public FileTpHeader() {
		
	}
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileprocessingDate() {
		return fileprocessingDate;
	}

	public void setFileprocessingDate(String fileprocessingDate) {
		this.fileprocessingDate = fileprocessingDate;
	}

	public String getDestinationBankIdentification() {
		return destinationBankIdentification;
	}

	public void setDestinationBankIdentification(String destinationBankIdentification) {
		this.destinationBankIdentification = destinationBankIdentification;
	}
	
	
}

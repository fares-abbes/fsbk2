package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "TP_SUMMARY_M", schema = "FRANSABANK")
public class FileHeaderM {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false)
	private int id;
	@Column(name = "FILE_NAME")
	private String fileName;

	@Column(name = "FILE_DATE")
	private String fileDate;

	@Column(name = "FILE_ProcessingDATE")
	private String fileprocessingDate;
	private String statusFile;
	@Column(name = "DESTINATION_BANK") 
	private String destinationBankIdentification;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getStatusFile() {
		return statusFile;
	}

	public void setStatusFile(String statusFile) {
		this.statusFile = statusFile;
	}
}

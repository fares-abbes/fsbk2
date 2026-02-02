package com.mss.unified.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "Tp_Summary",schema = "FRANSABANK")
public class FileProcessed {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id;

    @Column(name = "FILE_DATE")
    private String fileDate;

    @Column(name = "FILE_NAME")
    private String fileName;

    @Column(name = "FILE_PROCESSINGDATE")
    private String fileProcessingDate;

    @Column(name = "DESTINATION_BANK")
    private String destinationBank;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFileDate() {
		return fileDate;
	}

	public void setFileDate(String fileDate) {
		this.fileDate = fileDate;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileProcessingDate() {
		return fileProcessingDate;
	}

	public void setFileProcessingDate(String fileProcessingDate) {
		this.fileProcessingDate = fileProcessingDate;
	}

	public String getDestinationBank() {
		return destinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}


   
}

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
@Table(schema = "PORTEUR", name = "Batch_Porteur_International")
public class BatchPorteurInternational {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "BatchPorteurInternationalSequence")
	@SequenceGenerator(name = "BatchPorteurInternationalSequence", sequenceName = "PORTEUR.BatchPorteurInternationalSequence", allocationSize = 1)
	@Column(name = "BATCH_ID", nullable = false)
	private int batchId;
	@Column(name = "BATCH_NAME")

	public String batchName;
	@Column(name = "BATCH_LIBELLE")
	private String batchLibelle;
	@Column(name = "BATCH_FUNCTION")
	private String batchFunction;
	@Column(name = "FILE_NAME")
	public String fileName;
	 @Column(name = "BATCH_end_date")
	    private Date batchEndDate;
	    

	@Column(name = "BATCH_STATUS")
	private Integer batchStatus;
	@Column(name = "BATCH_DATE")
	public Date batchDate;

	
	@Column(name = "KEYS")
	private String keys;
	
	@Column(name = "ERROR_MSG")
	private String error;
	
    @Column(name = "ERROR_STACK_TRACE",length = 4000)
	private String errorStackTrace;
	
	
	
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorStackTrace() {
		return errorStackTrace;
	}
	public void setErrorStackTrace(String errorStackTrace) {
		this.errorStackTrace = errorStackTrace;
	}
	
	public String getKeys() {
		return keys;
	}
	public void setKeys(String keys) {
		this.keys = keys;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchLibelle() {
		return batchLibelle;
	}
	public void setBatchLibelle(String batchLibelle) {
		this.batchLibelle = batchLibelle;
	}
	public String getBatchFunction() {
		return batchFunction;
	}
	public void setBatchFunction(String batchFunction) {
		this.batchFunction = batchFunction;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(Integer batchStatus) {
		this.batchStatus = batchStatus;
	}
	public Date getBatchDate() {
		return batchDate;
	}
	public void setBatchDate(Date batchDate) {
		this.batchDate = batchDate;
	}
	public Date getBatchEndDate() {
		return batchEndDate;
	}
	public void setBatchEndDate(Date batchEndDate) {
		this.batchEndDate = batchEndDate;
	}
	
	
}

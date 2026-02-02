package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "BATCHESFC", schema = "FRANSABANK")

public class BatchesFC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newBatchesFCSSequence")
	@SequenceGenerator(name = "newBatchesFCSSequence", sequenceName = "FRANSABANK.BatchesFCSSequencens", allocationSize = 1)
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

	@Column(name = "FILE_LOCATION")
	private String fileLocation;
	@Column(name = "BATCH_STATUS")
	private Integer batchStatus;
	@Column(name = "BATCH_DATE")

	public Date batchDate;
	@Column(name = "BATCH_NUMBER")
	private Integer batchNumber;
	@Column(name = "BATCH_LAST_EXECUTION")
	private Date batchLastExcution;
	@Column(name = "BATCH_end_date")
	private Date batchEndDate;

	@Column(name = "KEYFC")
	private String key;
	@Column(name = "ERROR")
	private String error;

	@Column(name = "ERROR_STACK_TRACE", length = 4000)
	private String errorStackTrace;
	@Column(name = "BATCH_TYPE_FB")
	private String batchType;
	private String dateReg ;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
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

	public String getFileLocation() {
		return fileLocation;
	}

	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
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

	public Integer getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(Integer batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Date getBatchLastExcution() {
		return batchLastExcution;
	}

	public void setBatchLastExcution(Date batchLastExcution) {
		this.batchLastExcution = batchLastExcution;
	}

	public Date getBatchEndDate() {
		return batchEndDate;
	}

	public void setBatchEndDate(Date batchEndDate) {
		this.batchEndDate = batchEndDate;
	}

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

	public String getBatchType() {
		return batchType;
	}

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}

	public String getDateReg() {
		return dateReg;
	}

	public void setDateReg(String dateReg) {
		this.dateReg = dateReg;
	}

	@Override
	public String toString() {
		return "BatchesFC [batchId=" + batchId + ", batchName=" + batchName + ", batchLibelle=" + batchLibelle
				+ ", batchFunction=" + batchFunction + ", fileName=" + fileName + ", fileLocation=" + fileLocation
				+ ", batchStatus=" + batchStatus + ", batchDate=" + batchDate + ", batchNumber=" + batchNumber
				+ ", batchLastExcution=" + batchLastExcution + ", batchEndDate=" + batchEndDate + ", key=" + key
				+ ", error=" + error + ", errorStackTrace=" + errorStackTrace + ", batchType=" + batchType
				+ ", dateReg=" + dateReg + "]";
	}
}

package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CroControl", schema = "FRANSABANK")
public class CroControl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "CroControlSequence")
    @SequenceGenerator(name = "CroControlSequence", sequenceName = "CroControlSequence", allocationSize = 1)
    private int id;
	private String fileName;
	private Date processingDate;
	private String dateReg;
	
	private String typeCro;
	
	private long sumFromFile;
	private long nbTotalFromFile;
	
	
	private long sumValidated;
	private long nbTotalValidated;

	private long sumRejected;
	private long nbTotalRejected;
	
	
	private long sumExtra;
	private long nbTotalExtra;
	
	
	
	public String getTypeCro() {
		return typeCro;
	}
	public void setTypeCro(String typeCro) {
		this.typeCro = typeCro;
	}
	public String getDateReg() {
		return dateReg;
	}
	public void setDateReg(String dateReg) {
		this.dateReg = dateReg;
	}
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
	public Date getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(Date processingDate) {
		this.processingDate = processingDate;
	}
	public long getSumFromFile() {
		return sumFromFile;
	}
	public void setSumFromFile(long sumFromFile) {
		this.sumFromFile = sumFromFile;
	}
	public long getNbTotalFromFile() {
		return nbTotalFromFile;
	}
	public void setNbTotalFromFile(long nbTotalFromFile) {
		this.nbTotalFromFile = nbTotalFromFile;
	}
	public long getSumValidated() {
		return sumValidated;
	}
	public void setSumValidated(long sumValidated) {
		this.sumValidated = sumValidated;
	}
	public long getNbTotalValidated() {
		return nbTotalValidated;
	}
	public void setNbTotalValidated(long nbTotalValidated) {
		this.nbTotalValidated = nbTotalValidated;
	}
	public long getSumRejected() {
		return sumRejected;
	}
	public void setSumRejected(long sumRejected) {
		this.sumRejected = sumRejected;
	}
	public long getNbTotalRejected() {
		return nbTotalRejected;
	}
	public void setNbTotalRejected(long nbTotalRejected) {
		this.nbTotalRejected = nbTotalRejected;
	}
	public long getSumExtra() {
		return sumExtra;
	}
	public void setSumExtra(long sumExtra) {
		this.sumExtra = sumExtra;
	}
	public long getNbTotalExtra() {
		return nbTotalExtra;
	}
	public void setNbTotalExtra(long nbTotalExtra) {
		this.nbTotalExtra = nbTotalExtra;
	}
	@Override
	public String toString() {
		return "CroControl [id=" + id + ", fileName=" + fileName + ", processingDate=" + processingDate + ", dateReg="
				+ dateReg + ", typeCro=" + typeCro + ", sumFromFile=" + sumFromFile + ", nbTotalFromFile="
				+ nbTotalFromFile + ", sumValidated=" + sumValidated + ", nbTotalValidated=" + nbTotalValidated
				+ ", sumRejected=" + sumRejected + ", nbTotalRejected=" + nbTotalRejected + ", sumExtra=" + sumExtra
				+ ", nbTotalExtra=" + nbTotalExtra + "]";
	}
	
	
}

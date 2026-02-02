package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CraControl", schema = "FRANSABANK")
public class CraControl {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "CraControlSequence")
    @SequenceGenerator(name = "CraControlSequence", sequenceName = "CraControlSequence", allocationSize = 1)
    private int id;
	private String lotFileName;
	private String lotType;
	private String processingDate;
	
	private long sumInFile;
	private long nbTotalInFile;
	
	private long nbAccepted;
	private long sumAccepted;
	
	
	private long nbNotAccepted;
	private long sumNotAccepted;
	

	 
	
	public CraControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CraControl(String lotFileName, String lotType, String processingDate, long sumInFile,
			long nbTotalInFile) {
	
		this.lotFileName = lotFileName;
		this.lotType = lotType;
		this.processingDate = processingDate;
		this.sumInFile = sumInFile;
		this.nbTotalInFile = nbTotalInFile;
		this.nbAccepted = 0;
		this.sumAccepted = 0;
		this.nbNotAccepted = 0;
		this.sumNotAccepted = 0;
	}
	
	public long getNbAccepted() {
		return nbAccepted;
	}
	public void setNbAccepted(long nbAccepted) {
		this.nbAccepted = nbAccepted;
	}
	public long getSumAccepted() {
		return sumAccepted;
	}
	public void setSumAccepted(long sumAccepted) {
		this.sumAccepted = sumAccepted;
	}
	public long getNbNotAccepted() {
		return nbNotAccepted;
	}
	public void setNbNotAccepted(long nbNotAccepted) {
		this.nbNotAccepted = nbNotAccepted;
	}
	public long getSumNotAccepted() {
		return sumNotAccepted;
	}
	public void setSumNotAccepted(long sumNotAccepted) {
		this.sumNotAccepted = sumNotAccepted;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	public long getSumInFile() {
		return sumInFile;
	}
	public void setSumInFile(long sumInFile) {
		this.sumInFile = sumInFile;
	}
	public long getNbTotalInFile() {
		return nbTotalInFile;
	}
	public void setNbTotalInFile(long nbTotalInFile) {
		this.nbTotalInFile = nbTotalInFile;
	}
	public String getLotFileName() {
		return lotFileName;
	}
	public void setLotFileName(String lotFileName) {
		this.lotFileName = lotFileName;
	}
	public String getLotType() {
		return lotType;
	}
	public void setLotType(String lotType) {
		this.lotType = lotType;
	}
	
	
	
}

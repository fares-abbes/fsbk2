package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CroRejetControl", schema = "FRANSABANK")
public class CroRejetControl {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "CroRejetControlSequence")
    @SequenceGenerator(name = "CroRejetControlSequence", sequenceName = "CroRejetControlSequence", allocationSize = 1)
    private int id;
	private String fileName;
	private Date processingDate;
	//private String dateReg;
	
	private String typeCro;
	
	//private long sumFromFile;
	private long nbTotalFromFile;
	
	
	//private long sumValidated;
	private long nbTotalValidated;

//	private long sumRejected;
//	private long nbTotalRejected;
//	
//	
//	private long sumExtra;
//	private long nbTotalExtra;
//	
	
	
	public String getTypeCro() {
		return typeCro;
	}
	public void setTypeCro(String typeCro) {
		this.typeCro = typeCro;
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
	
	public long getNbTotalFromFile() {
		return nbTotalFromFile;
	}
	public void setNbTotalFromFile(long nbTotalFromFile) {
		this.nbTotalFromFile = nbTotalFromFile;
	}

	public long getNbTotalValidated() {
		return nbTotalValidated;
	}
	public void setNbTotalValidated(long nbTotalValidated) {
		this.nbTotalValidated = nbTotalValidated;
	}
	@Override
	public String toString() {
		return "CroRejetControl [fileName=" + fileName + ", processingDate=" + processingDate + ", typeCro=" + typeCro
				+ ", nbTotalFromFile=" + nbTotalFromFile + ", nbTotalValidated=" + nbTotalValidated + "]";
	}


}

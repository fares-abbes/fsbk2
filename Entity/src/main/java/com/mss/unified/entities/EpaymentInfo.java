package com.mss.unified.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EpaymentInfo", schema = "PORTEUR")
public class EpaymentInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EpaymentInfoCodeSequence")
    @SequenceGenerator(name = "EpaymentInfoCodeSequence", sequenceName = "PORTEUR.EpaymentInfoCodeSequence", allocationSize = 1)
	private int epaymentInfoCode;
	
	private int cardCode;

	private String cardNum;
	
	private Date creationDate;

	private Date modifDate;
	
	private String numContrat;
	
	private String status;
	
	//0 for done // 1 to be sent
	private int statusFile;
	
	private String lastFileBE;
	
	
	private String phoneNumber;
	
	private String yearInYy;
	
	private int sequenceNumber;
	private String branch;
	
	private String editedBy;
	
	
	
	
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	public int getEpaymentInfoCode() {
		return epaymentInfoCode;
	}
	public void setEpaymentInfoCode(int epaymentInfoCode) {
		this.epaymentInfoCode = epaymentInfoCode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getYearInYy() {
		return yearInYy;
	}
	public void setYearInYy(String yearInYy) {
		this.yearInYy = yearInYy;
	}
	public int getSequenceNumber() {
		return sequenceNumber;
	}
	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}
	public int getStatusFile() {
		return statusFile;
	}
	public void setStatusFile(int statusFile) {
		this.statusFile = statusFile;
	}

	public String getLastFileBE() {
		return lastFileBE;
	}
	public void setLastFileBE(String lastFileBE) {
		this.lastFileBE = lastFileBE;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public int getCardCode() {
		return cardCode;
	}
	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}
	public String getCardNum() {
		return cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Date getModifDate() {
		return modifDate;
	}
	public void setModifDate(Date modifDate) {
		this.modifDate = modifDate;
	}
	public String getNumContrat() {
		return numContrat;
	}
	public void setNumContrat(String numContrat) {
		this.numContrat = numContrat;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EpaymentInfo [epaymentInfoCode=" + epaymentInfoCode + ", cardCode=" + cardCode 
				+ ", creationDate=" + creationDate + ", modifDate=" + modifDate + ", numContrat=" + numContrat
				+ ", status=" + status + ", statusFile=" + statusFile + ", lastFileBE=" + lastFileBE + ", phoneNumber="
				+ phoneNumber + ", yearInYy=" + yearInYy + ", sequenceNumber=" + sequenceNumber + "]";
	}

	
}

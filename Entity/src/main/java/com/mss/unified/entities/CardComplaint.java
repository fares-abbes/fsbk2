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
@Table(name = "CardComplaint", schema = "PORTEUR")
public class CardComplaint {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CardComplaintSequence")
	@SequenceGenerator(name = "CardComplaintSequence", sequenceName = "PORTEUR.CardComplaintSequence", allocationSize = 1)
	private int CardComplaintCode;

	@Column(name = "CARD_CODE")
	private int cardCode;
	
	private String incident;
	private String comment;
	private Date complaintDate;
	private String addedBy;
	private String boComment;
	private int status;
	private Date responseDate;
	private String branch;
	private String pan;
	
	
	
	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Date getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(Date responseDate) {
		this.responseDate = responseDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getBoComment() {
		return boComment;
	}

	public void setBoComment(String boComment) {
		this.boComment = boComment;
	}

	public int getCardCode() {
		return cardCode;
	}

	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}

	public int getCardComplaintCode() {
		return CardComplaintCode;
	}

	public void setCardComplaintCode(int cardComplaintCode) {
		CardComplaintCode = cardComplaintCode;
	}

	public String getIncident() {
		return incident;
	}

	public void setIncident(String incident) {
		this.incident = incident;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getComplaintDate() {
		return complaintDate;
	}

	public void setComplaintDate(Date complaintDate) {
		this.complaintDate = complaintDate;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

}

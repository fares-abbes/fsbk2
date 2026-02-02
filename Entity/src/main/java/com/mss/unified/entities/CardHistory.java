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
@Table(name = "CARD_HISTORY", schema = "PORTEUR")
public class CardHistory {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CardHistorySequence")
	@SequenceGenerator(name = "CardHistorySequence", sequenceName = "PORTEUR.CardHistorySequence", allocationSize = 1)
	@Column(name = "CARD_HISTORY_CODE", nullable = false)
	private int cardHistoryCode;

	@Column(name = "CARD_CODE")
	private int cardCode;
	

	@Column(name = "OPERATION")
	private String operation;
	
	
	@Column(name = "OPERATION_DATE")
	private Date operation_date;
	
	@Column(name = "EDITED_BY")
	private String editedBy;

	@Column(name = "BLOCKED_BY")
	private String blockedBy;
	
	
	
	
	public String getBlockedBy() {
		return blockedBy;
	}


	public void setBlockedBy(String blockedBy) {
		this.blockedBy = blockedBy;
	}


	public String getEditedBy() {
		return editedBy;
	}


	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}


	public int getCardHistoryCode() {
		return cardHistoryCode;
	}


	public void setCardHistoryCode(int cardHistoryCode) {
		this.cardHistoryCode = cardHistoryCode;
	}


	public int getCardCode() {
		return cardCode;
	}


	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}


	public String getOperation() {
		return operation;
	}


	public void setOperation(String operation) {
		this.operation = operation;
	}


	public Date getOperation_date() {
		return operation_date;
	}


	public void setOperation_date(Date operation_date) {
		this.operation_date = operation_date;
	}
	
}

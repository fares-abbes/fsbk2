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
@Table( schema = "PORTEUR")
public class UnpersonalizedCard {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "UnpersonalizedCardSequence")
	@SequenceGenerator(name = "UnpersonalizedCardSequence", sequenceName = "PORTEUR.UnpersonalizedCardSequence")

	private int unpersonalizedCardCode;
	private String cardNumber;
	private Date fileDate;
	public int getUnpersonalizedCardCode() {
		return unpersonalizedCardCode;
	}
	public void setUnpersonalizedCardCode(int unpersonalizedCardCode) {
		this.unpersonalizedCardCode = unpersonalizedCardCode;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public Date getFileDate() {
		return fileDate;
	}
	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	
}

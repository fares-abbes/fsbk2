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
@Table(name = "Card_Holder_Info", schema = "PORTEUR")
public class CardHolderInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CardHolderInfoSequence")
	@SequenceGenerator(name = "CardHolderInfoSequence", sequenceName = "PORTEUR.CardHolderInfoSequence",allocationSize = 1)
	private int CardHolderInfoCode;

	private String pan;
	private String phoneNumber;
	private String firstName;
	private String lastName;
	private String expiry;
	private String action;
	
	private int statusGeneration;
	private String branch;
	private Date creationDate;
	private Date modifDate;
	
	
	public Date getModifDate() {
		return modifDate;
	}
	public void setModifDate(Date modifDate) {
		this.modifDate = modifDate;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getStatusGeneration() {
		return statusGeneration;
	}
	public void setStatusGeneration(int statusGeneration) {
		this.statusGeneration = statusGeneration;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getExpiry() {
		return expiry;
	}
	public void setExpiry(String expiry) {
		this.expiry = expiry;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getCardHolderInfoCode() {
		return CardHolderInfoCode;
	}
	public void setCardHolderInfoCode(int cardHolderInfoCode) {
		CardHolderInfoCode = cardHolderInfoCode;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CardHolderInfo [CardHolderInfoCode=" + CardHolderInfoCode + ", pan=" + pan + ", phoneNumber="
				+ phoneNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", expiry=" + expiry
				+ ", action=" + action + ", statusGeneration=" + statusGeneration + ", branch=" + branch
				+ ", creationDate=" + creationDate + ", modifDate=" + modifDate + "]";
	}
	
	
}

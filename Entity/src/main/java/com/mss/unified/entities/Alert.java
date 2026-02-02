package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Alert", schema = "PORTEUR")
public class Alert {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "AlertSequence")
	@SequenceGenerator(name = "AlertSequence", sequenceName = "PORTEUR.AlertSequence",allocationSize = 1)
	private int alertCode;
	private String name;
	private String phoneNumber;
	private String mailAddress;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAlertCode() {
		return alertCode;
	}
	public void setAlertCode(int alertCode) {
		this.alertCode = alertCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	
}

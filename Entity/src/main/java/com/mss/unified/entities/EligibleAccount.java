package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "PORTEUR", name = "EligibleAccount")
public class EligibleAccount {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EligibleAccountSequence")
    @SequenceGenerator(name = "EligibleAccountSequence", sequenceName = "PORTEUR.EligibleAccountSequence", allocationSize = 1)
	private int eligibleAccountCode;
	@Column(name = "chapter", unique = true)
	private String chapter;
	private String label;
	private String type;
	
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getEligibleAccountCode() {
		return eligibleAccountCode;
	}
	public void setEligibleAccountCode(int eligibleAccountCode) {
		this.eligibleAccountCode = eligibleAccountCode;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	
	
	

}

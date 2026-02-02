package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "POS", name = "EligiblePos")
public class EligiblePos {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EligiblePosSeq")
    @SequenceGenerator(name = "EligiblePosSeq", sequenceName = "POS.EligiblePosSeq", allocationSize = 1)
	@Column(name = "eligiblePosCode", nullable = false)
	private int eligiblePosCode;
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
	public int getEligiblePosCode() {
		return eligiblePosCode;
	}
	public void setEligiblePosCode(int eligiblePosCode) {
		this.eligiblePosCode = eligiblePosCode;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	@Override
	public String toString() {
		return "EligiblePos [eligiblePosCode=" + eligiblePosCode + ", chapter=" + chapter + ", label=" + label + "]";
	}
	
	
}

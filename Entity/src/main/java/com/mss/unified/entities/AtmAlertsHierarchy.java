package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Atm_Alerts_Hierarchy", schema = "ATM")
public class AtmAlertsHierarchy {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "atmAlertsHierarchySequence")
	  @SequenceGenerator(name = "atmAlertsHierarchySequence", sequenceName = "ATM.atmAlertsHierarchySequence")
	  private int atmAlertsHierarchyCode;
	  
	  private String groupLabel;
	  private int levelNum;
	  private String destination;
	  private String alertTime;
	  private int immediateFlag;
	
	
	
	public int getImmediateFlag() {
		return immediateFlag;
	}
	public void setImmediateFlag(int immediateFlag) {
		this.immediateFlag = immediateFlag;
	}
	public int getAtmAlertsHierarchyCode() {
		return atmAlertsHierarchyCode;
	}
	public void setAtmAlertsHierarchyCode(int atmAlertsHierarchyCode) {
		this.atmAlertsHierarchyCode = atmAlertsHierarchyCode;
	}

	public String getGroupLabel() {
		return groupLabel;
	}
	public void setGroupLabel(String groupLabel) {
		this.groupLabel = groupLabel;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getLevelNum() {
		return levelNum;
	}
	public void setLevelNum(int levelNum) {
		this.levelNum = levelNum;
	}
	public String getAlertTime() {
		return alertTime;
	}
	public void setAlertTime(String alertTime) {
		this.alertTime = alertTime;
	}
	@Override
	public String toString() {
		return "AtmAlertsHierarchy [atmAlertsHierarchyCode=" + atmAlertsHierarchyCode + ", groupLabel=" + groupLabel
				+ ", levelNum=" + levelNum + ", destination=" + destination + ", alertTime=" + alertTime + "]";
	}

	
  
}

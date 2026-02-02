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
@Table(schema = "SWITCH")
public class ActionOnSatim {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "ActionOnSatimSequence")
	@SequenceGenerator(name = "ActionOnSatimSequence", sequenceName = "SWITCH.ActionOnSatimSequence", allocationSize = 1)
	private int actionId;
	
	private String action;

	private Date actionEndDate;
	
	
	private Integer actionStatus;
	
	private Date actionDate;
	
	@Column(name = "KEYS")
	private String keys;
	
	@Column(name = "ERROR_MSG")
	private String error;
	
    @Column(name = "ERROR_STACK_TRACE",length = 4000)
	private String errorStackTrace;
	
	
	
	public int getActionId() {
		return actionId;
	}
	public void setActionId(int actionId) {
		this.actionId = actionId;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public Date getActionEndDate() {
		return actionEndDate;
	}
	public void setActionEndDate(Date actionEndDate) {
		this.actionEndDate = actionEndDate;
	}
	public Integer getActionStatus() {
		return actionStatus;
	}
	public void setActionStatus(Integer actionStatus) {
		this.actionStatus = actionStatus;
	}

	public Date getActionDate() {
		return actionDate;
	}
	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrorStackTrace() {
		return errorStackTrace;
	}
	public void setErrorStackTrace(String errorStackTrace) {
		this.errorStackTrace = errorStackTrace;
	}
	
	public String getKeys() {
		return keys;
	}
	public void setKeys(String keys) {
		this.keys = keys;
	}

	
}

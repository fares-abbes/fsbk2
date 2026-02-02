package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TransactionCodeVisa", schema = "FRANSABANK")
public class TransactionCodeVisa {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TransactionCodeVisaSeq")
	@SequenceGenerator(name = "TransactionCodeVisaSeq", sequenceName = "FRANSABANK.TransactionCodeVisaSeq", allocationSize = 1)
	private Integer code;
	
	private String transactionCode;
	private String type;
	private String inOut;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getTransactionCode() {
		return transactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInOut() {
		return inOut;
	}
	public void setInOut(String inOut) {
		this.inOut = inOut;
	}
	@Override
	public String toString() {
		return "TransactionCodeVisa [code=" + code + ", transactionCode=" + transactionCode + ", type=" + type
				+ ", inOut=" + inOut + "]";
	}
	
	
}

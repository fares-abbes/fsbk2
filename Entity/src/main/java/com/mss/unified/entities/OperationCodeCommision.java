package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "settelement_operation_code_international", schema = "FRANSABANK")
public class OperationCodeCommision {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  
	  @Column(name = "code", nullable = false)
	private int code;
	@Column(name = "type_operation")
	private String type;
	@Column(name = "identification")
	private String identification;
	
	@Column(name = "debit_acount")
	@JsonProperty("debit_account")
	private String debitAccount;
	
	@Column(name = "credit_account")
	@JsonProperty("credit_account")
	private String creditAccount;
	
	
	
	public String getDebitAccount() {
		return debitAccount;
	}
	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}
	public String getCreditAccount() {
		return creditAccount;
	}
	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}

	

}

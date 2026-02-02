package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name = "NATIONAL_ACQUIRER_FIID",schema="SWITCH")
public class NationalAcquirerFiid {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator = "NationalAcquirerFiidSequence")
	@SequenceGenerator(name = "NationalAcquirerFiidSequence", sequenceName = "SWITCH.NationalAcquirerFiidSequence",initialValue = 1)
	@Column(name = "FIID_CODE", nullable = false)
	private int fiidCode;
	
	@JsonProperty("bin")
	String bin;
	
	@JsonProperty("bankCode")
	String bankCode;

	public int getFiidCode() {
		return fiidCode;
	}

	public void setFiidCode(int fiidCode) {
		this.fiidCode = fiidCode;
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	
	

}

package com.mss.unified.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "DayOperationFeesCardSequence", schema = "FRANSABANK")
public class DayOperationFeesCardSequence {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newDayOperationFeesCardSequenceSeq")
	@SequenceGenerator(name = "newDayOperationFeesCardSequenceSeq", sequenceName = "FRANSABANK.DayOperationFeesCardSequenceSeqns", allocationSize = 1)
	private int code;
	private int  sequence;
	private String  keys;

	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getSequence() {
		return sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	
	
}

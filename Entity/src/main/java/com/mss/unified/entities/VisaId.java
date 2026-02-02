package com.mss.unified.entities;

import java.io.Serializable;

public class VisaId implements Serializable {
	private Integer code;
	private String compensationDate;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCompensationDate() {
		return compensationDate;
	}
	public void setCompensationDate(String compensationDate) {
		this.compensationDate = compensationDate;
	}
	public VisaId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

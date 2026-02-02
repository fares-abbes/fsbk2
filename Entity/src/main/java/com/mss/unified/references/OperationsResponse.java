package com.mss.unified.references;

import java.util.Date;

public class OperationsResponse {

	private String switchPan;
	private Date switchRequestDate;
	private String switchAccountId1;
	private String switchProcessingCode;
	private String switchAcceptorAcceptorName;
	private String switchAuthNumber;
	private String switchDE107;

	public OperationsResponse(String switchPan, Date switchRequestDate, String switchAccountId1,
			String switchProcessingCode, String switchAcceptorAcceptorName, String switchAuthNumber,
			String switchDE107) {
		super();
		this.switchPan = switchPan;
		this.switchRequestDate = switchRequestDate;
		this.switchAccountId1 = switchAccountId1;
		this.switchProcessingCode = switchProcessingCode;
		this.switchAcceptorAcceptorName = switchAcceptorAcceptorName;
		this.switchAuthNumber = switchAuthNumber;
		this.switchDE107 = switchDE107;
	}

	public String getSwitchPan() {
		return switchPan;
	}

	public void setSwitchPan(String switchPan) {
		this.switchPan = switchPan;
	}

	public Date getSwitchRequestDate() {
		return switchRequestDate;
	}

	public void setSwitchRequestDate(Date switchRequestDate) {
		this.switchRequestDate = switchRequestDate;
	}

	public String getSwitchAccountId1() {
		return switchAccountId1;
	}

	public void setSwitchAccountId1(String switchAccountId1) {
		this.switchAccountId1 = switchAccountId1;
	}

	public String getSwitchProcessingCode() {
		return switchProcessingCode;
	}

	public void setSwitchProcessingCode(String switchProcessingCode) {
		this.switchProcessingCode = switchProcessingCode;
	}

	public String getSwitchAcceptorAcceptorName() {
		return switchAcceptorAcceptorName;
	}

	public void setSwitchAcceptorAcceptorName(String switchAcceptorAcceptorName) {
		this.switchAcceptorAcceptorName = switchAcceptorAcceptorName;
	}

	public String getSwitchAuthNumber() {
		return switchAuthNumber;
	}

	public void setSwitchAuthNumber(String switchAuthNumber) {
		this.switchAuthNumber = switchAuthNumber;
	}

	public String getSwitchDE107() {
		return switchDE107;
	}

	public void setSwitchDE107(String switchDE107) {
		this.switchDE107 = switchDE107;
	}

}

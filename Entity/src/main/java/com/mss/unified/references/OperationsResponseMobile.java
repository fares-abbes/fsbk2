package com.mss.unified.references;

import java.util.Date;

public class OperationsResponseMobile {

	private Date switchRequestDate;
	private String switchPan;
	private String switchDE107;
	private String switchProcessingCode;
	private String switchAcceptorTerminalId;
	private String switchAmountTransaction;
	private String switchAccountId1;

	public OperationsResponseMobile(Date switchRequestDate, String switchPan, String switchDE107,
			String switchProcessingCode, String switchAcceptorTerminalId, String switchAmountTransaction,
			String switchAccountId1) {
		super();
		this.switchRequestDate = switchRequestDate;
		this.switchPan = switchPan;
		this.switchDE107 = switchDE107;
		this.switchProcessingCode = switchProcessingCode;
		this.switchAcceptorTerminalId = switchAcceptorTerminalId;
		this.switchAmountTransaction = switchAmountTransaction;
		this.switchAccountId1 = switchAccountId1;
	}

	public Date getSwitchRequestDate() {
		return switchRequestDate;
	}

	public void setSwitchRequestDate(Date switchRequestDate) {
		this.switchRequestDate = switchRequestDate;
	}

	public String getSwitchPan() {
		return switchPan;
	}

	public void setSwitchPan(String switchPan) {
		this.switchPan = switchPan;
	}

	public String getSwitchDE107() {
		return switchDE107;
	}

	public void setSwitchDE107(String switchDE107) {
		this.switchDE107 = switchDE107;
	}

	public String getSwitchProcessingCode() {
		return switchProcessingCode;
	}

	public void setSwitchProcessingCode(String switchProcessingCode) {
		this.switchProcessingCode = switchProcessingCode;
	}

	public String getSwitchAcceptorTerminalId() {
		return switchAcceptorTerminalId;
	}

	public void setSwitchAcceptorTerminalId(String switchAcceptorTerminalId) {
		this.switchAcceptorTerminalId = switchAcceptorTerminalId;
	}

	public String getSwitchAmountTransaction() {
		return switchAmountTransaction;
	}

	public void setSwitchAmountTransaction(String switchAmountTransaction) {
		this.switchAmountTransaction = switchAmountTransaction;
	}

	public String getSwitchAccountId1() {
		return switchAccountId1;
	}

	public void setSwitchAccountId1(String switchAccountId1) {
		this.switchAccountId1 = switchAccountId1;
	}

}

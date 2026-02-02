package com.mss.unified.references;

import java.util.Date;

public class CardResponse {

	private Date expiryDate;

	private String cardNum;

	private String globalRiskCode;

	private Integer cardStatusCode;

	private Integer productCode;

	private Integer programeId;

	public CardResponse(Date expiryDate, String cardNum, String globalRiskCode, Integer cardStatusCode,
			Integer productCode, Integer programeId) {
		super();
		this.expiryDate = expiryDate;
		this.cardNum = cardNum;
		this.globalRiskCode = globalRiskCode;
		this.cardStatusCode = cardStatusCode;
		this.productCode = productCode;
		this.programeId = programeId;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getGlobalRiskCode() {
		return globalRiskCode;
	}

	public void setGlobalRiskCode(String globalRiskCode) {
		this.globalRiskCode = globalRiskCode;
	}

	public Integer getCardStatusCode() {
		return cardStatusCode;
	}

	public void setCardStatusCode(Integer cardStatusCode) {
		this.cardStatusCode = cardStatusCode;
	}

	public Integer getProductCode() {
		return productCode;
	}

	public void setProductCode(Integer productCode) {
		this.productCode = productCode;
	}

	public Integer getProgrameId() {
		return programeId;
	}

	public void setProgrameId(Integer programeId) {
		this.programeId = programeId;
	}

}

package com.mss.unified.references;

import java.util.Date;

public class CardResponseMobile {

	private Date expiryDate;

	private String cardNum;

	private String globalRiskCode;

	private Integer cardStatusCode;

	private Integer productCode;

	private Integer programeId;

	private int cardCode;

	private int idPorteur;

	private String cardName;

	private Integer accCode;

	public CardResponseMobile(Date expiryDate, String cardNum, String globalRiskCode, Integer cardStatusCode,
			Integer productCode, Integer programeId, int cardCode, String cardName, Integer accCode) {
		super();
		this.expiryDate = expiryDate;
		this.cardNum = cardNum;
		this.globalRiskCode = globalRiskCode;
		this.cardStatusCode = cardStatusCode;
		this.productCode = productCode;
		this.programeId = programeId;
		this.cardCode = cardCode;
		this.cardName = cardName;
		this.accCode = accCode;
	}

	public int getCardCode() {
		return cardCode;
	}

	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
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

	public int getIdPorteur() {
		return idPorteur;
	}

	public void setIdPorteur(int idPorteur) {
		this.idPorteur = idPorteur;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public Integer getAccCode() {
		return accCode;
	}

	public void setAccCode(Integer accCode) {
		this.accCode = accCode;
	}

}

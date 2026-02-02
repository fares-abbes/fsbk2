package com.mss.unified.references;

public class PvvRequest {
	private String cardNumber;
	private String randomPin;
	private String binCode;
	private boolean isVisa;
	
	public String getBinCode() {
		return binCode;
	}

	public void setBinCode(String binCode) {
		this.binCode = binCode;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getRandomPin() {
		return randomPin;
	}
	public void setRandomPin(String randomPin) {
		this.randomPin = randomPin;
	}
	public boolean isVisa() {
		return isVisa;
	}

	public void setVisa(boolean isVisa) {
		this.isVisa = isVisa;
	}
	
	
}

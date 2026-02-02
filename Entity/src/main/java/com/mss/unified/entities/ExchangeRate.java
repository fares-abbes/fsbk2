package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "EXCHANGE_RATE",schema = "SWITCH")
public class ExchangeRate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "exchangeRateSequence")
	@SequenceGenerator(name = "exchangeRateSequence", sequenceName = "SWITCH.exchangeRateSequence")
	private Integer exchangeRateId;
	private String currencyBeginLabel;
	private String currencyBeginCode;

	private float cost;
	private String currencyEndLabel;
	private String currencyEndCode;
	private int expo;
	
	

	public Integer getExchangeRateId() {
		return exchangeRateId;
	}
	public void setExchangeRateId(Integer exchangeRateId) {
		this.exchangeRateId = exchangeRateId;
	}
	public String getCurrencyBeginLabel() {
		return currencyBeginLabel;
	}
	public void setCurrencyBeginLabel(String currencyBeginLabel) {
		this.currencyBeginLabel = currencyBeginLabel;
	}
	public String getCurrencyBeginCode() {
		return currencyBeginCode;
	}
	public void setCurrencyBeginCode(String currencyBeginCode) {
		this.currencyBeginCode = currencyBeginCode;
	}

	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getCurrencyEndLabel() {
		return currencyEndLabel;
	}
	public void setCurrencyEndLabel(String currencyEndLabel) {
		this.currencyEndLabel = currencyEndLabel;
	}
	public String getCurrencyEndCode() {
		return currencyEndCode;
	}
	public void setCurrencyEndCode(String currencyEndCode) {
		this.currencyEndCode = currencyEndCode;
	}
	public int getExpo() {
		return expo;
	}
	public void setExpo(int expo) {
		this.expo = expo;
	}
	
	

}

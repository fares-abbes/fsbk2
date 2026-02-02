package com.mss.unified.dto;

import com.mss.unified.entities.ChargebackVisa;
import com.mss.unified.entities.VisaSummary;

public class ChargebackVisaAndSummary {
ChargebackVisa chargeback;
VisaSummary summary;
public ChargebackVisaAndSummary(ChargebackVisa chargeback, VisaSummary summary) {
	super();
	this.chargeback = chargeback;
	this.summary = summary;
}
public ChargebackVisa getChargeback() {
	return chargeback;
}
public void setChargeback(ChargebackVisa chargeback) {
	this.chargeback = chargeback;
}
public VisaSummary getSummary() {
	return summary;
}
public void setSummary(VisaSummary summary) {
	this.summary = summary;
}

}

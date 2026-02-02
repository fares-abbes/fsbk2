package com.mss.unified.references;

import com.mss.unified.entities.DayOperationInternational;

public class DayOperationInternationalTypeOperationRequest {
DayOperationInternational day;
String identification;
public DayOperationInternational getDay() {
	return day;
}
public void setDay(DayOperationInternational day) {
	this.day = day;
}
public String getIdentification() {
	return identification;
}
public void setIdentification(String identification) {
	this.identification = identification;
}
public DayOperationInternationalTypeOperationRequest(DayOperationInternational day, String identification) {
	super();
	this.day = day;
	this.identification = identification;
}

}

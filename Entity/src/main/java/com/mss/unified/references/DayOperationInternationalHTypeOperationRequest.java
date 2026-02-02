package com.mss.unified.references;

import com.mss.unified.entities.DayOperationInternational;
import com.mss.unified.entities.DayOperationInternationalH;

public class DayOperationInternationalHTypeOperationRequest {
DayOperationInternationalH day;
String identification;

public String getIdentification() {
	return identification;
}
public void setIdentification(String identification) {
	this.identification = identification;
}
public DayOperationInternationalHTypeOperationRequest(DayOperationInternationalH day, String identification) {
	super();
	this.day = day;
	this.identification = identification;
}
public DayOperationInternationalH getDay() {
	return day;
}
public void setDay(DayOperationInternationalH day) {
	this.day = day;
}

}

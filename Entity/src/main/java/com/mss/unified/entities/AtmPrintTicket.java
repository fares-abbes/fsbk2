package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_IMPRESSION_VALUE",schema = "ATM")
public class AtmPrintTicket {

	@EmbeddedId
	private AtmPrintTicketId atmPrintTicketId;
	
	@Column(name = "TEXT")
	private String atmPrintTicketStaticText;
	
	@Column(name = "VARIABLE")
	private String atmPrintTicketValue;

	public AtmPrintTicketId getAtmPrintTicketId() {
		return atmPrintTicketId;
	}

	public void setAtmPrintTicketId(AtmPrintTicketId atmPrintTicketId) {
		this.atmPrintTicketId = atmPrintTicketId;
	}

	public String getAtmPrintTicketStaticText() {
		return atmPrintTicketStaticText;
	}

	public void setAtmPrintTicketStaticText(String atmPrintTicketStaticText) {
		this.atmPrintTicketStaticText = atmPrintTicketStaticText;
	}

	public String getAtmPrintTicketValue() {
		return atmPrintTicketValue;
	}

	public void setAtmPrintTicketValue(String atmPrintTicketValue) {
		this.atmPrintTicketValue = atmPrintTicketValue;
	}

	@Override
	public String toString() {
		return "AtmPrintTicket [atmPrintTicketId=" + atmPrintTicketId + ", atmPrintTicketStaticText="
				+ atmPrintTicketStaticText + ", atmPrintTicketValue=" + atmPrintTicketValue + "]";
	}

}

package com.mss.unified.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AtmPrintTicketId implements Serializable{

private static final long serialVersionUID = 1L;

	@Column(name = "TRANSACTION_CODE", nullable = false)
	private String atmPrintTicketTransId;
	
	@Column(name = "NUM_LIGNR", nullable = false)
	private int atmPrintTicketLineId;
	
	@Column(name = "NUM_COLONNE", nullable = false)
	private int atmPrintTicketColumnId;
	
	@Column(name = "ATM_IMPR_NUM", nullable = false)
	private String atmPrintTicketConfigId;

	public String getAtmPrintTicketTransId() {
		return atmPrintTicketTransId;
	}

	public void setAtmPrintTicketTransId(String atmPrintTicketTransId) {
		this.atmPrintTicketTransId = atmPrintTicketTransId;
	}

	public int getAtmPrintTicketLineId() {
		return atmPrintTicketLineId;
	}

	public void setAtmPrintTicketLineId(int atmPrintTicketLineId) {
		this.atmPrintTicketLineId = atmPrintTicketLineId;
	}

	public int getAtmPrintTicketColumnId() {
		return atmPrintTicketColumnId;
	}

	public void setAtmPrintTicketColumnId(int atmPrintTicketColumnId) {
		this.atmPrintTicketColumnId = atmPrintTicketColumnId;
	}

	public String getAtmPrintTicketConfigId() {
		return atmPrintTicketConfigId;
	}

	public void setAtmPrintTicketConfigId(String atmPrintTicketConfigId) {
		this.atmPrintTicketConfigId = atmPrintTicketConfigId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof AtmPrintTicketId))
			return false;
		AtmPrintTicketId that = (AtmPrintTicketId) o;
		return Objects.equals(getAtmPrintTicketTransId(), that.getAtmPrintTicketTransId())
				&& Objects.equals(getAtmPrintTicketLineId(), that.getAtmPrintTicketLineId())
				&& Objects.equals(getAtmPrintTicketColumnId(), that.getAtmPrintTicketColumnId())
				&& Objects.equals(getAtmPrintTicketConfigId(), that.getAtmPrintTicketConfigId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getAtmPrintTicketTransId(), getAtmPrintTicketLineId(),getAtmPrintTicketColumnId(),
				getAtmPrintTicketConfigId());
	}


}

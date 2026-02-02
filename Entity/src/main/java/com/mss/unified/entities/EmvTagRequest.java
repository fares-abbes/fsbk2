package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMV_REQUEST_FIELD",schema = "ATM")
public class EmvTagRequest {
	@EmbeddedId
	private EmvTagRequestId emvTagRequestId;

	public EmvTagRequestId getEmvTagRequestId() {
		return emvTagRequestId;
	}

	public void setEmvTagRequestId(EmvTagRequestId emvTagRequestId) {
		this.emvTagRequestId = emvTagRequestId;
	}
	
	
}

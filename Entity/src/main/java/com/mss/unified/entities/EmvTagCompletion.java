package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EMV_COMPLETION_FIELD",schema = "ATM")
public class EmvTagCompletion {

	@EmbeddedId
	private EmvTagCompletionId emvTagCompletionId;

	public EmvTagCompletionId getEmvTagCompletionId() {
		return emvTagCompletionId;
	}

	public void setEmvTagCompletionId(EmvTagCompletionId emvTagCompletionId) {
		this.emvTagCompletionId = emvTagCompletionId;
	}
}

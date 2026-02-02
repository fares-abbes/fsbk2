package com.mss.unified.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmvTagCompletionId implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "ET_TAG_COM", nullable = false)
	private String emvTag;
	
	@Column(name = "AID_VALUE", nullable = false)
	private String emvAidValue;

	public String getEmvTag() {
		return emvTag;
	}

	public void setEmvTag(String emvTag) {
		this.emvTag = emvTag;
	}

	public String getEmvAidValue() {
		return emvAidValue;
	}

	public void setEmvAidValue(String emvAidValue) {
		this.emvAidValue = emvAidValue;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof EmvTagCompletionId))
			return false;
		EmvTagCompletionId that = (EmvTagCompletionId) o;
		return Objects.equals(getEmvAidValue(), that.getEmvAidValue())
				&& Objects.equals(getEmvTag(), that.getEmvTag());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getEmvAidValue(), getEmvTag());
	}



}

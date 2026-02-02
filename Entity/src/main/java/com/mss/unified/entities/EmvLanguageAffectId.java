package com.mss.unified.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmvLanguageAffectId implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "LANG_CODE", nullable = false)
	private String emvLangId;
	
	@Column(name = "ELC_CODE", nullable = false)
	private String emvLangConfigId;

	public String getEmvLangId() {
		return emvLangId;
	}

	public void setEmvLangId(String emvLangId) {
		this.emvLangId = emvLangId;
	}

	public String getEmvLangConfigId() {
		return emvLangConfigId;
	}

	public void setEmvLangConfigId(String emvLangConfigId) {
		this.emvLangConfigId = emvLangConfigId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof EmvLanguageAffectId))
			return false;
		EmvLanguageAffectId that = (EmvLanguageAffectId) o;
		return Objects.equals(getEmvLangId(), that.getEmvLangId())
				&& Objects.equals(getEmvLangConfigId(), that.getEmvLangConfigId());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getEmvLangId(), getEmvLangConfigId());
	}


}

package com.mss.unified.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class TransactionAffectationId implements Serializable {
	
private static final long serialVersionUID = 1L;
	
	@Column(name = "CODE_TRANS", nullable = false)
	private String TranactionCode;
	
	@Column(name = "ESP_CODE", nullable = false)
	private String TransAffectConfigId;

	public String getTranactionCode() {
		return TranactionCode;
	}

	public void setTranactionCode(String tranactionCode) {
		TranactionCode = tranactionCode;
	}

	public String getTransAffectConfigId() {
		return TransAffectConfigId;
	}

	public void setTransAffectConfigId(String transAffectConfigId) {
		TransAffectConfigId = transAffectConfigId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof TransactionAffectationId))
			return false;
		TransactionAffectationId that = (TransactionAffectationId) o;
		return Objects.equals(getTransAffectConfigId(), that.getTransAffectConfigId())
				&& Objects.equals(getTranactionCode(), that.getTranactionCode());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTransAffectConfigId(), getTranactionCode());
	}

	
	

}

package com.mss.unified.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AtmTransactionReplyValueId implements Serializable {

	private static final long serialVersionUID = 1L;
	@Column(name = "ATRC_CODE", nullable = false)
	private String transReplyConfigId;
	@Column(name = "CODE_TRANSACTION", nullable = false)
	private String transReplyTransCode;
	@Column(name = "CODE_RESPONSE", nullable = false)
	private String transReplyResponseCode;
	@Column(name = "ATM_TRANS_REPLY_INDEX", nullable = false)
	private String transReplyIndexe;
	public String getTransReplyConfigId() {
		return transReplyConfigId;
	}


	public String getTransReplyTransCode() {
		return transReplyTransCode;
	}

	public void setTransReplyTransCode(String transReplyTransCode) {
		this.transReplyTransCode = transReplyTransCode;
	}

	public String getTransReplyResponseCode() {
		return transReplyResponseCode;
	}

	public void setTransReplyResponseCode(String transReplyResponseCode) {
		this.transReplyResponseCode = transReplyResponseCode;
	}

	public String getTransReplyIndexe() {
		return transReplyIndexe;
	}

	public void setTransReplyIndexe(String transReplyIndexe) {
		this.transReplyIndexe = transReplyIndexe;
	}

	public void setTransReplyConfigId(String transReplyConfigId) {
		this.transReplyConfigId = transReplyConfigId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof AtmTransactionReplyValueId))
			return false;
		AtmTransactionReplyValueId that = (AtmTransactionReplyValueId) o;
		return Objects.equals(getTransReplyConfigId(), that.getTransReplyConfigId())
				&& Objects.equals(getTransReplyTransCode(), that.getTransReplyTransCode())
				&& Objects.equals(getTransReplyResponseCode(), that.getTransReplyResponseCode())
				&& Objects.equals(getTransReplyIndexe(), that.getTransReplyIndexe());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getTransReplyConfigId(), getTransReplyResponseCode(),getTransReplyResponseCode(),
				getTransReplyIndexe());
	}

}

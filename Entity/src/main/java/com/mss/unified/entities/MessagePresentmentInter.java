package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "MESSAGE_PRESENTMENT", schema = "FRANSABANK")
public class MessagePresentmentInter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int code;

	private String message;

	private Integer chargebackInter;

	private String typeChargeback;

	@Override
	public String toString() {
		return "MessagePresentmentInter [code=" + code + ", message=" + message + ", chargebackInter=" + chargebackInter
				+ ", typeChargeback=" + typeChargeback + "]";
	}

	public Integer getChargebackInter() {
		return chargebackInter;
	}

	public void setChargebackInter(Integer chargebackInter) {
		this.chargebackInter = chargebackInter;
	}

	public String getTypeChargeback() {
		return typeChargeback;
	}

	public void setTypeChargeback(String typeChargeback) {
		this.typeChargeback = typeChargeback;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

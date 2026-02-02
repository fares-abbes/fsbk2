package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(schema = "PORTEUR", name = "Contacless_Control")
public class ContaclessControl {
	

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "ContaclessControlSequence")
	  @SequenceGenerator(name = "ContaclessControlSequence", sequenceName = "PORTEUR.ContaclessControlSequence")
	  private Integer contaclessControlCode;
	  
	  private int maxAmount;
	  private int minAmount;
	  private boolean pin;
	  private int programId;
	  
	public int getProgramId() {
		return programId;
	}
	public void setProgramId(int programId) {
		this.programId = programId;
	}
	public Integer getContaclessControlCode() {
		return contaclessControlCode;
	}
	public void setContaclessControlCode(Integer contaclessControlCode) {
		this.contaclessControlCode = contaclessControlCode;
	}
	public int getMaxAmount() {
		return maxAmount;
	}
	public void setMaxAmount(int maxAmount) {
		this.maxAmount = maxAmount;
	}
	public int getMinAmount() {
		return minAmount;
	}
	public void setMinAmount(int minAmount) {
		this.minAmount = minAmount;
	}
	public boolean isPin() {
		return pin;
	}
	public void setPin(boolean pin) {
		this.pin = pin;
	}

}

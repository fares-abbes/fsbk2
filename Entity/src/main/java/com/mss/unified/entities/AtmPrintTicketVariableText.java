package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "AtmPrintTicketVariableText",schema = "ATM")
public class AtmPrintTicketVariableText {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmPrintTicketVariableTextSequence")
	  @SequenceGenerator(name = "AtmPrintTicketVariableTextSequence", sequenceName = "ATM.AtmPrintTicketVariableTextSequence", allocationSize = 1)
	  private int code;
	  private String text;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	} 
}

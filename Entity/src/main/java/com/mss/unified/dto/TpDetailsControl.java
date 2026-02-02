package com.mss.unified.dto;

import java.math.BigInteger;

public class TpDetailsControl {

	public TpDetailsControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String montantTransaction;
	private String commisionInterchange;
	
	public String getMontantTransaction() {
		return montantTransaction;
	}
	public void setMontantTransaction(String montantTransaction) {
		this.montantTransaction = montantTransaction;
	}
	public String getCommisionInterchange() {
		return commisionInterchange;
	}
	public void setCommisionInterchange(String commisionInterchange) {
		this.commisionInterchange = commisionInterchange;
	}
	public TpDetailsControl(String montantTransaction, String commisionInterchange) {
		super();
		this.montantTransaction = montantTransaction;
		this.commisionInterchange = commisionInterchange;
	}
	
	

}

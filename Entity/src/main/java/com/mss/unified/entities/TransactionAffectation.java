package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity

@Table(name = "TRANSACTION_AFFECTATION",schema = "ATM")
public class TransactionAffectation {
	
	@EmbeddedId
	private TransactionAffectationId transId;
	
	
	@Column(name = "TRANS_ORDER")
	private String TransOrder;

	public TransactionAffectationId getTransId() {
		return transId;
	}

	public void setTransId(TransactionAffectationId transId) {
		this.transId = transId;
	}

	public String getTransOrder() {
		return TransOrder;
	}

	public void setTransOrder(String transOrder) {
		TransOrder = transOrder;
	}

}

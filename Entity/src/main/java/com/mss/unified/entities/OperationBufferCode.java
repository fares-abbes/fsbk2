package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPERATION_BUFFER",schema = "ATM")
public class OperationBufferCode {
	@Id
	@Column(name = "OPERATION_BUFFER_CODE", nullable = false)
	private String operationBuffer;  
	
	@Column(name = "TRANSACTION_CODE")
	private String transactionCode;
	
	@Column(name = "MERCHANT_CODE")
	private String merchantCode;
	
	@Column(name = "TERMINAL_CODE")
	private String terminalCode;
	
	@Column(name = "LIBELLE_OPERATION")
	private String libelleOperation;
	
	@Column(name = "TICKET")
	private String ticket;
	
	@Column(name = "CURRENCY_TRANSACTION")
	private String transactionCurrency;
	
	@Column(name = "INDEX_TRANSACTION")
	private String indexTransa;

	public String getOperationBuffer() {
		return operationBuffer;
	}

	public void setOperationBuffer(String operationBuffer) {
		this.operationBuffer = operationBuffer;
	}

	public String getTransactionCode() {
		return transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(String merchantCode) {
		this.merchantCode = merchantCode;
	}

	public String getTerminalCode() {
		return terminalCode;
	}

	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}

	public String getLibelleOperation() {
		return libelleOperation;
	}

	public void setLibelleOperation(String libelleOperation) {
		this.libelleOperation = libelleOperation;
	}

	public String getTicket() {
		return ticket;
	}

	public void setTicket(String ticket) {
		this.ticket = ticket;
	}

	public String getTransactionCurrency() {
		return transactionCurrency;
	}

	public void setTransactionCurrency(String transactionCurrency) {
		this.transactionCurrency = transactionCurrency;
	}

	public String getIndexTransa() {
		return indexTransa;
	}

	public void setIndexTransa(String indexTransa) {
		this.indexTransa = indexTransa;
	}

	
}

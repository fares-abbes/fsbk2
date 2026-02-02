package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "SWITCHT", schema = "FRANSABANK")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class SwitchTransactionT {

	@Id
	@Column(name = "SWITCH_CODE", nullable = false)
	private int switchCode;
	private String ExcuteDate;
	@Column(name = "DE41_ACCEPTOR_TERMINAL_ID")
	private String switchAcceptorTerminalId;
	@Column(name = "DE102_ACCOUNT_ID1")
	private String switchAccountId1;
	@Column(name = "DE13_DATE_LOCAL_TRANSACTION")
	private String switchDateLocalTransaction;
	@Column(name = "DE38_AUTH_IDENTIF_NUMBER")
	private String switchAuthNumber;
	@Column(name = "DE04_AMOUNT_TRANSACTION")
	private String switchAmountTransaction;
	@Column(name = "DE37_RRN")
	private String switchRRN;
	@Column(name = "DE02_PAN")
	private String switchPan;

	@Column(name = "RESPONSEDATE")
	private Date switchResponseDate;
	@Column(name = "DE32_AQCUIRER_IDENTI_CODE")
	private String switchAcquirerIdenCode;
	@Column(name = "DE42_ACEPTOR_MERCHANT_CODE")
	private String switchAcceptorMerchantCode;
	@Column(name = "DE156")
	private String switchDE156;
	@Column(name = "MTI_MESSAGE_TYPE_IDENTIFIER")
	private String switchMtiMessage;

	@Column(name = "DE43_CARD_ACCEPTOR_NAME")
	private String switchAcceptorAcceptorName;
	@Column(name = "DE03_PROCESSING_CODE")
	private String switchProcessingCode;
	@Column(name = "DE22_POS_ENTRY_MODE")
	private String switchPosEntryMode;
	@Column(name = "DE39_RESPONSE_CODE")
	private String switchResponseCode;
	@Column(name = "STAT_TRANSACTION")
	private String switchStatTransaction;
	@Column(name = "SOURCE")
	private String  source;
	@Column(name = "DE189")
	private String switchDE189;
	
	private int scripNB;
	private String scriptExcDate;
	private String accountCommercant;
	@Column(name = "CHARGEBACK_STATUS")
	private Integer chargebackStatus;

	public int getSwitchCode() {
		return switchCode;
	}

	public void setSwitchCode(int switchCode) {
		this.switchCode = switchCode;
	}

	public String getExcuteDate() {
		return ExcuteDate;
	}

	public void setExcuteDate(String excuteDate) {
		ExcuteDate = excuteDate;
	}

	public String getSwitchAcceptorTerminalId() {
		return switchAcceptorTerminalId;
	}

	public void setSwitchAcceptorTerminalId(String switchAcceptorTerminalId) {
		this.switchAcceptorTerminalId = switchAcceptorTerminalId;
	}

	public String getSwitchAccountId1() {
		return switchAccountId1;
	}

	public void setSwitchAccountId1(String switchAccountId1) {
		this.switchAccountId1 = switchAccountId1;
	}

	public String getSwitchDateLocalTransaction() {
		return switchDateLocalTransaction;
	}

	public void setSwitchDateLocalTransaction(String switchDateLocalTransaction) {
		this.switchDateLocalTransaction = switchDateLocalTransaction;
	}

	public String getSwitchAuthNumber() {
		return switchAuthNumber;
	}

	public void setSwitchAuthNumber(String switchAuthNumber) {
		this.switchAuthNumber = switchAuthNumber;
	}

	public String getSwitchAmountTransaction() {
		return switchAmountTransaction;
	}

	public void setSwitchAmountTransaction(String switchAmountTransaction) {
		this.switchAmountTransaction = switchAmountTransaction;
	}

	public String getSwitchRRN() {
		return switchRRN;
	}

	public void setSwitchRRN(String switchRRN) {
		this.switchRRN = switchRRN;
	}

	public String getSwitchPan() {
		return switchPan;
	}

	public void setSwitchPan(String switchPan) {
		this.switchPan = switchPan;
	}

	public Date getSwitchResponseDate() {
		return switchResponseDate;
	}

	public void setSwitchResponseDate(Date switchResponseDate) {
		this.switchResponseDate = switchResponseDate;
	}

	public String getSwitchAcquirerIdenCode() {
		return switchAcquirerIdenCode;
	}

	public void setSwitchAcquirerIdenCode(String switchAcquirerIdenCode) {
		this.switchAcquirerIdenCode = switchAcquirerIdenCode;
	}

	public String getSwitchAcceptorMerchantCode() {
		return switchAcceptorMerchantCode;
	}

	public void setSwitchAcceptorMerchantCode(String switchAcceptorMerchantCode) {
		this.switchAcceptorMerchantCode = switchAcceptorMerchantCode;
	}

	public String getSwitchDE156() {
		return switchDE156;
	}

	public void setSwitchDE156(String switchDE156) {
		this.switchDE156 = switchDE156;
	}

	public String getSwitchMtiMessage() {
		return switchMtiMessage;
	}

	public void setSwitchMtiMessage(String switchMtiMessage) {
		this.switchMtiMessage = switchMtiMessage;
	}

	public int getScripNB() {
		return scripNB;
	}

	public void setScripNB(int scripNB) {
		this.scripNB = scripNB;
	}

	public String getScriptExcDate() {
		return scriptExcDate;
	}

	public void setScriptExcDate(String scriptExcDate) {
		this.scriptExcDate = scriptExcDate;
	}

	public String getAccountCommercant() {
		return accountCommercant;
	}

	public void setAccountCommercant(String accountCommercant) {
		this.accountCommercant = accountCommercant;
	}

	public String getSwitchAcceptorAcceptorName() {
		return switchAcceptorAcceptorName;
	}

	public void setSwitchAcceptorAcceptorName(String switchAcceptorAcceptorName) {
		this.switchAcceptorAcceptorName = switchAcceptorAcceptorName;
	}

	public String getSwitchProcessingCode() {
		return switchProcessingCode;
	}

	public void setSwitchProcessingCode(String switchProcessingCode) {
		this.switchProcessingCode = switchProcessingCode;
	}

	public String getSwitchPosEntryMode() {
		return switchPosEntryMode;
	}

	public void setSwitchPosEntryMode(String switchPosEntryMode) {
		this.switchPosEntryMode = switchPosEntryMode;
	}

	public String getSwitchResponseCode() {
		return switchResponseCode;
	}

	public void setSwitchResponseCode(String switchResponseCode) {
		this.switchResponseCode = switchResponseCode;
	}

	public String getSwitchStatTransaction() {
		return switchStatTransaction;
	}

	public void setSwitchStatTransaction(String switchStatTransaction) {
		this.switchStatTransaction = switchStatTransaction;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSwitchDE189() {
		return switchDE189;
	}

	public void setSwitchDE189(String switchDE189) {
		this.switchDE189 = switchDE189;
	}

	public Integer getChargebackStatus() {
		return chargebackStatus;
	}

	public void setChargebackStatus(Integer chargebackStatus) {
		this.chargebackStatus = chargebackStatus;
	}

	@Override
	public String toString() {
		return "SwitchTransactionT [switchCode=" + switchCode + ", ExcuteDate=" + ExcuteDate
				+ ", switchAcceptorTerminalId=" + switchAcceptorTerminalId + ", switchAccountId1=" + switchAccountId1
				+ ", switchDateLocalTransaction=" + switchDateLocalTransaction + ", switchAuthNumber="
				+ switchAuthNumber + ", switchAmountTransaction=" + switchAmountTransaction + ", switchRRN=" + switchRRN
				+ ", switchPan=" + switchPan + ", switchResponseDate=" + switchResponseDate
				+ ", switchAcquirerIdenCode=" + switchAcquirerIdenCode + ", switchAcceptorMerchantCode="
				+ switchAcceptorMerchantCode + ", switchDE156=" + switchDE156 + "]";
	}

}

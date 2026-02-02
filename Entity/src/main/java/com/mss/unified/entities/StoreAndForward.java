package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "SWITCH", name = "StoreAndForward")
public class StoreAndForward {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "StoreAndForwardSequence")
	@SequenceGenerator(name = "SwitchTransactionSequence", sequenceName = "SWITCH.StoreAndForward_SEQUENCE", allocationSize = 1)
	private int storeAndForwardCode;
	

	private Date insertionDate;

	private int switchCode;
	
	private String destinationInterface;
	
	private String requestResponseCode;
	
	private String requestAdditionalResponseCode;
	
	private String resultAuthNumber;
	
	private String storeAndForwardMti;
	
	private int attempt;
	private Date lastAttemptDate;
	private String status;
	
	
	public String getResultAuthNumber() {
		return resultAuthNumber;
	}

	public void setResultAuthNumber(String resultAuthNumber) {
		this.resultAuthNumber = resultAuthNumber;
	}

	@Column(name = "MTI_MESSAGE_TYPE_IDENTIFIER")
	private String switchMtiMessage;

	@Column(name = "DE02_PAN")
	private String switchPan;

	@Column(name = "DE03_PROCESSING_CODE")
	private String switchProcessingCode;

	@Column(name = "DE04_AMOUNT_TRANSACTION")
	private String switchAmountTransaction;

	@Column(name = "DE06_AMOUNT_CARD_BELLING")
	private String switchAmountCardBelling;
	
	@Column(name = "DE07_TRANSMISSION_DATE_TIME")
	private String switchTransmissionDate;

	@Column(name = "DE11_STAN")
	private String switchStan;

	@Column(name = "DE12_TIME_LOCAL_TRANSACTION")
	private String switchTimeLocalTransaction;

	@Column(name = "DE13_DATE_LOCAL_TRANSACTION")
	private String switchDateLocalTransaction;

	@Column(name = "DE14_EXPIRATION_DATE")
	private String switchExpirationDate;

	@Column(name = "DE15_SETTELEMENT_DATE")
	private String switchSettelementDate;
	
	@Column(name = "DE17_CAPTURE_DATE")
	private String switchCaptureDate;
	
	@Column(name = "DE18_MERCHANT_TYPE")
	private String switchMerchantType;

	@Column(name = "DE22_POS_ENTRY_MODE")
	private String switchPosEntryMode;

	@Column(name = "TAG_5F34")
	private String tag5F34;

	@Column(name = "DE32_AQCUIRER_IDENTI_CODE")
	private String switchAcquirerIdenCode;

	@Column(name = "DE37_RRN")
	private String switchRRN;
	
	@Column(name = "DE38_AUTH_IDENTIF_NUMBER")
	private String switchAuthNumber;
	
	@Column(name = "DE39_RESPONSE_CODE")
	private String switchResponseCode;
	
	@Column(name = "DE41_ACCEPTOR_TERMINAL_ID")
	private String switchAcceptorTerminalId;
	
	@Column(name = "DE42_ACEPTOR_MERCHANT_CODE")
	private String switchAcceptorMerchantCode;
	
	
	@Column(name = "DE43_CARD_ACCEPTOR_NAME")
	private String switchAcceptorAcceptorName;
	
	@Column(name = "DE44_ADDITIONAL_RESP_DATA")
	private String switchAdditionalRespData;
	
	@Column(name = "DE49_TRANS_CURR_CODE")
	private String switchTransactionCurrencyCode;
	
	@Column(name = "DE51_BILLING_CURR_CODE")
	private String switchBillingCurrencyCode;
	
	@Column(name = "DE55_EMV_DATA")
	private String switchEmvData;
	
	@Column(name = "DE60_ADDITIONAL_POS_DATA")
	private String switchAdditonalPosData;
	
	@Column(name = "DE102_ACCOUNT_ID1")
	private String switchAccountId1;
	
	@Column(name = "DE107_RESERVED")
	private String switchDE107;
	
	private String validatedBy;

	private String treatedForReversal;
	
	@Column(name = "DE111_RESERVED")
	private String switchDE111;
	
	public String getValidatedBy() {
		return validatedBy;
	}

	public void setValidatedBy(String validatedBy) {
		this.validatedBy = validatedBy;
	}

	public String getTreatedForReversal() {
		return treatedForReversal;
	}

	public void setTreatedForReversal(String treatedForReversal) {
		this.treatedForReversal = treatedForReversal;
	}

	public Date getLastAttemptDate() {
		return lastAttemptDate;
	}

	public void setLastAttemptDate(Date lastAttemptDate) {
		this.lastAttemptDate = lastAttemptDate;
	}

	public int getStoreAndForwardCode() {
		return storeAndForwardCode;
	}

	public void setStoreAndForwardCode(int storeAndForwardCode) {
		this.storeAndForwardCode = storeAndForwardCode;
	}

	public Date getInsertionDate() {
		return insertionDate;
	}

	public void setInsertionDate(Date insertionDate) {
		this.insertionDate = insertionDate;
	}

	public int getSwitchCode() {
		return switchCode;
	}

	public void setSwitchCode(int switchCode) {
		this.switchCode = switchCode;
	}

	public String getDestinationInterface() {
		return destinationInterface;
	}

	public void setDestinationInterface(String destinationInterface) {
		this.destinationInterface = destinationInterface;
	}

	public String getRequestResponseCode() {
		return requestResponseCode;
	}

	public void setRequestResponseCode(String requestResponseCode) {
		this.requestResponseCode = requestResponseCode;
	}

	public String getStoreAndForwardMti() {
		return storeAndForwardMti;
	}

	public void setStoreAndForwardMti(String storeAndForwardMti) {
		this.storeAndForwardMti = storeAndForwardMti;
	}

	public int getAttempt() {
		return attempt;
	}

	public void setAttempt(int attempt) {
		this.attempt = attempt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSwitchMtiMessage() {
		return switchMtiMessage;
	}

	public void setSwitchMtiMessage(String switchMtiMessage) {
		this.switchMtiMessage = switchMtiMessage;
	}

	public String getSwitchPan() {
		return switchPan;
	}

	public void setSwitchPan(String switchPan) {
		this.switchPan = switchPan;
	}

	public String getSwitchProcessingCode() {
		return switchProcessingCode;
	}

	public void setSwitchProcessingCode(String switchProcessingCode) {
		this.switchProcessingCode = switchProcessingCode;
	}

	public String getSwitchAmountTransaction() {
		return switchAmountTransaction;
	}

	public void setSwitchAmountTransaction(String switchAmountTransaction) {
		this.switchAmountTransaction = switchAmountTransaction;
	}

	public String getSwitchAmountCardBelling() {
		return switchAmountCardBelling;
	}

	public void setSwitchAmountCardBelling(String switchAmountCardBelling) {
		this.switchAmountCardBelling = switchAmountCardBelling;
	}

	public String getSwitchTransmissionDate() {
		return switchTransmissionDate;
	}

	public void setSwitchTransmissionDate(String switchTransmissionDate) {
		this.switchTransmissionDate = switchTransmissionDate;
	}

	public String getSwitchStan() {
		return switchStan;
	}

	public void setSwitchStan(String switchStan) {
		this.switchStan = switchStan;
	}

	public String getSwitchTimeLocalTransaction() {
		return switchTimeLocalTransaction;
	}

	public void setSwitchTimeLocalTransaction(String switchTimeLocalTransaction) {
		this.switchTimeLocalTransaction = switchTimeLocalTransaction;
	}

	public String getSwitchDateLocalTransaction() {
		return switchDateLocalTransaction;
	}

	public void setSwitchDateLocalTransaction(String switchDateLocalTransaction) {
		this.switchDateLocalTransaction = switchDateLocalTransaction;
	}

	public String getSwitchExpirationDate() {
		return switchExpirationDate;
	}

	public void setSwitchExpirationDate(String switchExpirationDate) {
		this.switchExpirationDate = switchExpirationDate;
	}

	public String getSwitchSettelementDate() {
		return switchSettelementDate;
	}

	public void setSwitchSettelementDate(String switchSettelementDate) {
		this.switchSettelementDate = switchSettelementDate;
	}

	public String getSwitchCaptureDate() {
		return switchCaptureDate;
	}

	public void setSwitchCaptureDate(String switchCaptureDate) {
		this.switchCaptureDate = switchCaptureDate;
	}

	public String getSwitchMerchantType() {
		return switchMerchantType;
	}

	public void setSwitchMerchantType(String switchMerchantType) {
		this.switchMerchantType = switchMerchantType;
	}

	public String getSwitchPosEntryMode() {
		return switchPosEntryMode;
	}

	public void setSwitchPosEntryMode(String switchPosEntryMode) {
		this.switchPosEntryMode = switchPosEntryMode;
	}

	public String getTag5F34() {
		return tag5F34;
	}

	public void setTag5F34(String tag5f34) {
		tag5F34 = tag5f34;
	}

	public String getSwitchAcquirerIdenCode() {
		return switchAcquirerIdenCode;
	}

	public void setSwitchAcquirerIdenCode(String switchAcquirerIdenCode) {
		this.switchAcquirerIdenCode = switchAcquirerIdenCode;
	}

	public String getSwitchRRN() {
		return switchRRN;
	}

	public void setSwitchRRN(String switchRRN) {
		this.switchRRN = switchRRN;
	}

	public String getSwitchAuthNumber() {
		return switchAuthNumber;
	}

	public void setSwitchAuthNumber(String switchAuthNumber) {
		this.switchAuthNumber = switchAuthNumber;
	}

	public String getSwitchResponseCode() {
		return switchResponseCode;
	}

	public void setSwitchResponseCode(String switchResponseCode) {
		this.switchResponseCode = switchResponseCode;
	}

	public String getSwitchAcceptorTerminalId() {
		return switchAcceptorTerminalId;
	}

	public void setSwitchAcceptorTerminalId(String switchAcceptorTerminalId) {
		this.switchAcceptorTerminalId = switchAcceptorTerminalId;
	}

	public String getSwitchAcceptorMerchantCode() {
		return switchAcceptorMerchantCode;
	}

	public void setSwitchAcceptorMerchantCode(String switchAcceptorMerchantCode) {
		this.switchAcceptorMerchantCode = switchAcceptorMerchantCode;
	}

	public String getSwitchAcceptorAcceptorName() {
		return switchAcceptorAcceptorName;
	}

	public void setSwitchAcceptorAcceptorName(String switchAcceptorAcceptorName) {
		this.switchAcceptorAcceptorName = switchAcceptorAcceptorName;
	}

	public String getSwitchTransactionCurrencyCode() {
		return switchTransactionCurrencyCode;
	}

	public void setSwitchTransactionCurrencyCode(String switchTransactionCurrencyCode) {
		this.switchTransactionCurrencyCode = switchTransactionCurrencyCode;
	}

	public String getSwitchBillingCurrencyCode() {
		return switchBillingCurrencyCode;
	}

	public void setSwitchBillingCurrencyCode(String switchBillingCurrencyCode) {
		this.switchBillingCurrencyCode = switchBillingCurrencyCode;
	}

	public String getSwitchEmvData() {
		return switchEmvData;
	}

	public void setSwitchEmvData(String switchEmvData) {
		this.switchEmvData = switchEmvData;
	}

	public String getSwitchAdditonalPosData() {
		return switchAdditonalPosData;
	}

	public void setSwitchAdditonalPosData(String switchAdditonalPosData) {
		this.switchAdditonalPosData = switchAdditonalPosData;
	}

	public String getSwitchAccountId1() {
		return switchAccountId1;
	}

	public void setSwitchAccountId1(String switchAccountId1) {
		this.switchAccountId1 = switchAccountId1;
	}

	public String getSwitchDE107() {
		return switchDE107;
	}

	public void setSwitchDE107(String switchDE107) {
		this.switchDE107 = switchDE107;
	}

	public String getSwitchAdditionalRespData() {
		return switchAdditionalRespData;
	}

	public void setSwitchAdditionalRespData(String switchAdditionalRespData) {
		this.switchAdditionalRespData = switchAdditionalRespData;
	}

	public String getRequestAdditionalResponseCode() {
		return requestAdditionalResponseCode;
	}

	public void setRequestAdditionalResponseCode(String requestAdditionalResponseCode) {
		this.requestAdditionalResponseCode = requestAdditionalResponseCode;
	}

	public String getSwitchDE111() {
		return switchDE111;
	}

	public void setSwitchDE111(String switchDE111) {
		this.switchDE111 = switchDE111;
	}

	
}

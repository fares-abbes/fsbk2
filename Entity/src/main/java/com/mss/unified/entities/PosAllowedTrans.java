package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="POS_ALLOWED_TRANSACTION",schema="POS")
public class PosAllowedTrans {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosAllowedTransactionSequence")
	@SequenceGenerator(name = "PosAllowedTransactionSequence", sequenceName = "POS.PosAllowedTransactionSequence", allocationSize = 1)
	private Integer id;
	
	@Column(name = "NORMAL_PURCHASE")
	@JsonProperty("NORMAL_PURCHASE")
	private int normalPurchase;
	
	@Column(name = "PREAUTH_PURSHASE")
	@JsonProperty("PREAUTH_PURSHASE")
	private int preauthPurshase;
	
	@Column(name = "COMPLETION")
	@JsonProperty("COMPLETION")
	private int completion;
	
	@Column(name = "MAIL_TEL_ORDER")
	@JsonProperty("MAIL_TEL_ORDER")
	private int mailTelOrder;
	
	@Column(name = "MARCHANDISE_RETURN")
	@JsonProperty("MARCHANDISE_RETURN")
	private int marchandiseReturn;
	
	@Column(name = "CASH_ADVANCE")
	@JsonProperty("CASH_ADVANCE")
	private int cashAdvance;
	
	@Column(name = "CARD_VERIFICATION")
	@JsonProperty("CARD_VERIFICATION")
	private int cardVerification;
	
	@Column(name = "BALANCE_INQUERY")
	@JsonProperty("BALANCE_INQUERY")
	private int balanceInquery;
	
	@Column(name = "CASH_BACK")
	@JsonProperty("CASH_BACK")
	private int cashBack;
	
	@Column(name = "CHECK_VERIFICATION")
	@JsonProperty("CHECK_VERIFICATION")
	private int checkVerification;
	
	@Column(name = "CHECK_GUARANTEE")
	@JsonProperty("CHECK_GUARANTEE")
	private int checkGuarantee;
	
	@Column(name = "PURSHASE_ADJUSTEMENT")
	@JsonProperty("PURSHASE_ADJUSTEMENT")
	private int purshaseAdjustement;
	
	@Column(name = "MARCHANDISE_RET_ADJUST")
	@JsonProperty("MARCHANDISE_RET_ADJUST")
	private int marchandiseRetAdjust;
	
	@Column(name = "CASH_ADVANCE_ADJUSTEMENT")
	@JsonProperty("CASH_ADVANCE_ADJUSTEMENT")
	private int cashAdvanceAdjustement;
	
	@Column(name = "CLOSE_BATSH")
	@JsonProperty("CLOSE_BATSH")
	private int closeBatsh;
	
	@Column(name = "CLOSE_SHIFT")
	@JsonProperty("CLOSE_SHIFT")
	private int closeShift;
	
	@Column(name = "CLOSE_DAY")
	@JsonProperty("CLOSE_DAY")
	private int closeDay;
	
	@Column(name = "POSITION_18")
	@JsonProperty("POSITION_18")
	private int position18;
	
	@Column(name = "READ_MAIL")
	@JsonProperty("READ_MAIL")
	private int readMail;
	
	@Column(name = "SEND_MAIL")
	@JsonProperty("SEND_MAIL")
	private int sendMail;
	
	@Column(name = "MAIL_DELIVRED")
	@JsonProperty("MAIL_DELIVRED")
	private int mailDelivred;
	
	@Column(name = "SALES_DRAFT")
	@JsonProperty("SALES_DRAFT")
	private int salesDraft;
	
	@Column(name = "CLERK_TOTALS")
	@JsonProperty("CLERK_TOTALS")
	private int clerkTotals;
	
	@Column(name = "CASH_BACK_ADJUST")
	@JsonProperty("CASH_BACK_ADJUST")
	private int cashBackAdjust;
	
	@Column(name = "ADJUST_WHEN_AMT")
	@JsonProperty("ADJUST_WHEN_AMT")
	private int adjustWhenAmt;
	
	@Column(name = "PREAUT_LESSER_AMOUNT")
	@JsonProperty("PREAUT_LESSER_AMOUNT")
	private int preautLesserAmount;
	
	@Column(name = "CARD_ACTIVATION")
	@JsonProperty("CARD_ACTIVATION")
	private int cardActivation;
	
	@Column(name = "ADDITIONAL_CARD_ACTIVATION")
	@JsonProperty("ADDITIONAL_CARD_ACTIVATION")
	private int additionalCardActivation;
	
	@Column(name = "REPLENCHEMENT")
	@JsonProperty("REPLENCHEMENT")
	private int replenchement;
	
	@Column(name = "FULL_REDEMPTION")
	@JsonProperty("FULL_REDEMPTION")
	private int fullRedemption;
	
	@OneToMany(mappedBy = "PosAllowedTrans", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<PosAllowedTransConf> posAllowedTransConfs = new HashSet<>();
    
	public PosAllowedTrans() {
		super();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNormalPurchase() {
		return normalPurchase;
	}

	public void setNormalPurchase(int normalPurchase) {
		this.normalPurchase = normalPurchase;
	}

	public int getPreauthPurshase() {
		return preauthPurshase;
	}

	public void setPreauthPurshase(int preauthPurshase) {
		this.preauthPurshase = preauthPurshase;
	}

	public int getCompletion() {
		return completion;
	}

	public void setCompletion(int completion) {
		this.completion = completion;
	}

	public int getMailTelOrder() {
		return mailTelOrder;
	}

	public void setMailTelOrder(int mailTelOrder) {
		this.mailTelOrder = mailTelOrder;
	}

	public int getMarchandiseReturn() {
		return marchandiseReturn;
	}

	public void setMarchandiseReturn(int marchandiseReturn) {
		this.marchandiseReturn = marchandiseReturn;
	}

	public int getCashAdvance() {
		return cashAdvance;
	}

	public void setCashAdvance(int cashAdvance) {
		this.cashAdvance = cashAdvance;
	}

	public int getCardVerification() {
		return cardVerification;
	}

	public void setCardVerification(int cardVerification) {
		this.cardVerification = cardVerification;
	}

	public int getBalanceInquery() {
		return balanceInquery;
	}

	public void setBalanceInquery(int balanceInquery) {
		this.balanceInquery = balanceInquery;
	}

	public int getCashBack() {
		return cashBack;
	}

	public void setCashBack(int CASH_BACK) {
		this.cashBack = CASH_BACK;
	}

	public int getCheckVerification() {
		return checkVerification;
	}

	public void setCheckVerification(int checkVerification) {
		this.checkVerification = checkVerification;
	}

	public int getCheckGuarantee() {
		return checkGuarantee;
	}

	public void setCheckGuarantee(int checkGuarantee) {
		this.checkGuarantee = checkGuarantee;
	}

	public int getPurshaseAdjustement() {
		return purshaseAdjustement;
	}

	public void setPurshaseAdjustement(int purshaseAdjustement) {
		this.purshaseAdjustement = purshaseAdjustement;
	}

	public int getMarchandiseRetAdjust() {
		return marchandiseRetAdjust;
	}

	public void setMarchandiseRetAdjust(int marchandiseRetAdjust) {
		this.marchandiseRetAdjust = marchandiseRetAdjust;
	}

	public int getCashAdvanceAdjustement() {
		return cashAdvanceAdjustement;
	}

	public void setCashAdvanceAdjustement(int cashAdvanceAdjustement) {
		this.cashAdvanceAdjustement = cashAdvanceAdjustement;
	}

	public int getCloseBatsh() {
		return closeBatsh;
	}

	public void setCloseBatsh(int closeBatsh) {
		this.closeBatsh = closeBatsh;
	}

	public int getCloseShift() {
		return closeShift;
	}

	public void setCloseShift(int closeShift) {
		this.closeShift = closeShift;
	}

	public int getCloseDay() {
		return closeDay;
	}

	public void setCloseDay(int closeDay) {
		this.closeDay = closeDay;
	}

	public int getPosition18() {
		return position18;
	}

	public void setPosition18(int position18) {
		this.position18 = position18;
	}

	public int getReadMail() {
		return readMail;
	}

	public void setReadMail(int readMail) {
		this.readMail = readMail;
	}

	public int getSendMail() {
		return sendMail;
	}

	public void setSendMail(int sendMail) {
		this.sendMail = sendMail;
	}

	public int getMailDelivred() {
		return mailDelivred;
	}

	public void setMailDelivred(int mailDelivred) {
		this.mailDelivred = mailDelivred;
	}

	public int getSalesDraft() {
		return salesDraft;
	}

	public void setSalesDraft(int salesDraft) {
		this.salesDraft = salesDraft;
	}

	public int getClerkTotals() {
		return clerkTotals;
	}

	public void setClerkTotals(int clerkTotals) {
		this.clerkTotals = clerkTotals;
	}

	public int getCashBackAdjust() {
		return cashBackAdjust;
	}

	public void setCashBackAdjust(int cashBackAdjust) {
		this.cashBackAdjust = cashBackAdjust;
	}

	public int getAdjustWhenAmt() {
		return adjustWhenAmt;
	}

	public void setAdjustWhenAmt(int adjustWhenAmt) {
		this.adjustWhenAmt = adjustWhenAmt;
	}

	public int getPreautLesserAmount() {
		return preautLesserAmount;
	}

	public void setPreautLesserAmount(int preautLesserAmount) {
		this.preautLesserAmount = preautLesserAmount;
	}

	public int getCardActivation() {
		return cardActivation;
	}

	public void setCardActivation(int cardActivation) {
		this.cardActivation = cardActivation;
	}

	public int getAdditionalCardActivation() {
		return additionalCardActivation;
	}

	public void setAdditionalCardActivation(int additionalCardActivation) {
		this.additionalCardActivation = additionalCardActivation;
	}

	public int getReplenchement() {
		return replenchement;
	}

	public void setReplenchement(int replenchement) {
		this.replenchement = replenchement;
	}

	public int getFullRedemption() {
		return fullRedemption;
	}

	public void setFullRedemption(int fullRedemption) {
		this.fullRedemption = fullRedemption;
	}

	public Set<com.mss.unified.entities.PosAllowedTransConf> getPosAllowedTransConfs() {
		return posAllowedTransConfs;
	}

	public void setPosAllowedTransConfs(Set<com.mss.unified.entities.PosAllowedTransConf> posAllowedTransConfs) {
		this.posAllowedTransConfs = posAllowedTransConfs;
	}
}

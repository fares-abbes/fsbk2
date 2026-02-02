package com.mss.unified.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ACTION_CARD",schema = "PORTEUR")
public class ActionCard {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ActionCardSequence")
    @SequenceGenerator(name = "ActionCardSequence", sequenceName = "PORTEUR.ActionCardSequence", allocationSize = 1)
    private int actionCardCode;
    

	@Column(name = "CARD_CODE")
	private int cardCode;
    private Integer isRenewel;
    private Integer isReplacement;
    private Integer isPinChange;
    private Date cardNewExpDate;
    private Integer status;
    private String remplacementReason;
    private boolean remplacementWithPin;
	private String nameInCard;
	private String reeditionPinReason;
	
	private String replacementOldCard;
	
    @Column(columnDefinition = "integer default 0")
    private Integer isVisa;

	
    
	public String getReplacementOldCard() {
		return replacementOldCard;
	}
	public void setReplacementOldCard(String replacementOldCard) {
		this.replacementOldCard = replacementOldCard;
	}
	public String getReeditionPinReason() {
		return reeditionPinReason;
	}
	public void setReeditionPinReason(String reeditionPinReason) {
		this.reeditionPinReason = reeditionPinReason;
	}
	public String getNameInCard() {
		return nameInCard;
	}
	public void setNameInCard(String nameInCard) {
		this.nameInCard = nameInCard;
	}
	public Integer getIsPinChange() {
		return isPinChange;
	}
	public void setIsPinChange(Integer isPinChange) {
		this.isPinChange = isPinChange;
	}
	public boolean isRemplacementWithPin() {
		return remplacementWithPin;
	}
	public void setRemplacementWithPin(boolean remplacementWithPin) {
		this.remplacementWithPin = remplacementWithPin;
	}
	public String getRemplacementReason() {
		return remplacementReason;
	}
	public void setRemplacementReason(String remplacementReason) {
		this.remplacementReason = remplacementReason;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public Date getCardNewExpDate() {
		return cardNewExpDate;
	}
	public void setCardNewExpDate(Date cardNewExpDate) {
		this.cardNewExpDate = cardNewExpDate;
	}
	public int getActionCardCode() {
		return actionCardCode;
	}
	public void setActionCardCode(int actionCardCode) {
		this.actionCardCode = actionCardCode;
	}
	
	public Integer getIsRenewel() {
		return isRenewel;
	}
	public void setIsRenewel(Integer isRenewel) {
		this.isRenewel = isRenewel;
	}
	public Integer getIsReplacement() {
		return isReplacement;
	}
	public void setIsReplacement(Integer isReplacement) {
		this.isReplacement = isReplacement;
	}
	public int getCardCode() {
		return cardCode;
	}
	public void setCardCode(int cardCode) {
		this.cardCode = cardCode;
	}
	public Integer getIsVisa() {
		return isVisa;
	}
	public void setIsVisa(Integer isVisa) {
		this.isVisa = isVisa;
	}


}

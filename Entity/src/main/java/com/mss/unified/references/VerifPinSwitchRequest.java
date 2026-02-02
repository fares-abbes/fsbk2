package com.mss.unified.references;

import com.mss.unified.entities.Card;
import com.mss.unified.entities.SwitchTransaction;

public class VerifPinSwitchRequest {
	
	private SwitchTransaction switchTrans;
	private Card card;
	public SwitchTransaction getSwitchTrans() {
		return switchTrans;
	}
	public void setSwitchTrans(SwitchTransaction switchTrans) {
		this.switchTrans = switchTrans;
	}
	
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}

}

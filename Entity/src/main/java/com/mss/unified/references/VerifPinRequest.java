package com.mss.unified.references;

import org.springframework.web.bind.annotation.RequestBody;

import com.mss.unified.entities.AtmTerminal;
import com.mss.unified.entities.Card;
import com.mss.unified.entities.SwitchTransaction;

public class VerifPinRequest {
	
	private SwitchTransaction switchTrans;
	private AtmTerminal atmTerminal;
	private Card card;
	public SwitchTransaction getSwitchTrans() {
		return switchTrans;
	}
	public void setSwitchTrans(SwitchTransaction switchTrans) {
		this.switchTrans = switchTrans;
	}
	public AtmTerminal getAtmTerminal() {
		return atmTerminal;
	}
	public void setAtmTerminal(AtmTerminal atmTerminal) {
		this.atmTerminal = atmTerminal;
	}
	public Card getCard() {
		return card;
	}
	public void setCard(Card card) {
		this.card = card;
	}

}

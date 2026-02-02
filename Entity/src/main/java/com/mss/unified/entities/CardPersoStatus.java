package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "CARD_PERSO_STATUS",schema = "PORTEUR")
public class CardPersoStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CardPersoStatusSequence")
	@SequenceGenerator(name = "CardPersoStatusSequence", sequenceName = "PORTEUR.CardPersoStatusSequence", allocationSize = 1)
	@Column(name = "CARD_PERSO_STATUS_CODE", nullable = false)
	private int cardPersoStatusCode;

	@Column(name = "LABEL")
	private String label;


	public int getCardPersoStatusCode() {
		return cardPersoStatusCode;
	}

	public void setCardPersoStatusCode(int cardPersoStatusCode) {
		this.cardPersoStatusCode = cardPersoStatusCode;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}

package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_JOURNAL_CONFIG", schema = "ATM")
public class AtmJournalConfig {

	@Id
	@Column(name = "ATM_JOURNAL_NUM", nullable = false)
	private int atmJournalNum;

	@Column(name = "ATM_Journal_LIBELLE", nullable = false)
	private String atmJournalLibelle;

	public int getAtmJournalNum() {
		return atmJournalNum;
	}

	public void setAtmJournalNum(int atmJournalNum) {
		this.atmJournalNum = atmJournalNum;
	}

	public String getAtmJournalLibelle() {
		return atmJournalLibelle;
	}

	public void setAtmJournalLibelle(String atmJournalLibelle) {
		this.atmJournalLibelle = atmJournalLibelle;
	}

}

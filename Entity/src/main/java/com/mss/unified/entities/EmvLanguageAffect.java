package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "LANG_AFFECT",schema = "ATM")
public class EmvLanguageAffect {
	@EmbeddedId
	private EmvLanguageAffectId emvLanguageAffectId;

	public EmvLanguageAffectId getEmvLanguageAffectId() {
		return emvLanguageAffectId;
	}

	public void setEmvLanguageAffectId(EmvLanguageAffectId emvLanguageAffectId) {
		this.emvLanguageAffectId = emvLanguageAffectId;
	}
}

package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LANGS_OPER",schema = "ATM")
public class EmvLanguage {

	@Id
	@Column(name = "LANG_CODE", nullable = false)
	private String emvLangId;
	
	@Column(name = "SCREEN_BASE", nullable = false)
	private String emvLangScreen;
	
	@Column(name = "AUDIO_BASE", nullable = false)
	private String emvLangAudio;
	
	@Column(name = "OPCODE_POSITION", nullable = false)
	private String emvLangOpCodePos;
	
	@Column(name = "OPCODE_VALUE", nullable = false)
	private String emvLangOpCodeVal;

	public String getEmvLangId() {
		return emvLangId;
	}

	public void setEmvLangId(String emvLangId) {
		this.emvLangId = emvLangId;
	}

	public String getEmvLangScreen() {
		return emvLangScreen;
	}

	public void setEmvLangScreen(String emvLangScreen) {
		this.emvLangScreen = emvLangScreen;
	}

	public String getEmvLangAudio() {
		return emvLangAudio;
	}

	public void setEmvLangAudio(String emvLangAudio) {
		this.emvLangAudio = emvLangAudio;
	}

	public String getEmvLangOpCodePos() {
		return emvLangOpCodePos;
	}

	public void setEmvLangOpCodePos(String emvLangOpCodePos) {
		this.emvLangOpCodePos = emvLangOpCodePos;
	}

	public String getEmvLangOpCodeVal() {
		return emvLangOpCodeVal;
	}

	public void setEmvLangOpCodeVal(String emvLangOpCodeVal) {
		this.emvLangOpCodeVal = emvLangOpCodeVal;
	}
}

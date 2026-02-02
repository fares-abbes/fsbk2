package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "EMV_TERMINAL_DATA",schema = "ATM")
public class EmvTerminalData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EmvTerminalDataSequence")
	@SequenceGenerator(name = "EmvTerminalDataSequence", sequenceName = "ATM.EmvTerminalDataSequence", allocationSize = 1)

	@Column(name = "ETD_CODE", nullable = false)
	private Integer emvTerminalDataId;
	
	@Column(name = "TAG_9F1A", nullable = false)
	private String emvCountryCode;
	
	@Column(name = "TAG_9F35", nullable = false)
	private String emvTerminalType;

	public Integer getEmvTerminalDataId() {
		return emvTerminalDataId;
	}

	public void setEmvTerminalDataId(Integer emvTerminalDataId) {
		this.emvTerminalDataId = emvTerminalDataId;
	}

	public String getEmvCountryCode() {
		return emvCountryCode;
	}

	public void setEmvCountryCode(String emvCountryCode) {
		this.emvCountryCode = emvCountryCode;
	}

	public String getEmvTerminalType() {
		return emvTerminalType;
	}

	public void setEmvTerminalType(String emvTerminalType) {
		this.emvTerminalType = emvTerminalType;
	}

	@Override
	public String toString() {
		return "EmvTerminalData{" +
				"emvTerminalDataId=" + emvTerminalDataId +
				", emvCountryCode='" + emvCountryCode + '\'' +
				", emvTerminalType='" + emvTerminalType + '\'' +
				'}';
	}
}

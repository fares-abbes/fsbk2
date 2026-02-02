package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "openingDayM", schema = "FRANSABANK")
public class OpeningDayM {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;

	@Column(name = "Status070")
	private String status070;

	@Column(name = "file_integration")
	private String fileIntegration;
	private int lotIncrementNb;
	private int lotIncrementNbCra;

	public int getLotIncrementNbCra() {
		return lotIncrementNbCra;
	}

	public void setLotIncrementNbCra(int lotIncrementNbCra) {
		this.lotIncrementNbCra = lotIncrementNbCra;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getStatus070() {
		return status070;
	}

	public void setStatus070(String status070) {
		this.status070 = status070;
	}

	public String getFileIntegration() {
		return fileIntegration;
	}

	public void setFileIntegration(String fileIntegration) {
		this.fileIntegration = fileIntegration;
	}

	public int getLotIncrementNb() {
		return lotIncrementNb;
	}

	public void setLotIncrementNb(int lotIncrementNb) {
		this.lotIncrementNb = lotIncrementNb;
	}

	@Override
	public String toString() {
		return "OpeningDayM [code=" + code + ", status070=" + status070 
				+ ", fileIntegration=" + fileIntegration + ", lotIncrementNb=" + lotIncrementNb
				+ ", lotIncrementNbCra=" + lotIncrementNbCra + "]";
	}

}

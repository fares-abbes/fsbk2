package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "openingDay", schema = "FRANSABANK")
public class OpeningDay {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int code;

	@Column(name = "Status040")
	private String status040;
	@Column(name = "Status050")
	private String status050;
	@Column(name = "Status051")
	private String status051;
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

	public String getStatus040() {
		return status040;
	}

	public void setStatus040(String status040) {
		this.status040 = status040;
	}

	public String getStatus050() {
		return status050;
	}

	public void setStatus050(String status050) {
		this.status050 = status050;
	}

	public String getStatus051() {
		return status051;
	}

	public void setStatus051(String status051) {
		this.status051 = status051;
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
		return "OpeningDay [code=" + code + ", status040=" + status040 + ", status050=" + status050 + ", status051="
				+ status051 + ", fileIntegration=" + fileIntegration + ", lotIncrementNb=" + lotIncrementNb
				+ ", lotIncrementNbCra=" + lotIncrementNbCra + "]";
	}

}

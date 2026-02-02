package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MotifReeditionPinCard",schema = "PORTEUR")
public class MotifReeditionPinCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MotifReeditionPinSequence")
	@SequenceGenerator(name = "MotifReeditionPinSequence", sequenceName = "PORTEUR.MotifReeditionPinSequence")
	@Column(name = "ID_MOTIF", nullable = false)
	private int motifCode;
	
	private String motifReedtionPin;
	private String codeFsbk;
	private String motifFr;
	public int getMotifCode() {
		return motifCode;
	}
	public void setMotifCode(int motifCode) {
		this.motifCode = motifCode;
	}
	public String getMotifReedtionPin() {
		return motifReedtionPin;
	}
	public void setMotifReedtionPin(String motifReedtionPin) {
		this.motifReedtionPin = motifReedtionPin;
	}
	public String getCodeFsbk() {
		return codeFsbk;
	}
	public void setCodeFsbk(String codeFsbk) {
		this.codeFsbk = codeFsbk;
	}
	public String getMotifFr() {
		return motifFr;
	}
	public void setMotifFr(String motifFr) {
		this.motifFr = motifFr;
	}




}

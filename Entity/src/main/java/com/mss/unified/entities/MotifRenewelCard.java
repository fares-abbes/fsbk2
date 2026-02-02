package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MotifRenewelCard",schema = "PORTEUR")
public class MotifRenewelCard {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MotifRenewelCardSequence")
	@SequenceGenerator(name = "MotifRenewelCardSequence", sequenceName = "PORTEUR.MotifRenewelCardSequence")
	@Column(name = "ID_MOTIF", nullable = false)
	private int motifCode;
	
	
	private String motifRenewel;
	private String codeFsbk;
	private String motifFr;

	public String getCodeFsbk() {
		return codeFsbk;
	}


	public void setCodeFsbk(String codeFsbk) {
		this.codeFsbk = codeFsbk;
	}


	public int getMotifCode() {
		return motifCode;
	}


	public void setMotifCode(int motifCode) {
		this.motifCode = motifCode;
	}


	public String getMotifRenewel() {
		return motifRenewel;
	}


	public void setMotifRenewel(String motifRenewel) {
		this.motifRenewel = motifRenewel;
	}


	public String getMotifFr() {
		return motifFr;
	}


	public void setMotifFr(String motifFr) {
		this.motifFr = motifFr;
	}


}

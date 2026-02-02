package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MOTIF_OPPOSITION",schema = "PORTEUR")
public class MotifOpposition {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MotifOppositionSequence")
	@SequenceGenerator(name = "MotifOppositionSequence", sequenceName = "PORTEUR.MotifOppositionSequence")
	@Column(name = "ID_MOTIF", nullable = false)
	private int motifCode;
	
	
	private String motifOpposition;
	private String motifFr;

	
	public String getMotifFr() {
		return motifFr;
	}


	public void setMotifFr(String motifFr) {
		this.motifFr = motifFr;
	}


	public int getMotifCode() {
		return motifCode;
	}


	public void setMotifCode(int motifCode) {
		this.motifCode = motifCode;
	}


	public String getMotifOpposition() {
		return motifOpposition;
	}


	public void setMotifOpposition(String motifOpposition) {
		this.motifOpposition = motifOpposition;
	}
	
	

}

package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "POS_MARQUE",schema = "POS")
public class PosMarque {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "PosMarqueSequence")
	  @SequenceGenerator(name = "PosMarqueSequence", sequenceName = "POS.PosMarqueSequence", allocationSize = 1)
	  @Column(name = "MARQUE_CODE", nullable = false)
	  private Integer marqueCode;

	  @Column(name = "LIBELLE", nullable = false,unique = true)
	  private String libelle;

	public Integer getMarqueCode() {
		return marqueCode;
	}

	public void setMarqueCode(Integer marqueCode) {
		this.marqueCode = marqueCode;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "PosMarque [marqueCode=" + marqueCode + ", libelle=" + libelle + "]";
	}
	  
	  

}

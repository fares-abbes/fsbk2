package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_SCREEN_CONFIG", schema = "ATM")
public
class AtmScreenConfig {

	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "ASCSequence")
	  @SequenceGenerator(name = "ASCSequence", sequenceName = "ATM.ASCSequence", allocationSize = 1)
	  @Column(name = "ASC_CODE", nullable = false)
	  private int atmScreenConfigCode;

	  @Column(name = "ASC_LIBELLE")
	  private String libelle;

	  public int getAtmScreenConfigCode() {
	    return atmScreenConfigCode;
	  }

	  public void setAtmScreenConfigCode(int atmScreenConfigCode) {
	    this.atmScreenConfigCode = atmScreenConfigCode;
	  }

	  public String getLibelle() {
	    return libelle;
	  }

	  public void setLibelle(String libelle) {
	    this.libelle = libelle;
	  }
}

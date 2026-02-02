package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "ATM_FITS_APPLICATION", schema = "ATM")
public
class AtmFitsApplication {

	  @Id
	  @Column(name = "AFP_CODE", nullable = false)
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  @SequenceGenerator(name = "AtmFitsApplicationSequence", sequenceName = "ATM.AtmFitsApplicationSequence", allocationSize = 1)
	  private int atmFitsApp;
  @Column(name = "AFP_LIBELLE")
  private String atmFitsAppLibelle;


  public int getAtmFitsApp() {
    return atmFitsApp;
  }

  public void setAtmFitsApp(int atmFitsApp) {
    this.atmFitsApp = atmFitsApp;
  }

  public String getAtmFitsAppLibelle() {
    return atmFitsAppLibelle;
  }

  public void setAtmFitsAppLibelle(String atmFitsAppLibelle) {
    this.atmFitsAppLibelle = atmFitsAppLibelle;
  }

  @Override
  public String toString() {
    return "AtmFitsApplication{" +
        "atmFitsApp=" + atmFitsApp +
        ", atmFitsAppLibelle='" + atmFitsAppLibelle + '\'' +
        '}';
  }
}

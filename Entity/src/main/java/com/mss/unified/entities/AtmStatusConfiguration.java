package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "ATM_STATES_CONFIGURATION", schema = "ATM")
public
class AtmStatusConfiguration {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "ASCSequence")
	  @SequenceGenerator(name = "ASCSequence", sequenceName = "ATM.ASCSequence", allocationSize = 1)
	  @Column(name = "NUM_STAT_APPLI", nullable = false)
	  private int numStatusApplicationCode;
  @Column(name = "LIBELLE_STAT_APPL")
  private String libelleStatusApplication;


  public int getNumStatusApplicationCode() {
    return numStatusApplicationCode;
  }

  public void setNumStatusApplicationCode(int numStatusApplicationCode) {
    this.numStatusApplicationCode = numStatusApplicationCode;
  }

  public String getLibelleStatusApplication() {
    return libelleStatusApplication;
  }

  public void setLibelleStatusApplication(String libelleStatusApplication) {
    this.libelleStatusApplication = libelleStatusApplication;
  }
}

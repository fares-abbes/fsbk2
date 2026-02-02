package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "EMV_LANG_CONFIG",schema = "ATM")
public class EmvLangConfig {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "EmvLangConfigSequence")
	  @SequenceGenerator(name = "EmvLangConfigSequence", sequenceName = "ATM.EmvLangConfigSequence", allocationSize = 1)
	  @Column(name = "ELC_CODE", nullable = false)
	  private int elcCode;
  @Column(name = "ELC_LIBELLE")
  private String elcLibelle;

  public int getElcCode() {
    return elcCode;
  }

  public void setElcCode(int elcCode) {
    this.elcCode = elcCode;
  }

  public String getElcLibelle() {
    return elcLibelle;
  }

  public void setElcLibelle(String elcLibelle) {
    this.elcLibelle = elcLibelle;
  }

  @Override
  public String toString() {
    return "EmvLangConfig{" +
        "elcCode=" + elcCode +
        ", elcLibelle='" + elcLibelle + '\'' +
        '}';
  }
}

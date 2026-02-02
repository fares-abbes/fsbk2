package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name="TVR",schema = "SWITCH")
public class Tvr {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "TvrSequence")
	  @SequenceGenerator(name = "TvrSequence", sequenceName = "SWITCH.TvrSequence", allocationSize = 1)
	  @Column(name = "TVR_CODE", nullable = false)
	  private int tvrCode;
  @Column(name = "TVR_VALUE", nullable = false)
  private String tvrValue;
  @Column(name = "LIBELLE", nullable = false)
  private String libelle;


  public int getTvrCode() {
    return tvrCode;
  }

  public void setTvrCode(int tvrCode) {
    this.tvrCode = tvrCode;
  }

  public String getTvrValue() {
    return tvrValue;
  }

  public void setTvrValue(String tvrValue) {
    this.tvrValue = tvrValue;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }


  public Tvr() {
  }


  public Tvr(String libelle,String tvrValue) {
    this.tvrValue = tvrValue;
    this.libelle = libelle;
  }


  @Override
  public String toString() {
    return "Tvr{" +
        "tvrCode=" + tvrCode +
        ", tvrValue='" + tvrValue + '\'' +
        ", libelle='" + libelle + '\'' +
        '}';
  }
}

package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "ROUTAGE",schema = "SWITCH")
public class Routage {


	  @Id
	  @GeneratedValue(strategy= GenerationType.AUTO, generator = "RoutageSequence")
	  @SequenceGenerator(name = "RoutageSequence", sequenceName = "SWITCH.RoutageSequence",  allocationSize = 1)
	  @Column(name = "ROUTAGE_CODE", nullable = false)
	  private Integer routageCode;
  @Column(name = "LIBELLE", nullable = false)
  private String libelle;

  @Column(name = "PINKEY", nullable = false)
  private String pinKey;

  @Column(name = "PINKCV", nullable = false)
  private String pinKcv;
  @Column(name = "TPKKEY", nullable = false)
  private String tpkKey;

  @Column(name = "TPKKCV", nullable = false)
  private String tpkKcv;
  @Column(name = "ZPK", nullable = false)
  private String zpk;


  public String getZpk() {
    return zpk;
  }

  public void setZpk(String zpk) {
    this.zpk = zpk;
  }

  public String getPinKey() {
    return pinKey;
  }

  public void setPinKey(String pinKey) {
    this.pinKey = pinKey;
  }

  public String getPinKcv() {
    return pinKcv;
  }

  public void setPinKcv(String pinKcv) {
    this.pinKcv = pinKcv;
  }

  public String getTpkKey() {
    return tpkKey;
  }

  public void setTpkKey(String tpkKey) {
    this.tpkKey = tpkKey;
  }

  public String getTpkKcv() {
    return tpkKcv;
  }

  public void setTpkKcv(String tpkKcv) {
    this.tpkKcv = tpkKcv;
  }

  public Integer getRoutageCode() {
    return routageCode;
  }

  public void setRoutageCode(Integer routageCode) {
    this.routageCode = routageCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }



}

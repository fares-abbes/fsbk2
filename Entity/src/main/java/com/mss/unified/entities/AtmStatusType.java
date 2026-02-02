package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_STATES_TYPE", schema = "ATM")
public
class AtmStatusType {

  @Id
  @Column(name = "AST_CODE", nullable = false)
  private int atmStatusTypeCode;

  @Column(name = "STAT_TYPE", nullable = false)
  private String statusType;

  @Column(name = "STAT_LIBELLE")
  private String statusLibelle;

  @Column(name = "P1_LIBELLE")
  private String p1Libelle;

  @Column(name = "P2_LIBELLE")
  private String p2Libelle;

  @Column(name = "P3_LIBELLE")
  private String p3Libelle;

  @Column(name = "P4_LIBELLE")
  private String p4Libelle;

  @Column(name = "P5_LIBELLE")
  private String p5Libelle;

  @Column(name = "P6_LIBELLE")
  private String p6Libelle;

  @Column(name = "P7_LIBELLE")
  private String p7Libelle;

  @Column(name = "P8_LIBELLE")
  private String p8Libelle;

  public AtmStatusType() {
  }

  public int getAtmStatusTypeCode() {
    return atmStatusTypeCode;
  }

  public void setAtmStatusTypeCode(int atmStatusTypeCode) {
    this.atmStatusTypeCode = atmStatusTypeCode;
  }

  public String getStatusType() {
    return statusType;
  }

  public void setStatusType(String statusType) {
    this.statusType = statusType;
  }

  public String getStatusLibelle() {
    return statusLibelle;
  }

  public void setStatusLibelle(String statusLibelle) {
    this.statusLibelle = statusLibelle;
  }

  public String getP1Libelle() {
    return p1Libelle;
  }

  public void setP1Libelle(String p1Libelle) {
    this.p1Libelle = p1Libelle;
  }

  public String getP5Libelle() {
    return p5Libelle;
  }

  public void setP5Libelle(String p5Libelle) {
    this.p5Libelle = p5Libelle;
  }

  public String getP2Libelle() {
    return p2Libelle;
  }

  public void setP2Libelle(String p2Libelle) {
    this.p2Libelle = p2Libelle;
  }

  public String getP3Libelle() {
    return p3Libelle;
  }

  public void setP3Libelle(String p3Libelle) {
    this.p3Libelle = p3Libelle;
  }

  public String getP4Libelle() {
    return p4Libelle;
  }

  public void setP4Libelle(String p4Libelle) {
    this.p4Libelle = p4Libelle;
  }

  public String getP6Libelle() {
    return p6Libelle;
  }

  public void setP6Libelle(String p6Libelle) {
    this.p6Libelle = p6Libelle;
  }

  public String getP7Libelle() {
    return p7Libelle;
  }

  public void setP7Libelle(String p7Libelle) {
    this.p7Libelle = p7Libelle;
  }

  public String getP8Libelle() {
    return p8Libelle;
  }

  public void setP8Libelle(String p8Libelle) {
    this.p8Libelle = p8Libelle;
  }


  @Override
  public String toString() {
    return "AtmStatusType{" +
        "atmStatusTypeCode=" + atmStatusTypeCode +
        ", statusType='" + statusType + '\'' +
        ", statusLibelle='" + statusLibelle + '\'' +
        ", p1Libelle='" + p1Libelle + '\'' +
        ", p2Libelle='" + p2Libelle + '\'' +
        ", p3Libelle='" + p3Libelle + '\'' +
        ", p4Libelle='" + p4Libelle + '\'' +
        ", p5Libelle='" + p5Libelle + '\'' +
        ", p6Libelle='" + p6Libelle + '\'' +
        ", p7Libelle='" + p7Libelle + '\'' +
        ", p8Libelle='" + p8Libelle + '\'' +
        '}';
  }
}

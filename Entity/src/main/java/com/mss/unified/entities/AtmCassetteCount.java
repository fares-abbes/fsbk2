package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

 

@Entity
@Table(name = "ATM_CASSETTE_COUNT", schema = "ATM")
public class AtmCassetteCount {

  @EmbeddedId
  private AtmCassetteCountId atmCassetteCountId;

  @Column(name = "CASSETTE_VALUE")
  private String atmCassetteValue;

  @Column(name = "NOTE_IN_CASS")
  private String atmCassetteNoteIn;

  @Column(name = "NOTE_REJECTED")
  private String atmCassetteNoteRejected;

  @Column(name = "NOTE_DISPENSED")
  private String atmCassetteNoteDispensed;

  @Column(name = "NOTE_LAST_TRANS")
  private String atmCassetteNoteLastTrans;

  @Column(name = "CASSETTE_DEVISE")
  private String atmCassetteDevise;

  public String getAtmCassetteValue() {
    return atmCassetteValue;
  }

  public void setAtmCassetteValue(String atmCassetteValue) {
    this.atmCassetteValue = atmCassetteValue;
  }

  public AtmCassetteCountId getAtmCassetteCountId() {
    return atmCassetteCountId;
  }

  public void setAtmCassetteCountId(AtmCassetteCountId atmCassetteCountId) {
    this.atmCassetteCountId = atmCassetteCountId;
  }

  public String getAtmCassetteNoteIn() {
    return atmCassetteNoteIn;
  }

  public void setAtmCassetteNoteIn(String atmCassetteNoteIn) {
    this.atmCassetteNoteIn = atmCassetteNoteIn;
  }

  public String getAtmCassetteNoteRejected() {
    return atmCassetteNoteRejected;
  }

  public void setAtmCassetteNoteRejected(String atmCassetteNoteRejected) {
    this.atmCassetteNoteRejected = atmCassetteNoteRejected;
  }

  public String getAtmCassetteNoteDispensed() {
    return atmCassetteNoteDispensed;
  }

  public void setAtmCassetteNoteDispensed(String atmCassetteNoteDispensed) {
    this.atmCassetteNoteDispensed = atmCassetteNoteDispensed;
  }

  public String getAtmCassetteNoteLastTrans() {
    return atmCassetteNoteLastTrans;
  }

  public void setAtmCassetteNoteLastTrans(String atmCassetteNoteLastTrans) {
    this.atmCassetteNoteLastTrans = atmCassetteNoteLastTrans;
  }

  public String getAtmCassetteDevise() {
    return atmCassetteDevise;
  }

  public void setAtmCassetteDevise(String atmCassetteDevise) {
    this.atmCassetteDevise = atmCassetteDevise;
  }

}

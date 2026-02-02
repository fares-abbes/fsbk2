package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCY_VALUE", schema = "ATM")
public class CurrencyValue {

  @Id
  @Column(name = "CURR_CODE", nullable = false)
  private String currCodeID;

  @Column(name = "CURR_EXPONENET", nullable = false)
  private String currExp;

  @Column(name = "LIBELLE_DEVISE", nullable = false)
  private String currLibelle;

  public String getCurrCodeID() {
    return currCodeID;
  }

  public void setCurrCodeID(String currCodeID) {
    this.currCodeID = currCodeID;
  }

  public String getCurrExp() {
    return currExp;
  }

  public void setCurrExp(String currExp) {
    this.currExp = currExp;
  }

  public String getCurrLibelle() {
    return currLibelle;
  }

  public void setCurrLibelle(String currLibelle) {
    this.currLibelle = currLibelle;
  }

}

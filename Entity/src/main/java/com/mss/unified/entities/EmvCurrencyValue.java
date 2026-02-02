package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMV_CURRENCY_VALUE", schema = "ATM")
public
class EmvCurrencyValue {

  @Id
  @Column(name = "TRANS_CURR_CODE", nullable = false)
  private String transCurrCode;

  @Column(name = "TRANS_CURR_EXPONENET", nullable = false)
  private String transCurExponent;

  @Column(name = "LIBELLE_DEVISE", nullable = false)
  private String CurrLibelle;


  public String getTransCurrCode() {
    return transCurrCode;
  }

  public void setTransCurrCode(String transCurrCode) {
    this.transCurrCode = transCurrCode;
  }

  public String getTransCurExponent() {
    return transCurExponent;
  }

  public void setTransCurExponent(String transCurExponent) {
    this.transCurExponent = transCurExponent;
  }

public String getCurrLibelle() {
	return CurrLibelle;
}

public void setCurrLibelle(String currLibelle) {
	CurrLibelle = currLibelle;
}

 
}

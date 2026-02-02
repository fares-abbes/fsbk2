package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_IMPRESSION_CONFIG", schema = "ATM")
public
class AtmImpressionConfiguration {

  @Id
  @Column(name = "ATM_IMPR_NUM", nullable = false)
  private int atmImpressionNum;
  @Column(name = "ATM_IMP_LIBELLE", nullable = false)
  private String atmImpressionLibelle;


  public int getAtmImpressionNum() {
    return atmImpressionNum;
  }

  public void setAtmImpressionNum(int atmImpressionNum) {
    this.atmImpressionNum = atmImpressionNum;
  }

  public String getAtmImpressionLibelle() {
    return atmImpressionLibelle;
  }

  public void setAtmImpressionLibelle(String atmImpressionLibelle) {
    this.atmImpressionLibelle = atmImpressionLibelle;
  }
}

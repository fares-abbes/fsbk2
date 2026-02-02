package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_TRANS_REPLY_CONF", schema = "ATM")
public
class AtmTransactionReplyConfiguration {

  @Id
  @Column(name = "ATRC_CODE", nullable = false)
  private int atmTransactionReplyConfigurationCode;

  @Column(name = "ATRC_LIBELLE")
  private String atmTransactionReplyConfigurationLibelle;


  public int getAtmTransactionReplyConfigurationCode() {
    return atmTransactionReplyConfigurationCode;
  }

  public void setAtmTransactionReplyConfigurationCode(int atmTransactionReplyConfigurationCode) {
    this.atmTransactionReplyConfigurationCode = atmTransactionReplyConfigurationCode;
  }

  public String getAtmTransactionReplyConfigurationLibelle() {
    return atmTransactionReplyConfigurationLibelle;
  }

  public void setAtmTransactionReplyConfigurationLibelle(
      String atmTransactionReplyConfigurationLibelle) {
    this.atmTransactionReplyConfigurationLibelle = atmTransactionReplyConfigurationLibelle;
  }
}

package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "ATM_TRANS_REPLY_VALUE",schema = "ATM")
public class AtmTransactionReplyValue {

  @EmbeddedId
  private AtmTransactionReplyValueId atmTransactionReplyValueId;
  @Column(name = "ASC_CODE")
  private String atmTransactionReplyScreenConfig;
  @Column(name = "NUM_SCREEN")
  private String atmTransactionReplyScreenNum;
  @Column(name = "NUM_STAT_APPLI")
  private String atmTransactionReplyStatConfig;
  @Column(name = "STAT_NUM")
  private String atmTransactionReplyStatNum;
  public AtmTransactionReplyValueId getAtmTransactionReplyValueId() {
    return atmTransactionReplyValueId;
  }

  public void setAtmTransactionReplyValueId(AtmTransactionReplyValueId atmTransactionReplyValueId) {
    this.atmTransactionReplyValueId = atmTransactionReplyValueId;
  }

  public String getAtmTransactionReplyScreenConfig() {
    return atmTransactionReplyScreenConfig;
  }

  public void setAtmTransactionReplyScreenConfig(String atmTransactionReplyScreenConfig) {
    this.atmTransactionReplyScreenConfig = atmTransactionReplyScreenConfig;
  }

  public String getAtmTransactionReplyScreenNum() {
    return atmTransactionReplyScreenNum;
  }

  public void setAtmTransactionReplyScreenNum(String atmTransactionReplyScreenNum) {
    this.atmTransactionReplyScreenNum = atmTransactionReplyScreenNum;
  }

  public String getAtmTransactionReplyStatConfig() {
    return atmTransactionReplyStatConfig;
  }

  public void setAtmTransactionReplyStatConfig(String atmTransactionReplyStatConfig) {
    this.atmTransactionReplyStatConfig = atmTransactionReplyStatConfig;
  }

  public String getAtmTransactionReplyStatNum() {
    return atmTransactionReplyStatNum;
  }

  public void setAtmTransactionReplyStatNum(String atmTransactionReplyStatNum) {
    this.atmTransactionReplyStatNum = atmTransactionReplyStatNum;
  }

}

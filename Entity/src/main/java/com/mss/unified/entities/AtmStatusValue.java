package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_STATES_VALUE", schema = "ATM")
public
class AtmStatusValue {

  @Id
  @Column(name = "STAT_NUM", nullable = false)
  private String statusNum;
  @Column(name = "NUM_STAT_APPLI", nullable = false)
  private int numStatApplication;
  @Column(name = "AST_CODE")
  private int atmStatusCode;

  @Column(name = "P1_VALUE")
  private String p1Value;

  @Column(name = "P2_VALUE")
  private String p2Value;

  @Column(name = "P3_VALUE")
  private String p3Value;

  @Column(name = "P4_VALUE")
  private String p4Value;

  @Column(name = "P5_VALUE")
  private String p5Value;

  @Column(name = "P6_VALUE")
  private String p6Value;

  @Column(name = "P7_VALUE")
  private String p7Value;

  @Column(name = "P8_VALUE")
  private String p8Value;

 

  public String getStatusNum() {
	return statusNum;
}

public void setStatusNum(String statusNum) {
	this.statusNum = statusNum;
}

public int getNumStatApplication() {
    return numStatApplication;
  }

  public void setNumStatApplication(int numStatApplication) {
    this.numStatApplication = numStatApplication;
  }

  public int getAtmStatusCode() {
    return atmStatusCode;
  }

  public void setAtmStatusCode(int atmStatusCode) {
    this.atmStatusCode = atmStatusCode;
  }

  public String getP1Value() {
    return p1Value;
  }

  public void setP1Value(String p1Value) {
    this.p1Value = p1Value;
  }

  public String getP2Value() {
    return p2Value;
  }

  public void setP2Value(String p2Value) {
    this.p2Value = p2Value;
  }

  public String getP3Value() {
    return p3Value;
  }

  public void setP3Value(String p3Value) {
    this.p3Value = p3Value;
  }

  public String getP4Value() {
    return p4Value;
  }

  public void setP4Value(String p4Value) {
    this.p4Value = p4Value;
  }

  public String getP5Value() {
    return p5Value;
  }

  public void setP5Value(String p5Value) {
    this.p5Value = p5Value;
  }

  public String getP6Value() {
    return p6Value;
  }

  public void setP6Value(String p6Value) {
    this.p6Value = p6Value;
  }

  public String getP7Value() {
    return p7Value;
  }

  public void setP7Value(String p7Value) {
    this.p7Value = p7Value;
  }

  public String getP8Value() {
    return p8Value;
  }

  public void setP8Value(String p8Value) {
    this.p8Value = p8Value;
  }
}

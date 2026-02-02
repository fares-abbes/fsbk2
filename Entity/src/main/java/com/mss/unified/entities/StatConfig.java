package com.mss.unified.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "stat_config",schema = "ATM")
public class StatConfig {


  @Id
  private String statNum;
  private String statType;
  private String p1Value;
  private String p2Value;
  private String p3Value;
  private String p4Value;
  private String p5Value;
  private String p6Value;
  private String p7Value;
  private String p8Value;

  public StatConfig(String statNum, String statType, String p1Value, String p2Value, String p3Value,
      String p4Value, String p5Value, String p6Value, String p7Value, String p8Value) {
    this.statNum = statNum;
    this.statType = statType;
    this.p1Value = p1Value;
    this.p2Value = p2Value;
    this.p3Value = p3Value;
    this.p4Value = p4Value;
    this.p5Value = p5Value;
    this.p6Value = p6Value;
    this.p7Value = p7Value;
    this.p8Value = p8Value;
  }

  public StatConfig() {

  }

   

  public String getStatNum() {
	return statNum;
}

public void setStatNum(String statNum) {
	this.statNum = statNum;
}

public String getStatType() {
    return statType;
  }

  public void setStatType(String statType) {
    this.statType = statType;
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


  @Override
  public String toString() {
    return "StatConfig{" +
        "statNum=" + statNum +
        ", statType='" + statType + '\'' +
        ", p1Value='" + p1Value + '\'' +
        ", p2Value='" + p2Value + '\'' +
        ", p3Value='" + p3Value + '\'' +
        ", p4Value='" + p4Value + '\'' +
        ", p5Value='" + p5Value + '\'' +
        ", p6Value='" + p6Value + '\'' +
        ", p7Value='" + p7Value + '\'' +
        ", p8Value='" + p8Value + '\'' +
        '}';
  }
}

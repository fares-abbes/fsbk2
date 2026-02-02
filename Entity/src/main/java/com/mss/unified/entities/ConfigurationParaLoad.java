package com.mss.unified.entities;


import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "CONF_PARAM_LOAD", schema = "ATM")
public
class ConfigurationParaLoad {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "ACPL_CCODE", nullable = false)
  @JsonProperty("ACPL_CCODE")
  private int atmConfigParamLoadCode;

  @Column(name = "FIELD_M_VALUE")
  private String fieldMValue;

  @Column(name = "CAMERA_VALUE")
  private String cameraValue;

  @Column(name = "ACPL_LIBELLE")
  @JsonProperty("ACPL_LIBELLE")
  private String libelle;

  @Column(name = "FIELD_I")
  private String fieldI;

  @Column(name = "FIELD_J")
  private String fieldJ;

  @Column(name = "FIELD_K")
  private String fieldK;

  @Column(name = "FIELD_L")
  private String fieldL;

  @Column(name = "FIELD_N")
  private String fieldN;

  @Column(name = "TIMER_00")
  private String timer00;

  @Column(name = "TIMER_01")
  private String timer01;
  @Column(name = "TIMER_02")
  private String timer02;
  @Column(name = "TIMER_03")
  private String timer03;
  @Column(name = "TIMER_04")
  private String timer04;
  @Column(name = "TIMER_05")
  private String timer05;
  @Column(name = "TIMER_06")
  private String timer06;
  @Column(name = "TIMER_07")
  private String timer07;
  @Column(name = "TIMER_0")
  private String timer08;
  @Column(name = "TIMER_09")
  private String timer09;
  @Column(name = "TIMER_10")
  private String timer10;
  @Column(name = "TIMER_60")
  private String timer60;
  @Column(name = "TIMER_61")
  private String timer61;
  @Column(name = "TIMER_63")
  private String timer63;
  @Column(name = "TIMER_68")
  private String timer68;
  @Column(name = "TIMER_69")
  private String timer69;
  @Column(name = "TIMER_72")
  private String timer72;
  @Column(name = "TIMER_77")
  private String timer77;
  @Column(name = "TIMER_78")
  private String timer78;

  @Column(name = "TIMER_87")
  private String timer87;
  @Column(name = "TIMER_91")
  private String timer91;
  @Column(name = "TIMER_92")
  private String timer92;
  @Column(name = "TIMER_94")
  private String timer94;
  @Column(name = "TIMER_95")
  private String timer95;

  @Column(name = "TIMER_96")
  private String timer96;
  @Column(name = "TIMER_97")
  private String timer97;

  public int getAtmConfigParamLoadCode() {
    return atmConfigParamLoadCode;
  }

  public void setAtmConfigParamLoadCode(int atmConfigParamLoadCode) {
    this.atmConfigParamLoadCode = atmConfigParamLoadCode;
  }

  public String getFieldMValue() {
    return fieldMValue;
  }

  public void setFieldMValue(String fieldMValue) {
    this.fieldMValue = fieldMValue;
  }

  public String getCameraValue() {
    return cameraValue;
  }

  public void setCameraValue(String cameraValue) {
    this.cameraValue = cameraValue;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public String getFieldI() {
    return fieldI;
  }

  public void setFieldI(String fieldI) {
    this.fieldI = fieldI;
  }

  public String getFieldJ() {
    return fieldJ;
  }

  public void setFieldJ(String fieldJ) {
    this.fieldJ = fieldJ;
  }

  public String getFieldK() {
    return fieldK;
  }

  public void setFieldK(String fieldK) {
    this.fieldK = fieldK;
  }

  public String getFieldL() {
    return fieldL;
  }

  public void setFieldL(String fieldL) {
    this.fieldL = fieldL;
  }

  public String getFieldN() {
    return fieldN;
  }

  public void setFieldN(String fieldN) {
    this.fieldN = fieldN;
  }

  public String getTimer00() {
    return timer00;
  }

  public void setTimer00(String timer00) {
    this.timer00 = timer00;
  }

  public String getTimer01() {
    return timer01;
  }

  public void setTimer01(String timer01) {
    this.timer01 = timer01;
  }

  public String getTimer02() {
    return timer02;
  }

  public void setTimer02(String timer02) {
    this.timer02 = timer02;
  }

  public String getTimer03() {
    return timer03;
  }

  public void setTimer03(String timer03) {
    this.timer03 = timer03;
  }

  public String getTimer04() {
    return timer04;
  }

  public void setTimer04(String timer04) {
    this.timer04 = timer04;
  }

  public String getTimer05() {
    return timer05;
  }

  public void setTimer05(String timer05) {
    this.timer05 = timer05;
  }

  public String getTimer06() {
    return timer06;
  }

  public void setTimer06(String timer06) {
    this.timer06 = timer06;
  }

  public String getTimer07() {
    return timer07;
  }

  public void setTimer07(String timer07) {
    this.timer07 = timer07;
  }

  public String getTimer08() {
    return timer08;
  }

  public void setTimer08(String timer08) {
    this.timer08 = timer08;
  }

  public String getTimer09() {
    return timer09;
  }

  public void setTimer09(String timer09) {
    this.timer09 = timer09;
  }

  public String getTimer10() {
    return timer10;
  }

  public void setTimer10(String timer10) {
    this.timer10 = timer10;
  }

  public String getTimer60() {
    return timer60;
  }

  public void setTimer60(String timer60) {
    this.timer60 = timer60;
  }

  public String getTimer61() {
    return timer61;
  }

  public void setTimer61(String timer61) {
    this.timer61 = timer61;
  }

  public String getTimer63() {
    return timer63;
  }

  public void setTimer63(String timer63) {
    this.timer63 = timer63;
  }

  public String getTimer68() {
    return timer68;
  }

  public void setTimer68(String timer68) {
    this.timer68 = timer68;
  }

  public String getTimer69() {
    return timer69;
  }

  public void setTimer69(String timer69) {
    this.timer69 = timer69;
  }

  public String getTimer72() {
    return timer72;
  }

  public void setTimer72(String timer72) {
    this.timer72 = timer72;
  }

  public String getTimer77() {
    return timer77;
  }

  public void setTimer77(String timer77) {
    this.timer77 = timer77;
  }

  public String getTimer78() {
    return timer78;
  }

  public void setTimer78(String timer78) {
    this.timer78 = timer78;
  }

  public String getTimer87() {
    return timer87;
  }

  public void setTimer87(String timer87) {
    this.timer87 = timer87;
  }

  public String getTimer91() {
    return timer91;
  }

  public void setTimer91(String timer91) {
    this.timer91 = timer91;
  }

  public String getTimer92() {
    return timer92;
  }

  public void setTimer92(String timer92) {
    this.timer92 = timer92;
  }

  public String getTimer94() {
    return timer94;
  }

  public void setTimer94(String timer94) {
    this.timer94 = timer94;
  }

  public String getTimer95() {
    return timer95;
  }

  public void setTimer95(String timer95) {
    this.timer95 = timer95;
  }

  public String getTimer96() {
    return timer96;
  }

  public void setTimer96(String timer96) {
    this.timer96 = timer96;
  }

  public String getTimer97() {
    return timer97;
  }

  public void setTimer97(String timer97) {
    this.timer97 = timer97;
  }
}

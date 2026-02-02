package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "ATM_CASS_MAP_VALUE", schema = "ATM")
public
class AtmCassetteMapValue {

  @Id
  @Column(name = "ACMP_CODE", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int acmpCode;


  @Column(name = "ACMP_LIBELLE")
  private String acmpLibelle;
  @Column(name = "VALUE_CASS1")
  private int valueCass1;
  @Column(name = "DEVISE_CASS1")
  private String deviceCass1;
  @Column(name = "VALUE_CASS2")
  private int valueCass2;
  @Column(name = "DEVISE_CASS2")
  private String deviceCass2;
  @Column(name = "VALUE_CASS3")
  private int valueCass3;
  @Column(name = "DEVISE_CASS3")
  private String deviceCass3;
  @Column(name = "VALUE_CASS4")
  private int valueCass4;
  @Column(name = "DEVISE_CASS4")
  private String deviceCass4;
 
public int getAcmpCode() {
    return acmpCode;
  }

  public void setAcmpCode(int acmpCode) {
    this.acmpCode = acmpCode;
  }

  public String getAcmpLibelle() {
    return acmpLibelle;
  }

  public void setAcmpLibelle(String acmpLibelle) {
    this.acmpLibelle = acmpLibelle;
  }

  public int getValueCass1() {
    return valueCass1;
  }

  public void setValueCass1(int valueCass1) {
    this.valueCass1 = valueCass1;
  }

 
  public int getValueCass2() {
    return valueCass2;
  }

  public void setValueCass2(int valueCass2) {
    this.valueCass2 = valueCass2;
  }

  

  public String getDeviceCass1() {
	return deviceCass1;
}

public void setDeviceCass1(String deviceCass1) {
	this.deviceCass1 = deviceCass1;
}

public String getDeviceCass2() {
	return deviceCass2;
}

public void setDeviceCass2(String deviceCass2) {
	this.deviceCass2 = deviceCass2;
}

public int getValueCass3() {
    return valueCass3;
  }

  public void setValueCass3(int valueCass3) {
    this.valueCass3 = valueCass3;
  }

  public String getDeviceCass3() {
    return deviceCass3;
  }

  public void setDeviceCass3(String deviceCass3) {
    this.deviceCass3 = deviceCass3;
  }

  public int getValueCass4() {
    return valueCass4;
  }

  public void setValueCass4(int valueCass4) {
    this.valueCass4 = valueCass4;
  }

  public String getDeviceCass4() {
    return deviceCass4;
  }

  public void setDeviceCass4(String deviceCass4) {
    this.deviceCass4 = deviceCass4;
  }
}

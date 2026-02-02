package com.mss.unified.entities;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ATM_FITS_VALUE", schema = "ATM")
public
class AtmFitsValue implements Serializable {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmFitsValue")
	  @SequenceGenerator(name = "AtmFitsValueSequence", sequenceName = "ATM.AtmFitsValueSequence", allocationSize = 1)
	  @Column(name = "ID", nullable = false)
	  private Integer id;


  @Column(name = "FIT_NUMBER", nullable = false)
  private String fitNumber;

  @Column(name = "AFP_CODE", nullable = false)
  private String atmFitsApp;



  @Column(name = "PIDDX")
  private String piddx;

  @Column(name = "PFIID")
  private String pfiid;

  @Column(name = "PSTDX")
  private String pstdx;

  @Column(name = "PAGDX")
  private String pagdx;

  @Column(name = "PMXPN")
  private String pmxpn;

  @Column(name = "PCKLN")
  private String pckln;

  @Column(name = "PINPD")
  private String pinpd;

  @Column(name = "PANDX")
  private String pandx;

  @Column(name = "PANLN")
  private String panln;

  @Column(name = "PANPD")
  private String panpd;


  @Column(name = "PRCNT")
  private String prcnt;

  @Column(name = "POFDX")
  private String pofdx;

  @Column(name = "PDCTB")
  private String pdctb;

  @Column(name = "PEKEY")
  private String pekey;

  @Column(name = "PINDX")
  private String pindx;

  @Column(name = "PLNDX")
  private String plndx;

  @Column(name = "PMMSR")
  private String pmmsr;

  @Column(name = "PBFMT")
  private String pbfmt;
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public String getPrcnt() {
    return prcnt;
  }

  public void setPrcnt(String prcnt) {
    this.prcnt = prcnt;
  }

  public String getPofdx() {
    return pofdx;
  }

  public void setPofdx(String pofdx) {
    this.pofdx = pofdx;
  }

  public String getPdctb() {
    return pdctb;
  }

  public void setPdctb(String pdctb) {
    this.pdctb = pdctb;
  }

  public String getPekey() {
    return pekey;
  }

  public void setPekey(String pekey) {
    this.pekey = pekey;
  }

  public String getPindx() {
    return pindx;
  }

  public void setPindx(String pindx) {
    this.pindx = pindx;
  }

  public String getPlndx() {
    return plndx;
  }

  public void setPlndx(String plndx) {
    this.plndx = plndx;
  }

  public String getPmmsr() {
    return pmmsr;
  }

  public void setPmmsr(String pmmsr) {
    this.pmmsr = pmmsr;
  }

  public String getPbfmt() {
    return pbfmt;
  }

  public void setPbfmt(String pbfmt) {
    this.pbfmt = pbfmt;
  }

  

  public String getAtmFitsApp() {
	return atmFitsApp;
}

public void setAtmFitsApp(String atmFitsApp) {
	this.atmFitsApp = atmFitsApp;
}

public String getFitNumber() {
    return fitNumber;
  }

  public void setFitNumber(String fitNumber) {
    this.fitNumber = fitNumber;
  }

  public String getPiddx() {
    return piddx;
  }

  public void setPiddx(String piddx) {
    this.piddx = piddx;
  }

  public String getPfiid() {
    return pfiid;
  }

  public void setPfiid(String pfiid) {
    this.pfiid = pfiid;
  }

  public String getPstdx() {
    return pstdx;
  }

  public void setPstdx(String pstdx) {
    this.pstdx = pstdx;
  }

  public String getPagdx() {
    return pagdx;
  }

  public void setPagdx(String pagdx) {
    this.pagdx = pagdx;
  }

  public String getPmxpn() {
    return pmxpn;
  }

  public void setPmxpn(String pmxpn) {
    this.pmxpn = pmxpn;
  }

  public String getPckln() {
    return pckln;
  }

  public void setPckln(String pckln) {
    this.pckln = pckln;
  }

  public String getPinpd() {
    return pinpd;
  }

  public void setPinpd(String pinpd) {
    this.pinpd = pinpd;
  }

  public String getPandx() {
    return pandx;
  }

  public void setPandx(String pandx) {
    this.pandx = pandx;
  }

  public String getPanln() {
    return panln;
  }

  public void setPanln(String panln) {
    this.panln = panln;
  }

  public String getPanpd() {
    return panpd;
  }

  public void setPanpd(String panpd) {
    this.panpd = panpd;
  }


  @Override
  public String toString() {
    return "AtmFitsValue{" +
        "atmFitsApp=" + atmFitsApp +
        ", fitNumber=" + fitNumber +
        ", piddx='" + piddx + '\'' +
        ", pfiid='" + pfiid + '\'' +
        ", pstdx='" + pstdx + '\'' +
        ", pagdx='" + pagdx + '\'' +
        ", pmxpn='" + pmxpn + '\'' +
        ", pckln='" + pckln + '\'' +
        ", pinpd='" + pinpd + '\'' +
        ", pandx='" + pandx + '\'' +
        ", panln='" + panln + '\'' +
        ", panpd='" + panpd + '\'' +
        ", prcnt='" + prcnt + '\'' +
        ", pofdx='" + pofdx + '\'' +
        ", pdctb='" + pdctb + '\'' +
        ", pekey='" + pekey + '\'' +
        ", pindx='" + pindx + '\'' +
        ", plndx='" + plndx + '\'' +
        ", pmmsr='" + pmmsr + '\'' +
        ", pbfmt='" + pbfmt + '\'' +
        '}';
  }
}

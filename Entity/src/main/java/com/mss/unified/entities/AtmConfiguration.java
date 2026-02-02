package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "ATM_CONFIGURATION", schema = "ATM")
public class AtmConfiguration {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmConfigurationSequence")
	  @SequenceGenerator(name = "AtmConfigurationSequence", sequenceName = "ATM.AtmConfigurationSequence", allocationSize = 1)
	  @Column(name = "ATM_CON_NUM", nullable = false)
	  private int atmConNum;

  @Column(name = "ATRC_CODE", nullable = false)
  private int atrcCode;

  @Column(name = "ETD_CODE", nullable = false)
  private int etdCode;

  @Column(name = "ESP_CODE", nullable = false)
  private int espCode;

  @Column(name = "ACMP_CODE", nullable = false)
  private int acmpCode;

  @Column(name = "ECM_CODE", nullable = false)
  private int ecmCode;

  @Column(name = "TIMER_CONFIG_NUM", nullable = false)
  private int timerConfigNum;

  @Column(name = "ATM_IMPR_NUM", nullable = false)
  private int atmImprNum;

  @Column(name = "ELC_CODE", nullable = false)
  private int elcCode;

  @Column(name = "AFP_CODE", nullable = false)
  private int afpCode;

  @Column(name = "ECPL_CODE", nullable = false)
  private int ecplCode;

  @Column(name = "EAC_CODE", nullable = false)
  private int eacCode;

  @Column(name = "NUM_STAT_APPLI", nullable = false)
  private int numStatAppl;

  @Column(name = "ASC_CODE", nullable = false)
  private int ascCode;

  @Column(name = "ACPL_CCODE", nullable = false)
  private int acplCode;


  @Column(name = "ID_CONFIG", nullable = false)
  private String idConfig;

  @Column(name = "AM_CONF_LIBELLE", nullable = false)
  private String amConfigLibelle;

  @Column(name = "ATM_JOURNAL_ID")
  private String atmJournalId;

  @Column(name = "CASSETTE_CONTROL")
  private String atmConfCassetteControl;

  public int getAtmConNum() {
    return atmConNum;
  }


  public String getAtmJournalId() {
	return atmJournalId;
}


public void setAtmJournalId(String atmJournalId) {
	this.atmJournalId = atmJournalId;
}


public void setAtmConNum(int atmConNum) {
    this.atmConNum = atmConNum;
  }

  public int getAtrcCode() {
    return atrcCode;
  }

  public void setAtrcCode(int atrcCode) {
    this.atrcCode = atrcCode;
  }

  public int getEtdCode() {
    return etdCode;
  }

  public void setEtdCode(int etdCode) {
    this.etdCode = etdCode;
  }

  public int getEspCode() {
    return espCode;
  }

  public void setEspCode(int espCode) {
    this.espCode = espCode;
  }

  public int getAcmpCode() {
    return acmpCode;
  }

  public void setAcmpCode(int acmpCode) {
    this.acmpCode = acmpCode;
  }

  public int getEcmCode() {
    return ecmCode;
  }

  public void setEcmCode(int ecmCode) {
    this.ecmCode = ecmCode;
  }

  public int getTimerConfigNum() {
    return timerConfigNum;
  }

  public void setTimerConfigNum(int timerConfigNum) {
    this.timerConfigNum = timerConfigNum;
  }

  public int getAtmImprNum() {
    return atmImprNum;
  }

  public void setAtmImprNum(int atmImprNum) {
    this.atmImprNum = atmImprNum;
  }

  public int getElcCode() {
    return elcCode;
  }

  public void setElcCode(int elcCode) {
    this.elcCode = elcCode;
  }

  public int getAfpCode() {
    return afpCode;
  }

  public void setAfpCode(int afpCode) {
    this.afpCode = afpCode;
  }

  public int getEcplCode() {
    return ecplCode;
  }

  public void setEcplCode(int ecplCode) {
    this.ecplCode = ecplCode;
  }

  public int getEacCode() {
    return eacCode;
  }

  public void setEacCode(int eacCode) {
    this.eacCode = eacCode;
  }

  public int getNumStatAppl() {
    return numStatAppl;
  }

  public void setNumStatAppl(int numStatAppl) {
    this.numStatAppl = numStatAppl;
  }

  public int getAscCode() {
    return ascCode;
  }

  public void setAscCode(int ascCode) {
    this.ascCode = ascCode;
  }

  public int getAcplCode() {
    return acplCode;
  }

  public void setAcplCode(int acplCode) {
    this.acplCode = acplCode;
  }

  public String getIdConfig() {
    return idConfig;
  }

  public void setIdConfig(String idConfig) {
    this.idConfig = idConfig;
  }

  public String getAmConfigLibelle() {
    return amConfigLibelle;
  }

  public void setAmConfigLibelle(String amConfigLibelle) {
    this.amConfigLibelle = amConfigLibelle;
  }
  public String getAtmConfCassetteControl() {
    return atmConfCassetteControl;
  }

  public void setAtmConfCassetteControl(String atmConfCassetteControl) {
    this.atmConfCassetteControl = atmConfCassetteControl;
  }

  public AtmConfiguration updateAttributes(AtmConfiguration configuration){
    this.atrcCode = configuration.atrcCode;
    this.etdCode = configuration.etdCode;
    this.espCode = configuration.espCode;
    this.acmpCode = configuration.acmpCode;
    this.ecmCode = configuration.ecmCode;
    this.timerConfigNum = configuration.timerConfigNum;
    this.atmImprNum = configuration.atmImprNum;
    this.elcCode = configuration.elcCode;
    this.afpCode = configuration.afpCode;
    this.ecplCode = configuration.ecplCode;
    this.eacCode = configuration.eacCode;
    this.numStatAppl = configuration.numStatAppl;
    this.ascCode = configuration.ascCode;
    this.acplCode = configuration.acplCode;
    this.idConfig = configuration.idConfig;
    this.amConfigLibelle = configuration.amConfigLibelle;
    this.atmJournalId = configuration.atmJournalId;

    return this;
  }
}

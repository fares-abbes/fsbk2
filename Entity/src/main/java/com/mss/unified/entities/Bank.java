package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "BANK", schema = "SWITCH")
public class Bank {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "BankSequence2")
	  @SequenceGenerator(name = "BankSequence2", sequenceName = "SWITCH.BankSequence2", allocationSize = 1)
	  @Column(name = "BANK_CODE", nullable = false)
	  private Integer bankCode;

  @Column(name = "TAG_BANK", nullable = false)
  private String tagBank;

  @Column(name = "LIBELLE", nullable = false)
  private String libelle;

  @Column(name = "IDENTIFICATION_NUM", nullable = false)
  private String identificationNumber;

  public Bank(String tagBank, String libelle, String identificationNumber) {
    this.tagBank = tagBank;
    this.libelle = libelle;
    this.identificationNumber = identificationNumber;
  }

  public Bank() {
  }

  public String getIdentificationNumber() {
    return identificationNumber;
  }

  public void setIdentificationNumber(String identificationNumber) {
    this.identificationNumber = identificationNumber;
  }

  public Integer getBankCode() {
    return bankCode;
  }

  public void setBankCode(Integer bankCode) {
    this.bankCode = bankCode;
  }

  public String getTagBank() {
    return tagBank;
  }

  public void setTagBank(String tagBank) {
    this.tagBank = tagBank;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }
}

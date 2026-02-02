package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IDENTIFICATION_TYPE", schema = "PORTEUR")
public
class IdentificationType {

  @Id
  @Column(name = "IDEN_CODE", nullable = false)
  private Integer identificationTypeCode;

  @Column(name = "IDEN_LIBELLE")
  private String libelle;
  @Column(name = "FSBK_CODE")
  private String fsbkCode;

  public String getFsbkCode() {
	return fsbkCode;
}

public void setFsbkCode(String fsbkCode) {
	this.fsbkCode = fsbkCode;
}

public Integer getIdentificationTypeCode() {
    return identificationTypeCode;
  }

  public void setIdentificationTypeCode(Integer identificationTypeCode) {
    this.identificationTypeCode = identificationTypeCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "IdentificationType{" +
        "identificationTypeCode=" + identificationTypeCode +
        ", libelle='" + libelle + '\'' +
        '}';
  }
}

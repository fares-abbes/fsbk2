package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FIELD_H", schema = "ATM")
public
class FieldH {

  @Id
  @Column(name = "CAMERA_VALUE")
  private String cameraValue;

  @Column(name = "LIBELLE_VALEUR")
  private String libelle;


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

  @Override
  public String toString() {
    return "FieldH{" +
        "cameraValue='" + cameraValue + '\'' +
        ", libelle='" + libelle + '\'' +
        '}';
  }
}

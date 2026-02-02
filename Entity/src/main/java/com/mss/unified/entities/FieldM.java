package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FIELD_M", schema = "ATM")
public
class FieldM {

  @Id
  @Column(name = "FIELD_M_VALUE")
  private String fieldMValue;

  @Column(name = "LIBELLE")
  private String libelle;

  public String getFieldMValue() {
    return fieldMValue;
  }

  public void setFieldMValue(String fieldMValue) {
    this.fieldMValue = fieldMValue;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "FieldM{" +
        "fieldMValue='" + fieldMValue + '\'' +
        ", libelle='" + libelle + '\'' +
        '}';
  }
}

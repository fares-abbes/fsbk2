package com.mss.unified.entities;

import javax.persistence.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name = "ATM_MODEL",schema = "ATM")
public class AtmModel {
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmModelSequence")
	  @SequenceGenerator(name = "AtmModelSequence", sequenceName = "ATM.AtmModelSequence", allocationSize = 1)
	  @Column(name = "MODEL_CODE", nullable = false)
	  private Integer modelCode;
  @Column(name = "LIBELLE", nullable = false,unique = true)
  private String libelle;
  @Column(name = "MARQUE_CODE")
  private Integer marqueCode;
  public Integer getModelCode() {
    return modelCode;
  }

  public void setModelCode(Integer modelCode) {
    this.modelCode = modelCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public Integer getMarqueCode() {
    return marqueCode;
  }

  public void setMarqueCode(Integer marqueCode) {
    this.marqueCode = marqueCode;
  }
}




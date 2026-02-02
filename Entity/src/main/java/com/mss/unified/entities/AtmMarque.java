package com.mss.unified.entities;

import javax.persistence.*;


@Entity
@Table(name = "ATM_MARQUE",schema = "ATM")
public class AtmMarque {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmMarqueSequence")
	  @SequenceGenerator(name = "AtmMarqueSequence", sequenceName = "ATM.AtmMarqueSequence", allocationSize = 1)
	  @Column(name = "MARQUE_CODE", nullable = false)
	  private Integer marqueCode;

  @Column(name = "LIBELLE",nullable = false,unique = true)
  private String libelle;


  public Integer getMarqueCode() {
    return marqueCode;
  }

  public void setMarqueCode(Integer marqueCode) {
    this.marqueCode = marqueCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }


  public AtmMarque(Integer marqueCode, String libelle) {
    this.marqueCode = marqueCode;
    this.libelle = libelle;
  }


  public AtmMarque() {
  }
}

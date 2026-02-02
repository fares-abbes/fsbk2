package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "REQUEST_STATUS",schema = "POS")
public class TpeRequestStatus {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "TpeRequestSatusSequence")
	  @SequenceGenerator(name = "TpeRequestSatusSequence", sequenceName = "POS.TpeRequestSatusSequence", allocationSize = 1)
	  @Column(name = "STATUS_CODE", nullable = false)
	  private int statusCode;
  @Column(name = "LIBELLE")
  private String libelle;
  
  @Column(name = "LIBELLE_FR")
  private String libelleFr;

  

  public String getLibelleFr() {
	return libelleFr;
}

public void setLibelleFr(String libelleFr) {
	this.libelleFr = libelleFr;
}

public int getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(int statusCode) {
    this.statusCode = statusCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "TpeRequestStatus{" +
        "statusCode=" + statusCode +
        ", libelle='" + libelle + '\'' +
        '}';
  }
}

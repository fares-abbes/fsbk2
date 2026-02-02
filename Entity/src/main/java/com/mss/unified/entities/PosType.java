package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "TPE_TYPE",schema = "POS")
public class PosType {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "PosTypeSequence")
	  @SequenceGenerator(name = "PosTypeSequence", sequenceName = "POS.PosTypeSequence", allocationSize = 1)
	  @Column(name = "TYPE_CODE", nullable = false)
	  private int posTypeCode;
  @Column(name = "LIBELLE")
  private String libelle;
  
  @Column(name = "FAMILLE_CODE")
  private int famillePosCode;


  public int getPosTypeCode() {
    return posTypeCode;
  }

  public void setPosTypeCode(int posTypeCode) {
    this.posTypeCode = posTypeCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

public int getFamillePosCode() {
	return famillePosCode;
}

public void setFamillePosCode(int famillePosCode) {
	this.famillePosCode = famillePosCode;
}

@Override
public String toString() {
	return "PosType [posTypeCode=" + posTypeCode + ", libelle=" + libelle + ", famillePosCode=" + famillePosCode + "]";
}

}

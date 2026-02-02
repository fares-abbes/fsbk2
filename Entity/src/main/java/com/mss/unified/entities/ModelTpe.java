package com.mss.unified.entities;

import javax.persistence.*;


@Entity
@Table(name = "MODEL_TPE",schema = "POS")
public class ModelTpe {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "ModelSequence")
	  @SequenceGenerator(name = "ModelSequence", sequenceName = "POS.ModelSequence", allocationSize = 1)
	  @Column(name = "MODEL_TPE", nullable = false)
	  private Integer modelTpe;

  @Column(name = "LIBELLE")
  private String libelle;


  @Column(name = "NBRE_MODEL")
  private int nbreModel;

  public Integer getModelTpe() {
    return modelTpe;
  }

  public void setModelTpe(Integer modelTpe) {
    this.modelTpe = modelTpe;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public int getNbreModel() {
    return nbreModel;
  }

  public void setNbreModel(int nbreModel) {
    this.nbreModel = nbreModel;
  }


  @Override
  public String toString() {
    return "ModelTpe{" +
        "modelTpe=" + modelTpe +
        ", libelle='" + libelle + '\'' +
        ", nbreModel=" + nbreModel +
        '}';
  }
}

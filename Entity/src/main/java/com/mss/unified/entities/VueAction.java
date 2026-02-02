package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "VUE_ACTION", schema = "ADMINISTRATION")
public class VueAction {


	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "VueActionSequence")
	  @SequenceGenerator(name = "VueActionSequence", sequenceName = "ADMINISTRATION.VueActionSequence", allocationSize = 1)
	  @Column(name = "VUE_CODE", nullable = false)
	  private int vueCode;
  @Column(name = "LIBELLE", nullable = false)
  private String libelle;
  @Column(name = "GROUPE")

  private String groupe;

  public String getGroupe() {
    return groupe;
  }

  public void setGroupe(String groupe) {
    this.groupe = groupe;
  }

  public int getVueCode() {
    return vueCode;
  }

  public void setVueCode(int vueCode) {
    this.vueCode = vueCode;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "VueAction{" +
        "vueCode=" + vueCode +
        ", libelle='" + libelle + '\'' +
        ", groupe='" + groupe + '\'' +
        '}';
  }
}

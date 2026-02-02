package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "GROUP_VUE",schema = "ADMINISTRATION")
public class GroupeVue {
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "GroupeVueSequence")
	  @SequenceGenerator(name = "GroupeVueSequence", sequenceName = "ADMINISTRATION.GroupeVueSequence", allocationSize = 1)
	  @Column(name = "GROUPE_CODE", nullable = false)
	  private int vueCode;
  @Column(name = "LIBELLE", nullable = false)
  private String libelle;


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

  public GroupeVue() {
  }

  public GroupeVue(String libelle) {
    this.libelle = libelle;
  }

  @Override
  public String toString() {
    return "GroupeVue{" +
        "vueCode=" + vueCode +
        ", libelle='" + libelle + '\'' +
        '}';
  }
}

package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@IdClass(RegionId.class)
@Table(name = "REGION", schema = "ADMINISTRATION")
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CODE_Region", nullable = false)
    private Integer codeRegion;
    @Id
    @Column(name = "INITIALE", nullable = false)
    private String initial;

    @Column(name = "LIBELLE")
    private String libelle;

    public Integer getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(Integer codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

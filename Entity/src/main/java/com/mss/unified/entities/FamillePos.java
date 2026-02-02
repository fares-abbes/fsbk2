package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FAMILLE_POS",schema = "POS")
public class FamillePos {
    @Id
    @Column(name = "FAMILLE_CODE", nullable = false)
    private int famillePosCode;
    @Column(name = "FAMILLE_LIBELLE", nullable = false)
    private String famillePosLibelle;

    public FamillePos(int famillePosCode, String famillePosLibelle) {
        this.famillePosCode = famillePosCode;
        this.famillePosLibelle = famillePosLibelle;
    }

    public FamillePos() {

    }

    public int getFamillePosCode() {
        return famillePosCode;
    }

    public void setFamillePosCode(int famillePosCode) {
        this.famillePosCode = famillePosCode;
    }

    public String getFamillePosLibelle() {
        return famillePosLibelle;
    }

    public void setFamillePosLibelle(String famillePosLibelle) {
        this.famillePosLibelle = famillePosLibelle;
    }
}

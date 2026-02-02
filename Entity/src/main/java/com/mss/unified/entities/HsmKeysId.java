package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class HsmKeysId implements Serializable {
    public HsmKeysId(String libelle, String binCode) {
        this.libelle = libelle;
        this.binCode = binCode;
    }

    public HsmKeysId() {
    }

    @Column(name = "LIBELLE", nullable = false)
    private String libelle;


    @Column(name = "BIN_CODE", nullable = false)
    private String binCode;

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getBinCode() {
        return binCode;
    }

    public void setBinCode(String binCode) {
        this.binCode = binCode;
    }
}
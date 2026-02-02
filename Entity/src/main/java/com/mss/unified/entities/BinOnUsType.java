package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BIN_TYPE", schema = "PORTEUR")
public class BinOnUsType {

    @Id
    @Column(name = "BT_CODE", nullable = false)
    private int btCode;

    @Column(name = "BT_LIBELLE", nullable = false)
    private String btLibelle;

    public int getBtCode() {
        return btCode;
    }

    public void setBtCode(int btCode) {
        this.btCode = btCode;
    }

    public String getBtLibelle() {
        return btLibelle;
    }

    public void setBtLibelle(String btLibelle) {
        this.btLibelle = btLibelle;
    }


    @Override
    public String toString() {
        return "BinOnUsType{" +
                "btCode=" + btCode +
                ", btLibelle='" + btLibelle + '\'' +
                '}';
    }
}
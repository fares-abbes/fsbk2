package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "BIN_STATUS", schema = "PORTEUR")
public class BinStatus {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "BST_CODE", nullable = false)
    private int bstCode;

    @Column(name = "BST_LIBELLE")
    private String bstLibelle;

    public int getBstCode() {
        return bstCode;
    }

    public void setBstCode(int bstCode) {
        this.bstCode = bstCode;
    }

    public String getBstLibelle() {
        return bstLibelle;
    }

    public void setBstLibelle(String bstLibelle) {
        this.bstLibelle = bstLibelle;
    }
}

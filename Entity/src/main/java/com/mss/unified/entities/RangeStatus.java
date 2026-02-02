package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "RANGE_STATUS", schema = "PORTEUR")
public class RangeStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "RangeStatusSequence")
    @SequenceGenerator(name = "RangeStatusSequence", sequenceName = "PORTEUR.RangeStatusSequence", allocationSize = 1)
    @Column(name = "RANGE_STATUS_CODE", nullable = false)
    private int rangeStatusCode;
    @Column(name = "LIBELLE", nullable = false)
    private String libelle;


    public int getRangeStatusCode() {
        return rangeStatusCode;
    }

    public void setRangeStatusCode(int rangeStatusCode) {
        this.rangeStatusCode = rangeStatusCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

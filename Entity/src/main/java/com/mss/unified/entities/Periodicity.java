package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "PERIODICITY", schema = "PORTEUR")
public class Periodicity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PeriodicitySequence")
    @SequenceGenerator(name = "PeriodicitySequence", sequenceName = "PORTEUR.PeriodicitySequence", allocationSize = 1)
    @Column(name = "CODE", nullable = false)
    private int code;
    @Column(name = "LIBELLE", nullable = false)
    private String libelle;
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return "Periodicity{" +
                "code=" + code +
                ", libelle='" + libelle + '\'' +
                '}';
    }

}

package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name="CVR",schema = "SWITCH")
public class Cvr {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "CVRSequence")
    @SequenceGenerator(name = "CVRSequence", sequenceName = "SWITCH.CVRSequence", allocationSize = 1)
    @Column(name = "CVR_CODE", nullable = false)
    private int cvrCodee;

    @Column(name = "CVR_VALUE", nullable = false)
    private String cvrValue;
    @Column(name = "LIBELLE", nullable = false)
    private String libelle;


    public int getCvrCodee() {
        return cvrCodee;
    }

    public void setCvrCodee(int cvrCodee) {
        this.cvrCodee = cvrCodee;
    }

    public String getCvrValue() {
        return cvrValue;
    }

    public void setCvrValue(String cvrValue) {
        this.cvrValue = cvrValue;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Cvr() {
    }

    public Cvr( String libelle,String cvrValue) {
        this.cvrValue = cvrValue;
        this.libelle = libelle;
    }


    @Override
    public String toString() {
        return "Cvr{" +
                "cvrCodee=" + cvrCodee +
                ", cvrValue='" + cvrValue + '\'' +
                ", libelle='" + libelle + '\'' +
                '}';
    }
}

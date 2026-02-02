package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "AGENCE",schema = "SWITCH")
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AgenceSequecn")
    @SequenceGenerator(name = "AgenceSequecn", sequenceName = "SWITCH.AgenceSequecn", allocationSize = 1)
    @Column(name = "AGENCE_CODE", nullable = false)
    private Integer agenceCode;

    @Column(name = "BANK_CODE", nullable = false)
    private int bankCode;

    @Column(name = "LIBELLE", nullable = false)
    private String libelle;

    @Column(name = "CITY", nullable = false)
    private String city;

    @Column(name = "TAG", nullable = false)
    private String tag;

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Integer getAgenceCode() {
        return agenceCode;
    }

    public void setAgenceCode(Integer agenceCode) {
        this.agenceCode = agenceCode;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBankCode(int bankCode) {
        this.bankCode = bankCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Agence{" +
                "agenceCode=" + agenceCode +
                ", bankCode=" + bankCode +
                ", libelle='" + libelle + '\'' +
                ", city='" + city + '\'' +
                ", tag='" + tag + '\'' +
                '}';
    }
}
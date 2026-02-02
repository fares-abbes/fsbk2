package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "HISTORIQUE", schema = "SWITCH")
public class Historique {
    @Id
    @Column(name = "HISTO_CODE", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Integer historiqueCode;

    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "ACCOUNT_CODE")
    private int accountCode;
    @Column(name = "MONTANT")
    private String montant;
    @Column(name = "DATE_TRANSAC")
    private String date;

    public Historique() {
    }

    public Integer getHistoriqueCode() {
        return historiqueCode;
    }

    public void setHistoriqueCode(Integer historiqueCode) {
        this.historiqueCode = historiqueCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(int accountCode) {
        this.accountCode = accountCode;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

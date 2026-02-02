package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "CURRENCY_VALUE",schema = "ATM")
public class AtmCurrencyValue {

    @Id
    @Column(name = "CURR_CODE", nullable = false)
    private String currCode;

    @Column(name = "CURR_EXPONENET", nullable = false)
    private String currExponenet;

    @Column(name = "LIBELLE_DEVISE", nullable = false)
    private String libelleDevise;

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getCurrExponenet() {
        return currExponenet;
    }

    public void setCurrExponenet(String currExponenet) {
        this.currExponenet = currExponenet;
    }

    public String getLibelleDevise() {
        return libelleDevise;
    }

    public void setLibelleDevise(String libelleDevise) {
        this.libelleDevise = libelleDevise;
    }
}

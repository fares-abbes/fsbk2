package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "emv_currency_mapping", schema = "ATM")
public class AtmCurrencyMapping {
    @Id
    @GeneratedValue(generator = "emvCurrencyMappingSequence")
    @SequenceGenerator(name = "AtmCurrencyMappingValueSequence", sequenceName = "ATM.AtmCurrencyMappingValueSequence", allocationSize = 1)
    @Column(name = "ECM_CODE", nullable = false)
    private int    ecmCode;
    @Column(name = "ECM_LIBELE", nullable = false)
    private String ecmLibelle;
    public int getEcmCode() {
        return ecmCode;
    }
    public void setEcmCode(int ecmCode) {
        this.ecmCode = ecmCode;
    }
    public String getEcmLibelle() {
        return ecmLibelle;
    }
    public void setEcmLibelle(String ecmLibelle) {
        this.ecmLibelle = ecmLibelle;
    }
}

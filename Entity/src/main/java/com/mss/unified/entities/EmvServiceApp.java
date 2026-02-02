package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "EMV_SERVICE_APPLICATION",schema = "ATM")
public class EmvServiceApp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EmvServiceAppSequence")
    @SequenceGenerator(name = "EmvServiceAppSequence", sequenceName = "ATM.EmvServiceAppSequence", allocationSize = 1)
    @Column(name = "ESP_CODE", nullable = false)
    private int espCode;
    @Column(name = "ESP_LIBELLE")
    private String espLibelle;

    public int getEspCode() {
        return espCode;
    }

    public void setEspCode(int espCode) {
        this.espCode = espCode;
    }

    public String getEspLibelle() {
        return espLibelle;
    }

    public void setEspLibelle(String espLibelle) {
        this.espLibelle = espLibelle;
    }
}

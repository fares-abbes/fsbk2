package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "EMV_AID_CONFIG",schema = "ATM")
public class EmvAidConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EmvAidConfigSequence")
    @SequenceGenerator(name = "EmvAidConfigSequence", sequenceName = "ATM.EmvAidConfigSequence", allocationSize = 1)
    @Column(name = "EAC_CODE", nullable = false)
    private int eacCode;
    @Column(name = "EAC_LIBELLE")
    private String eacLibelle;

    public int getEacCode() {
        return eacCode;
    }

    public void setEacCode(int eacCode) {
        this.eacCode = eacCode;
    }

    public String getEacLibelle() {
        return eacLibelle;
    }

    public void setEacLibelle(String eacLibelle) {
        this.eacLibelle = eacLibelle;
    }
}

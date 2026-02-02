package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "SECOND_POSTION_SERVICE_CODEE", schema = "PORTEUR")
public class SecondPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secondSequence")
    @SequenceGenerator(name = "secondSequence", sequenceName = "PORTEUR.secondSequence", allocationSize = 1)
    @Column(name = "SPSC_CODE", nullable = false)
    @JsonProperty("Spsc_Code")
    private int spscCode;
    @Column(name = "SPSC_NUM", nullable = false)
    @JsonProperty("Spsc_Num")
    private int spscNum;
    @Column(name = "SPSC_LIBELLE", nullable = false)
    @JsonProperty("Spsc_Libelle")
    private String spscLibelle;

    public int getSpscCode() {
        return spscCode;
    }

    public void setSpscCode(int spscCode) {
        this.spscCode = spscCode;
    }

    public int getSpscNum() {
        return spscNum;
    }

    public void setSpscNum(int spscNum) {
        this.spscNum = spscNum;
    }

    public String getSpscLibelle() {
        return spscLibelle;
    }

    public void setSpscLibelle(String spscLibelle) {
        this.spscLibelle = spscLibelle;
    }

    public SecondPosition() {
        super();
        // TODO Auto-generated constructor stub
    }


}

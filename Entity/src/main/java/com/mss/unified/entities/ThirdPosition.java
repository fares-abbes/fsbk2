package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "THRID_POSITION_SERVICE_CEDE", schema = "PORTEUR")
public class ThirdPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ThirdSequence")
    @SequenceGenerator(name = "ThirdSequence", sequenceName = "PORTEUR.ThirdSequence", allocationSize = 1)
    @Column(name = "TPSC_CODE", nullable = false)
    @JsonProperty("Tpsc_Code")
    public int tpscCode;
    @Column(name = "TPSC_NUM", nullable = false)
    @JsonProperty("Tpsc_Num")
    public int tpscNum;
    @Column(name = "TPSC_LIBELLE", nullable = false)
    @JsonProperty("Tpsc_Libelle")
    public String tpscLibelle;

    public int getTpscCode() {
        return tpscCode;
    }

    public void setTpscCode(int tpscCode) {
        this.tpscCode = tpscCode;
    }

    public int getTpscNum() {
        return tpscNum;
    }

    public void setTpscNum(int tpscNum) {
        this.tpscNum = tpscNum;
    }

    public String getTpscLibelle() {
        return tpscLibelle;
    }

    public void setTpscLibelle(String tpscLibelle) {
        this.tpscLibelle = tpscLibelle;
    }

    public ThirdPosition() {
        super();
        // TODO Auto-generated constructor stub
    }

}

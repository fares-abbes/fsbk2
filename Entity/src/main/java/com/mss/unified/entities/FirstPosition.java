package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "FIRST_POSITION_SERVICE_CODE", schema = "PORTEUR")
public class FirstPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "FirstSequence")
    @SequenceGenerator(name = "FirstSequence", sequenceName = "PORTEUR.FirstSequence", allocationSize = 1)
    @Column(name = "FPSC_CODE", nullable = false)
    @JsonProperty("FPSC_CODE")
    public int fpscCode;
    @Column(name = "FPSC_NUM", nullable = false)
    @JsonProperty("Fpsc_num")
    public int fpscNum;
    @Column(name = "FPSC_LIBELLE", nullable = false)
    @JsonProperty("Fpsc_libelle")
    public String fpscLibelle;


    public int getFpscCode() {
        return fpscCode;
    }

    public void setFpscCode(int fpscCode) {
        this.fpscCode = fpscCode;
    }

    public int getFpscNum() {
        return fpscNum;
    }

    public void setFpscNum(int fpscNum) {
        this.fpscNum = fpscNum;
    }

    public String getFpscLibelle() {
        return fpscLibelle;
    }

    public void setFpscLibelle(String fpscLibelle) {
        this.fpscLibelle = fpscLibelle;
    }

    public FirstPosition() {
        super();
        // TODO Auto-generated constructor stub
    }
}

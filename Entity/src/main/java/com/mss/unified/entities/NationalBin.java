package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;


@Entity
@Table(name = "NATIONAL_BIN",schema = "PORTEUR")
public class NationalBin {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "NationalBinSequence")
    @SequenceGenerator(name = "NationalBinSequence", sequenceName = "PORTEUR.NationalBinSequence", allocationSize = 1)
    @Column(name = "NB_CODE", nullable = false)
    @JsonProperty("nbCode")
    private int nBCode;

    @Column(name = "NB_LOW_BIN", nullable = false)
    private String nBLowBin;

    @Column(name = "NB_HIGH_BIN")
    private String nbHighBin;

    @Column(name = "NB_LENGTH")
    private int nbLength;

    @Column(name = "NB_BAN_CODE")
    private int nBBanCode;

    @Column(name = "BST_CODE")
    @JsonProperty("binStatus")
    private int bstCode;

    public int getBstCode() {
        return bstCode;
    }

    public void setBstCode(int bstCode) {
        this.bstCode = bstCode;
    }

    public int getnBCode() {
        return nBCode;
    }

    public void setnBCode(int nBCode) {
        this.nBCode = nBCode;
    }

    public String getnBLowBin() {
        return nBLowBin;
    }

    public void setnBLowBin(String nBLowBin) {
        this.nBLowBin = nBLowBin;
    }

    public String getNbHighBin() {
        return nbHighBin;
    }

    public void setNbHighBin(String nbHighBin) {
        this.nbHighBin = nbHighBin;
    }

    public int getNbLength() {
        return nbLength;
    }

    public void setNbLength(int nbLength) {
        this.nbLength = nbLength;
    }

    public int getnBBanCode() {
        return nBBanCode;
    }

    public void setnBBanCode(int nBBanCode) {
        this.nBBanCode = nBBanCode;
    }

}

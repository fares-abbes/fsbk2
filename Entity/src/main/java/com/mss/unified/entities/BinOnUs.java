package com.mss.unified.entities;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "BIN_ON_US", schema = "PORTEUR")
public
class BinOnUs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "BinOnUsSequence")
    @SequenceGenerator(name = "BinOnUsSequence", sequenceName = "PORTEUR.BinOnUsSequence", allocationSize = 1)
    @Column(name = "BOU_CODE", nullable = false)
    private int binOnUsCode;

    @Column(name = "LIBELLE")
    @JsonProperty("libelle")
    public String libelle;
    @Column(name = "BT_CODE")
    private int binTypeCode;

    @Column(name = "BST_CODE")
    private int binStatusCode;

    @Column(name = "BOU_LOW_BIN", nullable = false)
    private String bouLowBin;
    @Column(name = "BOU_HIGH_BIN", nullable = false)
    private String bouHighBin;


    @Column(name = "BOU_LENGTH", nullable = false)
    private int bouLength;


    @Column(name = "BOU_BANK_CODE", nullable = false)
    private int bouBankCode;

    @Column(name = "BIN_LENGTH", nullable = false)
    private int binLength;

    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(CascadeType.DELETE)
    @JoinTable(name = "range_bin", schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "BOU_CODE"),
            inverseJoinColumns = @JoinColumn(name = "RANGE_CODE"))
    private Set<Range> ranges = new HashSet<>();


    public BinOnUs() {
    }

    public Set<Range> getRanges() {
        return ranges;
    }

    public void setRanges(Set<Range> ranges) {
        this.ranges = ranges;
    }

    public int getBinLength() {
        return binLength;
    }

    public void setBinLength(int binLength) {
        this.binLength = binLength;
    }

    public int getBinOnUsCode() {
        return binOnUsCode;
    }

    public void setBinOnUsCode(int binOnUsCode) {
        this.binOnUsCode = binOnUsCode;
    }

    public String getBouLowBin() {
        return bouLowBin;
    }

    public void setBouLowBin(String bouLowBin) {
        this.bouLowBin = bouLowBin;
    }

    public String getBouHighBin() {
        return bouHighBin;
    }

    public void setBouHighBin(String bouHighBin) {
        this.bouHighBin = bouHighBin;
    }

    public int getBouLength() {
        return bouLength;
    }

    public void setBouLength(int bouLength) {
        this.bouLength = bouLength;
    }

    public int getBinTypeCode() {
        return binTypeCode;
    }

    public void setBinTypeCode(int binTypeCode) {
        this.binTypeCode = binTypeCode;
    }

    public int getBinStatusCode() {
        return binStatusCode;
    }

    public void setBinStatusCode(int binStatusCode) {
        this.binStatusCode = binStatusCode;
    }

    public int getBouBankCode() {
        return bouBankCode;
    }

    public void setBouBankCode(int bouBankCode) {
        this.bouBankCode = bouBankCode;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public BinOnUs(int binOnUsCode, String libelle, int binTypeCode, int binStatusCode, String bouLowBin, String bouHighBin, int bouLength, int bouBankCode, int binLength, Set<Range> ranges) {
        this.binOnUsCode = binOnUsCode;
        this.libelle = libelle;
        this.binTypeCode = binTypeCode;
        this.binStatusCode = binStatusCode;
        this.bouLowBin = bouLowBin;
        this.bouHighBin = bouHighBin;
        this.bouLength = bouLength;
        this.bouBankCode = bouBankCode;
        this.binLength = binLength;
        this.ranges = ranges;
    }

    @Override
    public String toString() {
        return "BinOnUs{" +
                "binOnUsCode=" + binOnUsCode +
                ", binTypeCode=" + binTypeCode +
                ", binStatusCode=" + binStatusCode +
                ", bouLowBin='" + bouLowBin + '\'' +
                ", bouHighBin='" + bouHighBin + '\'' +
                ", bouLength=" + bouLength +
                ", bouBankCode=" + bouBankCode +
                ", binLength=" + binLength +
                ", ranges=" + ranges +
                '}';
}}

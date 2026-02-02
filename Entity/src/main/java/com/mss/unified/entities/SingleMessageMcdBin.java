package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "SINGLE_MESSAGE_MCD_BIN", schema = "PORTEUR")
public class SingleMessageMcdBin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SingleMessageMcBinSequence")
    @SequenceGenerator(name = "SingleMessageMcBin", sequenceName = "PORTEUR.SingleMessageMcBin", allocationSize = 1)
    @Column(name = "SMMB_CODE", nullable = false)
    private int smmbCode;

    @Column(name = "BST_CODE", nullable = false)
    private int bstCode;

    @Column(name = "SMMB_LOW_RANGE")
    private String smmbLowRange;
    @Column(name = "SMMB_HIGH_RANGE")
    private String smmbHighRange;


    @Column(name = "SMMB_LENGTH")
    private int smmbLength;

    @Column(name = "SMMB_STAT")
    private int smmbStat;

    public int getSmmbCode() {
        return smmbCode;
    }

    public void setSmmbCode(int smmbCode) {
        this.smmbCode = smmbCode;
    }

    public int getBstCode() {
        return bstCode;
    }

    public void setBstCode(int bstCode) {
        this.bstCode = bstCode;
    }

    public String getSmmbLowRange() {
        return smmbLowRange;
    }

    public void setSmmbLowRange(String smmbLowRange) {
        this.smmbLowRange = smmbLowRange;
    }

    public String getSmmbHighRange() {
        return smmbHighRange;
    }

    public void setSmmbHighRange(String smmbHighRange) {
        this.smmbHighRange = smmbHighRange;
    }

    public int getSmmbLength() {
        return smmbLength;
    }

    public void setSmmbLength(int smmbLength) {
        this.smmbLength = smmbLength;
    }

    public int getSmmbStat() {
        return smmbStat;
    }

    public void setSmmbStat(int smmbStat) {
        this.smmbStat = smmbStat;
    }
}

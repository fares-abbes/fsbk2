package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "DUAL_MESSAGE_MCD_BIN", schema = "PORTEUR")
public class DualMessageMcdBin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DualMessageMcBinSequence")
    @SequenceGenerator(name = "DualMessageMcBinSequence", sequenceName = "PORTEUR.DualMessageMcBinSequence", allocationSize = 1)
    @Column(name = "DMMB_CODE", nullable = false)
    private int dmmbCode;

    @Column(name = "BST_CODE", nullable = false)
    private int bstCode;

    @Column(name = "DMMB_LOW_RANGE")
    private String dmmbLowRange;

    @Column(name = "DMMB_HIGH_RANGE")
    private String dmmbHighRange;


    @Column(name = "DMMB_LENGTH")
    private int dmmbLength;


    @Column(name = "DMMB_STAT")
    private int dmmbStat;

    public int getDmmbCode() {
        return dmmbCode;
    }

    public void setDmmbCode(int dmmbCode) {
        this.dmmbCode = dmmbCode;
    }

    public int getBstCode() {
        return bstCode;
    }

    public void setBstCode(int bstCode) {
        this.bstCode = bstCode;
    }

    public String getDmmbLowRange() {
        return dmmbLowRange;
    }

    public void setDmmbLowRange(String dmmbLowRange) {
        this.dmmbLowRange = dmmbLowRange;
    }

    public String getDmmbHighRange() {
        return dmmbHighRange;
    }

    public void setDmmbHighRange(String dmmbHighRange) {
        this.dmmbHighRange = dmmbHighRange;
    }

    public int getDmmbLength() {
        return dmmbLength;
    }

    public void setDmmbLength(int dmmbLength) {
        this.dmmbLength = dmmbLength;
    }

    public int getDmmbStat() {
        return dmmbStat;
    }

    public void setDmmbStat(int dmmbStat) {
        this.dmmbStat = dmmbStat;
    }
}

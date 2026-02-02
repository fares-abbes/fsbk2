package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "VISA_BIN", schema = "PORTEUR")
public class VisaBin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "VisaBinSequence")
    @SequenceGenerator(name = "VisaBinSequence", sequenceName = "PORTEUR.VisaBinSequence", allocationSize = 1)
    @Column(name = "VB_CODE", nullable = false)
    private int vbCode;

    @Column(name = "BST_CODE", nullable = false)
    private int bstCode;

    @Column(name = "VB_LOW_RANGE ")
    private String vbLowRange;
    @Column(name = "VB_HIGH_RANGE")
    private String vbHighRange;


    @Column(name = "VB_LENGTH ")
    private int vbLength;


    @Column(name = "VB_STAT")
    private int vbStat;


    public int getVbCode() {
        return vbCode;
    }

    public void setVbCode(int vbCode) {
        this.vbCode = vbCode;
    }

    public int getBstCode() {
        return bstCode;
    }

    public void setBstCode(int bstCode) {
        this.bstCode = bstCode;
    }

    public String getVbLowRange() {
        return vbLowRange;
    }

    public void setVbLowRange(String vbLowRange) {
        this.vbLowRange = vbLowRange;
    }

    public String getVbHighRange() {
        return vbHighRange;
    }

    public void setVbHighRange(String vbHighRange) {
        this.vbHighRange = vbHighRange;
    }

    public int getVbLength() {
        return vbLength;
    }

    public void setVbLength(int vbLength) {
        this.vbLength = vbLength;
    }

    public int getVbStat() {
        return vbStat;
    }

    public void setVbStat(int vbStat) {
        this.vbStat = vbStat;
    }
}

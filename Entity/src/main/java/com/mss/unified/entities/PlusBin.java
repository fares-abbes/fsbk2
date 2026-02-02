package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "PLUS_BIN", schema = "PORTEUR")
public class PlusBin {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PlusBinSequence")
	    @SequenceGenerator(name = "PlusBinSequence", sequenceName = "PORTEUR.PlusBinSequence", allocationSize = 1)
	    @Column(name = "PB_CODE", nullable = false)
	    private int pbCode;

    @Column(name = "BST_CODE", nullable = false)
    private int bstCode;

    @Column(name = "PB_LOW_RANGE")
    private String pbLowRange;
    @Column(name = "PB_HIGH_RANGE")
    private String pbHighRange;


    @Column(name = "PB_LENGTH")
    private int pbLength;


    @Column(name = "PB_STAT")
    private int pbStat;

    public int getPbCode() {
        return pbCode;
    }

    public void setPbCode(int pbCode) {
        this.pbCode = pbCode;
    }

    public int getBstCode() {
        return bstCode;
    }

    public void setBstCode(int bstCode) {
        this.bstCode = bstCode;
    }

    public String getPbLowRange() {
        return pbLowRange;
    }

    public void setPbLowRange(String pbLowRange) {
        this.pbLowRange = pbLowRange;
    }

    public String getPbHighRange() {
        return pbHighRange;
    }

    public void setPbHighRange(String pbHighRange) {
        this.pbHighRange = pbHighRange;
    }

    public int getPbLength() {
        return pbLength;
    }

    public void setPbLength(int pbLength) {
        this.pbLength = pbLength;
    }

    public int getPbStat() {
        return pbStat;
    }

    public void setPbStat(int pbStat) {
        this.pbStat = pbStat;
    }
}

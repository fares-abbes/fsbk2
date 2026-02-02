package com.mss.unified.entities;


import javax.persistence.*;

@Entity
@Table(name = "RANGE", schema = "PORTEUR")
public class Range {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "RangeSequence")
    @SequenceGenerator(name = "RangeSequence", sequenceName = "PORTEUR.RangeSequence", allocationSize = 1)
    @Column(name = "RANGE_CODE", nullable = false)
    private int rangeCode;
    @Column(name = "BOU_HIGH_RANGE")
    private String bouHighRange;

    @Column(name = "BOU_LOW_RANGE")
    private String bouLowRange;
    @Column(name = "RANGE_STATUS_CODE")
    private int rangeStatusCode;

    public int getRangeStatusCode() {
        return rangeStatusCode;
    }

    public void setRangeStatusCode(int rangeStatusCode) {
        this.rangeStatusCode = rangeStatusCode;
    }

    public int getRangeCode() {
        return rangeCode;
    }

    public void setRangeCode(int rangeCode) {
        this.rangeCode = rangeCode;
    }

    public String getBouHighRange() {
        return bouHighRange;
    }

    public void setBouHighRange(String bouHighRange) {
        this.bouHighRange = bouHighRange;
    }

    public String getBouLowRange() {
        return bouLowRange;
    }

    public void setBouLowRange(String bouLowRange) {
        this.bouLowRange = bouLowRange;
    }
}

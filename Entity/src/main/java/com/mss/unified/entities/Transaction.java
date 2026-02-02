package com.mss.unified.entities;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;


@Entity
@Table(schema = "PORTEUR",name = "PERMITTED_TRANSACTIONS")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "Trans")
    @SequenceGenerator(name = "Trans", sequenceName = "PORTEUR.Trans", allocationSize = 1)
    @Column(name = "ID", nullable = false)
    private int id;

    @Column(name = "PLAFOND_MAX")
    private String plafondMax;
    @Column(name = "PLAFOND_MIN")
    private String plafondMin;
    @Column(name = "PLAFOND")
    private String plafond;
    @Column(name = "LIMIT_NUMBER")
    private String limitNumber;
    @Column(name = "PERIODICITY")
    private String periodicity;
    @Column(name = "DES_PR")
    private Integer primaryDestination;
    @Column(name = "DES_SEC")
    private Integer secondaryDestination;

    public Integer getPrimaryDestination() {
        return primaryDestination;
    }

    public void setPrimaryDestination(Integer primaryDestination) {
        this.primaryDestination = primaryDestination;
    }

    public Integer getSecondaryDestination() {
        return secondaryDestination;
    }

    public void setSecondaryDestination(Integer secondaryDestination) {
        this.secondaryDestination = secondaryDestination;
    }

    @ManyToOne
    @JoinColumn(name = "TYPE")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private EmvServiceValues type;

    @ManyToOne
    @JoinColumn(name = "PROGRAM")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Program program;

    public Transaction() {
    }

    public Transaction(String plafondMax, String plafondMin, String plafond, String limitNumber, String periodicity, EmvServiceValues type, Program program) {
        this.plafondMax = plafondMax;
        this.plafondMin = plafondMin;
        this.plafond = plafond;
        this.limitNumber = limitNumber;
        this.periodicity = periodicity;
        this.type = type;
        this.program = program;
    }

    public Transaction(int id, String plafondMax, String plafondMin, String plafond, String limitNumber, String periodicity, EmvServiceValues type, Program program) {
        this.id = id;
        this.plafondMax = plafondMax;
        this.plafondMin = plafondMin;
        this.plafond = plafond;
        this.limitNumber = limitNumber;
        this.periodicity = periodicity;
        this.type = type;
        this.program = program;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlafondMax() {
        return plafondMax;
    }

    public void setPlafondMax(String plafondMax) {
        this.plafondMax = plafondMax;
    }

    public String getPlafondMin() {
        return plafondMin;
    }

    public void setPlafondMin(String plafondMin) {
        this.plafondMin = plafondMin;
    }

    public String getPlafond() {
        return plafond;
    }

    public void setPlafond(String plafond) {
        this.plafond = plafond;
    }

    public String getLimitNumber() {
        return limitNumber;
    }

    public void setLimitNumber(String limitNumber) {
        this.limitNumber = limitNumber;
    }

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public EmvServiceValues getType() {
        return type;
    }

    public void setType(EmvServiceValues type) {
        this.type = type;
    }

    public Program getProgram() {
        return program;
    }

    public void setProgram(Program program) {
        this.program = program;
    }
}

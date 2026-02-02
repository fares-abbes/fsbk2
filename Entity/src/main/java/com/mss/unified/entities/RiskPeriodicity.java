package com.mss.unified.entities;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "RISK_PERIODICITY", schema = "PORTEUR")
public
class RiskPeriodicity {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO, generator = "RiskSequence")
    @SequenceGenerator(name = "RiskSequence", sequenceName = "PORTEUR.RiskSequence",  allocationSize = 1)
    @Column(name = "RP_CODE", nullable = false)
    private int riskPeriodicityCode;

    @Column(name = "type_code")
    private int typeCode;
    private int progCode;
    @Column(name = "RP_STAR_DATE")
    private Date riskPeriodicityStartDate;

    @Column(name = "RP_AND_DATE")
    private Date getRiskPeriodicityEndDate;
    @ManyToMany(fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    @JoinTable(name = "PERIODICITY_Trans",schema = "PORTEUR",
            joinColumns = @JoinColumn(name = "RP_CODE"),
            inverseJoinColumns = @JoinColumn(name = "CODE_TRANS"))
    private Set<EmvServiceValues> emvServiceValues = new HashSet<>();
    @Column(name = "AMOUNT_MAX_PERIOD")
    private String amountMaxPeriod;
    @Column(name = "AMOUNT_MIN_PERIOD")
    private String  amountMinPeriod;
    @Column(name = "AmountLimitPeriod")
    private String amountLimitPeriod;
    @Column(name = "NumberLimitPeriod")
    private String numberLimitPeriod;

    public RiskPeriodicity() {
        super();
    }

    public int getRiskPeriodicityCode() {
        return riskPeriodicityCode;
    }

    public void setRiskPeriodicityCode(int riskPeriodicityCode) {
        this.riskPeriodicityCode = riskPeriodicityCode;
    }

    public int getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(int typeCode) {
        this.typeCode = typeCode;
    }

    public int getProgCode() {
        return progCode;
    }

    public void setProgCode(int progCode) {
        this.progCode = progCode;
    }

    public Date getRiskPeriodicityStartDate() {
        return riskPeriodicityStartDate;
    }

    public void setRiskPeriodicityStartDate(Date riskPeriodicityStartDate) {
        this.riskPeriodicityStartDate = riskPeriodicityStartDate;
    }

    public Date getGetRiskPeriodicityEndDate() {
        return getRiskPeriodicityEndDate;
    }

    public void setGetRiskPeriodicityEndDate(Date getRiskPeriodicityEndDate) {
        this.getRiskPeriodicityEndDate = getRiskPeriodicityEndDate;
    }

    public Set<EmvServiceValues> getEmvServiceValues() {
        return emvServiceValues;
    }

    public void setEmvServiceValues(Set<EmvServiceValues> emvServiceValues) {
        this.emvServiceValues = emvServiceValues;
    }

    public String getAmountMaxPeriod() {
        return amountMaxPeriod;
    }

    public void setAmountMaxPeriod(String amountMaxPeriod) {
        this.amountMaxPeriod = amountMaxPeriod;
    }

    public String getAmountMinPeriod() {
        return amountMinPeriod;
    }

    public void setAmountMinPeriod(String amountMinPeriod) {
        this.amountMinPeriod = amountMinPeriod;
    }

    public String getAmountLimitPeriod() {
        return amountLimitPeriod;
    }

    public void setAmountLimitPeriod(String amountLimitPeriod) {
        this.amountLimitPeriod = amountLimitPeriod;
    }

    public String getNumberLimitPeriod() {
        return numberLimitPeriod;
    }

    public void setNumberLimitPeriod(String numberLimitPeriod) {
        this.numberLimitPeriod = numberLimitPeriod;
    }
}

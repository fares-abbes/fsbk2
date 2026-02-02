package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DETAIL_RISK_MANAGEMENT",schema = "PORTEUR")
public class DetailRiskManagment {


    @Id
    @Column(name = "DRM_TRANSACTION_CODE", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DetailSequence")
    @SequenceGenerator(name = "DetailSequence", sequenceName = "PORTEUR.DetailSequence", allocationSize = 1)
    private int DetailRiskManagCode;

    @Column(name = "DRM_TR_AMOUNT_MIN")
    private long minAmount;
    @Column(name = "DRM_TR_code")
    private String transactionCode;
    @Column(name = "GLOBAL_CODE")
    private int globalCode;
    @Column(name = "DR_TR_AMOUNT_MAX")
    private long maxAmount;

    @Column(name = "DR_AMOUNT_LIMIT", nullable = false)
    private String drAmountLimit;

    @Column(name = "DR_NUMEBR_LIMIT")
    private long drNumberLimit;


    @Column(name = "DR_START_DATE")
    private Date drStartDate;
    @Column(name = "DR_END_DATE")
    private Date drEndDate;


    @Column(name = "DR_CURR_AMOUNT")
    private long drCurrencyAmount;
    @Column(name = "DR_CURR_NUMBER")
    private long drCurrencyNumber;
    private int typePeriodicity;





    public int getDetailRiskManagCode() {
        return DetailRiskManagCode;
    }

    public void setDetailRiskManagCode(int detailRiskManagCode) {
        DetailRiskManagCode = detailRiskManagCode;
    }

    public long getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(long minAmount) {
        this.minAmount = minAmount;
    }

    public long getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(long maxAmount) {
        this.maxAmount = maxAmount;
    }

    public String getDrAmountLimit() {
        return drAmountLimit;
    }

    public void setDrAmountLimit(String drAmountLimit) {
        this.drAmountLimit = drAmountLimit;
    }

    public long getDrNumberLimit() {
        return drNumberLimit;
    }

    public void setDrNumberLimit(long drNumberLimit) {
        this.drNumberLimit = drNumberLimit;
    }



    public Date getDrStartDate() {
        return drStartDate;
    }

    public void setDrStartDate(Date drStartDate) {
        this.drStartDate = drStartDate;
    }

    public Date getDrEndDate() {
        return drEndDate;
    }

    public void setDrEndDate(Date drEndDate) {
        this.drEndDate = drEndDate;
    }

    public long getDrCurrencyAmount() {
        return drCurrencyAmount;
    }

    public void setDrCurrencyAmount(long drCurrencyAmount) {
        this.drCurrencyAmount = drCurrencyAmount;
    }

    public long getDrCurrencyNumber() {
        return drCurrencyNumber;
    }

    public void setDrCurrencyNumber(long drCurrencyNumber) {
        this.drCurrencyNumber = drCurrencyNumber;
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public int getGlobalCode() {
        return globalCode;
    }

    public void setGlobalCode(int globalCode) {
        this.globalCode = globalCode;
    }

    public int getTypePeriodicity() {
        return typePeriodicity;
    }

    public void setTypePeriodicity(int typePeriodicity) {
        this.typePeriodicity = typePeriodicity;
    }

    public DetailRiskManagment() {
    }


    public DetailRiskManagment(long minAmount, String transactionCode, int global_code, long maxAmount,
                               String drAmountLimit, long drNumberLimit, Date drStartDate, Date drEndDate,
                               long drCurrencyAmount, long drCurrencyNumber, int typePeriodicity) {
        this.minAmount = minAmount;
        this.transactionCode = transactionCode;
        this.globalCode = global_code;
        this.maxAmount = maxAmount;
        this.drAmountLimit = drAmountLimit;
        this.drNumberLimit = drNumberLimit;
        this.drStartDate = drStartDate;
        this.drEndDate = drEndDate;
        this.drCurrencyAmount = drCurrencyAmount;
        this.drCurrencyNumber = drCurrencyNumber;
        this.typePeriodicity = typePeriodicity;
    }

    @Override
    public String toString() {
        return "DetailRiskManagment{" +
                "DetailRiskManagCode=" + DetailRiskManagCode +
                ", minAmount=" + minAmount +
                ", transactionCode='" + transactionCode + '\'' +
                ", globalCode=" + globalCode +
                ", maxAmount=" + maxAmount +
                ", drAmountLimit='" + drAmountLimit + '\'' +
                ", drNumberLimit=" + drNumberLimit +
                ", drStartDate=" + drStartDate +
                ", drEndDate=" + drEndDate +
                ", drCurrencyAmount=" + drCurrencyAmount +
                ", drCurrencyNumber=" + drCurrencyNumber +
                ", typePeriodicity=" + typePeriodicity +
                '}';
    }
}

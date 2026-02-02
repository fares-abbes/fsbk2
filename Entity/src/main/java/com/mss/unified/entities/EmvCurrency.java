package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "EMV_CURR",schema = "ATM")
public class EmvCurrency {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "emvCurrencySequence")
    @SequenceGenerator(name = "emvCurrencySequence", sequenceName = "ATM.emvCurrencySequence", allocationSize = 1)
    @Column(name = "CURR_CODE", nullable = false)
    private String currCode;
    @Column(name = "ECM_CODE")
    private String ecmCode;
    @Column(name = "CURR_ORDER")
    private String currOrder;

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public String getEcmCode() {
        return ecmCode;
    }

    public void setEcmCode(String ecmCode) {
        this.ecmCode = ecmCode;
    }

    public String getCurrOrder() {
        return currOrder;
    }

    public void setCurrOrder(String currOrder) {
        this.currOrder = currOrder;
    }
}

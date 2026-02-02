package com.mss.unified.entities;

import javax.persistence.*;
@Entity
@Table(name = "emv_curr", schema = "ATM")
public class AtmEmvCurr {
	   @Id
	    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmEmvCurrSequence")
	    @SequenceGenerator(name = "AtmEmvCurrSequence", sequenceName = "ATM.AtmEmvCurrSequence", allocationSize = 1)
	    private int id;
    @Column(name = "CURR_CODE", nullable = false)
    private String currCode;

    @Column(name = "ECM_CODE", nullable = false)
    private int ecmCode;

    @Column(name = "curr_order", nullable = false)
    private int currorder;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCurrCode() {
        return currCode;
    }

    public void setCurrCode(String currCode) {
        this.currCode = currCode;
    }

    public int getEcmCode() {
        return ecmCode;
    }

    public void setEcmCode(int ecmCode) {
        this.ecmCode = ecmCode;
    }

    public int getCurrorder() {
        return currorder;
    }

    public void setCurrorder(int currorder) {
        this.currorder = currorder;
    }
}

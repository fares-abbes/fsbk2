package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TVA_COMMISSION_FRANSABANK",schema="FRANSABANK")
public class TvaCommissionFransaBank {
    @Id
    private int code;
    private String tva;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTva() {
        return tva;
    }

    public void setTva(String tva) {
        this.tva = tva;
    }
}

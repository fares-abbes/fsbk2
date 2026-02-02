package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "COMMISSION_TYPE", schema = "POS")
public class CommissionType {
    @Id
    @Column(name = "COMMISSION_CODE", nullable = false)
    private int commissionTypeCode;

    @Column(name = "COMMISSION_LIBELLE", nullable = false)
    private String comTypeLibelle;

    public CommissionType() {
    }

    public CommissionType(int commissionTypeCode, String comTypeLibelle) {
        this.commissionTypeCode = commissionTypeCode;
        this.comTypeLibelle = comTypeLibelle;
    }

    public int getCommissionTypeCode() {
        return commissionTypeCode;
    }

    public void setCommissionTypeCode(int commissionTypeCode) {
        this.commissionTypeCode = commissionTypeCode;
    }

    public String getComTypeLibelle() {
        return comTypeLibelle;
    }

    public void setComTypeLibelle(String comTypeLibelle) {
        this.comTypeLibelle = comTypeLibelle;
    }
}

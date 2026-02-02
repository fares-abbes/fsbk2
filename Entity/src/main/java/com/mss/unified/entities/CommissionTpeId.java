package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CommissionTpeId implements Serializable {
    @Column(name = "REQUEST_CODE", nullable = false)
    private int requestCode;
    @Column(name = "COMMISSION_NATIONAL")
    private String commissionNational;

    @Column(name = "COMMISSION_INTERNATIONAL")
    private String commissionInterNational;

    @Column(name = "MONTANT_REFMIN")
    private String montantRefMin;
    @Column(name = "MONTANT_REFMAX")
    private String montantRefMax;
    @Column(name = "MERCHANT_CODE")
    private Integer merchantCode;


    public CommissionTpeId() {
    }

    public CommissionTpeId(int requestCode, String commissionNational, String commissionInterNational, String montantRefMin, String montantRefMax, Integer merchantCode) {
        this.requestCode = requestCode;
        this.commissionNational = commissionNational;
        this.commissionInterNational = commissionInterNational;
        this.montantRefMin = montantRefMin;
        this.montantRefMax = montantRefMax;
        this.merchantCode = merchantCode;
    }

    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public String getCommissionNational() {
        return commissionNational;
    }

    public void setCommissionNational(String commissionNational) {
        this.commissionNational = commissionNational;
    }

    public String getCommissionInterNational() {
        return commissionInterNational;
    }

    public void setCommissionInterNational(String commissionInterNational) {
        this.commissionInterNational = commissionInterNational;
    }

    public String getMontantRefMin() {
        return montantRefMin;
    }

    public void setMontantRefMin(String montantRefMin) {
        this.montantRefMin = montantRefMin;
    }

    public String getMontantRefMax() {
        return montantRefMax;
    }

    public void setMontantRefMax(String montantRefMax) {
        this.montantRefMax = montantRefMax;
    }

    public Integer getMerchantCode() {
        return merchantCode;
    }

    public void setMerchantCode(Integer merchantCode) {
        this.merchantCode = merchantCode;
    }
}

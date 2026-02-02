package com.mss.unified.entities;

import javax.persistence.*;
@Entity
@Table(name = "Commission_FRANSABANK_OnUs", schema = "FRANSABANK")
public class CommissionFransabankOnUs {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CommissionFRANSABANKOnUsSequence")
    @SequenceGenerator(name = "newCommissionFRANSABANKOnUsSequence", sequenceName = "FRANSABANK.CommissionFRANSABANKOnUsSequencens", allocationSize = 1)
    @Column(name = "CODE", nullable = false)
    private Integer code;
    @Column(name = "Commission_FIXE")
    private String commissionFixe;
    @Column(name = "CMI")
    private String cmi;
    @Column(name = "CODE_ONUS")
    private String type;

    @Column(name = "MIN")
    private String min;
    @Column(name = "MAX")
    private String max;
    @Column(name = "COMMISSION_VARIABLE")
    private String commissionVariable;
    @Column(name = "PiementInternet")
    private String paiementInternet;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCommissionFixe() {
        return commissionFixe;
    }

    public void setCommissionFixe(String commissionFixe) {
        this.commissionFixe = commissionFixe;
    }

    public String getCmi() {
        return cmi;
    }

    public void setCmi(String cmi) {
        this.cmi = cmi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getCommissionVariable() {
        return commissionVariable;
    }

    public void setCommissionVariable(String commissionVariable) {
        this.commissionVariable = commissionVariable;
    }

	public String getPaiementInternet() {
		return paiementInternet;
	}

	public void setPaiementInternet(String paiementInternet) {
		this.paiementInternet = paiementInternet;
	}
    
    
}

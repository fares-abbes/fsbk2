package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Commission_ACHAT", schema = "FRANSABANK")
public class CommissionAchatFransaBank {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CommissionAchatFRANSABANKSequence")
    @SequenceGenerator(name = "newCommissionAchatFRANSABANKSequence", sequenceName = "FRANSABANK.CommissionAchatFRANSABANKSequencens", allocationSize = 1)
    @Column(name = "CODE", nullable = false)
    private Integer code;
    @Column(name = "VALEUR_MIN")
    private String valeurMin;
    @Column(name = "VALEUR_MAX")
    private String valeurMax;
    @Column(name = "VALEUR_FIX")
    private String valeurFix;
    @Column(name = "VALEUR_VARIABLE")
    private String valeurVarivable;
    @Column(name = "CMI")
    private String cmi;
    @Column(name = "CPI")
    private String cpi;
    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getValeurMin() {
        return valeurMin;
    }

    public void setValeurMin(String valeurMin) {
        this.valeurMin = valeurMin;
    }

    public String getValeurMax() {
        return valeurMax;
    }

    public void setValeurMax(String valeurMax) {
        this.valeurMax = valeurMax;
    }

    public String getValeurFix() {
        return valeurFix;
    }

    public void setValeurFix(String valeurFix) {
        this.valeurFix = valeurFix;
    }

    public String getValeurVarivable() {
        return valeurVarivable;
    }

    public void setValeurVarivable(String valeurVarivable) {
        this.valeurVarivable = valeurVarivable;
    }

    public String getCmi() {
        return cmi;
    }

    public void setCmi(String cmi) {
        this.cmi = cmi;
    }

    public String getCpi() {
        return cpi;
    }

    public void setCpi(String cpi) {
        this.cpi = cpi;
    }

    @Override
    public String toString() {
        return "CommissionAchatFransaBank{" +
                "code=" + code +
                ", valeurMin='" + valeurMin + '\'' +
                ", valeurMax='" + valeurMax + '\'' +
                ", valeurFix='" + valeurFix + '\'' +
                ", valeurVarivable='" + valeurVarivable + '\'' +
                ", cmi='" + cmi + '\'' +
                ", cpi='" + cpi + '\'' +
                '}';
    }
}

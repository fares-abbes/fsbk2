package com.mss.unified.entities;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name = "COMMISSION_INTERNATIONAL", schema = "FRANSABANK")
public class CommissionInternational {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODE")
    private Integer code;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "COMM_VARIABLE")
    private BigDecimal commVariable;

    @Column(name = "COMM_FIX")
    private BigDecimal commFix;
    @Column(name = "COMM_VARIABLE_DEVISE")
    private BigDecimal commVariableDevise;

    @Column(name = "COMM_FIX_DEVISE")
    private BigDecimal commFixDevise;

    public BigDecimal getCommVariableDevise() {
        return commVariableDevise;
    }

    public void setCommVariableDevise(BigDecimal commVariableDevise) {
        this.commVariableDevise = commVariableDevise;
    }

    public BigDecimal getCommFixDevise() {
        return commFixDevise;
    }

    public void setCommFixDevise(BigDecimal commFixDevise) {
        this.commFixDevise = commFixDevise;
    }

    public CommissionInternational() {
    }

    public CommissionInternational(String type, BigDecimal commVariable, BigDecimal commFix) {
        this.type = type;
        this.commVariable = commVariable;
        this.commFix = commFix;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getCommVariable() {
        return commVariable;
    }

    public void setCommVariable(BigDecimal commVariable) {
        this.commVariable = commVariable;
    }

    public BigDecimal getCommFix() {
        return commFix;
    }

    public void setCommFix(BigDecimal commFix) {
        this.commFix = commFix;
    }

    @Override
    public String toString() {
        return "CommissionInternational{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", commVariable=" + commVariable +
                ", commFix=" + commFix +
                '}';
    }
}

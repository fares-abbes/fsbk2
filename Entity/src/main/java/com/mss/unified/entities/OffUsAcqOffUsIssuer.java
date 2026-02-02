package com.mss.unified.entities;

import javax.persistence.*;
@Entity
@Table(name = "OffUsAcqOffUsIssuer", schema = "FRANSABANK")
public class OffUsAcqOffUsIssuer {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newOffUsAcqOffUsIssuerSequence")
    @SequenceGenerator(name = "newOffUsAcqOffUsIssuerSequence", sequenceName = "FRANSABANK.OffUsAcqOffUsIssuerSequencens", allocationSize = 1)
    @Column(name = "CODE", nullable = false)
    private int code;
    @Column(name = "TYPE")
    private String type;

    @Column(name = "IDENTIFY")
    private Integer identify;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIdentify() {
        return identify;
    }

    public void setIdentify(Integer identify) {
        this.identify = identify;
    }
}

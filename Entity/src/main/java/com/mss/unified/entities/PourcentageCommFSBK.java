package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POURCENTAGE_COMMISSION_FRANSABANK",schema="FRANSABANK")
public class PourcentageCommFSBK {
    @Id
    private int code;
    private String pourcentage;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(String pourcentage) {
        this.pourcentage = pourcentage;
    }
}

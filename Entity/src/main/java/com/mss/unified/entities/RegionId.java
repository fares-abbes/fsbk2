package com.mss.unified.entities;

import java.io.Serializable;


public class RegionId implements Serializable {

    private Integer codeRegion;


    private String initial;

    public Integer getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(Integer codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
}

package com.mss.unified.entities;


import java.io.Serializable;

public class ZoneId  implements Serializable {


    private Integer codeZone;


    private String initial;

    public Integer getCodeZone() {
        return codeZone;
    }

    public void setCodeZone(Integer codeZone) {
        this.codeZone = codeZone;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }
}

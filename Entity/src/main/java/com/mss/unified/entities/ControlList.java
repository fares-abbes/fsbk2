package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTROL_LIST",schema = "PORTEUR")
public class ControlList {
    @Id
    @Column(name = "CONTROL_NUM", nullable = false)
    private String controlNum;

    @Column(name = "LIBELLE_CONTROL")
    private String libelleControl;

    @Column(name="METHODE_NAME")
    private  String methodeName;

    public String getMethodeName() {
        return methodeName;
    }

    public void setMethodeName(String methodeName) {
        this.methodeName = methodeName;
    }

    public
    String getControlNum() {
        return controlNum;
    }

    public
    void setControlNum(String controlNum) {
        this.controlNum = controlNum;
    }

    public
    String getLibelleControl() {
        return libelleControl;
    }

    public
    void setLibelleControl(String libelleControl) {
        this.libelleControl = libelleControl;
    }
}

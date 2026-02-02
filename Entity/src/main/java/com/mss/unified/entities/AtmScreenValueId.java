package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AtmScreenValueId implements Serializable {


    @Column(name = "ASC_CODE", nullable = false)
    private String atmScreenConfigID;

    @Column(name = "NUM_SCREEN", nullable = false)
    private String atmScreenNumID;

    public AtmScreenValueId() {
    }

    public AtmScreenValueId(String atmScreenConfigID, String atmScreenNumID) {
        this.atmScreenConfigID = atmScreenConfigID;
        this.atmScreenNumID = atmScreenNumID;
    }


    public String getAtmScreenConfigID() {
        return atmScreenConfigID;
    }

    public void setAtmScreenConfigID(String atmScreenConfigID) {
        this.atmScreenConfigID = atmScreenConfigID;
    }

    public String getAtmScreenNumID() {
        return atmScreenNumID;
    }

    public void setAtmScreenNumID(String atmScreenNumID) {
        this.atmScreenNumID = atmScreenNumID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AtmScreenValueId))
            return false;
        AtmScreenValueId that = (AtmScreenValueId) o;
        return Objects.equals(getAtmScreenConfigID(), that.getAtmScreenConfigID())
                && Objects.equals(getAtmScreenNumID(), that.getAtmScreenNumID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmScreenConfigID(), getAtmScreenNumID());
    }

}


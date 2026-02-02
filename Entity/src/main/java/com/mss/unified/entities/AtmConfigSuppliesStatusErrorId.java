package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AtmConfigSuppliesStatusErrorId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "ASSME_CODE", nullable = false)
    private String atmSuppliesErrorId;

    @Column(name = "ATM_CON_NUM", nullable = false)
    private String atmConfigurationId;

    public String getAtmSuppliesErrorId() {
        return atmSuppliesErrorId;
    }

    public void setAtmSuppliesErrorId(String atmSuppliesErrorId) {
        this.atmSuppliesErrorId = atmSuppliesErrorId;
    }

    public String getAtmConfigurationId() {
        return atmConfigurationId;
    }

    public void setAtmConfigurationId(String atmConfigurationId) {
        this.atmConfigurationId = atmConfigurationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AtmConfigSuppliesStatusErrorId))
            return false;
        AtmConfigSuppliesStatusErrorId that = (AtmConfigSuppliesStatusErrorId) o;
        return Objects.equals(getAtmSuppliesErrorId(), that.getAtmSuppliesErrorId())
                && Objects.equals(getAtmConfigurationId(), that.getAtmConfigurationId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmSuppliesErrorId(), getAtmConfigurationId());
    }


}

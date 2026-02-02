package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class AtmConfigurationSensorErrorId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "ASSME_CODE", nullable = false)
    private String atmSensorStatusErrorId;

    @Column(name = "ATM_CON_NUM", nullable = false)
    private String atmConfigurationId;

    public String getAtmSensorStatusErrorId() {
        return atmSensorStatusErrorId;
    }

    public void setAtmSensorStatusErrorId(String atmSensorStatusErrorId) {
        this.atmSensorStatusErrorId = atmSensorStatusErrorId;
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
        if (!(o instanceof AtmConfigurationSensorErrorId))
            return false;
        AtmConfigurationSensorErrorId that = (AtmConfigurationSensorErrorId) o;
        return Objects.equals(getAtmSensorStatusErrorId(), that.getAtmSensorStatusErrorId())
                && Objects.equals(getAtmConfigurationId(), that.getAtmConfigurationId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmSensorStatusErrorId(), getAtmConfigurationId());
    }
}

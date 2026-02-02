package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AtmConfigHardFitnessErrorId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "AHFME_CODE", nullable = false)
    private String atmHardFitnessErrorId;

    @Column(name = "ATM_CON_NUM", nullable = false)
    private String atmConfigId;

    public String getAtmHardFitnessErrorId() {
        return atmHardFitnessErrorId;
    }

    public void setAtmHardFitnessErrorId(String atmHardFitnessErrorId) {
        this.atmHardFitnessErrorId = atmHardFitnessErrorId;
    }

    public String getAtmConfigId() {
        return atmConfigId;
    }

    public void setAtmConfigId(String atmConfigId) {
        this.atmConfigId = atmConfigId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof AtmConfigHardFitnessErrorId))
            return false;
        AtmConfigHardFitnessErrorId that = (AtmConfigHardFitnessErrorId) o;
        return Objects.equals(getAtmConfigId(), that.getAtmConfigId())
                && Objects.equals(getAtmHardFitnessErrorId(), that.getAtmHardFitnessErrorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmConfigId(), getAtmHardFitnessErrorId());
    }
}

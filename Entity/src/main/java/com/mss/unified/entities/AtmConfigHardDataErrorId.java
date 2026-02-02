package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
@Embeddable
public class AtmConfigHardDataErrorId implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "AHCDME_CODE", nullable = false)
    private String atmHardConfErrorId;

    @Column(name = "ATM_CON_NUM", nullable = false)
    private String atmConfigId;

    public String getAtmHardConfErrorId() {
        return atmHardConfErrorId;
    }

    public void setAtmHardConfErrorId(String atmHardConfErrorId) {
        this.atmHardConfErrorId = atmHardConfErrorId;
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
        if (!(o instanceof AtmConfigHardDataErrorId))
            return false;
        AtmConfigHardDataErrorId that = (AtmConfigHardDataErrorId) o;
        return Objects.equals(getAtmConfigId(), that.getAtmConfigId())
                && Objects.equals(getAtmHardConfErrorId(), that.getAtmHardConfErrorId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAtmConfigId(), getAtmHardConfErrorId());
    }
}

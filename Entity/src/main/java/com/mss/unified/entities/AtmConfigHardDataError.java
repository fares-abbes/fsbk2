package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HARD_CONF_ERR_AFF",schema = "ATM")
public class AtmConfigHardDataError {
    @EmbeddedId
    private AtmConfigHardDataErrorId atmConfigHardDataErrorId;

    public AtmConfigHardDataErrorId getAtmConfigHardDataErrorId() {
        return atmConfigHardDataErrorId;
    }

    public void setAtmConfigHardDataErrorId(AtmConfigHardDataErrorId atmConfigHardDataErrorId) {
        this.atmConfigHardDataErrorId = atmConfigHardDataErrorId;
    }
}

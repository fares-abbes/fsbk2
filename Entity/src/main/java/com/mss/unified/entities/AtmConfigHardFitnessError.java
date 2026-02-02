package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HARD_FIT_CONF_ERR",schema = "ATM")
public class AtmConfigHardFitnessError {
    @EmbeddedId
    private AtmConfigHardFitnessErrorId atmConfigHardFitnessErrorId;

    public AtmConfigHardFitnessErrorId getAtmConfigHardFitnessErrorId() {
        return atmConfigHardFitnessErrorId;
    }

    public void setAtmConfigHardFitnessErrorId(AtmConfigHardFitnessErrorId atmConfigHardFitnessErrorId) {
        this.atmConfigHardFitnessErrorId = atmConfigHardFitnessErrorId;
    }
}

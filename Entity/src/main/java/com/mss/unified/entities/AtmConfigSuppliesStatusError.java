package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SUPPLIES_STATUS_MAP_CONFIG",schema = "ATM")
public class AtmConfigSuppliesStatusError {
    @EmbeddedId
    private AtmConfigSuppliesStatusErrorId atmConfigSuppliesStatusErrorId;

    public AtmConfigSuppliesStatusErrorId getAtmConfigSuppliesStatusErrorId() {
        return atmConfigSuppliesStatusErrorId;
    }

    public void setAtmConfigSuppliesStatusErrorId(AtmConfigSuppliesStatusErrorId atmConfigSuppliesStatusErrorId) {
        this.atmConfigSuppliesStatusErrorId = atmConfigSuppliesStatusErrorId;
    }
}

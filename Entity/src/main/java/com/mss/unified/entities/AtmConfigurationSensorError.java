package com.mss.unified.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "SENSOR_STATUS_MAP_CONF",schema = "ATM")
public class AtmConfigurationSensorError {
    @EmbeddedId
    private AtmConfigurationSensorErrorId atmConfigurationSensorErrorId;

    public AtmConfigurationSensorErrorId getAtmConfigurationSensorErrorId() {
        return atmConfigurationSensorErrorId;
    }

    public void setAtmConfigurationSensorErrorId(AtmConfigurationSensorErrorId atmConfigurationSensorErrorId) {
        this.atmConfigurationSensorErrorId = atmConfigurationSensorErrorId;
    }
}

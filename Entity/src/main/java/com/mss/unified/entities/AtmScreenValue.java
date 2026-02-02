package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

 

import java.io.Serializable;

@Entity
@Table(name = "ATM_SCREEN_VALUE", schema = "ATM")
public
class AtmScreenValue implements Serializable {
	
 

	  @EmbeddedId
	  private AtmScreenValueId atmScreenValueId;

	  @Column(name = "PARAM_SCREEN", nullable = false)
	  private String atmScreenParam;

    public AtmScreenValueId getAtmScreenValueId() {
        return atmScreenValueId;
    }

    public void setAtmScreenValueId(AtmScreenValueId atmScreenValueId) {
        this.atmScreenValueId = atmScreenValueId;
    }

    public String getAtmScreenParam() {
        return atmScreenParam;
    }

    public void setAtmScreenParam(String atmScreenParam) {
        this.atmScreenParam = atmScreenParam;
    }
}

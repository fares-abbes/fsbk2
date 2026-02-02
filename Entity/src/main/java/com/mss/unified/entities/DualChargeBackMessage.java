package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "DUAL_MESSAGE_CHARGE_BACK", schema = "PORTEUR")
public class DualChargeBackMessage {
    
//    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DualChargeSequence")
//    @SequenceGenerator(name = "DualChargeSequence", sequenceName = "CLEARING.DualChargeSequence", allocationSize = 1)
//
//	@JsonProperty("code")
//	@Column(name = "CODE", nullable = false)
//    private int code;
	@Id
    @JsonProperty("motif")
    @Column(name = "MOTIF")
    private String motif;

    @JsonProperty("minPeriod")
    @Column(name = "MIN_PERIOD")
    private String minPeriod;

    @JsonProperty("maxPeriod")
    @Column(name = "MAX_PERIOD")
    private String maxPeriod;

    @JsonProperty("messageReasonCode")
    @Column(name = "MESSAGE_REASON_CODE")
    private String messageReasonCode;

    @JsonProperty("type")
    @Column(name = "type")
    private String type;

    private Boolean avecAgence;

 

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getMinPeriod() {
        return minPeriod;
    }

    public void setMinPeriod(String minPeriod) {
        this.minPeriod = minPeriod;
    }

    public String getMaxPeriod() {
        return maxPeriod;
    }

    public void setMaxPeriod(String maxPeriod) {
        this.maxPeriod = maxPeriod;
    }

    public String getMessageReasonCode() {
        return messageReasonCode;
    }
    

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setMessageReasonCode(String messageReasonCode) {
        this.messageReasonCode = messageReasonCode;
    }

	public Boolean getAvecAgence() {
		return avecAgence;
	}

	public void setAvecAgence(Boolean avecAgence) {
		this.avecAgence = avecAgence;
	}




}

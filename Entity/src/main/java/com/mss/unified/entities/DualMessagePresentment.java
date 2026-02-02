package com.mss.unified.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "DUAL_MESSAGE_PRESENTMENT", schema = "FRANSABANK")
public class DualMessagePresentment {
    
    
   @Id
    @JsonProperty("Motif")
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


    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public void setMessageReasonCode(String messageReasonCode) {
        this.messageReasonCode = messageReasonCode;
    }

  

}

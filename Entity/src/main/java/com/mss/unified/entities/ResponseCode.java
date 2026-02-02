package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RESPONSE_CODE",schema = "SWITCH")
public
class ResponseCode {


    @Id
    @Column(name = "RESPONSE_CODE_ISO", nullable = false)
    private String responseCodeIso;

    @Column(name = "MOTIF_OPPOSITION", nullable = false)
    private String motifOpposition;

    @Column(name = "DESCRIPTION", nullable = false)
    private String description;

    public String getResponseCodeIso() {
        return responseCodeIso;
    }

    public void setResponseCodeIso(String responseCodeIso) {
        this.responseCodeIso = responseCodeIso;
    }

    public String getMotifOpposition() {
        return motifOpposition;
    }

    public void setMotifOpposition(String motifOpposition) {
        this.motifOpposition = motifOpposition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REQUEST_TPE_TYPE", schema = "POS")
public class RequestTpeType {
    @Id
    @Column(name = "TYPE_CODE", nullable = false)
    private int requestTpeCode;
    @Column(name = "TYPE_LIBELLE", nullable = false)
    private String requestTpeLibelle;

    public RequestTpeType() {
    }

    public RequestTpeType(int requestTpeCode, String requestTpeLibelle) {
        this.requestTpeCode = requestTpeCode;
        this.requestTpeLibelle = requestTpeLibelle;
    }

    public int getRequestTpeCode() {
        return requestTpeCode;
    }

    public void setRequestTpeCode(int requestTpeCode) {
        this.requestTpeCode = requestTpeCode;
    }

    public String getRequestTpeLibelle() {
        return requestTpeLibelle;
    }

    public void setRequestTpeLibelle(String requestTpeLibelle) {
        this.requestTpeLibelle = requestTpeLibelle;
    }
}

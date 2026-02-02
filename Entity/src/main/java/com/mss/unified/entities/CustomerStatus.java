package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS_STATUS",schema = "PORTEUR")
public class CustomerStatus {
    @Id
    @Column(name = "CUST_CODE", nullable = false)
    private int identificationTypeCode;

    @Column(name = "CUST_LIBELLE")
    private String libelle;
    @Column(name = "FSBK_CODE")
    private String fsbkCode;

    public String getFsbkCode() {
		return fsbkCode;
	}

	public void setFsbkCode(String fsbkCode) {
		this.fsbkCode = fsbkCode;
	}

    public int getIdentificationTypeCode() {
        return identificationTypeCode;
    }

    public void setIdentificationTypeCode(int identificationTypeCode) {
        this.identificationTypeCode = identificationTypeCode;
    }

    public
    String getLibelle() {
        return libelle;
    }

    public
    void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}

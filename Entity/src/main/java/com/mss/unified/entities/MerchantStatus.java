package com.mss.unified.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MERCHANT_STATUS",schema = "POS")
public
class MerchantStatus {


    @Id
    @Column(name = "MERSTAT_CODE", nullable = false)
    private int merchantStatCode;

    @Column(name = "MERSTAT_LIBELLE")
    private String libelle;


    @Column(name = "LIBELLE_FR")
    private String libelleFr;

    public
    int getMerchantStatCode() {
        return merchantStatCode;
    }

    public
    void setMerchantStatCode(int merchantStatCode) {
        this.merchantStatCode = merchantStatCode;
    }

    public
    String getLibelle() {
        return libelle;
    }

    public
    void setLibelle(String libelle) {
        this.libelle = libelle;
    }

	public String getLibelleFr() {
		return libelleFr;
	}

	public void setLibelleFr(String libelleFr) {
		this.libelleFr = libelleFr;
	}

	@Override
	public String toString() {
		return "MerchantStatus [merchantStatCode=" + merchantStatCode + ", libelle=" + libelle + ", libelleFr="
				+ libelleFr + "]";
	}
    
    
}

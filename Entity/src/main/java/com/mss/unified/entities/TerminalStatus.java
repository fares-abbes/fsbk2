package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "TERMINAL_STATUS", schema = "ATM")
public class TerminalStatus {
    @Id
    @Column(name = "TERSTAT_CODE", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int terstatCode;

    @Column(name = "TERSTAT_LIBELLE")
    public String terstatLibelle;
    
    
    @Column(name = "LIBELLE_FR")
    private String libelleFr;
    
    public String getLibelleFr() {
    	return libelleFr;
    }

    public void setLibelleFr(String libelleFr) {
    	this.libelleFr = libelleFr;
    }


    public int getTerstatCode() {
        return terstatCode;
    }

    public void setTerstatCode(int terstatCode) {
        this.terstatCode = terstatCode;
    }

    public String getTerstatLibelle() {
        return terstatLibelle;
    }

    public void setTerstatLibelle(String terstatLibelle) {
        this.terstatLibelle = terstatLibelle;
    }

	@Override
	public String toString() {
		return "TerminalStatus [terstatCode=" + terstatCode + ", terstatLibelle=" + terstatLibelle + ", libelleFr="
				+ libelleFr + "]";
	}
    
    
}

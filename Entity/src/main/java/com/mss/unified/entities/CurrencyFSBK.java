package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CURRENCY_FSBK", schema = "FRANSABANK")
public class CurrencyFSBK {
	
	  @Id
	  @Column(name = "CODE_FSBK", nullable = false)
	  private String codeFsbk;


	  @Column(name = "LIBELLE", nullable = false)
	  private String libelle;
	  
	  @Column(name = "CODE_DEVISE", nullable = false)
	  private String codeDevise;

	public String getCodeFsbk() {
		return codeFsbk;
	}

	public void setCodeFsbk(String codeFsbk) {
		this.codeFsbk = codeFsbk;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCodeDevise() {
		return codeDevise;
	}

	public void setCodeDevise(String codeDevise) {
		this.codeDevise = codeDevise;
	}

	@Override
	public String toString() {
		return "CurrencyFSBK [codeFsbk=" + codeFsbk + ", libelle=" + libelle + ", codeDevise=" + codeDevise + "]";
	}

	  
}

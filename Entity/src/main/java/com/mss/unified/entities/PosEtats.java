package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="POS_STATUS",schema="POS")
public class PosEtats {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosEtatsSequence")
	@SequenceGenerator(name = "PosEtatsSequence", sequenceName = "POS.PosEtatsSequence", allocationSize = 1)
	@Column(name = "ID_STOCK", nullable = false)
	private int CodeStatus;
	
	
	 @Column(name = "LIBELLE")
	  private String libelle;

	 
	  @Column(name = "LIBELLE_FR")
	  private String libelleFr;
	  
	  
	public String getLibelleFr() {
		return libelleFr;
	}

	public void setLibelleFr(String libelleFr) {
		this.libelleFr = libelleFr;
	}

	public int getCodeStatus() {
		return CodeStatus;
	}

	public void setCodeStatus(int codeStatus) {
		CodeStatus = codeStatus;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "PosEtats [CodeStatus=" + CodeStatus + ", libelle=" + libelle + ", libelleFr=" + libelleFr + "]";
	}

	
	 

}

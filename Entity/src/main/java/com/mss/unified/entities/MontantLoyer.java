package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MONTANT_LOYER", schema = "POS")
public class MontantLoyer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "MontantLoyerSequence")
	@SequenceGenerator(name = "MontantLoyerSequence", sequenceName = "POS.MontantLoyerSequence", allocationSize = 1)
	@Column(name = "MONTANT_ID", nullable = false)
	private Integer idmontant;

	@Column(name = "REQUEST_CODE")
	private int requestCode;

	@Column(name = "MONTANT_LOYER")
	private String montantLoyer;

	public Integer getIdmontant() {
		return idmontant;
	}

	public void setIdmontant(Integer idmontant) {
		this.idmontant = idmontant;
	}

	public int getRequestCode() {
		return requestCode;
	}

	public void setRequestCode(int requestCode) {
		this.requestCode = requestCode;
	}

	public String getMontantLoyer() {
		return montantLoyer;
	}

	public void setMontantLoyer(String montantLoyer) {
		this.montantLoyer = montantLoyer;
	}

	@Override
	public String toString() {
		return "MontantLoyer [idmontant=" + idmontant + ", requestCode=" + requestCode + ", montantLoyer="
				+ montantLoyer + "]";
	}
	
	

}

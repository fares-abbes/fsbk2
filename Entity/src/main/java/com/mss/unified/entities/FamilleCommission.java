package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "POS",name = "FAMILLE_COMMISSION")
public class FamilleCommission {
	 	@Id
	    @Column(name = "COMMISSION_CODE", nullable = false)
	    private int familleCommissionCode;

	    @Column(name = "COMMISSION_LIBELLE", nullable = false)
	    private String comTypeLibelle;

		public int getFamilleCommissionCode() {
			return familleCommissionCode;
		}

		public void setFamilleCommissionCode(int familleCommissionCode) {
			this.familleCommissionCode = familleCommissionCode;
		}

		public String getComTypeLibelle() {
			return comTypeLibelle;
		}

		public void setComTypeLibelle(String comTypeLibelle) {
			this.comTypeLibelle = comTypeLibelle;
		}

		@Override
		public String toString() {
			return "FamilleCommission [familleCommissionCode=" + familleCommissionCode + ", comTypeLibelle="
					+ comTypeLibelle + "]";
		}
	    
	    
	    
	    
}

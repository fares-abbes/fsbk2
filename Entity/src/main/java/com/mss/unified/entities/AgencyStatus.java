package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AGENCY_STATUS",schema = "Administration")
public class AgencyStatus {
	
	 	@Id
	    @Column(name = "AGENCY_STATUS_CODE", nullable = false)
	    private String agencyStatusCode;

	    @Column(name = "AGENCY_STATUS_LIBELLE", nullable = false)
	    private String agencyStatusLibelle;

		public String getAgencyStatusCode() {
			return agencyStatusCode;
		}

		public void setAgencyStatusCode(String agencyStatusCode) {
			this.agencyStatusCode = agencyStatusCode;
		}

		public String getAgencyStatusLibelle() {
			return agencyStatusLibelle;
		}

		public void setAgencyStatusLibelle(String agencyStatusLibelle) {
			this.agencyStatusLibelle = agencyStatusLibelle;
		}
	    
	    


}

package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY",schema = "PORTEUR")
public class Country {
	

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "countrySequence")
    @SequenceGenerator(name = "countrySequence", sequenceName = "PORTEUR.countrySequence", allocationSize = 1)
    @Column(name = "country_id", nullable = false)
    private int countryId;
    private String country;
    private String  abbrev;
    private Integer countryCode;
    
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAbbrev() {
		return abbrev;
	}
	public void setAbbrev(String abbrev) {
		this.abbrev = abbrev;
	}
	public Integer getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(Integer countryCode) {
		this.countryCode = countryCode;
	}

    

}

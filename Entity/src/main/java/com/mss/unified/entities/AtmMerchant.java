package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ATM_MERCHANT",schema = "ATM")
public class AtmMerchant {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "AtmMerchantSequence")
    @SequenceGenerator(name = "AtmMerchantSequence", sequenceName = "ATM.AtmMerchantSequence", allocationSize = 1)
    @Column(name = "MERCHANT_CODE", nullable = false)
    private Integer merchantCode;
    
    
    
    
    

    @Column(name = "MERSTAT_CODE")
    private Integer merchantStatus;

    @Column(name = "MERCHANT_ID")
    private String merchantId;

    @Column(name = "MERCHANT_LIBELLE")
    private String merchantLibelle;

    @Column(name = "CITY")
    private String city;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "CODE_ZIP")
    private String codeZip;

    @Column(name = "PHONE")
    private String phone;
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "NUM_ACCOUNT")
    private String numAccount;
    
    @Column(name = "AGENCE")
    private String agence;
    
    @Column(name = "ADDRESS")
    private String address;
    
    @Column(name = "ISOFFSHORE")
    private Boolean offshore;
    
    @Column(name = "MCC")
    private String mcc;

	public Integer getMerchantCode() {
		return merchantCode;
	}

	public void setMerchantCode(Integer merchantCode) {
		this.merchantCode = merchantCode;
	}

	

	public Integer getMerchantStatus() {
		return merchantStatus;
	}

	public void setMerchantStatus(Integer merchantStatus) {
		this.merchantStatus = merchantStatus;
	}

	public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantLibelle() {
		return merchantLibelle;
	}

	public void setMerchantLibelle(String merchantLibelle) {
		this.merchantLibelle = merchantLibelle;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCodeZip() {
		return codeZip;
	}

	public void setCodeZip(String codeZip) {
		this.codeZip = codeZip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getOffshore() {
		return offshore;
	}

	public void setOffshore(Boolean offshore) {
		this.offshore = offshore;
	}


	public String getMcc() {
		return mcc;
	}

	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	

	public String getAgence() {
		return agence;
	}

	public void setAgence(String agence) {
		this.agence = agence;
	}

	public String getNumAccount() {
		return numAccount;
	}

	public void setNumAccount(String numAccount) {
		this.numAccount = numAccount;
	}

	@Override
	public String toString() {
		return "AtmMerchant [merchantCode=" + merchantCode + ", merchantStatus=" + merchantStatus + ", merchantId="
				+ merchantId + ", merchantLibelle=" + merchantLibelle + ", city=" + city + ", country=" + country
				+ ", codeZip=" + codeZip + ", phone=" + phone + ", creationDate=" + creationDate + ", numAccount="
				+ numAccount + ", agence=" + agence + ", address=" + address + ", offshore=" + offshore + ", mcc=" + mcc
				+ "]";
	}



	

	

    
  

}

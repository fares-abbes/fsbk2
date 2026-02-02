package com.mss.unified.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MERCHANT_EXCEPTION",schema = "FRANSABANK")
public class MerchantException {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "MerchantExSequence")
    @SequenceGenerator(name = "MerchantEXSequence", sequenceName = "FRANSABANK.MerchantExSequence", allocationSize = 1)
    @Column(name = "MERCHANT_CODE", nullable = false)
    private Integer merchantCode;

 
    @Column(name = "MERCHANT_ID")
    private String merchantId;
    
 

    @Column(name = "MERCHANT_LIBELLE")
    private String merchantLibelle;



	public Integer getMerchantCode() {
		return merchantCode;
	}



	public void setMerchantCode(Integer merchantCode) {
		this.merchantCode = merchantCode;
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



	@Override
	public String toString() {
		return "MerchantException [merchantCode=" + merchantCode + ", merchantId=" + merchantId + ", merchantLibelle="
				+ merchantLibelle + "]";
	}
 
    



}

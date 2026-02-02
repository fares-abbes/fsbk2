package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Marge_FCommisssion", schema = "FRANSABANK")
public class MargeCommission {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MargeCommissionSequence")
	@SequenceGenerator(name = "newMargeCommissionSequence", sequenceName = "FRANSABANK.MargeCommissionSequencens", allocationSize = 1)
	@Column(name = "CODE", nullable = false)
	private Integer code;
	@Column(name = "VALEUR_MIN")
	private String valeurMin;
	@Column(name = "VALEUR_MAX")
	private String valeurMax;
	@Column(name = "MargeKEY")
	private String margekey;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getValeurMin() {
		return valeurMin;
	}
	public void setValeurMin(String valeurMin) {
		this.valeurMin = valeurMin;
	}
	public String getValeurMax() {
		return valeurMax;
	}
	public void setValeurMax(String valeurMax) {
		this.valeurMax = valeurMax;
	}
	public String getMargekey() {
		return margekey;
	}
	public void setMargekey(String margekey) {
		this.margekey = margekey;
	}


	
	

}

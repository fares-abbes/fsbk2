package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "POS_MODEL",schema = "POS")
public class PosModel {

	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "PosModelSequence")
	  @SequenceGenerator(name = "PosModelSequence", sequenceName = "POS.PosModelSequence", allocationSize = 1)
	  @Column(name = "MODEL_CODE", nullable = false)
	  private Integer modelCode;
	 
	  @Column(name = "LIBELLE", nullable = false,unique = true)
	  private String libelle;
	  @Column(name = "MARQUE_CODE")
	  private Integer marqueCode;
	  
	  @Column(name = "TYPE_CODE")
	  private Integer codeType;
	public Integer getModelCode() {
		return modelCode;
	}
	public void setModelCode(Integer modelCode) {
		this.modelCode = modelCode;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Integer getMarqueCode() {
		return marqueCode;
	}
	public void setMarqueCode(Integer marqueCode) {
		this.marqueCode = marqueCode;
	}
	public Integer getCodeType() {
		return codeType;
	}
	public void setCodeType(Integer codeType) {
		this.codeType = codeType;
	}
	@Override
	public String toString() {
		return "PosModel [modelCode=" + modelCode + ", libelle=" + libelle + ", marqueCode=" + marqueCode
				+ ", codeType=" + codeType + "]";
	}
	
	  
	  
}

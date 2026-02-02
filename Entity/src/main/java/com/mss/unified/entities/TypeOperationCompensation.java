package com.mss.unified.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "TYPE_OPERATION_COMPENSATION", schema = "FRANSABANK")
public class TypeOperationCompensation {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "CODE", nullable = false)
	  public int code;

	  @Column(name = "LIBELLE")
	  public String libelle;

	  @Column(name = "operation_code")
	  public String operationCode;
	  
	public String getOperationCode() {
		return operationCode;
	}

	public void setOperationCode(String operationCode) {
		this.operationCode = operationCode;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	  
	  
}

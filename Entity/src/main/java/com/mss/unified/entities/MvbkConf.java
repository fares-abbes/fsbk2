package com.mss.unified.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "Mvbk_Conf", schema = "FRANSABANK")
public class MvbkConf {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "code", nullable = false)
	private int code;
	@Column(name = "code_settelement")

	private String codeSettlement;
	private String account;
	private int categorie;
	@Column(name = "CODE_AGENCE")
	private String codeAgence;
	private String identification;
	private String libelle;
	private String libOpe;

	private String signe;
	private String type;
	@Column(name = "code_operation")

	private String codeOperation;
	@Column(name = "libelleOperation")

	private String libelle_operation;
	private String entity;
	private String comment;
	private String libGenerique;
	private String typeOp;
	private String statusLevel;

	public String getStatusLevel() {
		return statusLevel;
	}

	public void setStatusLevel(String statusLevel) {
		this.statusLevel = statusLevel;
	}

	public String getTypeOp() {
		return typeOp;
	}

	public void setTypeOp(String typeOp) {
		this.typeOp = typeOp;
	}

	public String getLibGenerique() {
		return libGenerique;
	}

	public void setLibGenerique(String libGenerique) {
		this.libGenerique = libGenerique;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getLibOpe() {
		return libOpe;
	}

	public void setLibOpe(String libOpe) {
		this.libOpe = libOpe;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getCategorie() {
		return categorie;
	}

	public void setCategorie(int categorie) {
		this.categorie = categorie;
	}

	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getSigne() {
		return signe;
	}

	public void setSigne(String signe) {
		this.signe = signe;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLibelle_operation() {
		return libelle_operation;
	}

	public void setLibelle_operation(String libelle_operation) {
		this.libelle_operation = libelle_operation;
	}

	public String getCodeSettlement() {
		return codeSettlement;
	}

	public void setCodeSettlement(String codeSettelement) {
		this.codeSettlement = codeSettelement;
	}

	public String getCodeOperation() {
		return codeOperation;
	}

	public void setCodeOperation(String codeOperation) {
		this.codeOperation = codeOperation;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "MvbkConf [code=" + code + ", codeSettlement=" + codeSettlement + ", account=" + account + ", categorie="
				+ categorie + ", codeAgence=" + codeAgence + ", identification=" + identification + ", libelle="
				+ libelle + ", libOpe=" + libOpe + ", signe=" + signe + ", type=" + type + ", codeOperation="
				+ codeOperation + ", libelle_operation=" + libelle_operation + ", entity=" + entity + "]";
	}

}

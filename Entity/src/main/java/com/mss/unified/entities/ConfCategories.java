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
@Table(name = "ConfCategories", schema = "FRANSABANK")
public class ConfCategories {

	@Id
	@Column(name = "code", nullable = false)
	private int code;
	private String lib;
	private int type;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ConfCategories [code=" + code + ", lib=" + lib + ", type=" + type + "]";
	}
  
	
	
	
}

package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Transaction_Source", schema = "PORTEUR")
public class TransactionSource {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "sourceSequence")
	  @SequenceGenerator(name = "sourceSequence", sequenceName = "PORTEUR.sourceSequence", allocationSize = 1)
	  @Column(name = "CODE", nullable = false)
	  private int code;
	  @Column(name = "LIBELLE", nullable = false)
	  private String libelle;
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


	@Override
	public String toString() {
		return "TransactionSource{" +
				"code=" + code +
				", libelle='" + libelle + '\'' +
				'}';
	}
}

package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TYPE_CARD", schema = "PORTEUR")
public class typeCard {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "TypeCardSequence")
	  @SequenceGenerator(name = "TypeCardSequence", sequenceName = "PORTEUR.TypeCardSequence", allocationSize = 1)
	  @Column(name = "CODE_type", nullable = false)
	  public int typeCode;

	  @Column(name = "TYPE_LIBELLE")
	  public String type;

	public int getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	  
	  
}

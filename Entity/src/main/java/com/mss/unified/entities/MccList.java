package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MCC_LIST",schema = "POS")
public class MccList {

	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO, generator = "MccSequence")
	  @SequenceGenerator(name = "MccSequence", sequenceName = "POS.MccSequence", allocationSize = 1)
	  @Column(name = "MCC_CODE", nullable = false)
	  public Integer mccCode;

	  @Column(name = "MCC_ID")
	  public String mccListId;

	  @Column(name = "MCC_LIBELLE")
	  public String mccListLibelle;

	  public Integer getMccCode() {
		    return mccCode;
		  }

		  public void setMccCode(Integer mccCode) {
		    this.mccCode = mccCode;
		  }

		  public String getMccListId() {
		    return mccListId;
		  }

		  public void setMccListId(String mccListId) {
		    this.mccListId = mccListId;
		  }

		  public String getMccListLibelle() {
		    return mccListLibelle;
		  }

		  public void setMccListLibelle(String mccListLibelle) {
		    this.mccListLibelle = mccListLibelle;
		  }
}

package com.mss.unified.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DemandeResetPinOffline", schema = "PORTEUR")
public class DemandeResetPinOffline {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DemandeResetPinOfflineSequence")
	@SequenceGenerator(name = "DemandeResetPinOfflineSequence", sequenceName = "PORTEUR.DemandeResetPinOfflineSequence", allocationSize = 1)
	private Integer code;

	private String cardNumber;
	
	private Integer status;
	
	private String addedBy;
	private String motif;
	private LocalDateTime createdAt;
	private LocalDateTime modifiedAt;
	

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getAddedBy() {
		return addedBy;
	}

	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public LocalDateTime getModifiedAt() {
		return modifiedAt;
	}


	
	  @PreUpdate
	    private void setModifiedAt(){
	        this.modifiedAt = LocalDateTime.now();
	    }
	  
	    @PrePersist
	    private void setRowCreationData(){
	        this.createdAt = LocalDateTime.now();
	      
	    }

}

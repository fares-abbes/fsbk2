package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "FraisConnectivite", schema = "FRANSABANK")
public class FraisConnectivite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "fraisIdSequence")
	@SequenceGenerator(name = "fraisIdSequence", sequenceName = "clearing.fraisIdSequence", allocationSize = 1)	
	@Column(name = "flux_id", nullable = false)
    private Long fraisId;

	private double amount;
	public Long getFraisId() {
		return fraisId;
	}
	public void setFraisId(Long fraisId) {
		this.fraisId = fraisId;
	}
	
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}

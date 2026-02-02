package com.mss.unified.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="POS_LIMITS",schema="POS")
public class PosLimits {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosLimitsSequence")
	@SequenceGenerator(name = "PosLimitsSequence", sequenceName = "POS.PosLimitsSequence", allocationSize = 1)
	private Integer id;
	@Column(name = "ADJUSTEMENT_COUNT_LIMIT")
	@JsonProperty("ADJUSTEMENT_COUNT_LIMIT")
	private String adjustementCountLimit;
	
	@Column(name = "ADJUSTEMENT_AMOUNT_LIMIT")
	@JsonProperty("ADJUSTEMENT_AMOUNT_LIMIT")
	private String adjustementAmountLimit;
	
	@Column(name = "RETURN_COUNT_LIMIT")
	@JsonProperty("RETURN_COUNT_LIMIT")
	private String returnCountLimit;
	
	@Column(name = "RETURN_AMOUNT_LIMIT")
	@JsonProperty("RETURN_AMOUNT_LIMIT")
	private String returnAmountLimit;
	
	@OneToMany(mappedBy = "posLimits", fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private Set<PosLimitsConf> posLimitsConfs = new HashSet<>();
	
	public PosLimits() {
		super();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAdjustementCountLimit() {
		return adjustementCountLimit;
	}

	public void setAdjustementCountLimit(String adjustementCountLimit) {
		this.adjustementCountLimit = adjustementCountLimit;
	}

	public String getAdjustementAmountLimit() {
		return adjustementAmountLimit;
	}

	public void setAdjustementAmountLimit(String adjustementAmountLimit) {
		this.adjustementAmountLimit = adjustementAmountLimit;
	}

	public String getReturnCountLimit() {
		return returnCountLimit;
	}

	public void setReturnCountLimit(String returnCountLimit) {
		this.returnCountLimit = returnCountLimit;
	}

	public String getReturnAmountLimit() {
		return returnAmountLimit;
	}

	public void setReturnAmountLimit(String returnAmountLimit) {
		this.returnAmountLimit = returnAmountLimit;
	}

	public Set<PosLimitsConf> getPosLimitsConfs() {
		return posLimitsConfs;
	}

	public void setPosLimitsConfs(Set<PosLimitsConf> posLimitsConfs) {
		this.posLimitsConfs = posLimitsConfs;
	}
}

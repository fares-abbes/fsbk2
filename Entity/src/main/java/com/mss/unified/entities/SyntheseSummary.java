package com.mss.unified.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table( schema = "FRANSABANK")
public class SyntheseSummary {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "SyntheseSSequence")
	@SequenceGenerator(name = "newSyntheseSSequence", sequenceName = "FRANSABANK.SyntheseSSequencens", allocationSize = 1)
    @Column(name = "code", nullable = false)
	private Integer code;
	String dateSynthese;
	String status;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}


	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateSynthese() {
		return dateSynthese;
	}
	public void setDateSynthese(String dateSynthese) {
		this.dateSynthese = dateSynthese;
	}

	


	
	
}

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
@Table(name = "LOG_ATM",schema = "ATM")
public class LogAtm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "LOG_ATM_Sequence")
	@SequenceGenerator(name = "LOG_ATM_Sequence", sequenceName = "LOG_ATM_Sequence")
	private Integer id;
	private String numAtm;
	private Date anomlyDate;
	private String anomalyDescription;
	
    @Column(length = 4000)
	private String anomaly;
    
    private String anomalyDescriptionId;
    
    
    


	public String getAnomalyDescriptionId() {
		return anomalyDescriptionId;
	}

	public void setAnomalyDescriptionId(String anomalyDescriptionId) {
		this.anomalyDescriptionId = anomalyDescriptionId;
	}

	public Date getAnomlyDate() {
		return anomlyDate;
	}

	public void setAnomlyDate(Date anomlyDate) {
		this.anomlyDate = anomlyDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumAtm() {
		return numAtm;
	}

	public void setNumAtm(String numAtm) {
		this.numAtm = numAtm;
	}


	public String getAnomalyDescription() {
		return anomalyDescription;
	}

	public void setAnomalyDescription(String anomalyDescription) {
		this.anomalyDescription = anomalyDescription;
	}

	public String getAnomaly() {
		return anomaly;
	}

	public void setAnomaly(String anomaly) {
		this.anomaly = anomaly;
	}


    
}

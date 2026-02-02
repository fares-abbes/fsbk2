package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="POS_SERIAL_NUM",schema="POS")
public class PosSerialNumStates {
	
	@Id
	@Column(name = "SERIAL_NUM",unique = true, nullable = false)
	private String serialNum;
	
	@Column(name = "MODEL")
	private Integer model;
	
	@Column(name = "STATUS")
	private Integer status;
	
	@Column(name = "DATE_SAISIE")
	private String dateSaisie;
	
	@Column(name = "STATU_RESILIATION")
	private String statuResiliation;
	
	@Column(name = "STATU_REMPLACEMENT")
	private Integer statuRemplacement;
	@Column(name = "NUM_SIM")
	private String numSim;


	

	public String getNumSim() {
		return numSim;
	}

	public void setNumSim(String numSim) {
		this.numSim = numSim;
	}

	public Integer getStatuRemplacement() {
		return statuRemplacement;
	}

	public void setStatuRemplacement(Integer statuRemplacement) {
		this.statuRemplacement = statuRemplacement;
	}

	public Integer getModel() {
		return model;
	}

	public void setModel(Integer model) {
		this.model = model;
	}

	public String getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(String serialNum) {
		this.serialNum = serialNum;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDateSaisie() {
		return dateSaisie;
	}

	public void setDateSaisie(String dateSaisie) {
		this.dateSaisie = dateSaisie;
	}



	public String getStatuResiliation() {
		return statuResiliation;
	}

	public void setStatuResiliation(String statuResiliation) {
		this.statuResiliation = statuResiliation;
	}

	@Override
	public String toString() {
		return "PosSerialNumStates [serialNum=" + serialNum + ", model=" + model + ", status=" + status
				+ ", dateSaisie=" + dateSaisie + ", statuResiliation=" + statuResiliation + ", statuRemplacement="
				+ statuRemplacement + ", numSim=" + numSim + "]";
	}

	
	

	

}

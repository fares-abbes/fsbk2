package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="POS_HISTORIQUE",schema="POS")
public class PosHistoriqueOfSerial {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PosHistoriqueSequence")
	@SequenceGenerator(name = "PosHistoriqueSequence", sequenceName = "POS.PosHistoriqueSequence", allocationSize = 1)
	@Column(name = "ID_HISTORIQUE", nullable = false)
	private int idHistorique;
	
	@Column(name = "SERIAL_NUM")
	private String serialNum;

	@Column(name = "STATUS")
	private Integer status;
	
	@Column(name = "DATE_SAISIE")
	private String dateSaisie;

	public int getIdHistorique() {
		return idHistorique;
	}

	public void setIdHistorique(int idHistorique) {
		this.idHistorique = idHistorique;
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

	@Override
	public String toString() {
		return "PosHistoriqueOfSerial [idHistorique=" + idHistorique + ", serialNum=" + serialNum + ", status=" + status
				+ ", dateSaisie=" + dateSaisie + "]";
	}
	
	

}

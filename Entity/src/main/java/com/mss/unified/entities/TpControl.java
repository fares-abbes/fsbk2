package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TpControl",schema = "FRANSABANK")
public class TpControl {
		@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "TpControlSequence")
    @SequenceGenerator(name = "TpControlSequence", sequenceName = "TpControlSequence", allocationSize = 1)
    private int id;
	private String fileName;
	private String processingDate;
	private long tpTransactionsNb;
	private long sumTp;
	
	private long uap40TransactionsNb;
	private long sumUap40;
	
	private long uap50TransactionsNb;
	private long sumUap50;
	
	private long uap51TransactionsNb;
	private long sumUap51;
	
	private long nbTotalPres;
	private long sumTotalPres;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getProcessingDate() {
		return processingDate;
	}
	public void setProcessingDate(String processingDate) {
		this.processingDate = processingDate;
	}
	public long getTpTransactionsNb() {
		return tpTransactionsNb;
	}
	public void setTpTransactionsNb(long tpTransactionsNb) {
		this.tpTransactionsNb = tpTransactionsNb;
	}
	public long getSumTp() {
		return sumTp;
	}
	public void setSumTp(long sumTp) {
		this.sumTp = sumTp;
	}
	public long getUap40TransactionsNb() {
		return uap40TransactionsNb;
	}
	public void setUap40TransactionsNb(long uap40TransactionsNb) {
		this.uap40TransactionsNb = uap40TransactionsNb;
	}
	public long getSumUap40() {
		return sumUap40;
	}
	public void setSumUap40(long sumUap40) {
		this.sumUap40 = sumUap40;
	}
	public long getUap50TransactionsNb() {
		return uap50TransactionsNb;
	}
	public void setUap50TransactionsNb(long uap50TransactionsNb) {
		this.uap50TransactionsNb = uap50TransactionsNb;
	}
	public long getSumUap50() {
		return sumUap50;
	}
	public void setSumUap50(long sumUap50) {
		this.sumUap50 = sumUap50;
	}
	public long getUap51TransactionsNb() {
		return uap51TransactionsNb;
	}
	public void setUap51TransactionsNb(long uap51TransactionsNb) {
		this.uap51TransactionsNb = uap51TransactionsNb;
	}
	public long getSumUap51() {
		return sumUap51;
	}
	public void setSumUap51(long sumUap51) {
		this.sumUap51 = sumUap51;
	}
	public long getNbTotalPres() {
		return nbTotalPres;
	}
	public void setNbTotalPres(long nbTotalPres) {
		this.nbTotalPres = nbTotalPres;
	}
	public long getSumTotalPres() {
		return sumTotalPres;
	}
	public void setSumTotalPres(long sumTotalPres) {
		this.sumTotalPres = sumTotalPres;
	}

	
	

	
	
}

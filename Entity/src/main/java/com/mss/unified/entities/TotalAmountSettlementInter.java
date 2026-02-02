package com.mss.unified.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Column;







@Entity
@Table(name = "Total_Amount_Settlement_Inter", schema = "FRANSABANK")
public class TotalAmountSettlementInter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long code;
	private String dateSet;
	private Integer orderRow;

	private String cat;
	private double mntSett;
	private double mntInter;
	private double mntAccesFee;
	private double mntTran;
	@Column(name = "MNT_ACCES_FEEUSD")
	private double MntAccesFeeUSD;
	private Long nbtrans;
	public Long getNbtrans() {
		return nbtrans;
	}

	public void setNbtrans(Long nbtrans) {
		this.nbtrans = nbtrans;
	}

	private String mntSettCur;

	public String getSensInter() {
		return SensInter;
	}

	public void setSensInter(String sensInter) {
		SensInter = sensInter;
	}

	private String mntInterCur;
	private String mntAccesFeeCur;
	private String mntTranCur;
	private String SensInter;




	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public double getMntSett() {
		return mntSett;
	}

	public void setMntSett(double mntSett) {
		this.mntSett = mntSett;
	}

	public double getMntInter() {
		return mntInter;
	}

	public void setMntInter(double mntInter) {
		this.mntInter = mntInter;
	}

	public double getMntAccesFee() {
		return mntAccesFee;
	}

	public void setMntAccesFee(double mntAccesFee) {
		this.mntAccesFee = mntAccesFee;
	}

	public double getMntTran() {
		return mntTran;
	}

	public void setMntTran(double mntTran) {
		this.mntTran = mntTran;
	}

	public String getMntSettCur() {
		return mntSettCur;
	}

	public void setMntSettCur(String mntSettCur) {
		this.mntSettCur = mntSettCur;
	}

	public String getMntInterCur() {
		return mntInterCur;
	}

	public void setMntInterCur(String mntInterCur) {
		this.mntInterCur = mntInterCur;
	}

	public String getMntAccesFeeCur() {
		return mntAccesFeeCur;
	}

	public void setMntAccesFeeCur(String mntAccesFeeCur) {
		this.mntAccesFeeCur = mntAccesFeeCur;
	}

	public String getMntTranCur() {
		return mntTranCur;
	}

	public void setMntTranCur(String mntTranCur) {
		this.mntTranCur = mntTranCur;
	}

	public String getDateSet() {
		return dateSet;
	}

	public void setDateSet(String dateSet) {
		this.dateSet = dateSet;}

	public double getMntAccesFeeUSD() {
		return MntAccesFeeUSD;
	}

	public void setMntAccesFeeUSD(double mntAccesFeeUSD) {
		MntAccesFeeUSD = mntAccesFeeUSD;
	}

	public Integer getOrderRow() {
		return orderRow;
	}

	public void setOrderRow(Integer orderRow) {
		this.orderRow = orderRow;
	}

	@Override
	public String toString() {
		return "TotalAmountSettlementInter [code=" + code + ", dateSet=" + dateSet + ", cat=" + cat + ", mntSett="
				+ mntSett + ", mntInter=" + mntInter + ", mntAccesFee=" + mntAccesFee + ", mntTran=" + mntTran
				+ ", nbtrans=" + nbtrans + ", mntSettCur=" + mntSettCur + ", mntInterCur=" + mntInterCur
				+ ", mntAccesFeeCur=" + mntAccesFeeCur + ", mntTranCur=" + mntTranCur + "]";
	}

 
 
}
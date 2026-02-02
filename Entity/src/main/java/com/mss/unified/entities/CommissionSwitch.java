package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "COMMISSION_SWITCH", schema = "FRANSABANK")
public class CommissionSwitch {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CommissionFRANSABANKSwitchSequence")
	@SequenceGenerator(name = "newCommissionFRANSABANKSwitchSequence", sequenceName = "FRANSABANK.CommissionFRANSABANKSwitchSequencens", allocationSize = 1)
	private int id;

	@Column(name = "COMMISSION_VARIABLE")
	private String commissionVariable;

	@Column(name = "COMMISSION_FIX")
	private String commissionFix;

	@Column(name = "TYPE_TRANSACTION")
	private String typeTransaction;
	private String minVal;
	private String maxVal;
	private String cpi;

	public String getCpi() {
		return cpi;
	}

	public void setCpi(String cpi) {
		this.cpi = cpi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommissionVariable() {
		return commissionVariable;
	}

	public void setCommissionVariable(String commissionVariable) {
		this.commissionVariable = commissionVariable;
	}

	public String getCommissionFix() {
		return commissionFix;
	}

	public void setCommissionFix(String commissionFix) {
		this.commissionFix = commissionFix;
	}

	public String getTypeTransaction() {
		return typeTransaction;
	}

	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
	}

	public String getMinVal() {
		return minVal;
	}

	public void setMinVal(String minVal) {
		this.minVal = minVal;
	}

	public String getMaxVal() {
		return maxVal;
	}

	public void setMaxVal(String maxVal) {
		this.maxVal = maxVal;
	}

	@Override
	public String toString() {
		return "CommissionSwitch [id=" + id + ", commissionVariable=" + commissionVariable + ", commissionFix="
				+ commissionFix + ", typeTransaction=" + typeTransaction + ", minVal=" + minVal + ", maxVal=" + maxVal
				+ ", cpi=" + cpi + "]";
	}

	 

}
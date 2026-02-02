package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Commission_FRANSABANK", schema = "FRANSABANK")
public class CommissionFransaBank {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CommissionFRANSABANKSequence")
	@SequenceGenerator(name = "newCommissionFRANSABANKSequence", sequenceName = "FRANSABANK.CommissionFRANSABANKSequencens", allocationSize = 1)
	@Column(name = "CODE", nullable = false)
	private Integer code;
	@Column(name = "CODE_ONUS")
	private String type;
	@Column(name = "CODE_OFFUSACQ")
	private String typeAcq;
	@Column(name = "CODE_OFFUSISSUER")
	private String typeIssuer;
	@Column(name = "COMM_ACQ")
	private String commissionAcq;
	@Column(name = "COMM_ISSUER")
	private String commissionIssuer;
	@Column(name = "CMI")
	private String cmi;
	@Column(name = "CPI")
	private String cpi;
	@Column(name = "Commission_FIXE")
	private String commissionFixe;
	@Column(name = "Commission_Variable")
	private String commissionVariable;
	@Column(name = "TYPE_ACQ_ISSUER")
	private String typeAcqIssuer;
	@Column(name = "HostORSwitch")
	private String hostORSwitch;
	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCommissionAcq() {
		return commissionAcq;
	}

	public void setCommissionAcq(String commissionAcq) {
		this.commissionAcq = commissionAcq;
	}

	public String getCommissionIssuer() {
		return commissionIssuer;
	}

	public void setCommissionIssuer(String commissionIssuer) {
		this.commissionIssuer = commissionIssuer;
	}

	public String getCmi() {
		return cmi;
	}

	public void setCmi(String cmi) {
		this.cmi = cmi;
	}

	public String getCpi() {
		return cpi;
	}

	public void setCpi(String cpi) {
		this.cpi = cpi;
	}

	public String getCommissionFixe() {
		return commissionFixe;
	}

	public void setCommissionFixe(String commissionFixe) {
		this.commissionFixe = commissionFixe;
	}

	public String getCommissionVariable() {
		return commissionVariable;
	}

	public void setCommissionVariable(String commissionVariable) {
		this.commissionVariable = commissionVariable;
	}

	public String getTypeAcqIssuer() {
		return typeAcqIssuer;
	}

	public void setTypeAcqIssuer(String typeAcqIssuer) {
		this.typeAcqIssuer = typeAcqIssuer;
	}

	public String getTypeAcq() {
		return typeAcq;
	}

	public void setTypeAcq(String typeAcq) {
		this.typeAcq = typeAcq;
	}

	public String getTypeIssuer() {
		return typeIssuer;
	}



	public void setTypeIssuer(String typeIssuer) {
		this.typeIssuer = typeIssuer;
	}

	public String getHostORSwitch() {
		return hostORSwitch;
	}

	public void setHostORSwitch(String hostORSwitch) {
		this.hostORSwitch = hostORSwitch;
	}
	
}

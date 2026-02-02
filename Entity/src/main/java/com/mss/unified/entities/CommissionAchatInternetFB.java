package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "Commission_INTERNET", schema = "FRANSABANK")
public class CommissionAchatInternetFB {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CommissionInternetFRANSABANKSequence")
	@SequenceGenerator(name = "newCommissionInternetFRANSABANKSequence", sequenceName = "FRANSABANK.CommissionInternetFRANSABANKSequencens", allocationSize = 1)
	@Column(name = "CODE", nullable = false)
	private Integer code;
	@Column(name = "VALEUR_MIN")
	private String valeurMin;
	@Column(name = "VALEUR_MAX")
	private String valeurMax;
	@Column(name = "VALEUR_FIX")
	private String valeurFix;
	@Column(name = "VALEUR_VARIABLE")
	private String valeurVarivable;
	@Column(name = "VARIABLE_CMI")
	private String variableCmi;
	@Column(name = "FIX_CMI")
	private String fixCmi;

	@Column(name = "VARIABLE_CPI")
	private String variableCpi;
	@Column(name = "FIX_CPI")
	private String fixCpi;

	@Column(name = "TYPE")
	private String type;

	@Column(name = "VARIABLE_COMM_ACQ")
	private String variableCommissionAcq;
	@Column(name = "FIX_COMM_ACQ")
	private String fixCommissionAcq;

	@Column(name = "VARIABLE_COMM_ISSUER")
	private String variableCommissionIssuer;
	@Column(name = "FIX_COMM_ISSUER")
	private String fixCommissionIssuer;

	@Column(name = "BANK_ISSUER")
	private String bankIssuer;

	@Column(name = "BANK_ACK")
	private String bankAck;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getValeurMin() {
		return valeurMin;
	}

	public void setValeurMin(String valeurMin) {
		this.valeurMin = valeurMin;
	}

	public String getValeurMax() {
		return valeurMax;
	}

	public void setValeurMax(String valeurMax) {
		this.valeurMax = valeurMax;
	}

	public String getValeurFix() {
		return valeurFix;
	}

	public void setValeurFix(String valeurFix) {
		this.valeurFix = valeurFix;
	}

	public String getValeurVarivable() {
		return valeurVarivable;
	}

	public void setValeurVarivable(String valeurVarivable) {
		this.valeurVarivable = valeurVarivable;
	}

	public String getVariableCmi() {
		return variableCmi;
	}

	public void setVariableCmi(String variableCmi) {
		this.variableCmi = variableCmi;
	}

	public String getFixCmi() {
		return fixCmi;
	}

	public void setFixCmi(String fixCmi) {
		this.fixCmi = fixCmi;
	}

	public String getVariableCpi() {
		return variableCpi;
	}

	public void setVariableCpi(String variableCpi) {
		this.variableCpi = variableCpi;
	}

	public String getFixCpi() {
		return fixCpi;
	}

	public void setFixCpi(String fixCpi) {
		this.fixCpi = fixCpi;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVariableCommissionAcq() {
		return variableCommissionAcq;
	}

	public void setVariableCommissionAcq(String variableCommissionAcq) {
		this.variableCommissionAcq = variableCommissionAcq;
	}

	public String getFixCommissionAcq() {
		return fixCommissionAcq;
	}

	public void setFixCommissionAcq(String fixCommissionAcq) {
		this.fixCommissionAcq = fixCommissionAcq;
	}

	public String getVariableCommissionIssuer() {
		return variableCommissionIssuer;
	}

	public void setVariableCommissionIssuer(String variableCommissionIssuer) {
		this.variableCommissionIssuer = variableCommissionIssuer;
	}

	public String getFixCommissionIssuer() {
		return fixCommissionIssuer;
	}

	public void setFixCommissionIssuer(String fixCommissionIssuer) {
		this.fixCommissionIssuer = fixCommissionIssuer;
	}

	public String getBankIssuer() {
		return bankIssuer;
	}

	public void setBankIssuer(String bankIssuer) {
		this.bankIssuer = bankIssuer;
	}

	public String getBankAck() {
		return bankAck;
	}

	public void setBankAck(String bankAck) {
		this.bankAck = bankAck;
	}

	@Override

	public String toString() {
		return "CommissionAchatInternetFB{" + "code=" + code + ", valeurMin='" + valeurMin + '\'' + ", valeurMax='"
				+ valeurMax + '\'' + ", valeurFix='" + valeurFix + '\'' + ", valeurVarivable='" + valeurVarivable + '\''
				+ ", variableCmi='" + variableCmi + '\'' + ", fixCmi='" + fixCmi + '\'' + ", variableCpi='"
				+ variableCpi + '\'' + ", fixCpi='" + fixCpi + '\'' + ", type='" + type + '\''
				+ ", variableCommissionAcq='" + variableCommissionAcq + '\'' + ", fixCommissionAcq='" + fixCommissionAcq
				+ '\'' + ", variableCommissionIssuer='" + variableCommissionIssuer + '\'' + ", fixCommissionIssuer='"
				+ fixCommissionIssuer + '\'' + '}';
	}
}

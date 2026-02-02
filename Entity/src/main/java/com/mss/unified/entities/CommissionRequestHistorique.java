package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(schema = "POS",name = "COMMISSION_REQUEST_HISTORIQUE")
public class CommissionRequestHistorique {

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CommissionRequestHistoriqueSequence")
	@SequenceGenerator(name = "CommissionRequestHistoriqueSequence", sequenceName = "POS.CommissionRequestHistoriqueSequence", allocationSize = 1)
	@Column(name = "ID_COMMISSION")
	private int idCommission;
	
	
	 @Column(name = "REQUEST_CODE")
	    private int requestCode;
	    @Column(name = "COMMISSION_NATIONAL")
	    private String commissionNational;

	    @Column(name = "COMMISSION_INTERNATIONAL")
	    private String commissionInterNational;

	    @Column(name = "MONTANT_REFMIN")
	    private String montantRefMin;
	    @Column(name = "MONTANT_REFMAX")
	    private String montantRefMax;
	    @Column(name = "MERCHANT_CODE")
	    private Integer merchantCode;

    @Column(name = "OPERATEUR_MIN")
    private String operateurMin;
    @Column(name = "OPERATEUR_MAX")
    private String operateurMax;

    @Column(name = "VALEUR_COMFIXMIN")
    private String valeurComFixMin;
    @Column(name = "VALEUR_COMFIXMAX")
    private String valeurComFixMax;
    @Column(name = "VALEUR_COMVARIABLEMIN")
    private String valeurComVariableMin;
    @Column(name = "VALEUR_COMVARIABLEMAX")
    private String valeurComVariableMax;
    @Column(name = "LABEL")
    private String label;
    
    @Column(name = "commission_type")
    private Integer commissionType;
    
    @Column(name = "valeurCommissionNationaleFixe")
    private String valeurCommissionNationaleFix;
    @Column(name = "valeurCommissionInternationaleFixe")
    private String valeurCommissionInternationaleFixe;
    
    @Column(name = "DATE_SAISIE")
   	private String dateSaisie;
    
    
	public String getDateSaisie() {
		return dateSaisie;
	}
	public void setDateSaisie(String dateSaisie) {
		this.dateSaisie = dateSaisie;
	}
	public int getIdCommission() {
		return idCommission;
	}
	public void setIdCommission(int idCommission) {
		this.idCommission = idCommission;
	}
	public int getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(int requestCode) {
		this.requestCode = requestCode;
	}
	public String getCommissionNational() {
		return commissionNational;
	}
	public void setCommissionNational(String commissionNational) {
		this.commissionNational = commissionNational;
	}
	public String getCommissionInterNational() {
		return commissionInterNational;
	}
	public void setCommissionInterNational(String commissionInterNational) {
		this.commissionInterNational = commissionInterNational;
	}
	public String getMontantRefMin() {
		return montantRefMin;
	}
	public void setMontantRefMin(String montantRefMin) {
		this.montantRefMin = montantRefMin;
	}
	public String getMontantRefMax() {
		return montantRefMax;
	}
	public void setMontantRefMax(String montantRefMax) {
		this.montantRefMax = montantRefMax;
	}
	public Integer getMerchantCode() {
		return merchantCode;
	}
	public void setMerchantCode(Integer merchantCode) {
		this.merchantCode = merchantCode;
	}
	public String getOperateurMin() {
		return operateurMin;
	}
	public void setOperateurMin(String operateurMin) {
		this.operateurMin = operateurMin;
	}
	public String getOperateurMax() {
		return operateurMax;
	}
	public void setOperateurMax(String operateurMax) {
		this.operateurMax = operateurMax;
	}
	public String getValeurComFixMin() {
		return valeurComFixMin;
	}
	public void setValeurComFixMin(String valeurComFixMin) {
		this.valeurComFixMin = valeurComFixMin;
	}
	public String getValeurComFixMax() {
		return valeurComFixMax;
	}
	public void setValeurComFixMax(String valeurComFixMax) {
		this.valeurComFixMax = valeurComFixMax;
	}
	public String getValeurComVariableMin() {
		return valeurComVariableMin;
	}
	public void setValeurComVariableMin(String valeurComVariableMin) {
		this.valeurComVariableMin = valeurComVariableMin;
	}
	public String getValeurComVariableMax() {
		return valeurComVariableMax;
	}
	public void setValeurComVariableMax(String valeurComVariableMax) {
		this.valeurComVariableMax = valeurComVariableMax;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Integer getCommissionType() {
		return commissionType;
	}
	public void setCommissionType(Integer commissionType) {
		this.commissionType = commissionType;
	}
	public String getValeurCommissionNationaleFix() {
		return valeurCommissionNationaleFix;
	}
	public void setValeurCommissionNationaleFix(String valeurCommissionNationaleFix) {
		this.valeurCommissionNationaleFix = valeurCommissionNationaleFix;
	}
	public String getValeurCommissionInternationaleFixe() {
		return valeurCommissionInternationaleFixe;
	}
	public void setValeurCommissionInternationaleFixe(String valeurCommissionInternationaleFixe) {
		this.valeurCommissionInternationaleFixe = valeurCommissionInternationaleFixe;
	}
	@Override
	public String toString() {
		return "CommissionRequestHistorique [idCommission=" + idCommission + ", requestCode=" + requestCode
				+ ", commissionNational=" + commissionNational + ", commissionInterNational=" + commissionInterNational
				+ ", montantRefMin=" + montantRefMin + ", montantRefMax=" + montantRefMax + ", merchantCode="
				+ merchantCode + ", operateurMin=" + operateurMin + ", operateurMax=" + operateurMax
				+ ", valeurComFixMin=" + valeurComFixMin + ", valeurComFixMax=" + valeurComFixMax
				+ ", valeurComVariableMin=" + valeurComVariableMin + ", valeurComVariableMax=" + valeurComVariableMax
				+ ", label=" + label + ", commissionType=" + commissionType + ", valeurCommissionNationaleFix="
				+ valeurCommissionNationaleFix + ", valeurCommissionInternationaleFixe="
				+ valeurCommissionInternationaleFixe + ", dateSaisie=" + dateSaisie + "]";
	}
	
    
    
    
}

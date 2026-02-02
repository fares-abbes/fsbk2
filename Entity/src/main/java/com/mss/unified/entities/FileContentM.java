package com.mss.unified.entities;

import javax.persistence.*;

@Entity
@Table(name = "TP_DETAIL_M",schema = "FRANSABANK")
public class FileContentM {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name = "ID", nullable = false)
    private int id;
    
     private String dateCompensation;

    private Integer summaryCode;

    // Donor data
    @Column(name = "ID_PLATEFORME_MOBILE_DONNEUR")
    private String idPlateformeMobileDonneur;      // 10N per spec

    @Column(name = "RIB_RIP_DONNEUR")
    private String ribRipDonneur;                  // 20N per spec

    @Column(name = "NUM_TEL_DONNEUR")
    private String numTelDonneur;                  // 15AN per spec

    @Column(name = "METHODE_AUTH_DONNEUR")
    private String methodeAuthDonneur;             // 1N per spec (1: PIN, 2: Biometrie, 3: OTP)

    // Beneficiary data
    @Column(name = "ID_PLATEFORME_MOBILE_BENEFICIAIRE")
    private String idPlateformeMobileBeneficiaire; // 10N per spec

    @Column(name = "RIB_RIP_BENEFICIAIRE")
    private String ribRipBeneficiaire;             // 20N per spec

    @Column(name = "NUM_TEL_BENEFICIAIRE")
    private String numTelBeneficiaire;             // 15AN per spec

    // Transaction data
    @Column(name = "TYPE_TRANSACTION")
    private String typeTransaction;                // 3N per spec

    @Column(name = "DATE_TRANSACTION")
    private String dateTransaction;                // 8N (AAAAMMJJ)

    @Column(name = "HEURE_LOCALE_TRANSACTION")
    private String heureTransaction;               // 6N (HHMMSS)

    @Column(name = "MONTANT")
    private String montantTransaction;             // 12N with 2 implied decimals (formatting handled upstream)

    @Column(name = "REFERENCE_FACTURE_CHARGE")
    private String referenceFactureCharge;         // 20AN per spec

    @Column(name = "REFERENCE_TRANSACTION")
    private String referenceTransaction;           // 12AN per spec

    @Column(name = "NUM_AUTORISATION")
    private String numAutorisation;                // 15AN per spec (optional)

    // Commissions
    @Column(name = "COMMISSION_DONNEUR_TTC")
    private String commissionDonneurOrdre;         // 12N per spec

    @Column(name = "COMMISSION_DESTINATAIRE_TTC")
    private String commissionDestinataire;         // 12N per spec

    @Column(name = "COMMISSION_SWITCH_MOBILE_TTC")
    private String commissionSwitchMobile;         // 12N per spec

    @Column(name = "COMMISSION_INTERCHANGE_TTC")
    private String commissionInterchange;          // 12N per spec

    // Chargeback
    @Column(name = "ID_CHARGEBACK")
    private String idChargeback;                   // 16N per spec (conditional)

    @Column(name = "CODE_MOTIF_CHARGEBACK")
    private String codeMotifChargeback;            // 4N per spec

    @Column(name = "NUM_AUTORISATION_OP_INITIALE")
    private String numAutorisationOperationInitiale; // 15AN per spec (conditional)

    @Column(name = "DATE_OP_INITIALE")
    private String dateOperationInitiale;          // 8N per spec (AAAAMMJJ)

    @Column(name = "RUF")
    private String ruf;                            // 389AN per spec (when present)



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public String getDateCompensation() {
        return dateCompensation;
    }

    public void setDateCompensation(String dateCompensation) {
        this.dateCompensation = dateCompensation;
    }

    public Integer getSummaryCode() {
        return summaryCode;
    }

    public void setSummaryCode(Integer summaryCode) {
        this.summaryCode = summaryCode;
    }

    public String getIdPlateformeMobileDonneur() {
        return idPlateformeMobileDonneur;
    }

    public void setIdPlateformeMobileDonneur(String idPlateformeMobileDonneur) {
        this.idPlateformeMobileDonneur = idPlateformeMobileDonneur;
    }

    public String getRibRipDonneur() {
        return ribRipDonneur;
    }

    public void setRibRipDonneur(String ribRipDonneur) {
        this.ribRipDonneur = ribRipDonneur;
    }

    public String getNumTelDonneur() {
        return numTelDonneur;
    }

    public void setNumTelDonneur(String numTelDonneur) {
        this.numTelDonneur = numTelDonneur;
    }

    public String getMethodeAuthDonneur() {
        return methodeAuthDonneur;
    }

    public void setMethodeAuthDonneur(String methodeAuthDonneur) {
        this.methodeAuthDonneur = methodeAuthDonneur;
    }

    public String getIdPlateformeMobileBeneficiaire() {
        return idPlateformeMobileBeneficiaire;
    }

    public void setIdPlateformeMobileBeneficiaire(String idPlateformeMobileBeneficiaire) {
        this.idPlateformeMobileBeneficiaire = idPlateformeMobileBeneficiaire;
    }

    public String getRibRipBeneficiaire() {
        return ribRipBeneficiaire;
    }

    public void setRibRipBeneficiaire(String ribRipBeneficiaire) {
        this.ribRipBeneficiaire = ribRipBeneficiaire;
    }

    public String getNumTelBeneficiaire() {
        return numTelBeneficiaire;
    }

    public void setNumTelBeneficiaire(String numTelBeneficiaire) {
        this.numTelBeneficiaire = numTelBeneficiaire;
    }

    public String getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(String typeTransaction) {
        this.typeTransaction = typeTransaction;
    }

    public String getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(String dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    public String getHeureTransaction() {
        return heureTransaction;
    }

    public void setHeureTransaction(String heureTransaction) {
        this.heureTransaction = heureTransaction;
    }

    public String getMontantTransaction() {
        return montantTransaction;
    }

    public void setMontantTransaction(String montantTransaction) {
        this.montantTransaction = montantTransaction;
    }

    public String getReferenceFactureCharge() {
        return referenceFactureCharge;
    }

    public void setReferenceFactureCharge(String referenceFactureCharge) {
        this.referenceFactureCharge = referenceFactureCharge;
    }

    public String getReferenceTransaction() {
        return referenceTransaction;
    }

    public void setReferenceTransaction(String referenceTransaction) {
        this.referenceTransaction = referenceTransaction;
    }

    public String getNumAutorisation() {
        return numAutorisation;
    }

    public void setNumAutorisation(String numAutorisation) {
        this.numAutorisation = numAutorisation;
    }

    public String getCommissionDonneurOrdre() {
        return commissionDonneurOrdre;
    }

    public void setCommissionDonneurOrdre(String commissionDonneurOrdre) {
        this.commissionDonneurOrdre = commissionDonneurOrdre;
    }

    public String getCommissionDestinataire() {
        return commissionDestinataire;
    }

    public void setCommissionDestinataire(String commissionDestinataire) {
        this.commissionDestinataire = commissionDestinataire;
    }

    public String getCommissionSwitchMobile() {
        return commissionSwitchMobile;
    }

    public void setCommissionSwitchMobile(String commissionSwitchMobile) {
        this.commissionSwitchMobile = commissionSwitchMobile;
    }

    public String getCommissionInterchange() {
        return commissionInterchange;
    }

    public void setCommissionInterchange(String commissionInterchange) {
        this.commissionInterchange = commissionInterchange;
    }

    public String getIdChargeback() {
        return idChargeback;
    }

    public void setIdChargeback(String idChargeback) {
        this.idChargeback = idChargeback;
    }

    public String getCodeMotifChargeback() {
        return codeMotifChargeback;
    }

    public void setCodeMotifChargeback(String codeMotifChargeback) {
        this.codeMotifChargeback = codeMotifChargeback;
    }

    public String getNumAutorisationOperationInitiale() {
        return numAutorisationOperationInitiale;
    }

    public void setNumAutorisationOperationInitiale(String numAutorisationOperationInitiale) {
        this.numAutorisationOperationInitiale = numAutorisationOperationInitiale;
    }

    public String getDateOperationInitiale() {
        return dateOperationInitiale;
    }

    public void setDateOperationInitiale(String dateOperationInitiale) {
        this.dateOperationInitiale = dateOperationInitiale;
    }

    public String getRuf() {
        return ruf;
    }

    public void setRuf(String ruf) {
        this.ruf = ruf;
    }

    @Override
    public String toString() {
        return "FileContentM{" +
                "id=" + id +
                ", dateCompensation='" + dateCompensation + '\'' +
                ", summaryCode='" + summaryCode + '\'' +
                ", idPlateformeMobileDonneur='" + idPlateformeMobileDonneur + '\'' +
                ", ribRipDonneur='" + ribRipDonneur + '\'' +
                ", numTelDonneur='" + numTelDonneur + '\'' +
                ", methodeAuthDonneur='" + methodeAuthDonneur + '\'' +
                ", idPlateformeMobileBeneficiaire='" + idPlateformeMobileBeneficiaire + '\'' +
                ", ribRipBeneficiaire='" + ribRipBeneficiaire + '\'' +
                ", numTelBeneficiaire='" + numTelBeneficiaire + '\'' +
                ", typeTransaction='" + typeTransaction + '\'' +
                ", dateTransaction='" + dateTransaction + '\'' +
                ", heureTransaction='" + heureTransaction + '\'' +
                ", montantTransaction='" + montantTransaction + '\'' +
                ", referenceFactureCharge='" + referenceFactureCharge + '\'' +
                ", referenceTransaction='" + referenceTransaction + '\'' +
                ", numAutorisation='" + numAutorisation + '\'' +
                ", commissionDonneurOrdre='" + commissionDonneurOrdre + '\'' +
                ", commissionDestinataire='" + commissionDestinataire + '\'' +
                ", commissionSwitchMobile='" + commissionSwitchMobile + '\'' +
                ", commissionInterchange='" + commissionInterchange + '\'' +
                ", idChargeback='" + idChargeback + '\'' +
                ", codeMotifChargeback='" + codeMotifChargeback + '\'' +
                ", numAutorisationOperationInitiale='" + numAutorisationOperationInitiale + '\'' +
                ", dateOperationInitiale='" + dateOperationInitiale + '\'' +
                ", ruf='" + ruf + '\'' +
                '}';
    }
}

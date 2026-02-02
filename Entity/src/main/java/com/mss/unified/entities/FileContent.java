package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "TP_DETAIL",schema = "FRANSABANK")
public class FileContent {
    
	@Id
@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "newFILECONTENTTSequence")
    @SequenceGenerator(name = "newFILECONTENTTSequence", sequenceName = "FRANSABANK.FILECONTENTTns", allocationSize = 1)
    @Column(name = "ID", nullable = false)

    private int id;
    
    @Transient
    private String dateCompensation;
    
	@Column(name = "codeDebit")
    private String codeDebit;
    @Column(name = "codeBin")
    private String codeBin;
    @Column(name = "codeBank")
    private String codeBank;
    @Column(name = "numRIBEmetteur")
    private String numRIBEmetteur;
    @Column(name = "numCartePorteur")
    private String numCartePorteur;
    @Column(name = "codeDebitCommercant")
    private String codeDebitCommercant;
    @Column(name = "numRIBcommercant")
    private String numRIBcommercant;
    @Column(name = "BinAcquereur")
    private String BinAcquereur;
    @Column(name = "CodeBankAcquereur")
    private String CodeBankAcquereur;
    @Column(name = "CodeAgence")
    private String CodeAgence;
    @Column(name = "idTerminal")
    private String idTerminal;
    @Column(name = "idCommercant")
    private String idCommercant;
    @Column(name = "typeTransaction")
    private String typeTransaction;
    @Column(name = "Datetransaction")
    private String dateTransaction;
    @Column(name = "heureTransaction")
    private String heureTransaction;
    @Column(name = "montantTransaction")
    private String montantTransaction;
    @Column(name = "numFacture")
    private String numFacture;
    @Column(name = "emetteurFacture")
    private String emetteurFacture;
    @Column(name = "numRefTransaction")
    private String numRefTransaction;
    @Column(name = "numAutorisation")
    private String numAutorisation;
    @Column(name = "codeDebitPorteur")
    private String codeDebitPorteur;
    @Column(name = "commisionPorteur")
    private String commisionPorteur;
    @Column(name = "codeDebitCommisionCommercant")
    private String codeDebitCommisionCommercant;
    @Column(name = "commisionCommercant")
    private String commisionCommercant;
    @Column(name = "commisionInterchange")
    private String commisionInterchange;
    @Column(name = "fraisOperateurTechnique")
    private String fraisOperateurTechnique;
    @Column(name = "appCryptogram")
    private String appCryptogram;
    @Column(name = "cryptogramInfoData")
    private String cryptogramInfoData;
    @Column(name = "atc")
    private String atc;
    @Column(name = "terminalVerificationResult")
    private String terminalVerificationResult;
    @Column(name = "libelleCommercant")
    private String libelleCommercant;
    @Column(name = "ruf")
    private String ruf;
    @Column(name = "Numtransaction")
    private String Numtransaction;
    @Column(name = "udf1")
    private String udf1;
    @Column(name = "rufAcquereur")
    private String rufAcquereur;
    @Column(name = "numTransactionPaiementInternet")
    private String numTransactionPaiementInternet;
    @Column(name = "trackId")
    private String trackId;
    @Column(name = "idOriginTransaction")
    private String idOriginTransaction;
    @Column(name = "rufpaiement")
    private String rufpaiement;
    @Column(name = "IDHEADER")
    private String idHeder;

	private String idChargeback;

	private String codeMotifChargeback;

	private String numAutorisationOperationInitiale;

	private String dateOperationInitiale;
	// Nouvelle partie (accepteur)
	private String modeLectureCarte;            // length 1
	private String methodeVerificationPorteur;  // length 1
	private String typeDispositifSansContract;  // length 1  (controller uses 'Contract')

	// Commission gestionnaire ATM
	private String commissionsGestionaireATM;   // length 12

	// Bloc A (Retrait)
	private String localisationATM;             // length 40 (per spec Bloc A)
	private String reseau;                      // length 10 (per spec Bloc A)
	private String rufRetrait;
	@Column(name = "validCommission")
	private String validCommission="1";

	private String interchangeCalculated;
	private String satimCalculated;
	
    private Integer chargebackStatus;
	private String commissionCalculated;
	private String transactionOrigine;
	private Integer idTransactionOrigine  ;

	public String getDateOperationInitiale() {
		return dateOperationInitiale;
	}

	public void setDateOperationInitiale(String dateOperationInitiale) {
		this.dateOperationInitiale = dateOperationInitiale;
	}

	public String getCommissionsGestionaireATM() {
		return commissionsGestionaireATM;
	}

	public void setCommissionsGestionaireATM(String commissionsGestionaireATM) {
		this.commissionsGestionaireATM = commissionsGestionaireATM;
	}

	public String getCommissionCalculated() {
		return commissionCalculated;
	}

	public void setCommissionCalculated(String commissionCalculated) {
		this.commissionCalculated = commissionCalculated;
	}

	public String getTransactionOrigine() {
		return transactionOrigine;
	}

	public void setTransactionOrigine(String transactionOrigine) {
		this.transactionOrigine = transactionOrigine;
	}

	public Integer getIdTransactionOrigine() {
		return idTransactionOrigine;
	}

	public void setIdTransactionOrigine(Integer idTransactionOrigine) {
		this.idTransactionOrigine = idTransactionOrigine;
	}

	public String getNumAutorisationOperationInitiale() {
		return numAutorisationOperationInitiale;
	}

	public void setNumAutorisationOperationInitiale(String numAutorisationOperationInitiale) {
		this.numAutorisationOperationInitiale = numAutorisationOperationInitiale;
	}

	public String getValidCommission() {
		return validCommission;
	}
	public void setValidCommission(String validCommission) {
		this.validCommission = validCommission;
	}
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
	public String getCodeDebit() {
		return codeDebit;
	}
	public void setCodeDebit(String codeDebit) {
		this.codeDebit = codeDebit;
	}
	public String getCodeBin() {
		return codeBin;
	}
	public void setCodeBin(String codeBin) {
		this.codeBin = codeBin;
	}
	public String getCodeBank() {
		return codeBank;
	}
	public void setCodeBank(String codeBank) {
		this.codeBank = codeBank;
	}
	public String getNumRIBEmetteur() {
		return numRIBEmetteur;
	}
	public void setNumRIBEmetteur(String numRIBEmetteur) {
		this.numRIBEmetteur = numRIBEmetteur;
	}
	public String getNumCartePorteur() {
		return numCartePorteur;
	}
	public void setNumCartePorteur(String numCartePorteur) {
		this.numCartePorteur = numCartePorteur;
	}
	public String getCodeDebitCommercant() {
		return codeDebitCommercant;
	}
	public void setCodeDebitCommercant(String codeDebitCommercant) {
		this.codeDebitCommercant = codeDebitCommercant;
	}
	public String getNumRIBcommercant() {
		return numRIBcommercant;
	}
	public void setNumRIBcommercant(String numRIBcommercant) {
		this.numRIBcommercant = numRIBcommercant;
	}
	public String getBinAcquereur() {
		return BinAcquereur;
	}
	public void setBinAcquereur(String binAcquereur) {
		BinAcquereur = binAcquereur;
	}
	public String getCodeBankAcquereur() {
		return CodeBankAcquereur;
	}
	public void setCodeBankAcquereur(String codeBankAcquereur) {
		CodeBankAcquereur = codeBankAcquereur;
	}
	public String getCodeAgence() {
		return CodeAgence;
	}
	public void setCodeAgence(String codeAgence) {
		CodeAgence = codeAgence;
	}
	public String getIdTerminal() {
		return idTerminal;
	}
	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}
	public String getIdCommercant() {
		return idCommercant;
	}
	public void setIdCommercant(String idCommercant) {
		this.idCommercant = idCommercant;
	}
	public String getTypeTransaction() {
		return typeTransaction;
	}
	public void setTypeTransaction(String typeTransaction) {
		this.typeTransaction = typeTransaction;
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
	public String getNumFacture() {
		return numFacture;
	}
	public void setNumFacture(String numFacture) {
		this.numFacture = numFacture;
	}
	public String getEmetteurFacture() {
		return emetteurFacture;
	}
	public void setEmetteurFacture(String emetteurFacture) {
		this.emetteurFacture = emetteurFacture;
	}
	public String getNumRefTransaction() {
		return numRefTransaction;
	}
	public void setNumRefTransaction(String numRefTransaction) {
		this.numRefTransaction = numRefTransaction;
	}
	public String getNumAutorisation() {
		return numAutorisation;
	}
	public void setNumAutorisation(String numAutorisation) {
		this.numAutorisation = numAutorisation;
	}
	public String getCodeDebitPorteur() {
		return codeDebitPorteur;
	}
	public void setCodeDebitPorteur(String codeDebitPorteur) {
		this.codeDebitPorteur = codeDebitPorteur;
	}
	public String getCommisionPorteur() {
		return commisionPorteur;
	}
	public void setCommisionPorteur(String commisionPorteur) {
		this.commisionPorteur = commisionPorteur;
	}
	public String getCodeDebitCommisionCommercant() {
		return codeDebitCommisionCommercant;
	}
	public void setCodeDebitCommisionCommercant(String codeDebitCommisionCommercant) {
		this.codeDebitCommisionCommercant = codeDebitCommisionCommercant;
	}
	public String getCommisionCommercant() {
		return commisionCommercant;
	}
	public void setCommisionCommercant(String commisionCommercant) {
		this.commisionCommercant = commisionCommercant;
	}
	public String getCommisionInterchange() {
		return commisionInterchange;
	}
	public void setCommisionInterchange(String commisionInterchange) {
		this.commisionInterchange = commisionInterchange;
	}
	public String getFraisOperateurTechnique() {
		return fraisOperateurTechnique;
	}
	public void setFraisOperateurTechnique(String fraisOperateurTechnique) {
		this.fraisOperateurTechnique = fraisOperateurTechnique;
	}
	public String getAppCryptogram() {
		return appCryptogram;
	}
	public void setAppCryptogram(String appCryptogram) {
		this.appCryptogram = appCryptogram;
	}
	public String getCryptogramInfoData() {
		return cryptogramInfoData;
	}
	public void setCryptogramInfoData(String cryptogramInfoData) {
		this.cryptogramInfoData = cryptogramInfoData;
	}
	public String getAtc() {
		return atc;
	}
	public void setAtc(String atc) {
		this.atc = atc;
	}
	public String getTerminalVerificationResult() {
		return terminalVerificationResult;
	}
	public void setTerminalVerificationResult(String terminalVerificationResult) {
		this.terminalVerificationResult = terminalVerificationResult;
	}
	public String getLibelleCommercant() {
		return libelleCommercant;
	}
	public void setLibelleCommercant(String libelleCommercant) {
		this.libelleCommercant = libelleCommercant;
	}
	public String getRuf() {
		return ruf;
	}
	public void setRuf(String ruf) {
		this.ruf = ruf;
	}
	public String getNumtransaction() {
		return Numtransaction;
	}
	public void setNumtransaction(String numtransaction) {
		Numtransaction = numtransaction;
	}
	public String getUdf1() {
		return udf1;
	}
	public void setUdf1(String udf1) {
		this.udf1 = udf1;
	}
	public String getRufAcquereur() {
		return rufAcquereur;
	}
	public void setRufAcquereur(String rufAcquereur) {
		this.rufAcquereur = rufAcquereur;
	}
	public String getNumTransactionPaiementInternet() {
		return numTransactionPaiementInternet;
	}
	public void setNumTransactionPaiementInternet(String numTransactionPaiementInternet) {
		this.numTransactionPaiementInternet = numTransactionPaiementInternet;
	}
	public String getTrackId() {
		return trackId;
	}
	public void setTrackId(String trackId) {
		this.trackId = trackId;
	}
	public String getIdOriginTransaction() {
		return idOriginTransaction;
	}
	public void setIdOriginTransaction(String idOriginTransaction) {
		this.idOriginTransaction = idOriginTransaction;
	}
	public String getRufpaiement() {
		return rufpaiement;
	}
	public void setRufpaiement(String rufpaiement) {
		this.rufpaiement = rufpaiement;
	}
	public String getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public String getIdHeder() {
		return idHeder;
	}
	public void setIdHeder(String idHeder) {
		this.idHeder = idHeder;
	}
	public String getInterchangeCalculated() {
		return interchangeCalculated;
	}
	public void setInterchangeCalculated(String interchangeCalculated) {
		this.interchangeCalculated = interchangeCalculated;
	}
	public String getSatimCalculated() {
		return satimCalculated;
	}
	public void setSatimCalculated(String satimCalculated) {
		this.satimCalculated = satimCalculated;
	}
	public String getModeLectureCarte() { return modeLectureCarte; }
	public void setModeLectureCarte(String modeLectureCarte) { this.modeLectureCarte = modeLectureCarte; }
// Existing fields assumed:
// private String numAutorisationOperationInitiale;
// private String dateOperationInitiale;
// private String idChargeback;
// private String codeMotifChargeback;

	public String getIdChargeback() { return idChargeback; }
	public void setIdChargeback(String idChargeback) { this.idChargeback = idChargeback; }

	public String getCodeMotifChargeback() { return codeMotifChargeback; }
	public void setCodeMotifChargeback(String codeMotifChargeback) { this.codeMotifChargeback = codeMotifChargeback; }

	// Controller calls setNumAutorisationInitial / setdateOPInitial
	public String getNumAutorisationInitial() { return numAutorisationOperationInitiale; }
	public void setNumAutorisationInitial(String numAutorisationInitial) {
		this.numAutorisationOperationInitiale = numAutorisationInitial;
	}

	public String getdateOPInitial() { return dateOperationInitiale; }
	public void setdateOPInitial(String dateOPInitial) {
		this.dateOperationInitiale = dateOPInitial;
	}
	public String getMethodeVerificationPorteur() { return methodeVerificationPorteur; }
	public void setMethodeVerificationPorteur(String methodeVerificationPorteur) { this.methodeVerificationPorteur = methodeVerificationPorteur; }

	public String getTypeDispositifSansContract() { return typeDispositifSansContract; }
	public void setTypeDispositifSansContract(String typeDispositifSansContract) { this.typeDispositifSansContract = typeDispositifSansContract; }

	// note: controller calls setcommissionsGestionaireATM (lowercase 's')
	public String getcommissionsGestionaireATM() { return commissionsGestionaireATM; }
	public void setcommissionsGestionaireATM(String commissionsGestionaireATM) { this.commissionsGestionaireATM = commissionsGestionaireATM; }

	public String getLocalisationATM() { return localisationATM; }
	public void setLocalisationATM(String localisationATM) { this.localisationATM = localisationATM; }

	public String getReseau() { return reseau; }
	public void setReseau(String reseau) { this.reseau = reseau; }

	public String getRufRetrait() { return rufRetrait; }
	public void setRufRetrait(String rufRetrait) { this.rufRetrait = rufRetrait; }
	public Integer getChargebackStatus() {
		return chargebackStatus;
	}

	public void setChargebackStatus(Integer chargebackStatus) {
		this.chargebackStatus = chargebackStatus;
	}
	@Override
	public String toString() {
		return "FileContent [id=" + id + ", dateCompensation=" + dateCompensation + ", codeDebit=" + codeDebit
				+ ", codeBin=" + codeBin + ", codeBank=" + codeBank + ", numRIBEmetteur=" + numRIBEmetteur
				+ ", numCartePorteur=" + numCartePorteur + ", codeDebitCommercant=" + codeDebitCommercant
				+ ", numRIBcommercant=" + numRIBcommercant + ", BinAcquereur=" + BinAcquereur + ", CodeBankAcquereur="
				+ CodeBankAcquereur + ", CodeAgence=" + CodeAgence + ", idTerminal=" + idTerminal + ", idCommercant="
				+ idCommercant + ", typeTransaction=" + typeTransaction + ", dateTransaction=" + dateTransaction
				+ ", heureTransaction=" + heureTransaction + ", montantTransaction=" + montantTransaction
				+ ", numFacture=" + numFacture + ", emetteurFacture=" + emetteurFacture + ", numRefTransaction="
				+ numRefTransaction + ", numAutorisation=" + numAutorisation + ", codeDebitPorteur=" + codeDebitPorteur
				+ ", commisionPorteur=" + commisionPorteur + ", codeDebitCommisionCommercant="
				+ codeDebitCommisionCommercant + ", commisionCommercant=" + commisionCommercant
				+ ", commisionInterchange=" + commisionInterchange + ", fraisOperateurTechnique="
				+ fraisOperateurTechnique + ", appCryptogram=" + appCryptogram + ", cryptogramInfoData="
				+ cryptogramInfoData + ", atc=" + atc + ", terminalVerificationResult=" + terminalVerificationResult
				+ ", libelleCommercant=" + libelleCommercant + ", ruf=" + ruf + ", Numtransaction=" + Numtransaction
				+ ", udf1=" + udf1 + ", rufAcquereur=" + rufAcquereur + ", numTransactionPaiementInternet="
				+ numTransactionPaiementInternet + ", trackId=" + trackId + ", idOriginTransaction="
				+ idOriginTransaction + ", rufpaiement=" + rufpaiement + ", idHeder=" + idHeder + ", validCommission="
				+ validCommission + ", interchangeCalculated=" + interchangeCalculated + ", satimCalculated="
				+ satimCalculated + "]";
	}



}


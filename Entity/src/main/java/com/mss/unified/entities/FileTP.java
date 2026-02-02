package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "FILE_TP",schema = "ATM")
public class FileTP {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "FILETPSequence")
    @SequenceGenerator(name = "FILETPSequence", sequenceName = "ATM.FILETPSequence", allocationSize = 1)

	@Column(name = "Id", nullable = false)
	private int id;
	
	@Column(name = "CodeDebit")
	public String codeDebit;

	@Column(name = "CodeBin")
	public String codeBin;
	
	@Column(name = "CodeBank")
	public String codeBank;
	
	@Column(name = "NumRIBEmetteur")
	public String numRIBEmetteur;
	
	@Column(name = "NumCartePorteur")
	public String numCartePorteur;
	
	@Column(name = "CodeDebitCommercant")
	public String codeDebitCommercant;
	
	@Column(name = "NumRIBcommercant")
	public String numRIBcommercant;
	
	@Column(name = "BinAcquereur")
	public String binAcquereur;
	
	@Column(name = "CodeBankAcquereur")
	public String codeBankAcquereur;
	
	@Column(name = "CodeAgence")
	public String codeAgence;
	
	@Column(name = "Id_Terminal")
	public String idTerminal;
	
	@Column(name = "Id_commercant")
	public String idCommercant;
	
	@Column(name = "Type_transaction")
	public String typeTransaction;
	
	@Column(name = "Datetransaction")
	public String dateTransaction;
	
	@Column(name = "HeureTransaction")
	public String heureTransaction;
	
	@Column(name = "MontantTransaction")
	public String montantTransaction;
	
	@Column(name = "NumFacture")
	public String numFacture;
	
	@Column(name = "EmetteurFacture")
	public String emetteurFacture;
	
	@Column(name = "NumRefTransaction")
	public String numRefTransaction;
	
	@Column(name = "NumAutorisation")
	public String numAutorisation;
	
	@Column(name = "CodeDebitPorteur")
	public String codeDebitPorteur;
	
	@Column(name = "CommisionPorteur")
	public String commisionPorteur;
	
	@Column(name = "CodeDebitCommisionCommercant")
	public String codeDebitCommisionCommercant;
	
	@Column(name = "CommisionCommercant")
	public String commisionCommercant;
	
	@Column(name = "CommisionInterchange")
	public String commisionInterchange;
	
	@Column(name = "FraisOperateurTechnique")
	public String fraisOperateurTechnique;
	
	@Column(name = "AppCryptogram")
	public String appCryptogram;
	
	@Column(name = "CryptogramInfoData")
	public String cryptogramInfoData;
	
	@Column(name = "Atc")
	public String atc;
	
	@Column(name = "TerminalVerificationResult")
	public String terminalVerificationResult;
	
	@Column(name = "LibelleCommercant")
	public String libelleCommercant;

	@Column(name = "Ruf")
	public String ruf;
	
	@Column(name = "Numtransaction")
	public String numtransaction;
	
	@Column(name = "Udf1")
	public String udf1;
	
	@Column(name = "RufAcquereur")
	public String rufAcquereur;

	@Column(name = "NumTransactionPaiementInternet")
	public String numTransactionPaiementInternet;

	@Column(name = "TrackId")
	public String trackId;

	@Column(name = "IdOriginTransaction")
	public String idOriginTransaction;

	@Column(name = "Rufpaiement")
	public String rufpaiement;

	@Column(name = "IdHeder")
	public String idHeder;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return binAcquereur;
	}

	public void setBinAcquereur(String binAcquereur) {
		this.binAcquereur = binAcquereur;
	}

	public String getCodeBankAcquereur() {
		return codeBankAcquereur;
	}

	public void setCodeBankAcquereur(String codeBankAcquereur) {
		this.codeBankAcquereur = codeBankAcquereur;
	}

	public String getCodeAgence() {
		return codeAgence;
	}

	public void setCodeAgence(String codeAgence) {
		this.codeAgence = codeAgence;
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
		return numtransaction;
	}

	public void setNumtransaction(String numtransaction) {
		this.numtransaction = numtransaction;
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

	public String getIdHeder() {
		return idHeder;
	}

	public void setIdHeder(String idHeder) {
		this.idHeder = idHeder;
	}

	
	
	
	
}

package com.mss.unified.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Transient;

 
import com.mss.unified.entities.FileContent;
import com.mss.unified.entities.FileContentT;

public class FileContentProjection extends FileContent  implements Serializable {
	public FileContentProjection(FileContent fc, int switchCode, String switchRRn) {
		 this.id = fc.getId();
		  this.codeDebit = fc.getCodeDebit();
		  this.codeBin = fc.getCodeBin();
		  this.codeBank = fc.getCodeBank();
		  this.numRIBEmetteur = fc.getNumRIBEmetteur();
		  this.numCartePorteur = fc.getNumCartePorteur();
		  this.codeDebitCommercant = fc.getCodeDebitCommercant();
		  this.numRIBcommercant = fc.getNumRIBcommercant();
		  this.BinAcquereur = fc.getBinAcquereur();
		  this.CodeBankAcquereur = fc.getCodeBankAcquereur();
		  this.CodeAgence = fc.getCodeAgence();
		  this.idTerminal = fc.getIdTerminal();
		  this.idCommercant = fc.getIdCommercant();
		  this.typeTransaction = fc.getTypeTransaction();
		  this.dateTransaction = fc.getDateTransaction();
		  this.heureTransaction = fc.getHeureTransaction();
		  this.montantTransaction = fc.getMontantTransaction();
		  this.numFacture = fc.getNumFacture();
		  this.emetteurFacture = fc.getEmetteurFacture();
		  this.numRefTransaction = fc.getNumRefTransaction();
		  this.numAutorisation = fc.getNumAutorisation();
		  this.codeDebitPorteur = fc.getCodeDebitPorteur();
		  this.commisionPorteur = fc.getCommisionPorteur();
		  this.codeDebitCommisionCommercant = fc.getCodeDebitCommisionCommercant();
		  this.commisionCommercant = fc.getCommisionCommercant();
		  this.commisionInterchange = fc.getCommisionInterchange();
		  this.fraisOperateurTechnique = fc.getFraisOperateurTechnique();
		  this.appCryptogram = fc.getAppCryptogram();
		  this.cryptogramInfoData = fc.getCryptogramInfoData();
		  this.atc = fc.getAtc();
		  this.terminalVerificationResult = fc.getTerminalVerificationResult();
		  this.libelleCommercant = fc.getLibelleCommercant();
		  this.ruf = fc.getRuf();
		  this.Numtransaction = fc.getNumtransaction();
		  this.udf1 = fc.getUdf1();
		  this.rufAcquereur = fc.getRufAcquereur();
		  this.numTransactionPaiementInternet = fc.getNumTransactionPaiementInternet();
		  this.trackId = fc.getTrackId();
		  this.idOriginTransaction = fc.getIdOriginTransaction();
		  this.rufpaiement = fc.getRufpaiement();
		  this.idHeder = fc.getIdHeder();
		  this.validCommission = fc.getValidCommission();
		this.switchCode = switchCode;
		this.switchRRn = switchRRn;
		
	}

	public FileContentProjection(int id,   String codeDebit, String codeBin, String codeBank,
			String numRIBEmetteur, String numCartePorteur, String codeDebitCommercant, String numRIBcommercant,
			String binAcquereur, String codeBankAcquereur, String codeAgence, String idTerminal, String idCommercant,
			String typeTransaction, String dateTransaction, String heureTransaction, String montantTransaction,
			String numFacture, String emetteurFacture, String numRefTransaction, String numAutorisation,
			String codeDebitPorteur, String commisionPorteur, String codeDebitCommisionCommercant,
			String commisionCommercant, String commisionInterchange, String fraisOperateurTechnique,
			String appCryptogram, String cryptogramInfoData, String atc, String terminalVerificationResult,
			String libelleCommercant, String ruf, String numtransaction, String udf1, String rufAcquereur,
			String numTransactionPaiementInternet, String trackId, String idOriginTransaction, String rufpaiement,
			String idHeder, String validCommission, String commissionCalculated, int switchCode, String switchRRn) {
		super();
		this.id = id;
 		this.codeDebit = codeDebit;
		this.codeBin = codeBin;
		this.codeBank = codeBank;
		this.numRIBEmetteur = numRIBEmetteur;
		this.numCartePorteur = numCartePorteur;
		this.codeDebitCommercant = codeDebitCommercant;
		this.numRIBcommercant = numRIBcommercant;
		BinAcquereur = binAcquereur;
		CodeBankAcquereur = codeBankAcquereur;
		CodeAgence = codeAgence;
		this.idTerminal = idTerminal;
		this.idCommercant = idCommercant;
		this.typeTransaction = typeTransaction;
		this.dateTransaction = dateTransaction;
		this.heureTransaction = heureTransaction;
		this.montantTransaction = montantTransaction;
		this.numFacture = numFacture;
		this.emetteurFacture = emetteurFacture;
		this.numRefTransaction = numRefTransaction;
		this.numAutorisation = numAutorisation;
		this.codeDebitPorteur = codeDebitPorteur;
		this.commisionPorteur = commisionPorteur;
		this.codeDebitCommisionCommercant = codeDebitCommisionCommercant;
		this.commisionCommercant = commisionCommercant;
		this.commisionInterchange = commisionInterchange;
		this.fraisOperateurTechnique = fraisOperateurTechnique;
		this.appCryptogram = appCryptogram;
		this.cryptogramInfoData = cryptogramInfoData;
		this.atc = atc;
		this.terminalVerificationResult = terminalVerificationResult;
		this.libelleCommercant = libelleCommercant;
		this.ruf = ruf;
		Numtransaction = numtransaction;
		this.udf1 = udf1;
		this.rufAcquereur = rufAcquereur;
		this.numTransactionPaiementInternet = numTransactionPaiementInternet;
		this.trackId = trackId;
		this.idOriginTransaction = idOriginTransaction;
		this.rufpaiement = rufpaiement;
		this.idHeder = idHeder;
		this.validCommission = validCommission;
		this.commissionCalculated = commissionCalculated;
		this.switchCode = switchCode;
		this.switchRRn = switchRRn;
	}

	private int id;

	private String dateCompensation;

	private String codeDebit;
	private String codeBin;
	private String codeBank;
	private String numRIBEmetteur;
	private String numCartePorteur;
	private String codeDebitCommercant;
	private String numRIBcommercant;
	private String BinAcquereur;
	private String CodeBankAcquereur;
	private String CodeAgence;
	private String idTerminal;
	private String idCommercant;
	private String typeTransaction;
	private String dateTransaction;
	private String heureTransaction;
	private String montantTransaction;
	private String numFacture;
	private String emetteurFacture;
	private String numRefTransaction;
	private String numAutorisation;
	private String codeDebitPorteur;
	private String commisionPorteur;
	private String codeDebitCommisionCommercant;
	private String commisionCommercant;
	private String commisionInterchange;
	private String fraisOperateurTechnique;
	private String appCryptogram;
	private String cryptogramInfoData;
	private String atc;
	private String terminalVerificationResult;
	private String libelleCommercant;
	private String ruf;
	private String Numtransaction;
	private String udf1;
	private String rufAcquereur;
	private String numTransactionPaiementInternet;
	private String trackId;
	private String idOriginTransaction;
	private String rufpaiement;
	private String idHeder;

	private String validCommission;

	private String commissionCalculated;

	private int switchCode;
	private String switchRRn;

	public int getSwitchCode() {
		return switchCode;
	}

	public void setSwitchCode(int switchCode) {
		this.switchCode = switchCode;
	}

	public String getSwitchRRn() {
		return switchRRn;
	}

	public void setSwitchRRn(String switchRRn) {
		this.switchRRn = switchRRn;
	}

	@Override
	public String toString() {
		return "FileContentProjection [id=" + id + ", dateCompensation=" + dateCompensation + ", codeDebit=" + codeDebit
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
				+ validCommission + ", commissionCalculated=" + commissionCalculated + ", switchCode=" + switchCode
				+ ", switchRRn=" + switchRRn + "]";
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

	public String getIdHeder() {
		return idHeder;
	}

	public void setIdHeder(String idHeder) {
		this.idHeder = idHeder;
	}

	public String getValidCommission() {
		return validCommission;
	}

	public void setValidCommission(String validCommission) {
		this.validCommission = validCommission;
	}

	public String getCommissionCalculated() {
		return commissionCalculated;
	}

	public void setCommissionCalculated(String commissionCalculated) {
		this.commissionCalculated = commissionCalculated;
	}

}
